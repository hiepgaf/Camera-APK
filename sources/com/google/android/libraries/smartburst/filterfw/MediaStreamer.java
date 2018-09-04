package com.google.android.libraries.smartburst.filterfw;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.google.android.libraries.smartburst.filterfw.SurfaceFrameDistributor.SurfaceTextureManager;
import com.google.android.libraries.smartburst.filterfw.decoder.VideoStreamProvider;
import com.google.android.libraries.smartburst.filterfw.geometry.Scaler;
import com.google.android.libraries.smartburst.filterfw.util.MediaUtils;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(18)
/* compiled from: PG */
public class MediaStreamer implements VideoStreamProvider {
    public final ConsumerFrameForwarder mConsumers;
    public final SurfaceFrameDistributor mFrameDistributor;
    public AtomicBoolean mIsClosed;
    public volatile int mMediaHeight;
    public final MediaPlayer mMediaPlayer;
    public volatile int mMediaWidth;
    public final HandlerThread mPlayerThread;
    public final SurfaceTextureManager mSurfaceTextureManager;
    public final SurfaceTexTransform mTransform;

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.MediaStreamer$1 */
    class C00701 implements OnCompletionListener {
        C00701() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            MediaStreamer.this.onStop();
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.MediaStreamer$2 */
    class C00712 implements OnVideoSizeChangedListener {
        C00712() {
        }

        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            MediaStreamer.this.mMediaWidth = i;
            MediaStreamer.this.mMediaHeight = i2;
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.MediaStreamer$3 */
    class C01423 implements SurfaceTextureManager {
        public Surface mFrameSurface;
        public TextureSource mFrameTexture;

        C01423() {
        }

        public SurfaceTexture createSurfaceTexture() {
            this.mFrameTexture = TextureSource.newExternalTexture();
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.mFrameTexture.getTextureId());
            this.mFrameSurface = new Surface(surfaceTexture);
            MediaStreamer.this.mMediaPlayer.setSurface(this.mFrameSurface);
            surfaceTexture.detachFromGLContext();
            return surfaceTexture;
        }

        public void releaseSurfaceTexture(SurfaceTexture surfaceTexture) {
            this.mFrameSurface.release();
            surfaceTexture.release();
            this.mFrameTexture.release();
        }
    }

    public MediaStreamer(Context context, Uri uri) {
        this.mMediaWidth = 1;
        this.mMediaHeight = 1;
        this.mIsClosed = new AtomicBoolean(false);
        this.mSurfaceTextureManager = new C01423();
        this.mMediaPlayer = MediaPlayer.create(context, uri);
        this.mMediaPlayer.setOnCompletionListener(new C00701());
        this.mMediaPlayer.setOnVideoSizeChangedListener(new C00712());
        this.mTransform = SurfaceTexTransform.create(MediaUtils.getMediaRotation(context, uri), false, true);
        this.mConsumers = new ConsumerFrameForwarder(this);
        this.mPlayerThread = new HandlerThread("MediaStreamer");
        this.mPlayerThread.start();
        this.mFrameDistributor = new SurfaceFrameDistributor(this.mConsumers, this.mSurfaceTextureManager, new Handler(this.mPlayerThread.getLooper()));
        this.mFrameDistributor.setup();
    }

    public MediaStreamer(Context context, File file) {
        this(context, Uri.fromFile(file));
    }

    public void addVideoFrameConsumer(VideoFrameConsumer videoFrameConsumer) {
        this.mConsumers.addConsumer(videoFrameConsumer);
    }

    public void close() {
        if (!this.mIsClosed.compareAndSet(false, true)) {
            release();
        }
    }

    public long getDurationNs() {
        return ((long) this.mMediaPlayer.getDuration()) * 1000000;
    }

    public boolean grabVideoFrame(FrameImage2D frameImage2D, FrameValue frameValue, Scaler scaler) {
        return this.mFrameDistributor.grabFrame(frameImage2D, this.mMediaWidth, this.mMediaHeight, this.mTransform, scaler);
    }

    private void onStop() {
        this.mConsumers.sendStopNotification();
    }

    public void release() {
        this.mMediaPlayer.stop();
        this.mMediaPlayer.release();
        this.mFrameDistributor.release();
        this.mPlayerThread.quitSafely();
    }

    public void removeVideoFrameConsumer(VideoFrameConsumer videoFrameConsumer) {
        this.mConsumers.removeConsumer(videoFrameConsumer);
    }

    public void skipVideoFrame() {
    }

    public void start() {
        this.mConsumers.sendStartNotification();
        this.mMediaPlayer.start();
    }

    public void stop() {
        this.mMediaPlayer.stop();
    }
}
