package com.google.android.libraries.smartburst.filterfw.decoder;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.ConditionVariable;
import com.google.android.libraries.smartburst.filterfw.AudioFrameConsumer;
import com.google.android.libraries.smartburst.filterfw.AudioFrameProvider;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameValue;
import com.google.android.libraries.smartburst.filterfw.RenderTarget;
import com.google.android.libraries.smartburst.filterfw.VideoFrameConsumer;
import com.google.android.libraries.smartburst.filterfw.VideoFrameProvider;
import com.google.android.libraries.smartburst.filterfw.geometry.Scaler;
import com.google.android.libraries.smartburst.filterfw.util.MediaUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

@TargetApi(16)
/* compiled from: PG */
public class MediaDecoder implements AudioFrameProvider, VideoStreamProvider {
    public static final boolean DEBUG = false;
    public static final int EVENT_EOF = 2;
    public static final int EVENT_START = 0;
    public static final int EVENT_STOP = 1;
    public static final String LOG_TAG = "MediaDecoder";
    public static final int ROTATE_180 = 180;
    public static final int ROTATE_90_LEFT = 270;
    public static final int ROTATE_90_RIGHT = 90;
    public static final int ROTATE_NONE = 0;
    public final AtomicCounter mAudioConsumerWaitCount;
    public final HashSet mAudioConsumers;
    public volatile AudioTrackDecoder mAudioTrackDecoder;
    public final Context mContext;
    public final DecoderRunnable mDecoderLoop;
    public final Thread mDecoderThread;
    public final long mEndMicros;
    public final AtomicBoolean mIsClosed;
    public final boolean mOpenGLEnabled;
    public final long mStartMicros;
    public final Listener mTrackListener;
    public final Uri mUri;
    public final AtomicCounter mVideoConsumerWaitCount;
    public final HashSet mVideoConsumers;
    public volatile VideoTrackDecoder mVideoTrackDecoder;

    /* compiled from: PG */
    class AtomicCounter {
        public final AtomicInteger mCount;

        private AtomicCounter() {
            this.mCount = new AtomicInteger();
        }

        public boolean decrementAndCheckZero() {
            int decrementAndGet = this.mCount.decrementAndGet();
            if (decrementAndGet == 0) {
                return true;
            }
            if (decrementAndGet > 0) {
                return false;
            }
            throw new IllegalStateException("Counter fell below zero!");
        }

        public void set(int i) {
            this.mCount.set(i);
        }
    }

    /* compiled from: PG */
    class DecoderRunnable implements Runnable {
        public static final int MAX_EVENTS = 32;
        public static final long VIDEO_START_WAIT_MS = 1000;
        public int mAudioTrackIndex;
        public volatile int mDefaultRotation;
        public volatile long mDurationUs;
        public final BlockingQueue mEventQueue;
        public MediaExtractor mMediaExtractor;
        public RenderTarget mRenderTarget;
        public boolean mSignaledEndOfInput;
        public final ConditionVariable mStarted;
        public int mVideoTrackIndex;

        private DecoderRunnable() {
            this.mEventQueue = new LinkedBlockingQueue(32);
            this.mStarted = new ConditionVariable(false);
            this.mDurationUs = -1;
        }

        public int getDefaultRotation() {
            waitForStart();
            return this.mDefaultRotation;
        }

        public long getDurationUs() {
            waitForStart();
            return this.mDurationUs;
        }

        private RenderTarget getRenderTarget() {
            if (this.mRenderTarget == null) {
                this.mRenderTarget = RenderTarget.newTarget(1, 1);
            }
            return this.mRenderTarget;
        }

        private void onDecode() {
            int sampleTrackIndex = this.mMediaExtractor.getSampleTrackIndex();
            if (sampleTrackIndex >= 0) {
                if (sampleTrackIndex == this.mVideoTrackIndex) {
                    MediaDecoder.this.mVideoTrackDecoder.feedInput(this.mMediaExtractor);
                } else if (sampleTrackIndex == this.mAudioTrackIndex) {
                    MediaDecoder.this.mAudioTrackDecoder.feedInput(this.mMediaExtractor);
                }
            } else if (!this.mSignaledEndOfInput) {
                if (MediaDecoder.this.mVideoTrackDecoder != null) {
                    MediaDecoder.this.mVideoTrackDecoder.signalEndOfInput();
                }
                if (MediaDecoder.this.mAudioTrackDecoder != null) {
                    MediaDecoder.this.mAudioTrackDecoder.signalEndOfInput();
                }
                this.mSignaledEndOfInput = true;
            }
            if (MediaDecoder.this.mVideoTrackDecoder != null) {
                MediaDecoder.this.mVideoTrackDecoder.drainOutputBuffer();
            }
            if (MediaDecoder.this.mAudioTrackDecoder != null) {
                MediaDecoder.this.mAudioTrackDecoder.drainOutputBuffer();
            }
        }

