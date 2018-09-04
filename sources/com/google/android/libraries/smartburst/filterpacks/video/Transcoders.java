package com.google.android.libraries.smartburst.filterpacks.video;

/* compiled from: PG */
public class Transcoders {
    private Transcoders() {
        throw new IllegalAccessException("No instances allowed.");
    }

    public static Transcoder newCPUTranscoder(String str, String str2) {
        return CPUTranscoder.newInstance(str, str2);
    }

    public static Transcoder newGPUTranscoder(String str, String str2) {
        return GPUTranscoder.newInstance(str, str2);
    }
}
