package com.google.android.apps.camera.jni.facebeautification;

import android.graphics.Rect;
import java.nio.ByteBuffer;

/* compiled from: PG */
public class FaceBeautificationNative {
    static {
        System.loadLibrary("facebeautification");
    }

    public static native byte[] nativeFaceBeautification(int i, int i2, int i3, ByteBuffer byteBuffer, int i4, int i5, ByteBuffer byteBuffer2, int i6, int i7, ByteBuffer byteBuffer3, int i8, int i9, Rect[] rectArr);
}
