package com.google.android.libraries.smartburst.filterpacks.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;

/* compiled from: PG */
class CPUTranscoder implements Transcoder {
    public static final int OUTPUT_BITRATE = 3000000;
    public static final int OUTPUT_FRAME_RATE = 30;
    public static final int OUTPUT_IFRAME_INTERVAL_SEC = 1;
    public final Decoder mDecoder = CPUVideoDecoder.newInstance();
    public final Encoder mEncoder = CPUVideoEncoder.newInstance();
    public final MediaExtractor mMediaExtractor = new MediaExtractor();
    public MediaMuxer mMediaMuxer;

    private CPUTranscoder() {
    }

    public void close() {
        this.mDecoder.close();
        this.mEncoder.close();
        this.mMediaMuxer.stop();
        this.mMediaMuxer.release();
        this.mMediaExtractor.release();
    }

    private static boolean isSupportedYUV420Format(int i) {
        switch (i) {
            case 19:
            case 20:
            case 21:
            case 39:
            case 2130706688:
                return true;
            default:
                return false;
        }
    }

    public static Transcoder newInstance(String str, String str2) {
        Transcoder cPUTranscoder = new CPUTranscoder();
        cPUTranscoder.mMediaExtractor.setDataSource(str);
        int selectVideoTrack = MediaCodecUtil.selectVideoTrack(cPUTranscoder.mMediaExtractor);
        cPUTranscoder.mMediaMuxer = new MediaMuxer(str2, 0);
        cPUTranscoder.mDecoder.setTarget(cPUTranscoder.mEncoder);
        cPUTranscoder.mDecoder.openTrack(cPUTranscoder.mMediaExtractor, selectVideoTrack);
        MediaFormat format = cPUTranscoder.mDecoder.getFormat();
        int integer = format.getInteger("width");
        selectVideoTrack = format.getInteger("height");
        int selectColorFormat = selectColorFormat(selectCodec("video/avc"), "video/avc");
        format = MediaFormat.createVideoFormat("video/avc", integer, selectVideoTrack);
        format.setInteger("frame-rate", 30);
        format.setInteger("bitrate", 3000000);
        format.setInteger("i-frame-interval", 1);
        format.setInteger("color-format", selectColorFormat);
        cPUTranscoder.mEncoder.open(cPUTranscoder.mMediaMuxer, format);
        return cPUTranscoder;
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

    private static int selectColorFormat(MediaCodecInfo mediaCodecInfo, String str) {
        CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        for (int i : capabilitiesForType.colorFormats) {
            if (isSupportedYUV420Format(i)) {
                return i;
            }
        }
        throw new IllegalStateException("Unable to find a supported format.");
    }

    public void transcode(long j, long j2) {
        this.mDecoder.seekTo(j);
        this.mDecoder.decodeUntil(j2);
    }
}
