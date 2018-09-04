package p000;

/* compiled from: PG */
/* renamed from: krm */
final class krm {
    /* renamed from: a */
    private static final Class f8443a = krm.m5102c();

    /* renamed from: a */
    public static krn m5099a() {
        if (f8443a != null) {
            try {
                return krm.m5100a("newInstance");
            } catch (Exception e) {
            }
        }
        return new krn();
    }

    /* renamed from: b */
    public static krn m5101b() {
        if (f8443a != null) {
            try {
                return krm.m5100a("getEmptyRegistry");
            } catch (Exception e) {
            }
        }
        return krn.f8444a;
    }

    /* renamed from: a */
    private static final krn m5100a(String str) {
        return (krn) f8443a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    /* renamed from: c */
    private static Class m5102c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
}
