package p000;

/* compiled from: PG */
/* renamed from: krq */
final class krq {
    /* renamed from: a */
    public static final krp f8449a = new krp((byte) 0);
    /* renamed from: b */
    private static final krp f8450b = krq.m5113b();

    /* renamed from: a */
    static krp m5112a() {
        if (f8450b != null) {
            return f8450b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    private static krp m5113b() {
        try {
            return (krp) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }
}
