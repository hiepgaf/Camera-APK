package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* renamed from: anb */
public final class anb {
    /* renamed from: a */
    public static final Lock f549a;
    /* renamed from: b */
    private static final Paint f550b = new Paint(6);

    static {
        Lock reentrantLock;
        Paint paint = new Paint(7);
        if (new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"})).contains(Build.MODEL)) {
            reentrantLock = new ReentrantLock();
        } else {
            reentrantLock = new anc();
        }
        f549a = reentrantLock;
        new Paint(7).setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
    }

    /* renamed from: a */
    private static void m368a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        f549a.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f550b);
            canvas.setBitmap(null);
        } finally {
            f549a.unlock();
        }
    }

    /* renamed from: a */
    public static Bitmap m366a(agw agw, Bitmap bitmap, int i, int i2) {
        float f = 0.0f;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        float height;
        float width;
        Matrix matrix = new Matrix();
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            height = ((float) i2) / ((float) bitmap.getHeight());
            width = (((float) i) - (((float) bitmap.getWidth()) * height)) * 0.5f;
        } else {
            height = ((float) i) / ((float) bitmap.getWidth());
            width = 0.0f;
            f = (((float) i2) - (((float) bitmap.getHeight()) * height)) * 0.5f;
        }
        matrix.setScale(height, height);
        matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap a = agw.mo59a(i, i2, anb.m364a(bitmap));
        anb.m367a(bitmap, a);
        anb.m368a(bitmap, a, matrix);
        return a;
    }

    /* renamed from: b */
    public static Bitmap m369b(agw agw, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return anb.m371c(agw, bitmap, i, i2);
        } else if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        } else {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            return bitmap;
        }
    }

    /* renamed from: c */
    public static Bitmap m371c(agw agw, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
            float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
            int round = Math.round(((float) bitmap.getWidth()) * min);
            int round2 = Math.round(((float) bitmap.getHeight()) * min);
            if (bitmap.getWidth() != round || bitmap.getHeight() != round2) {
                Bitmap a = agw.mo59a((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), anb.m364a(bitmap));
                anb.m367a(bitmap, a);
                if (Log.isLoggable("TransformationUtils", 2)) {
                    StringBuilder stringBuilder = new StringBuilder(32);
                    stringBuilder.append("request: ");
                    stringBuilder.append(i);
                    stringBuilder.append("x");
                    stringBuilder.append(i2);
                    Log.v("TransformationUtils", stringBuilder.toString());
                    round2 = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    StringBuilder stringBuilder2 = new StringBuilder(32);
                    stringBuilder2.append("toFit:   ");
                    stringBuilder2.append(round2);
                    stringBuilder2.append("x");
                    stringBuilder2.append(height);
                    Log.v("TransformationUtils", stringBuilder2.toString());
                    round2 = a.getWidth();
                    height = a.getHeight();
                    stringBuilder2 = new StringBuilder(32);
                    stringBuilder2.append("toReuse: ");
                    stringBuilder2.append(round2);
                    stringBuilder2.append("x");
                    stringBuilder2.append(height);
                    Log.v("TransformationUtils", stringBuilder2.toString());
                    stringBuilder = new StringBuilder(25);
                    stringBuilder.append("minPct:   ");
                    stringBuilder.append(min);
                    Log.v("TransformationUtils", stringBuilder.toString());
                }
                Matrix matrix = new Matrix();
                matrix.setScale(min, min);
                anb.m368a(bitmap, a, matrix);
                return a;
            } else if (!Log.isLoggable("TransformationUtils", 2)) {
                return bitmap;
            } else {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
                return bitmap;
            }
        } else if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        } else {
            Log.v("TransformationUtils", "requested target size matches input, returning input");
            return bitmap;
        }
    }

    /* renamed from: a */
    public static int m363a(int i) {
        switch (i) {
            case 3:
            case 4:
                return MediaDecoder.ROTATE_180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return MediaDecoder.ROTATE_90_LEFT;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    private static Config m364a(Bitmap bitmap) {
        return bitmap.getConfig() == null ? Config.ARGB_8888 : bitmap.getConfig();
    }

    /* renamed from: b */
    public static boolean m370b(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public static Bitmap m365a(agw agw, Bitmap bitmap, int i) {
        if (!anb.m370b(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap a = agw.mo59a(Math.round(rectF.width()), Math.round(rectF.height()), anb.m364a(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        anb.m368a(bitmap, a, matrix);
        return a;
    }

    /* renamed from: a */
    private static void m367a(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
