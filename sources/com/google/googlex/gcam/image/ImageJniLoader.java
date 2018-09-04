package com.google.googlex.gcam.image;

import com.google.googlex.gcam.JniUtilsJniLoader;

/* compiled from: PG */
public class ImageJniLoader {
    static {
        JniUtilsJniLoader.initialize();
        System.loadLibrary("ImageJni");
    }

    private ImageJniLoader() {
    }

    public static void initialize() {
    }
}
