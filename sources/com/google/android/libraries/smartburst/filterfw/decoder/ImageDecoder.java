package com.google.android.libraries.smartburst.filterfw.decoder;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameValue;
import com.google.android.libraries.smartburst.filterfw.VideoFrameConsumer;
import com.google.android.libraries.smartburst.filterfw.geometry.Scaler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
public class ImageDecoder implements VideoStreamProvider {
    public static final long CONSUMER_REGISTRATION_DELAY_MS = 2000;
    public static final long INTER_FRAME_TIME_GAP_MS = 250;
    public final long mConsumerRegistrationDelay;
    public final List mConsumers;
    public final HandlerThread mDecoderThread;
    public final Handler mHandler;
    public final AtomicInteger mImageIndex;
    public final Bitmap[] mImages;
    public final AtomicBoolean mIsClosed;
    public boolean mIsRunning;
    public final TimestampProvider mTimestampProvider;
    public final AtomicInteger mWaitingConsumers;

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.decoder.ImageDecoder$1 */
    class C00811 implements Runnable {
        C00811() {
        }

        public void run() {
            synchronized (ImageDecoder.this.mConsumers) {
                ImageDecoder.this.mIsRunning = true;
                for (VideoFrameConsumer onVideoStreamStarted : ImageDecoder.this.mConsumers) {
                    onVideoStreamStarted.onVideoStreamStarted();
                }
            }
            ImageDecoder.this.signalNewFrame();
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.decoder.ImageDecoder$2 */
    class C00822 implements Runnable {
        C00822() {
        }

        public void run() {
            long access$400 = ImageDecoder.this.getTimestampForCurrentFrame();
            synchronized (ImageDecoder.this.mConsumers) {
                for (VideoFrameConsumer onVideoFrameAvailable : ImageDecoder.this.mConsumers) {
                    onVideoFrameAvailable.onVideoFrameAvailable(ImageDecoder.this, access$400);
                }
            }
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.decoder.ImageDecoder$3 */
    class C00833 implements Runnable {
        C00833() {
        }

        public void run() {
            synchronized (ImageDecoder.this.mConsumers) {
                ImageDecoder.this.mIsRunning = false;
                for (VideoFrameConsumer onVideoStreamStopped : ImageDecoder.this.mConsumers) {
                    onVideoStreamStopped.onVideoStreamStopped();
                }
            }
        }
    }

    /* compiled from: PG */
    public interface TimestampProvider {
        long getTimestampForFrame(int i);
    }

    /* compiled from: PG */
    class DefaultTimestampProvider implements TimestampProvider {
        public static final long FRAME_TIMESTAMP_GAP_NS = 10000000000L;

        private DefaultTimestampProvider() {
        }

        public long getTimestampForFrame(int i) {
            return ((long) i) * FRAME_TIMESTAMP_GAP_NS;
        }
    }

    public ImageDecoder(Bitmap[] bitmapArr) {
        this(bitmapArr, CONSUMER_REGISTRATION_DELAY_MS, new DefaultTimestampProvider());
    }

    public ImageDecoder(Bitmap[] bitmapArr, long j, TimestampProvider timestampProvider) {
        this.mWaitingConsumers = new AtomicInteger(0);
        this.mImageIndex = new AtomicInteger(0);
        this.mConsumers = new ArrayList();
        this.mIsClosed = new AtomicBoolean(false);
        this.mImages = bitmapArr;
        this.mConsumerRegistrationDelay = j;
        this.mTimestampProvider = timestampProvider;
        this.mDecoderThread = new HandlerThread("ImageDecoder");
        this.mDecoderThread.start();
        this.mHandler = new Handler(this.mDecoderThread.getLooper());
    }

    public void addVideoFrameConsumer(VideoFrameConsumer videoFrameConsumer) {
        synchronized (this.mConsumers) {
            this.mConsumers.add(videoFrameConsumer);
            if (!this.mIsRunning) {
                this.mWaitingConsumers.set(this.mConsumers.size());
            }
        }
    }

    public void close() {
        if (this.mIsClosed.compareAndSet(false, true)) {
            stop();
        }
    }

    public static ImageDecoder createFromUri(Uri uri) {
        new Options().inPreferQualityOverSpeed = true;
        if (uri == null) {
            throw new IllegalArgumentException("Image uri is empty!");
        }
        return new ImageDecoder(new Bitmap[]{BitmapFactory.decodeFile(uri.getPath(), r0)});
    }

    private void decrementConsumersAndSignalNextFrame() {
        synchronized (this.mWaitingConsumers) {
            if (this.mWaitingConsumers.decrementAndGet() == 0) {
                if (this.mImageIndex.incrementAndGet() < this.mImages.length) {
                    this.mWaitingConsumers.set(this.mConsumers.size());
                    signalNewFrame();
                } else {
                    signalStop();
                }
            }
        }
    }

    public long getDurationNs() {
        return (long) this.mImages.length;
    }

    private long getTimestampForCurrentFrame() {
        return this.mTimestampProvider.getTimestampForFrame(this.mImageIndex.get());
    }

    public boolean grabVideoFrame(FrameImage2D frameImage2D, FrameValue frameValue, Scaler scaler) {
        if (this.mWaitingConsumers.get() > 0) {
            int i = this.mImageIndex.get();
            Bitmap[] bitmapArr = this.mImages;
            if (i < bitmapArr.length) {
                Bitmap bitmap = bitmapArr[this.mImageIndex.get()];
                int[] scale = scaler.scale(bitmap.getWidth(), bitmap.getHeight());
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, scale[0], scale[1], false);
                frameImage2D.resize(scale);
                frameImage2D.setBitmap(createScaledBitmap);
                frameImage2D.setTimestamp(getTimestampForCurrentFrame());
                decrementConsumersAndSignalNextFrame();
                return true;
            }
        }
        return false;
    }

    public void removeVideoFrameConsumer(VideoFrameConsumer videoFrameConsumer) {
        synchronized (this.mConsumers) {
            this.mConsumers.remove(videoFrameConsumer);
            if (!this.mIsRunning) {
                this.mWaitingConsumers.set(this.mConsumers.size());
            }
        }
    }

    private void signalNewFrame() {
        this.mHandler.postDelayed(new C00822(), 250);
    }

    private void signalStop() {
        this.mHandler.postDelayed(new C00833(), 250);
    }

    public void skipVideoFrame() {
        decrementConsumersAndSignalNextFrame();
    }

    public void start() {
        this.mHandler.postDelayed(new C00811(), this.mConsumerRegistrationDelay);
    }

    public void stop() {
        this.mDecoderThread.quitSafely();
    }
}
