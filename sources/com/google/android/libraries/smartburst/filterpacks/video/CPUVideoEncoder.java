package com.google.android.libraries.smartburst.filterpacks.video;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import java.nio.ByteBuffer;

/* compiled from: PG */
public class CPUVideoEncoder implements Encoder {
    public final BufferInfo mBufferInfo = new BufferInfo();
    public int mCurrentTrack;
    public MediaCodec mEncoder;
    public boolean mEndOfStreamSent = false;
    public MediaFormat mFormat;
    public int mLastBufferIndexProvided = -1;
    public MediaMuxer mMuxer;

    private CPUVideoEncoder() {
    }

    public void close() {
        int i = 0;
        while ((this.mBufferInfo.flags & 4) == 0) {
            sendEndOfStreamIfNecessary();
            if (!encodeFrame()) {
                i++;
                if (i > 100) {
                    break;
                }
            }
        }
        this.mEncoder.flush();
        this.mEncoder.release();
    }

    public void drainOutput() {
        do {
        } while (encodeFrame());
    }

    private boolean encodeFrame() {
        int dequeueOutputBuffer;
        ByteBuffer[] outputBuffers = this.mEncoder.getOutputBuffers();
        while (true) {
            dequeueOutputBuffer = this.mEncoder.dequeueOutputBuffer(this.mBufferInfo, 0);
            if (dequeueOutputBuffer != -1) {
                if (dequeueOutputBuffer != -3) {
                    if (dequeueOutputBuffer != -2) {
                        break;
                    }
                    this.mCurrentTrack = this.mMuxer.addTrack(this.mEncoder.getOutputFormat());
                    this.mMuxer.start();
                } else {
                    outputBuffers = this.mEncoder.getOutputBuffers();
                }
            } else {
                return false;
            }
        }
        ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
        BufferInfo bufferInfo = this.mBufferInfo;
        if ((bufferInfo.flags & 2) != 0) {
            bufferInfo.size = 0;
        }
        if (bufferInfo.size != 0) {
            this.mMuxer.writeSampleData(this.mCurrentTrack, byteBuffer, bufferInfo);
        }
        this.mEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
        return true;
    }

    public ByteBuffer get() {
        ByteBuffer[] inputBuffers = this.mEncoder.getInputBuffers();
        while (true) {
            int dequeueInputBuffer = MediaCodecUtil.dequeueInputBuffer(this.mEncoder);
            if (dequeueInputBuffer >= 0) {
                this.mLastBufferIndexProvided = dequeueInputBuffer;
                return inputBuffers[dequeueInputBuffer];
            }
            drainOutput();
        }
    }

    public static Encoder newInstance() {
        return new CPUVideoEncoder();
    }

    public void onEndOfStream() {
        sendEndOfStreamIfNecessary();
    }

    public void onNewFrameAvailable(BufferInfo bufferInfo) {
        this.mEncoder.queueInputBuffer(this.mLastBufferIndexProvided, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
    }

    public void open(MediaMuxer mediaMuxer, MediaFormat mediaFormat) {
        this.mFormat = mediaFormat;
        this.mMuxer = mediaMuxer;
        this.mEncoder = MediaCodec.createEncoderByType(mediaFormat.getString("mime"));
        this.mEncoder.configure(this.mFormat, null, null, 1);
        this.mEncoder.start();
    }

    private void sendEndOfStreamIfNecessary() {
        if (!this.mEndOfStreamSent) {
            MediaCodecUtil.signalEndOfStream(this.mEncoder);
            this.mEndOfStreamSent = true;
        }
    }
}
