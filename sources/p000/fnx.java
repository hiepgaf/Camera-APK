package p000;

/* compiled from: PG */
/* renamed from: fnx */
public final class fnx implements kwk {
    /* renamed from: a */
    private final fnu f16242a;
    /* renamed from: b */
    private final kwk f16243b;
    /* renamed from: c */
    private final kwk f16244c;
    /* renamed from: d */
    private final kwk f16245d;
    /* renamed from: e */
    private final kwk f16246e;

    private fnx(fnu fnu, kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f16242a = fnu;
        this.f16243b = kwk;
        this.f16244c = kwk2;
        this.f16245d = kwk3;
        this.f16246e = kwk4;
    }

    /* renamed from: a */
    public static fnx m10559a(fnu fnu, kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new fnx(fnu, kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f16243b;
        kwk kwk2 = this.f16244c;
        kwk kwk3 = this.f16245d;
        ikb ikb = (ikb) kwk.mo345a();
        ikv ikv = (ikv) kwk2.mo345a();
        fyy fyy = (fyy) kwk3.mo345a();
        fmt fmt = (fmt) this.f16246e.mo345a();
        jri.m13153b(fyy.f4832c.mo2084b());
        ive ive = (ive) fyy.f4832c.mo2081a();
        return (fmm) ktm.m13963a(fmt.mo1407a(ikb, ikv, ive.f7495b, ive.f7494a, 3), "Cannot return null from a non-@Nullable @Provides method");
    }
}
