package com.google.android.libraries.smartburst.filterpacks.video;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* compiled from: PG */
public class CPUVideoDecoder implements Decoder {
    public static final int TIMEOUT_WAIT_BUFFER_US = 0;
    public final BufferInfo mBufferInfo = new BufferInfo();
    public long mCurrentTimestampUs;
    public MediaCodec mDecoder;
    public DecoderTarget mDecoderTarget;
    public boolean mEndSignaled;
    public MediaExtractor mMediaExtractor;
    public MediaFormat mMediaFormat;

    private CPUVideoDecoder() {
    }

    public void close() {
        while ((this.mBufferInfo.flags & 4) == 0) {
            signalEndOfStreamIfNecessary();
            drainOutput(true);
        }
        releaseExtractor();
        releaseDecoder();
    }

    private void copyToDecoderTarget(int i) {
        if (this.mDecoderTarget != null) {
            ByteBuffer byteBuffer = this.mDecoder.getOutputBuffers()[i];
            ByteBuffer byteBuffer2 = (ByteBuffer) this.mDecoderTarget.get();
            byteBuffer.rewind();
            byteBuffer2.rewind();
            byteBuffer2.put(byteBuffer);
            this.mDecoderTarget.onNewFrameAvailable(this.mBufferInfo);
        }
    }

    private boolean decodeFrameIfAvailable() {
        int dequeueInputBuffer = MediaCodecUtil.dequeueInputBuffer(this.mDecoder);
        if (dequeueInputBuffer < 0) {
            return false;
        }
        int readSampleData = this.mMediaExtractor.readSampleData(this.mDecoder.getInputBuffers()[dequeueInputBuffer], 0);
        if (readSampleData == -1) {
            signalEndOfStreamIfNecessary();
            return false;
        }
        this.mDecoder.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.mMediaExtractor.getSampleTime(), 0);
        if (!this.mMediaExtractor.advance()) {
            signalEndOfStreamIfNecessary();
        }
        this.mCurrentTimestampUs = this.mMediaExtractor.getSampleTime();
        return true;
    }

    public long decodeUntil(long j) {
        processFramesUntil(j, true);
        return this.mCurrentTimestampUs;
    }

    private boolean dequeueAvailableOutput(boolean z) {
        boolean z2 = false;
        int dequeueOutputBuffer = MediaCodecUtil.dequeueOutputBuffer(this.mDecoder, 0, this.mBufferInfo);
        if (dequeueOutputBuffer < 0) {
            return false;
        }
        if (this.mBufferInfo.size != 0) {
            z2 = true;
        }
        if (z) {
            copyToDecoderTarget(dequeueOutputBuffer);
        }
        this.mDecoder.releaseOutputBuffer(dequeueOutputBuffer, z2);
        return true;
    }

    private void drainOutput(boolean z) {
        do {
        } while (dequeueAvailableOutput(z));
    }

    public MediaFormat getFormat() {
        return this.mMediaFormat;
    }

    public static Decoder newInstance() {
        return new CPUVideoDecoder();
    }

    public void openTrack(MediaExtractor mediaExtractor, int i) {
        this.mMediaExtractor = mediaExtractor;
        this.mMediaFormat = mediaExtractor.getTrackFormat(i);
        mediaExtractor.selectTrack(i);
        setupCodec();
    }

    private void processFramesUntil(long j, boolean z) {
        while (this.mCurrentTimestampUs < j && this.mMediaExtractor.getSampleTrackIndex() != -1) {
            if (!decodeFrameIfAvailable()) {
                drainOutput(z);
            }
        }
    }

    private void releaseDecoder() {
        MediaCodec mediaCodec = this.mDecoder;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.mDecoder.release();
            this.mDecoder = null;
        }
    }

    private void releaseExtractor() {
        this.mMediaExtractor.release();
    }

    public long seekTo(long j) {
        this.mMediaExtractor.seekTo(j, 0);
        this.mCurrentTimestampUs = this.mMediaExtractor.getSampleTime();
        processFramesUntil(j, false);
        return this.mCurrentTimestampUs;
    }

    public void setTarget(DecoderTarget decoderTarget) {
        this.mDecoderTarget = decoderTarget;
    }

    private void setupCodec() {
        this.mDecoder = MediaCodec.createDecoderByType(this.mMediaFormat.getString("mime"));
        this.mDecoder.configure(this.mMediaFormat, null, null, 0);
        this.mDecoder.start();
    }

    private void signalEndOfStreamIfNecessary() {
        if (!this.mEndSignaled && MediaCodecUtil.signalEndOfStream(this.mDecoder)) {
            this.mEndSignaled = true;
        }
    }
}
