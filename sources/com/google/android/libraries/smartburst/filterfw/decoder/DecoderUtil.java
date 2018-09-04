package com.google.android.libraries.smartburst.filterfw.decoder;

import android.annotation.TargetApi;
import android.media.MediaFormat;

@TargetApi(16)
/* compiled from: PG */
public class DecoderUtil {
    public static final boolean ENABLE_ALL_VIDEO_FORMATS = false;

    public static boolean isAudioFormat(MediaFormat mediaFormat) {
        return mediaFormat.getString("mime").startsWith("audio/");
    }

    public static boolean isSupportedVideoFormat(MediaFormat mediaFormat) {
        return mediaFormat.getString("mime").equals("video/avc");
    }
}
