package p000;

/* compiled from: PG */
/* renamed from: brf */
public final class brf implements kwk {
    /* renamed from: a */
    private final kwk f11219a;

    private brf(kwk kwk) {
        this.f11219a = kwk;
    }

    /* renamed from: a */
    public static brf m7692a(kwk kwk) {
        return new brf(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        hjf hjf = (hjf) this.f11219a.mo345a();
        boolean z = !hjf.m3194b() ? !hjf.m3195c() ? hjf.m3196d() : true : true;
        return (bsq) ktm.m13963a(new bsq("camera.enable_vesper", z), "Cannot return null from a non-@Nullable @Provides method");
    }
}
