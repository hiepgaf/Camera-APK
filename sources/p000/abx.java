package p000;

import android.util.Log;

/* compiled from: PG */
/* renamed from: abx */
public final class abx {
    /* renamed from: a */
    public static final aby f179a = new aby("Log");

    /* renamed from: a */
    public static void m84a(aby aby, String str) {
        if (abx.m86a(aby, 3)) {
            Log.d(aby.toString(), str);
        }
    }

    /* renamed from: b */
    public static void m87b(aby aby, String str) {
        if (abx.m86a(aby, 6)) {
            Log.e(aby.toString(), str);
        }
    }

    /* renamed from: a */
    public static void m85a(aby aby, String str, Throwable th) {
        if (abx.m86a(aby, 6)) {
            Log.e(aby.toString(), str, th);
        }
    }

    /* renamed from: c */
    public static void m89c(aby aby, String str) {
        if (abx.m86a(aby, 4)) {
            Log.i(aby.toString(), str);
        }
    }

    /* renamed from: a */
    private static boolean m86a(aby aby, int i) {
        try {
            return Log.isLoggable("CAM2PORT_", i) || Log.isLoggable(aby.toString(), i);
        } catch (IllegalArgumentException e) {
            aby aby2 = f179a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Tag too long:");
            stringBuilder.append(aby);
            abx.m87b(aby2, stringBuilder.toString());
            return false;
        }
    }

    /* renamed from: d */
    public static void m90d(aby aby, String str) {
        if (abx.m86a(aby, 2)) {
            Log.v(aby.toString(), str);
        }
    }

    /* renamed from: e */
    public static void m91e(aby aby, String str) {
        if (abx.m86a(aby, 5)) {
            Log.w(aby.toString(), str);
        }
    }

    /* renamed from: b */
    public static void m88b(aby aby, String str, Throwable th) {
        if (abx.m86a(aby, 5)) {
            Log.w(aby.toString(), str, th);
        }
    }
}
