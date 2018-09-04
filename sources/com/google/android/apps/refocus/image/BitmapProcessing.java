package com.google.android.apps.refocus.image;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.nio.Buffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import junit.framework.Assert;

/* compiled from: PG */
public class BitmapProcessing {
    public static Bitmap addMargin(Bitmap bitmap, int i) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Buffer allocate = IntBuffer.allocate(height * width);
        bitmap.copyPixelsToBuffer(allocate);
        int[] addMarginUsingBuffer = addMarginUsingBuffer(allocate.array(), width, height, i);
        int i2 = i + i;
        Bitmap createBitmap = Bitmap.createBitmap(width + i2, height + i2, Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(IntBuffer.wrap(addMarginUsingBuffer));
        return createBitmap;
    }

    private static int[] addMarginUsingBuffer(int[] iArr, int i, int i2, int i3) {
        int i4 = 0;
        int i5 = i3 + i3;
        int i6 = i + i5;
        Object obj = new int[((i5 + i2) * i6)];
        Arrays.fill(obj, 0);
        while (i4 < i2) {
            System.arraycopy(iArr, i4 * i, obj, ((i4 + i3) * i6) + i3, i);
            i4++;
        }
        return obj;
    }

    public static Bitmap copyAlphaToRGB(Bitmap bitmap, int i) {
        Assert.assertEquals(Config.ARGB_8888, bitmap.getConfig());
        Buffer allocate = IntBuffer.allocate(bitmap.getWidth() * bitmap.getHeight());
        bitmap.copyPixelsToBuffer(allocate);
        int[] copyAlphaToRGBUsingBuffer = copyAlphaToRGBUsingBuffer(allocate.array(), i);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        createBitmap.copyPixelsFromBuffer(IntBuffer.wrap(copyAlphaToRGBUsingBuffer));
        return createBitmap;
    }

    private static int[] copyAlphaToRGBUsingBuffer(int[] iArr, int i) {
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = (iArr[i2] >>> 24) * i;
            iArr2[i2] = (i3 | ((i3 << 16) | (i3 << 8))) | -16777216;
        }
        return iArr2;
    }

    public static Bitmap copyRGBIgnoreAlpha(Bitmap bitmap, int i) {
        Assert.assertEquals(Config.ARGB_8888, bitmap.getConfig());
        Buffer allocate = IntBuffer.allocate(bitmap.getWidth() * bitmap.getHeight());
        bitmap.copyPixelsToBuffer(allocate);
        int[] copyRGBIgnoreAlphaUsingBuffer = copyRGBIgnoreAlphaUsingBuffer(allocate.array(), i);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        createBitmap.copyPixelsFromBuffer(IntBuffer.wrap(copyRGBIgnoreAlphaUsingBuffer));
        return createBitmap;
    }

    public static Bitmap copyRGBIgnoreAlpha(Bitmap bitmap, int i, int i2, int i3) {
        Assert.assertEquals(Config.ARGB_8888, bitmap.getConfig());
        Buffer allocate = IntBuffer.allocate(bitmap.getWidth() * bitmap.getHeight());
        bitmap.copyPixelsToBuffer(allocate);
        int[] copyRGBIgnoreAlphaUsingBuffer = copyRGBIgnoreAlphaUsingBuffer(allocate.array(), i, i2, i3);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        createBitmap.copyPixelsFromBuffer(IntBuffer.wrap(copyRGBIgnoreAlphaUsingBuffer));
        return createBitmap;
    }

    private static int[] copyRGBIgnoreAlphaUsingBuffer(int[] iArr, int i) {
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            iArr2[i2] = (((i3 & Illuminant.kOther) * i) | (((((i3 >> 16) & Illuminant.kOther) * i) << 16) | ((((i3 >> 8) & Illuminant.kOther) * i) << 8))) | -16777216;
        }
        return iArr2;
    }

    private static int[] copyRGBIgnoreAlphaUsingBuffer(int[] iArr, int i, int i2, int i3) {
        int[] iArr2 = new int[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            iArr2[i4] = (((i5 & Illuminant.kOther) * i) | (((((i5 >> 16) & Illuminant.kOther) * i3) << 16) | ((((i5 >> 8) & Illuminant.kOther) * i2) << 8))) | -16777216;
        }
        return iArr2;
    }

    public static Bitmap removeMargin(Bitmap bitmap, int i) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Buffer allocate = IntBuffer.allocate(width * height);
        bitmap.copyPixelsToBuffer(allocate);
        int[] removeMarginUsingBuffer = removeMarginUsingBuffer(allocate.array(), width, height, i);
        int i2 = i + i;
        Bitmap createBitmap = Bitmap.createBitmap(width - i2, height - i2, Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(IntBuffer.wrap(removeMarginUsingBuffer));
        return createBitmap;
    }

    private static int[] removeMarginUsingBuffer(int[] iArr, int i, int i2, int i3) {
        int i4 = i3 + i3;
        int i5 = i - i4;
        int i6 = i2 - i4;
        Object obj = new int[(i5 * i6)];
        for (i4 = 0; i4 < i6; i4++) {
            System.arraycopy(iArr, ((i4 + i3) * i) + i3, obj, i4 * i5, i5);
        }
        return obj;
    }

    public static Bitmap rotate(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap writeDepthToAlpha(Bitmap bitmap, Bitmap bitmap2, int i) {
        int width = bitmap.getWidth() * bitmap.getWidth();
        Buffer allocate = IntBuffer.allocate(width);
        Buffer allocate2 = IntBuffer.allocate(width);
        bitmap.copyPixelsToBuffer(allocate);
        bitmap2.copyPixelsToBuffer(allocate2);
        int[] writeDepthToAlphaUsingBuffer = writeDepthToAlphaUsingBuffer(allocate.array(), allocate2.array(), i);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(IntBuffer.wrap(writeDepthToAlphaUsingBuffer));
        return createBitmap;
    }

    private static int[] writeDepthToAlphaUsingBuffer(int[] iArr, int[] iArr2, int i) {
        int length = iArr.length;
        Assert.assertEquals(length, iArr2.length);
        int[] iArr3 = new int[length];
        for (length = 0; length < iArr.length; length++) {
            iArr3[length] = (iArr[length] & 16777215) | (((iArr2[length] & Illuminant.kOther) / i) << 24);
        }
        return iArr3;
    }
}
