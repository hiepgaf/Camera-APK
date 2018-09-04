package com.google.android.libraries.smartburst.filterfw.imageutils;

import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* compiled from: PG */
public class Histograms {
    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native void nativeExtractGrayHistogram(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, IntBuffer intBuffer);

    private static native void nativeExtractHueSatHistogram(ByteBuffer byteBuffer, FloatBuffer floatBuffer, int i, int i2);

    private static native boolean nativeExtractHueSatValueHistogram(ByteBuffer byteBuffer, FloatBuffer floatBuffer, int i, int i2, FloatBuffer floatBuffer2, int i3, int i4, int i5);

    public static void extractGrayHistogram(FrameImage2D frameImage2D, IntBuffer intBuffer) {
        nativeExtractGrayHistogram(frameImage2D.lockBytes(1), null, intBuffer);
        frameImage2D.unlock();
    }

    public static void extractGrayHistogramWithMask(FrameImage2D frameImage2D, FrameImage2D frameImage2D2, IntBuffer intBuffer) {
        nativeExtractGrayHistogram(frameImage2D.lockBytes(1), frameImage2D2.lockBytes(1), intBuffer);
        frameImage2D.unlock();
        frameImage2D2.unlock();
    }

    public static void extractHueSatHistogram(FrameImage2D frameImage2D, int i, int i2, FloatBuffer floatBuffer) {
        int i3 = i * i2;
        if (floatBuffer.limit() < i3) {
            int limit = floatBuffer.limit();
            StringBuilder stringBuilder = new StringBuilder(69);
            stringBuilder.append("Expected histogram size of ");
            stringBuilder.append(i3);
            stringBuilder.append(" but got a size of ");
            stringBuilder.append(limit);
            stringBuilder.append(".");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        nativeExtractHueSatHistogram(frameImage2D.lockBytes(1), floatBuffer, i, i2);
        frameImage2D.unlock();
    }

    public static void extractHueSatValueHistogram(FrameImage2D frameImage2D, int i, int i2, int i3, int i4, int i5, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        int i6 = i * i2;
        if (floatBuffer.limit() < i6) {
            int limit = floatBuffer.limit();
            StringBuilder stringBuilder = new StringBuilder(75);
            stringBuilder.append("Expected hueSatHistogram size of ");
            stringBuilder.append(i6);
            stringBuilder.append(" but got a size of ");
            stringBuilder.append(limit);
            stringBuilder.append(".");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (floatBuffer2.limit() < i3) {
            int limit2 = floatBuffer2.limit();
            StringBuilder stringBuilder2 = new StringBuilder(74);
            stringBuilder2.append("Expected valueHistogram size of ");
            stringBuilder2.append(i3);
            stringBuilder2.append(" but got a size of ");
            stringBuilder2.append(limit2);
            stringBuilder2.append(".");
            throw new IllegalArgumentException(stringBuilder2.toString());
        } else {
            nativeExtractHueSatValueHistogram(frameImage2D.lockBytes(1), floatBuffer, i, i2, floatBuffer2, i3, i4, i5);
            frameImage2D.unlock();
        }
    }
}
