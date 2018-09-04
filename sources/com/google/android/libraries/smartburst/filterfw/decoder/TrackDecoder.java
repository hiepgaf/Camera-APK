package com.google.android.libraries.smartburst.filterfw.decoder;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;

@TargetApi(16)
/* compiled from: PG */
abstract class TrackDecoder {
    public static final String LOG_TAG = "TrackDecoder";
    public static final int NO_INPUT_BUFFER = -1;
    public static final long TIMEOUT_US = 50;
    public ByteBuffer[] mCodecInputBuffers;
    public ByteBuffer[] mCodecOutputBuffers;
    public final Listener mListener;
    public MediaCodec mMediaCodec;
    public final MediaFormat mMediaFormat;
    public MediaFormat mOutputFormat;
    public boolean mShouldEnqueueEndOfStream;
    public final Queue mSynchronizationSampleTimestampsUs;
    public final int mTrackIndex;

    /* compiled from: PG */
    interface Listener {
        void onDecodedOutputAvailable(TrackDecoder trackDecoder);

        void onEndOfStream(TrackDecoder trackDecoder);
    }

    protected TrackDecoder(int i, MediaFormat mediaFormat, Listener listener) {
        this.mTrackIndex = i;
        if (mediaFormat == null) {
            throw new NullPointerException("mediaFormat cannot be null");
        }
        this.mMediaFormat = mediaFormat;
        if (listener == null) {
            throw new NullPointerException("listener cannot be null");
        }
        this.mListener = listener;
        this.mSynchronizationSampleTimestampsUs = new LinkedList();
    }

    public abstract void advance();

    public abstract long getTimestampNs();

    protected abstract MediaCodec initMediaCodec(MediaFormat mediaFormat);

    protected abstract boolean onDataAvailable(MediaCodec mediaCodec, ByteBuffer[] byteBufferArr, int i, BufferInfo bufferInfo, boolean z);

    public boolean drainOutputBuffer() {
        BufferInfo bufferInfo = new BufferInfo();
        int dequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(bufferInfo, 50);
        if ((bufferInfo.flags & 4) != 0) {
            this.mListener.onEndOfStream(this);
            return false;
        }
        if (this.mShouldEnqueueEndOfStream) {
            tryEnqueueEndOfStream();
        }
        if (dequeueOutputBuffer >= 0) {
            boolean z;
            if (this.mSynchronizationSampleTimestampsUs.isEmpty()) {
                z = false;
            } else {
                boolean z2;
                long longValue = ((Long) this.mSynchronizationSampleTimestampsUs.peek()).longValue();
                if (bufferInfo.presentationTimeUs == longValue) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bufferInfo.presentationTimeUs >= longValue) {
                    this.mSynchronizationSampleTimestampsUs.remove();
                    z = z2;
                } else {
                    z = z2;
                }
            }
            return onDataAvailable(this.mMediaCodec, this.mCodecOutputBuffers, dequeueOutputBuffer, bufferInfo, z);
        } else if (dequeueOutputBuffer == -3) {
            this.mCodecOutputBuffers = this.mMediaCodec.getOutputBuffers();
            return true;
        } else if (dequeueOutputBuffer != -2) {
            return false;
        } else {
            this.mOutputFormat = this.mMediaCodec.getOutputFormat();
            String valueOf = String.valueOf(this.mOutputFormat);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 29);
            stringBuilder.append("Output format has changed to ");
            stringBuilder.append(valueOf);
            Log.d(LOG_TAG, stringBuilder.toString());
            return true;
        }
    }

    public boolean feedInput(MediaExtractor mediaExtractor) {
        int dequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(50);
        if (dequeueInputBuffer == -1) {
            return false;
        }
        int readSampleData = mediaExtractor.readSampleData(this.mCodecInputBuffers[dequeueInputBuffer], 0);
        if (readSampleData < 0) {
            Log.w(LOG_TAG, "Media extractor had sample but no data.");
            this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
            return false;
        }
        int i;
        long sampleTime = mediaExtractor.getSampleTime();
        if ((mediaExtractor.getSampleFlags() & 1) != 0) {
            this.mSynchronizationSampleTimestampsUs.add(Long.valueOf(sampleTime));
            i = 1;
        } else {
            i = 0;
        }
        this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, sampleTime, i);
        if (mediaExtractor.advance() && mediaExtractor.getSampleTrackIndex() == this.mTrackIndex) {
            return true;
        }
        return false;
    }

    protected MediaCodec getMediaCodec() {
        return this.mMediaCodec;
    }

    public void init() {
        this.mMediaCodec = initMediaCodec(this.mMediaFormat);
        this.mMediaCodec.start();
        this.mCodecInputBuffers = this.mMediaCodec.getInputBuffers();
        this.mCodecOutputBuffers = this.mMediaCodec.getOutputBuffers();
        this.mSynchronizationSampleTimestampsUs.clear();
    }

    protected void notifyListener() {
        this.mListener.onDecodedOutputAvailable(this);
    }

    public void release() {
        MediaCodec mediaCodec = this.mMediaCodec;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.mMediaCodec.release();
        }
    }

    public void signalEndOfInput() {
        this.mShouldEnqueueEndOfStream = true;
        tryEnqueueEndOfStream();
    }

    private void tryEnqueueEndOfStream() {
        int dequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(50);
        if (dequeueInputBuffer != -1) {
            this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
            this.mShouldEnqueueEndOfStream = false;
        }
    }
}
