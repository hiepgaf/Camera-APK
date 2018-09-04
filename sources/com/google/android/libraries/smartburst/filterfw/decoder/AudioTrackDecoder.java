package com.google.android.libraries.smartburst.filterfw.decoder;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.google.android.libraries.smartburst.filterfw.FrameValue;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import p000.kqg;

@TargetApi(16)
/* compiled from: PG */
public class AudioTrackDecoder extends TrackDecoder {
    public int mAudioChannelCount;
    public int mAudioSampleRate;
    public final BlockingDeque mAudioSamples;
    public long mPresentationTimeUs;

    public AudioTrackDecoder(int i, MediaFormat mediaFormat, Listener listener) {
        super(i, mediaFormat, listener);
        if (DecoderUtil.isAudioFormat(mediaFormat)) {
            this.mAudioSamples = new LinkedBlockingDeque();
            this.mAudioSampleRate = mediaFormat.getInteger("sample-rate");
            this.mAudioChannelCount = mediaFormat.getInteger("channel-count");
            return;
        }
        throw new IllegalArgumentException("AudioTrackDecoder can only be used with audio formats");
    }

    public void advance() {
        this.mAudioSamples.pop();
    }

    public void clearBuffer() {
        this.mAudioSamples.clear();
    }

    public /* bridge */ /* synthetic */ boolean drainOutputBuffer() {
        return super.drainOutputBuffer();
    }

    public /* bridge */ /* synthetic */ boolean feedInput(MediaExtractor mediaExtractor) {
        return super.feedInput(mediaExtractor);
    }

    public long getTimestampNs() {
        return this.mPresentationTimeUs * 1000;
    }

    public void grabSample(FrameValue frameValue) {
        frameValue.setValue((AudioSample) this.mAudioSamples.getFirst());
        frameValue.setTimestamp(getTimestampNs());
    }

    public /* bridge */ /* synthetic */ void init() {
        super.init();
    }

    protected MediaCodec initMediaCodec(MediaFormat mediaFormat) {
        Throwable e;
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = MediaCodec.createDecoderByType(mediaFormat.getString("mime"));
            try {
                mediaCodec.configure(mediaFormat, null, null, 0);
            } catch (IOException e2) {
                e = e2;
                kqg.f8420a.mo2210b(e);
                return mediaCodec;
            }
        } catch (IOException e3) {
            e = e3;
            kqg.f8420a.mo2210b(e);
            return mediaCodec;
        }
        return mediaCodec;
    }

    protected boolean onDataAvailable(MediaCodec mediaCodec, ByteBuffer[] byteBufferArr, int i, BufferInfo bufferInfo, boolean z) {
        ByteBuffer byteBuffer = byteBufferArr[i];
        byte[] bArr = new byte[bufferInfo.size];
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.get(bArr, 0, bufferInfo.size);
        this.mAudioSamples.offerLast(new AudioSample(this.mAudioSampleRate, this.mAudioChannelCount, bArr, bufferInfo.presentationTimeUs));
        byteBuffer.clear();
        mediaCodec.releaseOutputBuffer(i, false);
        this.mPresentationTimeUs = bufferInfo.presentationTimeUs;
        notifyListener();
        return true;
    }

    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    public /* bridge */ /* synthetic */ void signalEndOfInput() {
        super.signalEndOfInput();
    }
}
