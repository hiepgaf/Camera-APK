package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.io.File;
import java.util.List;

@Deprecated
/* compiled from: PG */
/* renamed from: hjg */
public final class hjg {
    /* renamed from: a */
    private static final String f6269a = bli.m862a("CameraUtil");

    /* renamed from: a */
    public static int m3200a(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        if (i < i2) {
            return i2;
        }
        return i;
    }

    /* renamed from: a */
    public static float m3198a(float f) {
        if (f > 1.0f) {
            return 1.0f;
        }
        if (f < 0.0f) {
            return 0.0f;
        }
        return f;
    }

    /* renamed from: a */
    public static int m3199a() {
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new hjh());
            if (listFiles != null) {
                return listFiles.length;
            }
            bli.m866b(f6269a, "Failed to count number of cores, defaulting to 1");
            return 1;
        } catch (Throwable e) {
            bli.m867b(f6269a, "Failed to count number of cores, defaulting to 1", e);
            return 1;
        }
    }

    /* renamed from: a */
    public static int[] m3205a(List list) {
        if (list.size() == 0) {
            bli.m866b(f6269a, "No suppoted frame rates returned!");
            return null;
        }
        int[] iArr;
        int i = 400000;
        for (int[] iArr2 : list) {
            int i2 = iArr2[0];
            if (iArr2[1] >= 30000 && i2 <= 30000 && i2 < i) {
                i = i2;
            }
        }
        int i3 = 0;
        int i4 = -1;
        for (i2 = 0; i2 < list.size(); i2++) {
            iArr2 = (int[]) list.get(i2);
            int i5 = iArr2[0];
            int i6 = iArr2[1];
            if (i5 == i && r4 < i6) {
                i3 = i6;
                i4 = i2;
            }
        }
        if (i4 >= 0) {
            return (int[]) list.get(i4);
        }
        bli.m866b(f6269a, "Can't find an appropiate frame rate range!");
        return null;
    }

    /* renamed from: a */
    public static Bitmap m3201a(byte[] bArr) {
        Bitmap bitmap = null;
        int i = 1;
        try {
            Options options = new Options();
            options.inJustDecodeBounds = true;
            int length = bArr.length;
            BitmapFactory.decodeByteArray(bArr, 0, length, options);
            if (!(options.mCancel || options.outWidth == -1 || options.outHeight == -1)) {
                int ceil = (int) Math.ceil(Math.sqrt((((double) options.outWidth) * ((double) options.outHeight)) / 51200.0d));
                if (ceil <= 8) {
                    while (i < ceil) {
                        i += i;
                    }
                } else {
                    i = ((ceil + 7) / 8) << 3;
                }
                options.inSampleSize = i;
                options.inJustDecodeBounds = false;
                options.inDither = false;
                options.inPreferredConfig = Config.ARGB_8888;
                bitmap = BitmapFactory.decodeByteArray(bArr, 0, length, options);
            }
        } catch (Throwable e) {
            bli.m867b(f6269a, "Got oom exception ", e);
        }
        return bitmap;
    }

    /* renamed from: a */
    public static Rect m3203a(RectF rectF) {
        Rect rect = new Rect();
        rect.left = Math.round(rectF.left);
        rect.top = Math.round(rectF.top);
        rect.right = Math.round(rectF.right);
        rect.bottom = Math.round(rectF.bottom);
        return rect;
    }

    /* renamed from: a */
    public static RectF m3204a(Rect rect) {
        return new RectF((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
    }

    /* renamed from: a */
    public static Point m3202a(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = i3 % MediaDecoder.ROTATE_180;
        if (i7 != 0) {
            i6 = i;
        } else {
            i6 = i2;
        }
        if (i7 == 0) {
            i2 = i;
        }
        Point point = new Point();
        point.x = i4;
        point.y = i5;
        if (i2 == 0 || i6 == 0) {
            String str = f6269a;
            StringBuilder stringBuilder = new StringBuilder(101);
            stringBuilder.append("zero width/height, falling back to bounds (w|h|bw|bh):");
            stringBuilder.append(i2);
            stringBuilder.append("|");
            stringBuilder.append(i6);
            stringBuilder.append("|");
            stringBuilder.append(i4);
            stringBuilder.append("|");
            stringBuilder.append(i5);
            bli.m873e(str, stringBuilder.toString());
        } else if (i2 * i5 > i4 * i6) {
            point.y = (i6 * point.x) / i2;
        } else {
            point.x = (point.y * i2) / i6;
        }
        return point;
    }
}
