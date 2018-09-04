package com.google.android.apps.camera.jni.microvideotonemap;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import p000.iyp;

/* compiled from: PG */
public class MicrovideoToneMapNative {
    static {
        System.loadLibrary("microvideo_tone_map");
    }

    public static native void argbToYuv(Bitmap bitmap, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3);

    public static native void extractMeanVarianceMappingNative(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, ByteBuffer byteBuffer6, iyp iyp);
}
