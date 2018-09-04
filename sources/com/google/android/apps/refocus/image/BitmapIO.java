package com.google.android.apps.refocus.image;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import p000.bli;
import p000.isx;

/* compiled from: PG */
public class BitmapIO {
    public static final int PNG_DEFAULT_QUALITY = 100;
    public static final String TAG = bli.m862a("BitmapIO");

    public static Bitmap decodeJpeg(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (decodeByteArray == null) {
            return null;
        }
        isx a = isx.m4161a(bArr);
        return a != null ? BitmapProcessing.rotate(decodeByteArray, isx.m4158a(a).f7326e) : decodeByteArray;
    }

    public static byte[] toByteArray(Bitmap bitmap, int i) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (i < 0) {
            bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        } else {
            bitmap.compress(CompressFormat.JPEG, i, byteArrayOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static InputStream toInputStream(Bitmap bitmap, int i) {
        return new ByteArrayInputStream(toByteArray(bitmap, i));
    }
}
