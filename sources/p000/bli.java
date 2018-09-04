package p000;

import android.os.Build;
import android.util.Log;

/* compiled from: PG */
/* renamed from: bli */
public final class bli {
    /* renamed from: a */
    private static final int f1264a = 19;

    /* renamed from: a */
    public static void m863a(String str, String str2) {
        if (bli.m865a(str, 3)) {
            Log.d(str, str2);
        }
    }

    /* renamed from: a */
    public static void m864a(String str, String str2, Throwable th) {
        if (bli.m865a(str, 3)) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: b */
    public static void m866b(String str, String str2) {
        if (bli.m865a(str, 6)) {
            Log.e(str, str2);
        }
    }

    /* renamed from: b */
    public static void m867b(String str, String str2, Throwable th) {
        if (bli.m865a(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: c */
    public static void m869c(String str, String str2) {
        if (bli.m865a(str, 4)) {
            Log.i(str, str2);
        }
    }

    /* renamed from: c */
    public static void m870c(String str, String str2, Throwable th) {
        if (bli.m865a(str, 4)) {
            Log.i(str, str2, th);
        }
    }

    /* renamed from: a */
    public static boolean m865a(String str, int i) {
        try {
            if (blj.f1265a == 0) {
                if (i == 2) {
                    return bli.m868b(str, i);
                }
                boolean z = !"userdebug".equals(Build.TYPE) ? "eng".equals(Build.TYPE) : true;
                if (z || bli.m868b(str, i)) {
                    return true;
                }
                return false;
            } else if (blj.f1265a > i) {
                return false;
            } else {
                return true;
            }
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(str);
            String str2 = "String too long:";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m866b("CAM_Log", valueOf);
            return false;
        }
    }

    /* renamed from: a */
    public static String m862a(String str) {
        int length = str.length() - f1264a;
        if (length > 0) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 44);
            stringBuilder.append("Tag ");
            stringBuilder.append(str);
            stringBuilder.append(" is ");
            stringBuilder.append(length);
            stringBuilder.append(" chars longer than limit.");
            bli.m873e("CAM_Log", stringBuilder.toString());
        }
        String valueOf = String.valueOf("CAM_");
        if (length > 0) {
            str = str.substring(0, f1264a);
        }
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: b */
    private static boolean m868b(String str, int i) {
        if (Log.isLoggable("CAM_", i) || Log.isLoggable(str, i)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static void m871d(String str, String str2) {
        if (bli.m865a(str, 2)) {
            Log.v(str, str2);
        }
    }

    /* renamed from: d */
    public static void m872d(String str, String str2, Throwable th) {
        if (bli.m865a(str, 2)) {
            Log.v(str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m873e(String str, String str2) {
        if (bli.m865a(str, 5)) {
            Log.w(str, str2);
        }
    }

    /* renamed from: e */
    public static void m874e(String str, String str2, Throwable th) {
        if (bli.m865a(str, 5)) {
            Log.w(str, str2, th);
        }
    }
}
