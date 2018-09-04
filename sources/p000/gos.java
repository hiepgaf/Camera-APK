package p000;

import android.content.SharedPreferences;

/* compiled from: PG */
/* renamed from: gos */
public abstract class gos {
    /* renamed from: a */
    public abstract int mo1527a(String str, String str2, Integer num);

    /* renamed from: a */
    public abstract SharedPreferences mo1528a();

    /* renamed from: a */
    public abstract void mo1529a(gol gol);

    /* renamed from: a */
    public abstract void mo1530a(String str, int i, int[] iArr);

    /* renamed from: a */
    public abstract void mo1531a(String str, String str2, int i);

    /* renamed from: a */
    public abstract void mo1532a(String str, String str2, String str3);

    /* renamed from: a */
    public abstract void mo1533a(String str, String str2, String[] strArr);

    /* renamed from: a */
    public abstract void mo1534a(String str, boolean z);

    /* renamed from: a */
    public abstract boolean mo1535a(String str, String str2);

    /* renamed from: a */
    public abstract boolean mo1536a(String str, String str2, boolean z);

    /* renamed from: b */
    public abstract int mo1537b(String str, String str2);

    /* renamed from: b */
    public abstract void mo1538b(gol gol);

    /* renamed from: b */
    public abstract void mo1539b(String str, String str2, int i);

    /* renamed from: b */
    public abstract void mo1540b(String str, String str2, boolean z);

    /* renamed from: c */
    public abstract int mo1541c(String str, String str2);

    /* renamed from: c */
    public abstract SharedPreferences mo1542c(String str);

    /* renamed from: d */
    public abstract String mo1543d(String str, String str2);

    /* renamed from: e */
    public abstract boolean mo1544e(String str, String str2);

    /* renamed from: f */
    public abstract void mo1545f(String str, String str2);

    /* renamed from: g */
    public abstract void mo1546g(String str, String str2);

    /* renamed from: a */
    public static String m2670a(boolean z) {
        return !z ? "0" : "1";
    }

    /* renamed from: a */
    public static String m2669a(String str) {
        String valueOf = String.valueOf("_preferences_camera_");
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: b */
    public static String m2671b(String str) {
        String valueOf = String.valueOf("_preferences_camera_");
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }
}
