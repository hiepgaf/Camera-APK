package com.google.android.libraries.smartburst.filterpacks.video;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.google.android.libraries.smartburst.filterpacks.video.GLSurface.Builder;

/* compiled from: PG */
class GPUTranscoder implements Transcoder {
    public static final int OUTPUT_BITRATE = 3000000;
    public static final int OUTPUT_FRAME_RATE = 30;
    public static final int OUTPUT_IFRAME_INTERVAL_SEC = 1;
    public final Builder mBuilder = GLSurface.newBuilder();
    public final Decoder mDecoder = GPUVideoDecoder.newInstance(this.mBuilder);
    public final Encoder mEncoder = GPUVideoEncoder.newInstance(this.mBuilder);
    public final MediaExtractor mMediaExtractor = new MediaExtractor();
    public MediaMuxer mMediaMuxer;

    private GPUTranscoder() {
    }

    public void close() {
        this.mDecoder.close();
        this.mEncoder.close();
        this.mMediaMuxer.stop();
        this.mMediaMuxer.release();
        this.mMediaExtractor.release();
    }

    public static Transcoder newInstance(String str, String str2) {
        Transcoder gPUTranscoder = new GPUTranscoder();
        gPUTranscoder.mMediaExtractor.setDataSource(str);
        int selectVideoTrack = MediaCodecUtil.selectVideoTrack(gPUTranscoder.mMediaExtractor);
        gPUTranscoder.mMediaMuxer = new MediaMuxer(str2, 0);
        gPUTranscoder.mDecoder.setTarget(gPUTranscoder.mEncoder);
        gPUTranscoder.mDecoder.openTrack(gPUTranscoder.mMediaExtractor, selectVideoTrack);
        MediaFormat format = gPUTranscoder.mDecoder.getFormat();
        format = MediaFormat.createVideoFormat("video/avc", format.getInteger("width"), format.getInteger("height"));
        format.setInteger("frame-rate", 30);
        format.setInteger("bitrate", 3000000);
        format.setInteger("i-frame-interval", 1);
        format.setInteger("color-format", 2130708361);
        gPUTranscoder.mEncoder.open(gPUTranscoder.mMediaMuxer, format);
        return gPUTranscoder;
    }

    public void transcode(long j, long j2) {
        this.mDecoder.seekTo(j);
        this.mDecoder.decodeUntil(j2);
    }
}
