package com.google.android.libraries.smartburst.filterpacks.image;

import java.nio.ByteBuffer;
import p000.jri;

/* compiled from: PG */
public final class ImageHistogramEqualization {
    public static final boolean DEBUG = false;
    public static final String TAG = "ImageHistogramEqualization";

    static {
        System.loadLibrary("smartburst-jni");
    }

    private static native void doHistogramEqualization(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2);

    private ImageHistogramEqualization() {
    }

    public static void applyImageHistogramEqualization(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2) {
        boolean z;
        boolean z2 = true;
        jri.m13152b((Object) byteBuffer);
        jri.m13152b((Object) byteBuffer2);
        int i3 = i * i2;
        if (byteBuffer.capacity() == i3) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (byteBuffer2.capacity() == i3) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (i2 <= 0) {
            z2 = false;
        }
        jri.m13143a(z2);
        doHistogramEqualization(byteBuffer, i, i2, byteBuffer2);
    }
}
