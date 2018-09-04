package com.google.android.libraries.smartburst.artifacts.gifutils;

import java.nio.ByteBuffer;

/* compiled from: PG */
public class LZWEncoder {
    static {
        System.loadLibrary("smartburst-jni");
    }

    private static native byte[] process(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    /* renamed from: a */
    public static byte[] m1356a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return process(byteBuffer, byteBuffer2, i, i2, i3, i4, i5, i6, i7, 0);
    }
}
