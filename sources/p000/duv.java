package p000;

/* compiled from: PG */
/* renamed from: duv */
public final class duv implements kwk {
    /* renamed from: a */
    private final kwk f14592a;
    /* renamed from: b */
    private final kwk f14593b;
    /* renamed from: c */
    private final kwk f14594c;
    /* renamed from: d */
    private final kwk f14595d;
    /* renamed from: e */
    private final kwk f14596e;
    /* renamed from: f */
    private final kwk f14597f;
    /* renamed from: g */
    private final kwk f14598g;
    /* renamed from: h */
    private final kwk f14599h;

    private duv(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8) {
        this.f14592a = kwk;
        this.f14593b = kwk2;
        this.f14594c = kwk3;
        this.f14595d = kwk4;
        this.f14596e = kwk5;
        this.f14597f = kwk6;
        this.f14598g = kwk7;
        this.f14599h = kwk8;
    }

    /* renamed from: a */
    public static duv m9427a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8) {
        return new duv(kwk, kwk2, kwk3, kwk4, kwk5, kwk6, kwk7, kwk8);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        boolean z;
        kwk kwk = this.f14592a;
        kwk kwk2 = this.f14593b;
        kwk kwk3 = this.f14594c;
        kwk kwk4 = this.f14595d;
        kwk kwk5 = this.f14596e;
        kwk kwk6 = this.f14597f;
        kwk kwk7 = this.f14598g;
        bkw bkw = (bkw) kwk.mo345a();
        ffc ffc = (ffc) kwk2.mo345a();
        fxc fxc = (fxc) kwk3.mo345a();
        ilp ilp = (ilp) kwk4.mo345a();
        ilp ilp2 = (ilp) kwk5.mo345a();
        ilp ilp3 = (ilp) kwk6.mo345a();
        dud dud = (dud) kwk7.mo345a();
        this.f14599h.mo345a();
        boolean v = ffc.mo1940v();
        if (ffc.mo1921c() == iut.FRONT) {
            z = true;
        } else {
            z = false;
        }
        return (ilp) ktm.m13963a(new dtz(bkw, v, z, fxc, ilp, ilp2, ilp3, dud.f14547a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
