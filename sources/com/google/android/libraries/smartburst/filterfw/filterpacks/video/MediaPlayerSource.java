package com.google.android.libraries.smartburst.filterfw.filterpacks.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.util.Log;
import android.view.Surface;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.ImageShader;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.TextureSource;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;

@TargetApi(14)
/* compiled from: PG */
public class MediaPlayerSource extends Filter {
    public static final FrameType INPUT_ASSET_TYPE = FrameType.single(AssetFileDescriptor.class);
    public static final FrameType INPUT_PATH_TYPE = FrameType.single(Uri.class);
    public static final FrameType OUTPUT_VIDEO_TYPE = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16);
    public static final String TAG = "MediaPlayerSource";
    public static final float[] TARGET_COORDS_0 = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    public static final float[] TARGET_COORDS_180 = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    public static final float[] TARGET_COORDS_270 = new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};
    public static final float[] TARGET_COORDS_90 = new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
    public static final String mFrameShader = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n";
    public static float[] mSurfaceTransform = new float[16];
    public boolean mCompleted;
    public ImageShader mFrameExtractor;
    public final Object mFrameMutex = new Object();
    public int mHeight;
    public final boolean mLogVerbose = Log.isLoggable(TAG, 2);
    public boolean mLooping = false;
    public TextureSource mMediaFrame;
    public MediaPlayer mMediaPlayer;
    public boolean mNewFrameAvailable;
    public boolean mPaused;
    public int mRotation = 0;
    public Uri mSourceUri;
    public SurfaceTexture mSurfaceTexture;
    public float mVolume = 0.0f;
    public int mWidth;
    public OnCompletionListener onCompletionListener = new C00963();
    public OnFrameAvailableListener onMediaFrameAvailableListener = new C00974();
    public OnPreparedListener onPreparedListener = new C00941();
    public OnVideoSizeChangedListener onVideoSizeChangedListener = new C00952();

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.filterpacks.video.MediaPlayerSource$1 */
    class C00941 implements OnPreparedListener {
        C00941() {
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            MediaPlayerSource.this.vLog("MediaPlayer is prepared");
            synchronized (MediaPlayerSource.this) {
                MediaPlayerSource.this.mMediaPlayer.start();
            }
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.filterpacks.video.MediaPlayerSource$2 */
    class C00952 implements OnVideoSizeChangedListener {
        C00952() {
        }

        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            MediaPlayerSource mediaPlayerSource = MediaPlayerSource.this;
            StringBuilder stringBuilder = new StringBuilder(54);
            stringBuilder.append("MediaPlayer sent dimensions: ");
            stringBuilder.append(i);
            stringBuilder.append(" x ");
            stringBuilder.append(i2);
            mediaPlayerSource.vLog(stringBuilder.toString());
            synchronized (MediaPlayerSource.this.mFrameMutex) {
                MediaPlayerSource.this.mWidth = i;
                MediaPlayerSource.this.mHeight = i2;
            }
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.filterpacks.video.MediaPlayerSource$3 */
    class C00963 implements OnCompletionListener {
        C00963() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            MediaPlayerSource.this.vLog("MediaPlayer has completed playback");
            synchronized (MediaPlayerSource.this.mFrameMutex) {
                MediaPlayerSource.this.mCompleted = true;
            }
            MediaPlayerSource.this.wakeUp();
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.filterpacks.video.MediaPlayerSource$4 */
    class C00974 implements OnFrameAvailableListener {
        C00974() {
        }

        public void onFrameAvailable(SurfaceTexture surfaceTexture) {
            if (MediaPlayerSource.this.mLogVerbose) {
                Log.v(MediaPlayerSource.TAG, "New frame from media player");
            }
            synchronized (MediaPlayerSource.this.mFrameMutex) {
                MediaPlayerSource.this.mNewFrameAvailable = true;
            }
            MediaPlayerSource.this.vLog("New frame: wakeUp");
            MediaPlayerSource.this.wakeUp();
        }
    }

    public MediaPlayerSource(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    private static float[] getRotationCoords(int i) {
        switch (i) {
            case 0:
                return TARGET_COORDS_0;
            case 90:
                return TARGET_COORDS_90;
            case MediaDecoder.ROTATE_180 /*180*/:
                return TARGET_COORDS_180;
            case MediaDecoder.ROTATE_90_LEFT /*270*/:
                return TARGET_COORDS_270;
            default:
                throw new RuntimeException("Unsupported rotation angle.");
        }
    }

    public Signature getSignature() {
        return new Signature().addInputPort("sourceUri", 1, INPUT_PATH_TYPE).addInputPort("sourceAsset", 1, INPUT_ASSET_TYPE).addInputPort("context", 1, FrameType.single(Context.class)).addInputPort("loop", 1, FrameType.single(Boolean.TYPE)).addInputPort("volume", 1, FrameType.single(Float.TYPE)).addInputPort("rotation", 1, FrameType.single(Integer.TYPE)).addOutputPort("video", 2, OUTPUT_VIDEO_TYPE).disallowOtherPorts();
    }

    private boolean nextFrame() {
        boolean z;
        synchronized (this.mFrameMutex) {
            z = this.mNewFrameAvailable;
            if (z) {
                this.mNewFrameAvailable = false;
            } else {
                enterSleepState();
            }
        }
        return z;
    }

    public void onClose() {
        if (this.mMediaPlayer.isPlaying()) {
            this.mMediaPlayer.stop();
        }
        this.mPaused = false;
        this.mCompleted = false;
        this.mNewFrameAvailable = false;
        this.mMediaPlayer.release();
        this.mMediaPlayer = null;
        this.mSurfaceTexture.release();
        this.mSurfaceTexture = null;
        vLog("MediaSource closed");
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("sourceUri")) {
            inputPort.bindToFieldNamed("mSourceUri");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("loop")) {
            inputPort.bindToFieldNamed("mLooping");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("volume")) {
            inputPort.bindToFieldNamed("mVolume");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("rotation")) {
            inputPort.bindToFieldNamed("mRotation");
            inputPort.setAutoPullEnabled(true);
        }
    }

    public void onOpen() {
        String valueOf = String.valueOf(this.mSourceUri);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 15);
        stringBuilder.append("Current URL is ");
        stringBuilder.append(valueOf);
        vLog(stringBuilder.toString());
        this.mMediaFrame = TextureSource.newExternalTexture();
        this.mSurfaceTexture = new SurfaceTexture(this.mMediaFrame.getTextureId());
        if (!setupMediaPlayer()) {
            throw new RuntimeException("Error setting up MediaPlayer!");
        }
    }

    protected void onPrepare() {
        this.mFrameExtractor = new ImageShader("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n");
    }

    public void onProcess() {
        vLog("Processing new frame");
        if (this.mMediaPlayer == null) {
            throw new NullPointerException("Unexpected null media player!");
        } else if (this.mCompleted) {
            requestClose();
        } else if (nextFrame()) {
            int i;
            int i2;
            this.mSurfaceTexture.updateTexImage();
            this.mSurfaceTexture.getTransformMatrix(mSurfaceTransform);
            this.mFrameExtractor.setSourceTransform(mSurfaceTransform);
            this.mFrameExtractor.setTargetCoords(getRotationCoords(this.mRotation));
            synchronized (this.mFrameMutex) {
                i = this.mWidth;
                i2 = this.mHeight;
                int i3 = this.mRotation;
                if (!(i3 == 90 || i3 == MediaDecoder.ROTATE_90_LEFT)) {
                    int i4 = i2;
                    i2 = i;
                    i = i4;
                }
            }
            int[] iArr = new int[]{i2, i};
            OutputPort connectedOutputPort = getConnectedOutputPort("video");
            Frame asFrameImage2D = connectedOutputPort.fetchAvailableFrame(iArr).asFrameImage2D();
            this.mFrameExtractor.process(this.mMediaFrame, asFrameImage2D.lockRenderTarget(), i2, i);
            long timestamp = this.mSurfaceTexture.getTimestamp();
            StringBuilder stringBuilder = new StringBuilder(34);
            stringBuilder.append("Timestamp: ");
            stringBuilder.append(timestamp / 1000000);
            stringBuilder.append(" ms");
            vLog(stringBuilder.toString());
            asFrameImage2D.setTimestamp(timestamp);
            asFrameImage2D.unlock();
            connectedOutputPort.pushFrame(asFrameImage2D);
        }
    }

    public void onTearDown() {
        TextureSource textureSource = this.mMediaFrame;
        if (textureSource != null) {
            textureSource.release();
        }
    }

    public synchronized void pauseVideo(boolean z) {
        if (isOpen()) {
            if (z && !this.mPaused) {
                this.mMediaPlayer.pause();
            } else if (!z) {
                if (this.mPaused) {
                    this.mMediaPlayer.start();
                }
            }
        }
        this.mPaused = z;
    }

    private synchronized boolean setupMediaPlayer() {
        this.mPaused = false;
        this.mCompleted = false;
        this.mNewFrameAvailable = false;
        vLog("Setting up playback.");
        if (this.mMediaPlayer != null) {
            vLog("Resetting existing MediaPlayer.");
            this.mMediaPlayer.reset();
        } else {
            vLog("Creating new MediaPlayer.");
            this.mMediaPlayer = new MediaPlayer();
        }
        if (this.mMediaPlayer == null) {
            throw new RuntimeException("Unable to create a MediaPlayer!");
        }
        try {
            String valueOf = String.valueOf(this.mSourceUri);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
            stringBuilder.append("Setting MediaPlayer source to ");
            stringBuilder.append(valueOf);
            vLog(stringBuilder.toString());
            this.mMediaPlayer.setDataSource(getContext().getApplicationContext(), this.mSourceUri);
            this.mMediaPlayer.setLooping(this.mLooping);
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            float f = this.mVolume;
            mediaPlayer.setVolume(f, f);
            Surface surface = new Surface(this.mSurfaceTexture);
            this.mMediaPlayer.setSurface(surface);
            surface.release();
            this.mMediaPlayer.setOnVideoSizeChangedListener(this.onVideoSizeChangedListener);
            this.mMediaPlayer.setOnPreparedListener(this.onPreparedListener);
            this.mMediaPlayer.setOnCompletionListener(this.onCompletionListener);
            this.mSurfaceTexture.setOnFrameAvailableListener(this.onMediaFrameAvailableListener);
            vLog("Preparing MediaPlayer.");
            this.mMediaPlayer.prepareAsync();
        } catch (Throwable e) {
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
            throw new RuntimeException(String.format("Unable to set MediaPlayer to %s!", new Object[]{this.mSourceUri}), e);
        } catch (Throwable e2) {
            this.mMediaPlayer.release();
            this.mMediaPlayer = null;
            throw new RuntimeException(String.format("Unable to set MediaPlayer to URL %s!", new Object[]{this.mSourceUri}), e2);
        }
        return true;
    }

    private void vLog(String str) {
        if (this.mLogVerbose) {
            Log.v(TAG, str);
        }
    }
}
