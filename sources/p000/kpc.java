package p000;

/* compiled from: PG */
/* renamed from: kpc */
class kpc {
    /* renamed from: a */
    public static final kpb f8401a = kpc.m5033a();
    /* renamed from: b */
    private static final String f8402b = String.valueOf(kpc.class.getName()).concat("$ClassValueValidator");

    kpc() {
    }

    /* renamed from: a */
    private static kpb m5033a() {
        try {
            return (kpb) Class.forName(f8402b).getEnumConstants()[0];
        } catch (Throwable th) {
            return koz.m5029a();
        }
    }
}
