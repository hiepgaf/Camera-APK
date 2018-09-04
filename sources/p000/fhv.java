package p000;

/* compiled from: PG */
/* renamed from: fhv */
public final class fhv implements kwk {
    /* renamed from: a */
    private final kwk f16037a;
    /* renamed from: b */
    private final kwk f16038b;
    /* renamed from: c */
    private final kwk f16039c;
    /* renamed from: d */
    private final kwk f16040d;

    private fhv(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f16037a = kwk;
        this.f16038b = kwk2;
        this.f16039c = kwk3;
        this.f16040d = kwk4;
    }

    /* renamed from: a */
    public static fhv m10399a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new fhv(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f16037a;
        kwk kwk2 = this.f16038b;
        kwk kwk3 = this.f16039c;
        fiq fiq = (fiq) kwk.mo345a();
        ikb ikb = (ikb) kwk2.mo345a();
        kpk kpk = (kpk) kwk3.mo345a();
        this.f16040d.mo345a();
        return (kpk) ktm.m13963a(kny.m18045a(kpk, new fhs(ikb, fiq), kpq.f8410a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
