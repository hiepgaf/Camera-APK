package com.google.googlex.gcam.imageproc;

import com.google.googlex.gcam.JniUtilsJniLoader;

/* compiled from: PG */
public class ImageProcJniLoader {
    static {
        JniUtilsJniLoader.initialize();
        System.loadLibrary("ImageProcJni");
    }

    private ImageProcJniLoader() {
    }

    public static void initialize() {
    }
}
