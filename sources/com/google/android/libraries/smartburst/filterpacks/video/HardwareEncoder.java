package com.google.android.libraries.smartburst.filterpacks.video;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.view.Surface;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.ImageShader;
import com.google.android.libraries.smartburst.filterfw.RenderTarget;
import java.io.IOException;
import java.util.Arrays;
import p000.jri;

/* compiled from: PG */
public class HardwareEncoder implements VideoEncoder {
    public static final int BIT_RATE = 3000000;
    public static final int FRAME_RATE = 30;
    public static final int IFRAME_INTERVAL_SEC = 1;
    public static final float[] TARGET_COORDS = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    public long mEncodedFrameTimestampNs;
    public Encoder mEncoder;
    public MediaMuxer mMediaMuxer;
    public String mOutputFile;
    public RenderTarget mRenderTarget;
    public ImageShader mShader;

    public void close() {
        this.mEncoder.close();
        this.mMediaMuxer.stop();
        this.mMediaMuxer.release();
    }

    private MediaFormat createMediaFormat(int i, int i2) {
        int selectColorFormat = selectColorFormat(selectCodec("video/avc"), "video/avc", 2130708361);
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i2);
        createVideoFormat.setInteger("color-format", selectColorFormat);
        createVideoFormat.setInteger("bitrate", 3000000);
        createVideoFormat.setInteger("frame-rate", 30);
        createVideoFormat.setInteger("i-frame-interval", 1);
        return createVideoFormat;
    }

    private MediaMuxer createMediaMuxer(String str) {
        try {
            return new MediaMuxer(str, 0);
        } catch (IOException e) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 36);
            stringBuilder.append("Cannot create MediaMuxer for file [");
            stringBuilder.append(str);
            stringBuilder.append("]");
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void encodeFrame(FrameImage2D frameImage2D, long j) {
        BufferInfo bufferInfo = new BufferInfo();
        renderFrameToSurface(frameImage2D, ((GLSurface) this.mEncoder.get()).getInputSurface());
        long j2 = this.mEncodedFrameTimestampNs;
        bufferInfo.presentationTimeUs = j2 / 1000;
        this.mEncodedFrameTimestampNs = j2 + j;
        this.mEncoder.onNewFrameAvailable(bufferInfo);
    }

    public long getDurationMs() {
        return this.mEncodedFrameTimestampNs / 1000000;
    }

    public void initialize(String str, int i, int i2) {
        boolean z;
        boolean z2 = false;
        jri.m13152b((Object) str);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (i2 > 0) {
            z2 = true;
        }
        jri.m13143a(z2);
        this.mOutputFile = str;
        this.mMediaMuxer = createMediaMuxer(this.mOutputFile);
        this.mEncoder = GPUVideoEncoder.newInstance(GLSurface.newBuilder().setEncoderOnly(true).setDirectSurface(true));
        this.mEncoder.open(this.mMediaMuxer, createMediaFormat(i, i2));
        this.mEncodedFrameTimestampNs = 0;
    }

    private void renderFrameToSurface(FrameImage2D frameImage2D, Surface surface) {
        if (this.mRenderTarget == null) {
            this.mRenderTarget = RenderTarget.currentTarget().forSurface(surface);
            this.mRenderTarget.registerAsDisplaySurface();
        }
        if (this.mShader == null) {
            this.mShader = ImageShader.createIdentity();
            this.mShader.setTargetCoords(TARGET_COORDS);
        }
        this.mShader.process(frameImage2D.lockTextureSource(), this.mRenderTarget, frameImage2D.getWidth(), frameImage2D.getHeight());
        frameImage2D.unlock();
        EGLExt.eglPresentationTimeANDROID(EGL14.eglGetCurrentDisplay(), EGL14.eglGetCurrentSurface(12377), this.mEncodedFrameTimestampNs);
        this.mRenderTarget.swapBuffers();
    }

    private static MediaCodecInfo selectCodec(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                for (String equalsIgnoreCase : supportedTypes) {
                    if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
                continue;
            }
        }
        return null;
    }

    @TargetApi(21)
    private static int selectColorFormat(MediaCodecInfo mediaCodecInfo, String str, int i) {
        CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        Arrays.sort(capabilitiesForType.colorFormats);
        return Arrays.binarySearch(capabilitiesForType.colorFormats, i) >= 0 ? i : capabilitiesForType.colorFormats[0];
    }
}
