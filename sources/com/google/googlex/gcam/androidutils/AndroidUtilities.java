package com.google.googlex.gcam.androidutils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.media.Image;
import android.media.Image.Plane;
import android.util.Log;
import android.view.WindowManager;
import android.widget.SeekBar;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import com.google.googlex.gcam.androidutils.Array2D.U8x4;
import com.google.googlex.gcam.androidutils.vecmath.Matrix4f;
import com.google.googlex.gcam.androidutils.vecmath.VecmathFunctions;
import com.google.googlex.gcam.androidutils.vecmath.Vector2i;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p000.kqg;

/* compiled from: PG */
public final class AndroidUtilities {
    public static final String TAG = AndroidUtilities.class.getSimpleName();

    /* compiled from: PG */
    /* renamed from: com.google.googlex.gcam.androidutils.AndroidUtilities$1 */
    class C01141 implements Comparator {
        C01141() {
        }

        public int compare(Vector2i vector2i, Vector2i vector2i2) {
            int i = vector2i.f2487x * vector2i.f2488y;
            int i2 = vector2i2.f2487x * vector2i2.f2488y;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            return 0;
        }
    }

    private AndroidUtilities() {
    }

    public static Vector2i biggestSizeLEq(List list, Vector2i vector2i) {
        List arrayList = new ArrayList(list.size());
        for (Vector2i vector2i2 : list) {
            if (vector2i2.f2487x <= vector2i.f2487x && vector2i2.f2488y <= vector2i.f2488y) {
                arrayList.add(vector2i2);
            }
        }
        return getLargestSizeByPixelCount(arrayList);
    }

    public static void copyImage(Image image, ByteBuffer[] byteBufferArr) {
        Plane[] planes = image.getPlanes();
        for (int i = 0; i < planes.length; i++) {
            BufferUtilities.copy(planes[i].getBuffer(), byteBufferArr[i]);
        }
    }

    public static void copyImage(U8x4 u8x4, Bitmap bitmap) {
        if (bitmap.getConfig() != Config.ARGB_8888) {
            throw new RuntimeException("dstBitmap must be of config ARGB_8888");
        } else if (u8x4.width() != bitmap.getWidth() || u8x4.height() != bitmap.getHeight()) {
            throw new IndexOutOfBoundsException("copyImage requires that thesrcArray and dstBitmap have the same dimensions.");
        } else if (u8x4.rowStrideBytes() != bitmap.getRowBytes()) {
            throw new IndexOutOfBoundsException("copyImage requires that thesrcArray and dstBitmap have the same row strides.");
        } else {
            bitmap.copyPixelsFromBuffer(u8x4.buffer());
        }
    }

    public static String floatArrayToString(float[] fArr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ ");
        int i = 0;
        while (true) {
            int length = fArr.length - 1;
            if (i < length) {
                stringBuilder.append(fArr[i]);
                stringBuilder.append(", ");
                i++;
            } else {
                stringBuilder.append(fArr[length]);
                stringBuilder.append(" ]");
                return stringBuilder.toString();
            }
        }
    }

    public static int getDeviceRotation(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public static Vector2i getLargestSizeByPixelCount(List list) {
        return (Vector2i) Collections.max(list, new C01141());
    }

    public static final String getMd5HashAsHex(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : digest) {
                String toHexString = Integer.toHexString(b & Illuminant.kOther);
                while (toHexString.length() < 2) {
                    String str2 = "0";
                    toHexString = String.valueOf(toHexString);
                    toHexString = toHexString.length() == 0 ? new String(str2) : str2.concat(toHexString);
                }
                stringBuilder.append(toHexString);
            }
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            Log.w(TAG, "MD5 not installed.");
            return null;
        }
    }

    public static float getSeekBarValue(SeekBar seekBar, float f, float f2) {
        return MathUtils.linearRescaleRanges((float) seekBar.getProgress(), 0.0f, (float) seekBar.getMax(), f, f2);
    }

    public static int maxIndex(List list) {
        if (list == null || list.size() == 0) {
            return -1;
        }
        int i = 0;
        int intValue = ((Integer) list.get(0)).intValue();
        int i2 = 1;
        while (i2 < list.size()) {
            int intValue2 = ((Integer) list.get(i2)).intValue();
            int i3 = intValue2 > intValue ? intValue2 : intValue;
            intValue = intValue2 > intValue ? i2 : i;
            i2++;
            i = intValue;
            intValue = i3;
        }
        return i;
    }

    public static BufferedInputStream openBinaryFileForReading(File file, int i) {
        return new BufferedInputStream(new FileInputStream(file), i);
    }

    public static BufferedInputStream openBinaryFileForReading(String str, int i) {
        return openBinaryFileForReading(new File(str), i);
    }

    public static BufferedOutputStream openBinaryFileForWriting(File file, int i) {
        return new BufferedOutputStream(new FileOutputStream(file), i);
    }

    public static BufferedOutputStream openBinaryFileForWriting(String str, int i) {
        return openBinaryFileForWriting(new File(str), i);
    }

    public static BufferedReader openTextFileForReading(File file, int i) {
        return new BufferedReader(new FileReader(file), i);
    }

    public static BufferedReader openTextFileForReading(String str, int i) {
        return openTextFileForReading(new File(str), i);
    }

    public static String readRawResource(Resources resources, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resources.openRawResource(i)));
        try {
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                stringBuilder.append(readLine);
                stringBuilder.append("\n");
            }
        } catch (Throwable e) {
            kqg.f8420a.mo2210b(e);
        }
        return stringBuilder.toString();
    }

    public static void setSeekBarToValue(SeekBar seekBar, float f, float f2, float f3) {
        seekBar.setProgress(MathUtils.linearRescaleRangesAndRound(f, f2, f3, 0.0f, (float) seekBar.getMax()));
    }

    public static Matrix4f textureMatrixForRotatedSensorAndDisplay(int i, int i2, int i3) {
        Matrix4f rotateUnitSquareCCWNinety = VecmathFunctions.rotateUnitSquareCCWNinety(i - i2);
        return i3 == 0 ? rotateUnitSquareCCWNinety : VecmathFunctions.mul(VecmathFunctions.flipUnitSquareY(), rotateUnitSquareCCWNinety);
    }
}
