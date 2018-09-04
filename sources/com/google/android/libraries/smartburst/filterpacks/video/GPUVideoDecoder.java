package com.google.android.libraries.smartburst.filterpacks.video;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import com.google.android.libraries.smartburst.filterpacks.video.GLSurface.Builder;
import java.nio.ByteBuffer;
import p000.aqe;

/* compiled from: PG */
public class GPUVideoDecoder implements Decoder {
    public long mCurrentTimestampUs;
    public final BufferInfo mDecodedInfo = new BufferInfo();
    public MediaCodec mDecoder;
    public DecoderTarget mDecoderTarget;
    public boolean mEndSignaled;
    public MediaExtractor mExtractor;
    public final Builder mGLSurfaceBuilder;
    public MediaFormat mMediaFormat;

    private GPUVideoDecoder(Builder builder) {
        this.mGLSurfaceBuilder = builder;
    }

    public void close() {
        signalEndOfStreamIfNecessary();
        drainOutput(true);
        this.mGLSurfaceBuilder.getOrBuild().close();
        releaseDecoder();
        this.mGLSurfaceBuilder.reset();
        this.mExtractor = null;
        this.mMediaFormat = null;
        this.mDecoderTarget = null;
    }

    private void copyToDecoderTarget() {
        if (this.mDecoderTarget != null) {
            this.mGLSurfaceBuilder.getOrBuild().drawImage();
            this.mDecoderTarget.onNewFrameAvailable(this.mDecodedInfo);
        }
    }

    public long decodeUntil(long j) {
        setupDecoderIfNecessary();
        this.mGLSurfaceBuilder.getOrBuild().makeCurrent();
        processFramesUntil(j, true);
        return this.mCurrentTimestampUs;
    }

    private void drainOutput(boolean z) {
        do {
        } while (processSingleFrame(z));
    }

    public MediaFormat getFormat() {
        return this.mMediaFormat;
    }

    public static Decoder newInstance(Builder builder) {
        return new GPUVideoDecoder(builder);
    }

    public void openTrack(MediaExtractor mediaExtractor, int i) {
        this.mExtractor = mediaExtractor;
        this.mExtractor.selectTrack(i);
        this.mMediaFormat = this.mExtractor.getTrackFormat(i);
        this.mEndSignaled = false;
        this.mGLSurfaceBuilder.setFormat(this.mMediaFormat);
    }

    private long processFramesUntil(long j, boolean z) {
        this.mCurrentTimestampUs = this.mExtractor.getSampleTime();
        ByteBuffer[] inputBuffers = this.mDecoder.getInputBuffers();
        while (this.mCurrentTimestampUs < j && this.mExtractor.getSampleTrackIndex() != -1) {
            int dequeueInputBuffer = MediaCodecUtil.dequeueInputBuffer(this.mDecoder);
            if (dequeueInputBuffer < 0) {
                drainOutput(z);
            } else {
                int readSampleData = this.mExtractor.readSampleData(inputBuffers[dequeueInputBuffer], 0);
                if (readSampleData == -1) {
                    signalEndOfStreamIfNecessary();
                    break;
                }
                this.mDecoder.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.mExtractor.getSampleTime(), 0);
                if (!this.mExtractor.advance()) {
                    signalEndOfStreamIfNecessary();
                    break;
                }
                this.mCurrentTimestampUs = this.mExtractor.getSampleTime();
            }
        }
        drainOutput(z);
        return this.mCurrentTimestampUs;
    }

    private boolean processSingleFrame(boolean z) {
        boolean z2 = false;
        int dequeueOutputBuffer = MediaCodecUtil.dequeueOutputBuffer(this.mDecoder, 0, this.mDecodedInfo);
        if (dequeueOutputBuffer < 0) {
            return false;
        }
        if (this.mDecodedInfo.size > 0) {
            z2 = true;
        }
        this.mDecoder.releaseOutputBuffer(dequeueOutputBuffer, z2);
        if (z2) {
            this.mGLSurfaceBuilder.getOrBuild().awaitNewImage();
            if (z) {
                copyToDecoderTarget();
            }
        }
        if ((this.mDecodedInfo.flags & 4) != 0) {
            this.mDecoderTarget.onEndOfStream();
        }
        return true;
    }

    private void releaseDecoder() {
        MediaCodec mediaCodec = this.mDecoder;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.mDecoder.release();
            this.mDecoder = null;
        }
    }

    public long seekTo(long j) {
        setupDecoderIfNecessary();
        this.mGLSurfaceBuilder.getOrBuild().makeCurrent();
        aqe.m585a(this.mExtractor, "Argument must not be null");
        this.mExtractor.seekTo(j, 0);
        this.mCurrentTimestampUs = this.mExtractor.getSampleTime();
        processFramesUntil(j, false);
        return this.mCurrentTimestampUs;
    }

    public void setTarget(DecoderTarget decoderTarget) {
        this.mDecoderTarget = decoderTarget;
    }

    private void setupDecoderIfNecessary() {
        if (this.mDecoder == null) {
            Surface surfaceForDecoderOutput = this.mGLSurfaceBuilder.getOrBuild().surfaceForDecoderOutput();
            this.mDecoder = MediaCodec.createDecoderByType(this.mMediaFormat.getString("mime"));
            this.mDecoder.configure(this.mMediaFormat, surfaceForDecoderOutput, null, 0);
            this.mDecoder.start();
        }
    }

    private void signalEndOfStreamIfNecessary() {
        if (!this.mEndSignaled) {
            MediaCodec mediaCodec = this.mDecoder;
            if (mediaCodec != null && MediaCodecUtil.signalEndOfStream(mediaCodec)) {
                this.mEndSignaled = true;
            }
        }
    }
}
