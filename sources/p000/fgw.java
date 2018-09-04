package p000;

import android.annotation.TargetApi;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: fgw */
public final class fgw {
    /* renamed from: a */
    private static fgw f4549a = null;
    /* renamed from: b */
    private static final Object f4550b = new Object();
    /* renamed from: c */
    private final iwc f4551c;

    static {
        bli.m862a("OneCamDbgHpr");
    }

    private fgw(iwc iwc) {
        this.f4551c = iwc;
    }

    /* renamed from: a */
    public final boolean m2281a() {
        if (m2283a("persist.gcam.save_metering", false) || m2283a("persist.gcam.debug", false)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m2284b() {
        if (m2283a("persist.gcam.save_payload", false) || m2283a("persist.gcam.debug", false)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m2285c() {
        if (m2283a("persist.gcam.save_text", false) || m2283a("persist.gcam.debug", false)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m2277d() {
        return false;
    }

    /* renamed from: e */
    public static boolean m2278e() {
        return false;
    }

    /* renamed from: a */
    public final boolean m2283a(String str, boolean z) {
        jri.m13152b((Object) str);
        String a = this.f4551c.m4274a(str);
        if (a == null || a.isEmpty()) {
            return z;
        }
        if ("0".equals(a)) {
            return false;
        }
        if ("1".equals(a)) {
            return true;
        }
        return z;
    }

    /* renamed from: a */
    public final int m2280a(String str) {
        int i = 4;
        jri.m13152b((Object) str);
        String a = this.f4551c.m4274a(str);
        if (!(a == null || a.isEmpty())) {
            try {
                i = Integer.parseInt(a);
            } catch (NumberFormatException e) {
            }
        }
        return i;
    }

    /* renamed from: a */
    public final boolean m2282a(String str, String str2) {
        jri.m13152b((Object) str);
        String a = this.f4551c.m4274a(str);
        if (a == null || a.isEmpty() || str2.isEmpty()) {
            return false;
        }
        return str2.equals(a);
    }

    @Deprecated
    /* renamed from: f */
    public static fgw m2279f() {
        synchronized (f4550b) {
            if (f4549a == null) {
                f4549a = new fgw(iwd.f7518a);
            }
        }
        return f4549a;
    }
}
