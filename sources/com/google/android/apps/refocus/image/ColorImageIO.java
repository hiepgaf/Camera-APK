package com.google.android.apps.refocus.image;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import p000.bli;
import p000.hvy;

/* compiled from: PG */
public class ColorImageIO {
    public static final String TAG = bli.m862a("ColorImageIO");

    static {
        System.loadLibrary("refocus");
    }

    public static native boolean convert(ColorImage colorImage, ColorImage colorImage2);

    private static native Bitmap toBitmapInternal(ColorImage colorImage);

    public static ColorImage fromBitmap(Bitmap bitmap) {
        if (bitmap == null || bitmap.getConfig() != Config.ARGB_8888) {
            return null;
        }
        byte[] bArr = new byte[((bitmap.getWidth() * bitmap.getHeight()) << 2)];
        bitmap.copyPixelsToBuffer(ByteBuffer.wrap(bArr));
        return new ColorImage(bitmap.getWidth(), bitmap.getHeight(), 1, bArr);
    }

    public static boolean saveToFile(ColorImage colorImage, String str) {
        if (colorImage.getFormat() == 256) {
            return hvy.m3536a(colorImage.getBuffer(), str);
        }
        if (colorImage.getFormat() == 17) {
            YuvImage yuvImage = new YuvImage(colorImage.getBuffer(), 17, colorImage.getWidth(), colorImage.getHeight(), null);
            File file = new File(str);
            file.getParentFile().mkdirs();
            try {
                OutputStream fileOutputStream = new FileOutputStream(file);
                yuvImage.compressToJpeg(new Rect(0, 0, colorImage.getWidth(), colorImage.getHeight()), 100, fileOutputStream);
                fileOutputStream.close();
                return true;
            } catch (IOException e) {
                bli.m866b(TAG, e.toString());
                return false;
            }
        }
        String str2 = TAG;
        int format = colorImage.getFormat();
        StringBuilder stringBuilder = new StringBuilder(46);
        stringBuilder.append("Cannot save ColorImage with format ");
        stringBuilder.append(format);
        bli.m866b(str2, stringBuilder.toString());
        return false;
    }

    public static Bitmap toBitmap(ColorImage colorImage) {
        if (colorImage.getFormat() == 256) {
            return BitmapFactory.decodeByteArray(colorImage.getBuffer(), 0, colorImage.getBuffer().length);
        }
        return toBitmapInternal(colorImage);
    }
}
