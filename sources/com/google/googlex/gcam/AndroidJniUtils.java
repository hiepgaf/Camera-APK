package com.google.googlex.gcam;

import android.graphics.Bitmap;
import android.view.Surface;

/* compiled from: PG */
public final class AndroidJniUtils {
    static {
        GcamSwigLoader.initialize();
        System.loadLibrary("AndroidJniUtilsJni");
    }

    static native long lockBitmap(Bitmap bitmap);

    static native long lockSurface(Surface surface);

    static native void unlockBitmap(Bitmap bitmap);

    static native void unlockSurface(long j);

    private AndroidJniUtils() {
    }

    public static void initialize() {
    }
}
