package p000;

import android.content.SharedPreferences;

/* compiled from: PG */
/* renamed from: eak */
public abstract class eak {
    /* renamed from: a */
    private static final String f3455a = bli.m862a("SettingsUpgrader");
    /* renamed from: b */
    private final String f3456b;
    /* renamed from: c */
    private final int f3457c;

    /* renamed from: a */
    public abstract void mo1143a(gos gos, fbn fbn, int i);

    public eak(String str, int i) {
        this.f3456b = str;
        this.f3457c = i;
    }

    /* renamed from: a */
    protected static boolean m1733a(SharedPreferences sharedPreferences, String str) {
        try {
            sharedPreferences.getString(str, null);
            return true;
        } catch (Throwable e) {
            bli.m867b(f3455a, "error reading old value", e);
            return false;
        }
    }

    /* renamed from: a */
    protected int mo1204a(gos gos) {
        return gos.mo1541c("default_scope", this.f3456b);
    }

    /* renamed from: b */
    public static boolean m1734b(SharedPreferences sharedPreferences, String str) {
        boolean z = false;
        try {
            z = sharedPreferences.getBoolean(str, false);
        } catch (Throwable e) {
            bli.m867b(f3455a, "error reading old value, removing and returning default", e);
        }
        sharedPreferences.edit().remove(str).apply();
        return z;
    }

    /* renamed from: c */
    protected static String m1735c(SharedPreferences sharedPreferences, String str) {
        String str2 = null;
        try {
            str2 = sharedPreferences.getString(str, null);
        } catch (Throwable e) {
            bli.m867b(f3455a, "error reading old value, removing and returning default", e);
        }
        sharedPreferences.edit().remove(str).apply();
        return str2;
    }

    /* renamed from: a */
    public final void m1737a(gos gos, fbn fbn) {
        try {
            int a = mo1204a(gos);
            if (a != this.f3457c) {
                mo1143a(gos, fbn, a);
            }
            gos.mo1531a("default_scope", this.f3456b, this.f3457c);
        } catch (Throwable e) {
            bli.m867b(f3455a, "exception during upgrade", e);
            throw e;
        }
    }
}
