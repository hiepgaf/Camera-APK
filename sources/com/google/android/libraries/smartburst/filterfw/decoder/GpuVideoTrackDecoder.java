package com.google.android.libraries.smartburst.filterfw.decoder;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameValue;
import com.google.android.libraries.smartburst.filterfw.SurfaceFrameDistributor;
import com.google.android.libraries.smartburst.filterfw.SurfaceFrameDistributor.Listener;
import com.google.android.libraries.smartburst.filterfw.SurfaceFrameDistributor.SurfaceTextureManager;
import com.google.android.libraries.smartburst.filterfw.SurfaceTexTransform;
import com.google.android.libraries.smartburst.filterfw.TextureSource;
import com.google.android.libraries.smartburst.filterfw.geometry.Scaler;
import java.io.IOException;
import java.nio.ByteBuffer;
import p000.kqg;

@TargetApi(16)
/* compiled from: PG */
public class GpuVideoTrackDecoder extends VideoTrackDecoder {
    public volatile boolean mCurrentIsKeyFrame;
    public volatile long mCurrentPresentationTimeUs;
    public final SurfaceFrameDistributor mDistributor;
    public final HandlerThread mFrameServerThread = new HandlerThread("gpu-frames");
    public final int mOutputHeight;
    public final int mOutputWidth;
    public volatile Surface mSurface;

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.decoder.GpuVideoTrackDecoder$1 */
    class C01451 implements Listener {
        C01451() {
        }

        public void onFrameAvailable(long j) {
            GpuVideoTrackDecoder.this.markFrameAvailable();
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.libraries.smartburst.filterfw.decoder.GpuVideoTrackDecoder$2 */
    class C01462 implements SurfaceTextureManager {
        public SurfaceTexture mSurfaceTexture;
        public TextureSource mTextureSource;

        C01462() {
        }

        public SurfaceTexture createSurfaceTexture() {
            this.mTextureSource = TextureSource.newExternalTexture();
            this.mSurfaceTexture = new SurfaceTexture(this.mTextureSource.getTextureId());
            GpuVideoTrackDecoder.this.mSurface = new Surface(this.mSurfaceTexture);
            this.mSurfaceTexture.detachFromGLContext();
            return this.mSurfaceTexture;
        }

        public void releaseSurfaceTexture(SurfaceTexture surfaceTexture) {
            this.mSurfaceTexture.release();
            this.mTextureSource.release();
        }
    }

    public GpuVideoTrackDecoder(int i, MediaFormat mediaFormat, Listener listener) {
        super(i, mediaFormat, listener);
        this.mOutputWidth = mediaFormat.getInteger("width");
        this.mOutputHeight = mediaFormat.getInteger("height");
        this.mFrameServerThread.start();
        this.mDistributor = new SurfaceFrameDistributor(new C01451(), new C01462(), new Handler(this.mFrameServerThread.getLooper()));
        this.mDistributor.setup();
    }

    protected void copyFrameDataTo(FrameImage2D frameImage2D, FrameValue frameValue, Scaler scaler, int i) {
        FrameImage2D frameImage2D2 = frameImage2D;
        this.mDistributor.grabFrame(frameImage2D2, this.mOutputWidth, this.mOutputHeight, SurfaceTexTransform.create(i, false, true), scaler);
        frameImage2D.setTimestamp(getTimestampNs());
        if (frameValue != null) {
            frameValue.setValue(new VideoFrameInfo(this.mCurrentIsKeyFrame));
            frameValue.setTimestamp(getTimestampNs());
        }
    }

    public long getTimestampNs() {
        return this.mCurrentPresentationTimeUs * 1000;
    }

    protected MediaCodec initMediaCodec(MediaFormat mediaFormat) {
        MediaCodec createDecoderByType;
        Throwable e;
        this.mDistributor.waitForCommand();
        try {
            createDecoderByType = MediaCodec.createDecoderByType(mediaFormat.getString("mime"));
            try {
                createDecoderByType.configure(mediaFormat, this.mSurface, null, 0);
                this.mSurface.release();
            } catch (IOException e2) {
                e = e2;
                try {
                    kqg.f8420a.mo2210b(e);
                    return createDecoderByType;
                } finally {
                    this.mSurface.release();
                }
            }
        } catch (Throwable e3) {
            e = e3;
            createDecoderByType = null;
            kqg.f8420a.mo2210b(e);
            return createDecoderByType;
        }
        return createDecoderByType;
    }

    protected boolean onDataAvailable(MediaCodec mediaCodec, ByteBuffer[] byteBufferArr, int i, BufferInfo bufferInfo, boolean z) {
        boolean waitForFrameGrabs = waitForFrameGrabs();
        this.mCurrentPresentationTimeUs = bufferInfo.presentationTimeUs;
        this.mCurrentIsKeyFrame = z;
        mediaCodec.releaseOutputBuffer(i, waitForFrameGrabs);
        if (waitForFrameGrabs && waitForOnFrameAvailable()) {
            notifyListener();
        }
        return false;
    }

    public void release() {
        super.release();
        this.mDistributor.release();
    }

    private boolean waitForOnFrameAvailable() {
        synchronized (this.mFrameMonitor) {
            while (!this.mFrameAvailable) {
                try {
                    this.mFrameMonitor.wait();
                } catch (InterruptedException e) {
                    return false;
                }
            }
        }
        return true;
    }
}
