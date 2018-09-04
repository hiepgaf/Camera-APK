package p000;

/* compiled from: PG */
/* renamed from: fho */
public final class fho implements kwk {
    /* renamed from: a */
    private final kwk f16027a;
    /* renamed from: b */
    private final kwk f16028b;
    /* renamed from: c */
    private final kwk f16029c;
    /* renamed from: d */
    private final kwk f16030d;

    private fho(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f16027a = kwk;
        this.f16028b = kwk2;
        this.f16029c = kwk3;
        this.f16030d = kwk4;
    }

    /* renamed from: a */
    public static fho m10389a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new fho(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f16027a;
        kwk kwk2 = this.f16028b;
        kwk kwk3 = this.f16029c;
        fiq fiq = (fiq) kwk.mo345a();
        ikb ikb = (ikb) kwk2.mo345a();
        kpk kpk = (kpk) kwk3.mo345a();
        this.f16030d.mo345a();
        return (kpk) ktm.m13963a(kny.m18045a(kpk, new fhl(ikb, fiq), kpq.f8410a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
