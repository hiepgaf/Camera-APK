package p000;

/* compiled from: PG */
/* renamed from: dre */
public final class dre implements kwk {
    /* renamed from: a */
    private final kwk f14278a;
    /* renamed from: b */
    private final kwk f14279b;
    /* renamed from: c */
    private final kwk f14280c;
    /* renamed from: d */
    private final kwk f14281d;
    /* renamed from: e */
    private final kwk f14282e;

    private dre(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f14278a = kwk;
        this.f14279b = kwk2;
        this.f14280c = kwk3;
        this.f14281d = kwk4;
        this.f14282e = kwk5;
    }

    /* renamed from: a */
    public static dre m9279a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new dre(kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f14278a;
        kwk kwk2 = this.f14279b;
        kwk kwk3 = this.f14280c;
        kwk kwk4 = this.f14281d;
        dri dri = (dri) kwk.mo345a();
        dsn dsn = (dsn) kwk2.mo345a();
        dsl dsl = (dsl) kwk3.mo345a();
        dsj dsj = (dsj) kwk4.mo345a();
        bxg bxg = (bxg) this.f14282e.mo345a();
        fwl a = dsn.m1675a();
        fwl a2 = dsj.m1673a();
        fwl a3 = dsl.m1674a(a2);
        return (dsv) ktm.m13963a(new dsv(new drq(dri.f3218a, new drk(dri.f3219b, dri.f3223f.m1672a(a3), a, dri.f3221d, dri.f3222e, dri.f3223f.m1672a(dri.f3220c.m1671a(bxg, a2, dri.f3225h.m2275a(Math.max(bxg.f1694i, 0))))))), "Cannot return null from a non-@Nullable @Provides method");
    }
}
