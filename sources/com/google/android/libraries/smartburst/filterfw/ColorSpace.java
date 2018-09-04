package com.google.android.libraries.smartburst.filterfw;

import java.nio.ByteBuffer;

/* compiled from: PG */
public class ColorSpace {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native void nativeArgb8888ToRgba8888(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3);

    private static native void nativeCropRgbaImage(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5, int i6);

    private static native void nativeRgba8888ToGray8888(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2);

    private static native void nativeRgba8888ToHsva8888(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2);

    private static native void nativeRgba8888ToYcbcra8888(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2);

    private static native void nativeYuv420pToRgba8888(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3);

    public static void convertArgb8888ToRgba8888(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3) {
        expectInputSize(byteBuffer, i3 * i2);
        expectOutputSize(byteBuffer2, (i * i2) << 2);
        nativeArgb8888ToRgba8888(byteBuffer, byteBuffer2, i, i2, i3);
    }

    public static void convertRgba8888ToGray8888(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2) {
        int i3 = (i * i2) << 2;
        expectInputSize(byteBuffer, i3);
        expectOutputSize(byteBuffer2, i3);
        nativeRgba8888ToGray8888(byteBuffer, byteBuffer2, i, i2);
    }

    public static void convertRgba8888ToHsva8888(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2) {
        int i3 = (i * i2) << 2;
        expectInputSize(byteBuffer, i3);
        expectOutputSize(byteBuffer2, i3);
        nativeRgba8888ToHsva8888(byteBuffer, byteBuffer2, i, i2);
    }

    public static void convertRgba8888ToYcbcra8888(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2) {
        int i3 = (i * i2) << 2;
        expectInputSize(byteBuffer, i3);
        expectOutputSize(byteBuffer2, i3);
        nativeRgba8888ToYcbcra8888(byteBuffer, byteBuffer2, i, i2);
    }

    public static void convertYuv420pToRgba8888(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3) {
        expectInputSize(byteBuffer, ((i3 * 3) * i2) / 2);
        expectOutputSize(byteBuffer2, (i * i2) << 2);
        nativeYuv420pToRgba8888(byteBuffer, byteBuffer2, i, i2, i3);
    }

    public static void cropRgbaImage(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, int i5, int i6) {
        expectInputSize(byteBuffer, (i * i2) << 2);
        expectOutputSize(byteBuffer2, (((i5 + 1) - i3) * ((i6 + 1) - i4)) << 2);
        nativeCropRgbaImage(byteBuffer, byteBuffer2, i, i2, i3, i4, i5, i6);
    }

    private static void expectInputSize(ByteBuffer byteBuffer, int i) {
        if (byteBuffer.remaining() < i) {
            int remaining = byteBuffer.remaining();
            StringBuilder stringBuilder = new StringBuilder(97);
            stringBuilder.append("Input buffer's size does not fit given width and height! Expected: ");
            stringBuilder.append(i);
            stringBuilder.append(", Got: ");
            stringBuilder.append(remaining);
            stringBuilder.append(".");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private static void expectOutputSize(ByteBuffer byteBuffer, int i) {
        if (byteBuffer.remaining() < i) {
            int remaining = byteBuffer.remaining();
            StringBuilder stringBuilder = new StringBuilder(98);
            stringBuilder.append("Output buffer's size does not fit given width and height! Expected: ");
            stringBuilder.append(i);
            stringBuilder.append(", Got: ");
            stringBuilder.append(remaining);
            stringBuilder.append(".");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
