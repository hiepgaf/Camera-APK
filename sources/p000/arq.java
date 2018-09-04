package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Looper;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: arq */
public final class arq {
    /* renamed from: a */
    private static final char[] f924a = "0123456789abcdef".toCharArray();
    /* renamed from: b */
    private static final char[] f925b = new char[64];

    /* renamed from: a */
    public static void m653a() {
        if (!arq.m655b()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: a */
    public static boolean m654a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else {
            if (obj instanceof ajv) {
                return ((ajv) obj).m313a();
            }
            return obj.equals(obj2);
        }
    }

    /* renamed from: b */
    public static boolean m658b(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        return obj2 == null;
    }

    /* renamed from: a */
    public static Queue m652a(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: a */
    public static int m646a(int i, int i2, Config config) {
        int i3;
        int i4 = i * i2;
        if (config == null) {
            config = Config.ARGB_8888;
        }
        switch (arr.f926a[config.ordinal()]) {
            case 1:
                i3 = 1;
                break;
            case 2:
            case 3:
                i3 = 2;
                break;
            case 4:
                i3 = 8;
                break;
            default:
                i3 = 4;
                break;
        }
        return i3 * i4;
    }

    @TargetApi(19)
    /* renamed from: a */
    public static int m647a(Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            String valueOf = String.valueOf(bitmap);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            String valueOf2 = String.valueOf(bitmap.getConfig());
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 66) + String.valueOf(valueOf2).length());
            stringBuilder.append("Cannot obtain size for recycled Bitmap: ");
            stringBuilder.append(valueOf);
            stringBuilder.append("[");
            stringBuilder.append(width);
            stringBuilder.append("x");
            stringBuilder.append(height);
            stringBuilder.append("] ");
            stringBuilder.append(valueOf2);
            throw new IllegalStateException(stringBuilder.toString());
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException e) {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
    }

    /* renamed from: a */
    public static List m651a(Collection collection) {
        List arrayList = new ArrayList(collection.size());
        for (Object next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static int m644a(float f) {
        return Float.floatToIntBits(f) + 527;
    }

    /* renamed from: a */
    public static int m645a(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: a */
    public static int m648a(Object obj, int i) {
        int hashCode;
        if (obj != null) {
            hashCode = obj.hashCode();
        } else {
            hashCode = 0;
        }
        return hashCode + (i * 31);
    }

    /* renamed from: a */
    public static int m649a(boolean z, int i) {
        return (i * 31) + z;
    }

    /* renamed from: b */
    public static boolean m655b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: b */
    private static boolean m656b(int i) {
        return i > 0 || i == kvl.UNSET_ENUM_VALUE;
    }

    /* renamed from: b */
    public static boolean m657b(int i, int i2) {
        return arq.m656b(i) && arq.m656b(i2);
    }

    /* renamed from: a */
    public static String m650a(byte[] bArr) {
        String str;
        synchronized (f925b) {
            char[] cArr = f925b;
            for (int i = 0; i < bArr.length; i++) {
                int i2 = bArr[i] & Illuminant.kOther;
                int i3 = i + i;
                cArr[i3] = f924a[i2 >>> 4];
                cArr[i3 + 1] = f924a[i2 & 15];
            }
            str = new String(cArr);
        }
        return str;
    }
}
