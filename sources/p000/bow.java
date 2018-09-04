package p000;

/* compiled from: PG */
/* renamed from: bow */
public final class bow implements kwk {
    /* renamed from: a */
    private final kwk f11168a;
    /* renamed from: b */
    private final kwk f11169b;
    /* renamed from: c */
    private final kwk f11170c;
    /* renamed from: d */
    private final kwk f11171d;

    public bow(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f11168a = kwk;
        this.f11169b = kwk2;
        this.f11170c = kwk3;
        this.f11171d = kwk4;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f11168a;
        kwk kwk2 = this.f11169b;
        kwk kwk3 = this.f11170c;
        ena ena = (ena) kwk3.mo345a();
        ikd ikd = (ikd) this.f11171d.mo345a();
        eol bov = new bov((baf) kwk.mo345a(), (bou) kwk2.mo345a());
        eio.m1756a(ikd, ena, bov);
        return (gqd) ktm.m13963a(bov, "Cannot return null from a non-@Nullable @Provides method");
    }
}
