package p000;

/* compiled from: PG */
/* renamed from: ktl */
final class ktl {
    /* renamed from: a */
    public static final ktk f8540a = ktl.m5172a();
    /* renamed from: b */
    public static final ktk f8541b = new ktk();

    /* renamed from: a */
    private static ktk m5172a() {
        try {
            return (ktk) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }
}
