package p000;

/* compiled from: PG */
/* renamed from: kqs */
final class kqs {
    /* renamed from: a */
    public static final Class f8427a = kqs.m5050a("libcore.io.Memory");
    /* renamed from: b */
    private static final boolean f8428b;

    static {
        boolean z;
        if (kqs.m5050a("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = false;
        }
        f8428b = z;
    }

    /* renamed from: a */
    private static Class m5050a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    static boolean m5051a() {
        return (f8427a == null || f8428b) ? false : true;
    }
}
