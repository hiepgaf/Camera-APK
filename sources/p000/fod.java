package p000;

/* compiled from: PG */
/* renamed from: fod */
public final class fod implements kwk {
    /* renamed from: a */
    private final kwk f16251a;
    /* renamed from: b */
    private final kwk f16252b;
    /* renamed from: c */
    private final kwk f16253c;
    /* renamed from: d */
    private final kwk f16254d;
    /* renamed from: e */
    private final kwk f16255e;

    private fod(fnz fnz, kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f16251a = kwk;
        this.f16252b = kwk2;
        this.f16253c = kwk3;
        this.f16254d = kwk4;
        this.f16255e = kwk5;
    }

    /* renamed from: a */
    public static fod m10569a(fnz fnz, kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new fod(fnz, kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f16251a;
        kwk kwk2 = this.f16252b;
        kwk kwk3 = this.f16253c;
        kwk kwk4 = this.f16254d;
        ikb ikb = (ikb) kwk.mo345a();
        ikv ikv = (ikv) kwk2.mo345a();
        fyy fyy = (fyy) kwk3.mo345a();
        fmt fmt = (fmt) kwk4.mo345a();
        int intValue = ((Integer) this.f16255e.mo345a()).intValue();
        ive ive = fyy.f4830a;
        return (fmm) ktm.m13963a(fmt.mo1407a(ikb, ikv, ive.f7495b, ive.f7494a, intValue), "Cannot return null from a non-@Nullable @Provides method");
    }
}
