package p000;

/* compiled from: PG */
/* renamed from: krx */
final class krx implements ktd {
    /* renamed from: a */
    public static final krx f19277a = new krx();

    private krx() {
    }

    /* renamed from: a */
    public final boolean mo2285a(Class cls) {
        return kry.class.isAssignableFrom(cls);
    }

    /* renamed from: b */
    public final ktc mo2286b(Class cls) {
        if (kry.class.isAssignableFrom(cls)) {
            try {
                return (ktc) kry.m17795a(cls.asSubclass(kry.class)).mo3571a(go.bX, null);
            } catch (Throwable e) {
                Throwable th = e;
                String valueOf = String.valueOf(cls.getName());
                String str = "Unable to get message info for ";
                throw new RuntimeException(valueOf.length() == 0 ? new String(str) : str.concat(valueOf), th);
            }
        }
        valueOf = String.valueOf(cls.getName());
        String str2 = "Unsupported message type: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        throw new IllegalArgumentException(valueOf);
    }
}