        private void onStart() {
            int i;
            if (MediaDecoder.this.mOpenGLEnabled) {
                getRenderTarget().focus();
            }
            this.mMediaExtractor = new MediaExtractor();
            this.mMediaExtractor.setDataSource(MediaDecoder.this.mContext, MediaDecoder.this.mUri, null);
            this.mVideoTrackIndex = -1;
            this.mAudioTrackIndex = -1;
            for (i = 0; i < this.mMediaExtractor.getTrackCount(); i++) {
                MediaFormat trackFormat = this.mMediaExtractor.getTrackFormat(i);
                if (DecoderUtil.isSupportedVideoFormat(trackFormat) && this.mVideoTrackIndex == -1) {
                    this.mVideoTrackIndex = i;
                } else if (DecoderUtil.isAudioFormat(trackFormat) && this.mAudioTrackIndex == -1) {
                    this.mAudioTrackIndex = i;
                }
                if (this.mDurationUs < 0) {
                    if (MediaDecoder.this.mEndMicros > 0) {
                        this.mDurationUs = MediaDecoder.this.mEndMicros - MediaDecoder.this.mStartMicros;
                    } else if (MediaDecoder.this.mStartMicros > 0) {
                        this.mDurationUs = trackFormat.getLong("durationUs") - MediaDecoder.this.mStartMicros;
                    } else {
                        this.mDurationUs = trackFormat.getLong("durationUs");
                    }
                }
            }
            i = this.mVideoTrackIndex;
            if (i == -1 && this.mAudioTrackIndex == -1) {
                throw new IllegalArgumentException("Couldn't find a video or audio track in the provided file");
            }
            if (i != -1) {
                VideoTrackDecoder gpuVideoTrackDecoder;
                trackFormat = this.mMediaExtractor.getTrackFormat(i);
                MediaDecoder mediaDecoder = MediaDecoder.this;
                if (mediaDecoder.mOpenGLEnabled) {
                    gpuVideoTrackDecoder = new GpuVideoTrackDecoder(this.mVideoTrackIndex, trackFormat, MediaDecoder.this.mTrackListener);
                } else {
                    gpuVideoTrackDecoder = new CpuVideoTrackDecoder(this.mVideoTrackIndex, trackFormat, MediaDecoder.this.mTrackListener);
                }
                mediaDecoder.mVideoTrackDecoder = gpuVideoTrackDecoder;
                MediaDecoder.this.mVideoTrackDecoder.init();
                this.mMediaExtractor.selectTrack(this.mVideoTrackIndex);
                if (VERSION.SDK_INT >= 17) {
                    this.mDefaultRotation = MediaUtils.getMediaRotation(MediaDecoder.this.mContext, MediaDecoder.this.mUri);
                }
            }
            i = this.mAudioTrackIndex;
            if (i != -1) {
                MediaFormat trackFormat2 = this.mMediaExtractor.getTrackFormat(i);
                MediaDecoder mediaDecoder2 = MediaDecoder.this;
                mediaDecoder2.mAudioTrackDecoder = new AudioTrackDecoder(this.mAudioTrackIndex, trackFormat2, mediaDecoder2.mTrackListener);
                MediaDecoder.this.mAudioTrackDecoder.init();
                this.mMediaExtractor.selectTrack(this.mAudioTrackIndex);
            }
            if (MediaDecoder.this.mStartMicros > 0) {
                this.mMediaExtractor.seekTo(MediaDecoder.this.mStartMicros, 2);
            }
            this.mStarted.open();
            synchronized (MediaDecoder.this.mVideoConsumers) {
                Iterator it = MediaDecoder.this.mVideoConsumers.iterator();
                while (it.hasNext()) {
                    ((VideoFrameConsumer) it.next()).onVideoStreamStarted();
                }
            }
        }

