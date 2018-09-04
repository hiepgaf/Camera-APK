package com.google.android.libraries.camera.jni.yuv;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.nio.ByteBuffer;
import java.util.List;
import p000.iwz;
import p000.ixa;

/* compiled from: PG */
public class YuvUtilNative {
    static {
        System.loadLibrary("jni_yuvutil");
    }

    private static native boolean convertYUV420ToARGBNative(int i, int i2, ByteBuffer byteBuffer, int i3, int i4, ByteBuffer byteBuffer2, int i5, int i6, ByteBuffer byteBuffer3, int i7, int i8, int[] iArr);

    private static native boolean copyYUV_420_888Native(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i3, int i4, int i5, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, ByteBuffer byteBuffer6, int i6, int i7, int i8);

    public static native boolean downsampleYUV_420_888toNV21Native(int i, int i2, ByteBuffer byteBuffer, int i3, int i4, ByteBuffer byteBuffer2, int i5, int i6, ByteBuffer byteBuffer3, int i7, int i8, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i9);

    /* renamed from: a */
    public static Bitmap m1351a(iwz iwz) {
        List e = iwz.mo2718e();
        ixa ixa = (ixa) e.get(0);
        ixa ixa2 = (ixa) e.get(1);
        ixa ixa3 = (ixa) e.get(2);
        ByteBuffer a = ixa.mo637a();
        ByteBuffer a2 = ixa2.mo637a();
        ByteBuffer a3 = ixa3.mo637a();
        int g = iwz.mo2720g();
        int d = iwz.mo2717d();
        int[] iArr = new int[(g * d)];
        if (convertYUV420ToARGBNative(iwz.mo2720g(), iwz.mo2717d(), a, ixa.mo638b(), ixa.mo639c(), a2, ixa2.mo638b(), ixa2.mo639c(), a3, ixa3.mo638b(), ixa3.mo639c(), iArr)) {
            return Bitmap.createBitmap(iArr, g, d, Config.ARGB_8888);
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m1352a(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i3, int i4, int i5, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, ByteBuffer byteBuffer6, int i6, int i7, int i8) {
        return copyYUV_420_888Native(i, i2, byteBuffer, byteBuffer2, byteBuffer3, i3, i4, i5, byteBuffer4, byteBuffer5, byteBuffer6, i6, i7, i8);
    }
}
