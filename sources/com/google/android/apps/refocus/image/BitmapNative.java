package com.google.android.apps.refocus.image;

import android.graphics.Bitmap;

/* compiled from: PG */
public class BitmapNative {
    static {
        System.loadLibrary("refocus");
    }

    public static native void decodeJPEGToChannel(byte[] bArr, Bitmap bitmap, int i);

    public static native byte[] encodeChannelAsJPEG(Bitmap bitmap, int i, int i2);

    public static native void getAlphaChannel(Bitmap bitmap, Bitmap bitmap2);

    public static native int getPixel(Bitmap bitmap, int i, int i2);

    public static native boolean getRegion(Bitmap bitmap, int i, int i2, Bitmap bitmap2);

    public static native boolean resize(Bitmap bitmap, Bitmap bitmap2);

    public static native void setAlphaChannel(Bitmap bitmap, Bitmap bitmap2);

    public static native boolean setRegion(Bitmap bitmap, int i, int i2, Bitmap bitmap2, int i3, int i4);
}
