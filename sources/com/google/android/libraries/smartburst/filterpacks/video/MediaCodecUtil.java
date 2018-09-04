package com.google.android.libraries.smartburst.filterpacks.video;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaExtractor;
import android.media.MediaFormat;

/* compiled from: PG */
class MediaCodecUtil {
    private MediaCodecUtil() {
        throw new IllegalAccessException("No instances allowed.");
    }

    public static int dequeueInputBuffer(MediaCodec mediaCodec) {
        while (true) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0);
            if (dequeueInputBuffer != -3 && dequeueInputBuffer != -2) {
                return dequeueInputBuffer;
            }
        }
    }

    public static int dequeueOutputBuffer(MediaCodec mediaCodec, long j, BufferInfo bufferInfo) {
        while (true) {
            int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j);
            if (dequeueOutputBuffer != -3 && dequeueOutputBuffer != -2) {
                return dequeueOutputBuffer;
            }
        }
    }

    public static boolean isVideo(MediaFormat mediaFormat) {
        return mediaFormat.getString("mime").startsWith("video/");
    }

    public static int selectVideoTrack(MediaExtractor mediaExtractor) {
        for (int i = 0; i < mediaExtractor.getTrackCount(); i++) {
            if (isVideo(mediaExtractor.getTrackFormat(i))) {
                mediaExtractor.selectTrack(i);
                return i;
            }
        }
        return -1;
    }

    public static boolean signalEndOfStream(MediaCodec mediaCodec) {
        int dequeueInputBuffer = dequeueInputBuffer(mediaCodec);
        if (dequeueInputBuffer < 0) {
            return false;
        }
        mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0, 4);
        return true;
    }
}
