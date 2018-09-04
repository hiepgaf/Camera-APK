package com.google.android.libraries.smartburst.filterfw;

import java.nio.ByteBuffer;

/* compiled from: PG */
public class PixelUtils {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native void nativeCopyPixels(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5);

    public static void copyPixels(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5) {
        if (byteBuffer.remaining() != byteBuffer2.remaining()) {
            throw new IllegalArgumentException("Input and output buffers must have the same size!");
        } else if (byteBuffer.remaining() % 4 != 0) {
            throw new IllegalArgumentException("Input buffer size must be a multiple of 4!");
        } else if (byteBuffer2.remaining() % 4 != 0) {
            throw new IllegalArgumentException("Output buffer size must be a multiple of 4!");
        } else {
            int i6 = (i * i2) << 2;
            if (i6 != byteBuffer.remaining()) {
                throw new IllegalArgumentException("Input buffer size does not match given dimensions!");
            } else if (i6 != byteBuffer2.remaining()) {
                throw new IllegalArgumentException("Output buffer size does not match given dimensions!");
            } else {
                nativeCopyPixels(byteBuffer, byteBuffer2, i, i2, i3, i4, i5);
            }
        }
    }
}
