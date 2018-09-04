package p000;

/* compiled from: PG */
/* renamed from: fxb */
public final class fxb implements kwk {
    /* renamed from: a */
    private final kwk f16608a;
    /* renamed from: b */
    private final kwk f16609b;
    /* renamed from: c */
    private final kwk f16610c;
    /* renamed from: d */
    private final kwk f16611d;
    /* renamed from: e */
    private final kwk f16612e;

    private fxb(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f16608a = kwk;
        this.f16609b = kwk2;
        this.f16610c = kwk3;
        this.f16611d = kwk4;
        this.f16612e = kwk5;
    }

    /* renamed from: a */
    public static fxb m10852a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new fxb(kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f16608a;
        kwk kwk2 = this.f16609b;
        kwk kwk3 = this.f16610c;
        kwk kwk4 = this.f16611d;
        kwk kwk5 = this.f16612e;
        ikb ikb = (ikb) kwk.mo345a();
        fff fff = (fff) kwk2.mo345a();
        Object a = kwk3.mo345a();
        kpk kpk = (kpk) kwk4.mo345a();
        kpk kpk2 = (kpk) kwk5.mo345a();
        fwx fwx = (fwx) a;
        Runnable ffq = new ffq(fff, fwx);
        kow.m13622a(kpk, new fwz(ffq, ikb), kpq.f8410a);
        kpk2.mo1985a(ffq, kpq.f8410a);
        return (ijk) ktm.m13963a(aqe.m582a(new fwy(fff, fwx)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
