package com.google.android.libraries.camera.jpegutil;

import android.graphics.Rect;
import java.nio.ByteBuffer;
import java.util.List;
import p000.iwz;
import p000.ixa;
import p000.jri;

/* compiled from: PG */
public class JpegUtilNative {
    static {
        System.loadLibrary("jni_jpegutil");
    }

    private static native int compressJpegFromYUV420pNative(int i, int i2, Object obj, int i3, int i4, Object obj2, int i5, int i6, Object obj3, int i7, int i8, Object obj4, int i9, int i10, int i11, int i12, int i13, int i14);

    /* renamed from: a */
    public static int m1353a(iwz iwz, ByteBuffer byteBuffer, int i, Rect rect) {
        boolean z;
        Object str;
        jri.m13154b(byteBuffer.isDirect(), (Object) "Output buffer must be direct");
        if (rect.left < rect.right) {
            z = true;
        } else {
            z = false;
        }
        String valueOf = String.valueOf(rect.toString());
        String str2 = "Invalid crop rectangle: ";
        if (valueOf.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(valueOf);
        }
        jri.m13154b(z, str);
        if (rect.top < rect.bottom) {
            z = true;
        } else {
            z = false;
        }
        valueOf = String.valueOf(rect.toString());
        str2 = "Invalid crop rectangle: ";
        if (valueOf.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(valueOf);
        }
        jri.m13154b(z, str);
        int min = Math.min(Math.max(rect.left, 0), iwz.mo2720g() - 1);
        int min2 = Math.min(Math.max(rect.right, 0), iwz.mo2720g());
        int min3 = Math.min(Math.max(rect.top, 0), iwz.mo2717d() - 1);
        int min4 = Math.min(Math.max(rect.bottom, 0), iwz.mo2717d());
        if (iwz.mo2716c() == 35) {
            z = true;
        } else {
            z = false;
        }
        int c = iwz.mo2716c();
        StringBuilder stringBuilder = new StringBuilder(60);
        stringBuilder.append("Only ImageFormat.YUV_420_888 is supported, found ");
        stringBuilder.append(c);
        jri.m13154b(z, stringBuilder.toString());
        List e = iwz.mo2718e();
        ixa ixa = (ixa) e.get(0);
        ixa ixa2 = (ixa) e.get(1);
        ixa ixa3 = (ixa) e.get(2);
        jri.m13153b(ixa.mo637a().isDirect());
        jri.m13153b(ixa.mo637a().isDirect());
        jri.m13153b(ixa.mo637a().isDirect());
        byteBuffer.clear();
        int compressJpegFromYUV420pNative = compressJpegFromYUV420pNative(iwz.mo2720g(), iwz.mo2717d(), ixa.mo637a(), ixa.mo638b(), ixa.mo639c(), ixa2.mo637a(), ixa2.mo638b(), ixa2.mo639c(), ixa3.mo637a(), ixa3.mo638b(), ixa3.mo639c(), byteBuffer, byteBuffer.capacity(), i, min, min3, min2, min4);
        byteBuffer.limit(compressJpegFromYUV420pNative);
        return compressJpegFromYUV420pNative;
    }
}