        private void onStop(boolean z) {
            this.mMediaExtractor.release();
            this.mMediaExtractor = null;
            if (MediaDecoder.this.mVideoTrackDecoder != null) {
                MediaDecoder.this.mVideoTrackDecoder.release();
                MediaDecoder.this.mVideoTrackDecoder = null;
            }
            if (MediaDecoder.this.mAudioTrackDecoder != null) {
                MediaDecoder.this.mAudioTrackDecoder.release();
                MediaDecoder.this.mAudioTrackDecoder = null;
            }
            if (MediaDecoder.this.mOpenGLEnabled) {
                if (this.mRenderTarget != null) {
                    getRenderTarget().release();
                }
                RenderTarget.focusNone();
            }
            this.mVideoTrackIndex = -1;
            this.mAudioTrackIndex = -1;
            this.mEventQueue.clear();
            if (z) {
                synchronized (MediaDecoder.this.mVideoConsumers) {
                    Iterator it = MediaDecoder.this.mVideoConsumers.iterator();
                    while (it.hasNext()) {
                        ((VideoFrameConsumer) it.next()).onVideoStreamStopped();
                    }
                }
            }
        }

        public void postEvent(int i) {
            this.mEventQueue.offer(Integer.valueOf(i));
        }

        public void run() {
            boolean z;
            do {
                try {
                    Integer num = (Integer) this.mEventQueue.poll();
                    if (num != null) {
                        switch (num.intValue()) {
                            case 0:
                                onStart();
                                z = false;
                                continue;
                            case 1:
                                break;
                            case 2:
                                if (MediaDecoder.this.mVideoTrackDecoder != null) {
                                    MediaDecoder.this.mVideoTrackDecoder.waitForFrameGrabs();
                                    break;
                                }
                                break;
                            default:
                                z = false;
                                continue;
                        }
                        onStop(true);
                        z = true;
                        continue;
                    } else if (this.mDurationUs > 0) {
                        onDecode();
                        z = false;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                } catch (Exception e) {
                    r1 = e;
                    synchronized (MediaDecoder.this.mVideoConsumers) {
                        Iterator it = MediaDecoder.this.mVideoConsumers.iterator();
                        while (it.hasNext()) {
                            Exception exception;
                            ((VideoFrameConsumer) it.next()).onVideoStreamError(exception);
                        }
                        onStop(false);
                        return;
                    }
                }
            } while (!z);
        }

        private void waitForStart() {
            if (!this.mStarted.block(1000)) {
                throw new RuntimeException("Timed out while waiting for video to load.");
            }
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder$1 */
    class C01471 implements Listener {
        public boolean mSeenEndOfAudioOutput;
        public boolean mSeenEndOfVideoOutput;

        C01471() {
        }

        public void onDecodedOutputAvailable(TrackDecoder trackDecoder) {
            if (MediaDecoder.this.mEndMicros > 0 && MediaDecoder.this.mVideoTrackDecoder.getTimestampNs() > MediaDecoder.this.mEndMicros * 1000) {
                MediaDecoder.this.stop();
            }
            Iterator it;
            if (trackDecoder == MediaDecoder.this.mVideoTrackDecoder) {
                synchronized (MediaDecoder.this.mVideoConsumers) {
                    MediaDecoder.this.mVideoConsumerWaitCount.set(MediaDecoder.this.mVideoConsumers.size());
                    it = MediaDecoder.this.mVideoConsumers.iterator();
                    while (it.hasNext()) {
                        VideoFrameConsumer videoFrameConsumer = (VideoFrameConsumer) it.next();
                        VideoFrameProvider videoFrameProvider = MediaDecoder.this;
                        videoFrameConsumer.onVideoFrameAvailable(videoFrameProvider, videoFrameProvider.mVideoTrackDecoder.getTimestampNs());
                    }
                }
            } else if (trackDecoder == MediaDecoder.this.mAudioTrackDecoder) {
                synchronized (MediaDecoder.this.mAudioConsumers) {
                    MediaDecoder.this.mAudioConsumerWaitCount.set(MediaDecoder.this.mAudioConsumers.size());
                    it = MediaDecoder.this.mAudioConsumers.iterator();
                    while (it.hasNext()) {
                        ((AudioFrameConsumer) it.next()).onAudioSamplesAvailable(MediaDecoder.this);
                    }
                }
            }
        }

        public void onEndOfStream(TrackDecoder trackDecoder) {
            if (trackDecoder == MediaDecoder.this.mAudioTrackDecoder) {
                this.mSeenEndOfAudioOutput = true;
            } else if (trackDecoder == MediaDecoder.this.mVideoTrackDecoder) {
                this.mSeenEndOfVideoOutput = true;
            }
            if (MediaDecoder.this.mAudioTrackDecoder != null) {
                if (!this.mSeenEndOfAudioOutput) {
                    return;
                }
            }
            if (MediaDecoder.this.mVideoTrackDecoder == null || this.mSeenEndOfVideoOutput) {
                MediaDecoder.this.stop(false);
            }
        }
    }

    public MediaDecoder(Context context, Uri uri) {
        this(context, uri, 0);
    }

    public MediaDecoder(Context context, Uri uri, long j) {
        this(context, uri, j, true);
    }

    public MediaDecoder(Context context, Uri uri, long j, long j2) {
        this(context, uri, j, j2, true);
    }

    public MediaDecoder(Context context, Uri uri, long j, long j2, boolean z) {
        this.mVideoConsumers = new HashSet();
        this.mAudioConsumers = new HashSet();
        this.mVideoConsumerWaitCount = new AtomicCounter();
        this.mAudioConsumerWaitCount = new AtomicCounter();
        this.mIsClosed = new AtomicBoolean(false);
        this.mTrackListener = new C01471();
        if (context == null) {
            throw new NullPointerException("context cannot be null");
        }
        this.mContext = context;
        if (uri == null) {
            throw new NullPointerException("uri cannot be null");
        }
        this.mUri = uri;
        if (j < 0) {
            throw new IllegalArgumentException("startMicros cannot be negative");
        } else if (j2 <= 0 || j <= j2) {
            this.mStartMicros = j;
            this.mEndMicros = j2;
            this.mOpenGLEnabled = z;
            this.mDecoderLoop = new DecoderRunnable();
            this.mDecoderThread = new Thread(this.mDecoderLoop);
        } else {
            throw new IllegalArgumentException("startMicros cannot be larger than endMicros");
        }
    }

    public MediaDecoder(Context context, Uri uri, long j, boolean z) {
        this(context, uri, j, 0, z);
    }

    public void addAudioFrameConsumer(AudioFrameConsumer audioFrameConsumer) {
        synchronized (this.mAudioConsumers) {
            this.mAudioConsumers.add(audioFrameConsumer);
        }
    }

    public void addVideoFrameConsumer(VideoFrameConsumer videoFrameConsumer) {
        synchronized (this.mVideoConsumers) {
            this.mVideoConsumers.add(videoFrameConsumer);
        }
    }

    public void clearAudioSamples() {
        if (this.mAudioTrackDecoder != null) {
            this.mAudioTrackDecoder.clearBuffer();
        }
    }

    public void close() {
        if (this.mIsClosed.compareAndSet(false, true)) {
            stop();
        }
    }

    public long getDurationNs() {
        return this.mDecoderLoop.getDurationUs() * 1000;
    }

    public boolean grabAudioSamples(FrameValue frameValue) {
        if (this.mAudioTrackDecoder == null) {
            return false;
        }
        synchronized (this.mAudioConsumers) {
            this.mAudioTrackDecoder.grabSample(frameValue);
            if (this.mAudioConsumerWaitCount.decrementAndCheckZero()) {
                this.mAudioTrackDecoder.advance();
            }
        }
        return true;
    }

    public boolean grabVideoFrame(FrameImage2D frameImage2D, FrameValue frameValue, Scaler scaler) {
        return grabVideoFrame(frameImage2D, frameValue, scaler, this.mDecoderLoop.getDefaultRotation());
    }

    public boolean grabVideoFrame(FrameImage2D frameImage2D, FrameValue frameValue, Scaler scaler, int i) {
        if (this.mVideoTrackDecoder == null || frameImage2D == null) {
            return false;
        }
        synchronized (this.mVideoConsumers) {
            this.mVideoTrackDecoder.grabFrame(frameImage2D, frameValue, scaler, i);
            if (this.mVideoConsumerWaitCount.decrementAndCheckZero()) {
                this.mVideoTrackDecoder.advance();
            }
        }
        return true;
    }

    public boolean isOpenGLEnabled() {
        return this.mOpenGLEnabled;
    }

    public void removeAudioFrameConsumer(AudioFrameConsumer audioFrameConsumer) {
        synchronized (this.mAudioConsumers) {
            this.mAudioConsumers.remove(audioFrameConsumer);
        }
    }

    public void removeVideoFrameConsumer(VideoFrameConsumer videoFrameConsumer) {
        synchronized (this.mVideoConsumers) {
            this.mVideoConsumers.remove(videoFrameConsumer);
        }
    }

    public void skipVideoFrame() {
        if (this.mVideoConsumerWaitCount.decrementAndCheckZero()) {
            this.mVideoTrackDecoder.advance();
        }
    }

    public void start() {
        this.mDecoderLoop.postEvent(0);
        this.mDecoderThread.start();
    }

    public void stop() {
        stop(true);
    }

    private void stop(boolean z) {
        if (z) {
            this.mDecoderLoop.postEvent(1);
            this.mDecoderThread.interrupt();
            return;
        }
        this.mDecoderLoop.postEvent(2);
    }
}
