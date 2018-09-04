package p000;

/* compiled from: PG */
/* renamed from: fxg */
public final class fxg {
    /* renamed from: a */
    public final iqp f4777a;
    /* renamed from: b */
    public final ilp f4778b;
    /* renamed from: c */
    public final ilp f4779c;
    /* renamed from: d */
    public final ilp f4780d;
    /* renamed from: e */
    public final ilp f4781e;

    static {
        bli.m862a("OneCamCaptSetting");
    }

    private fxg(iqp iqp, ilp ilp, ilp ilp2, ilp ilp3, ilp ilp4) {
        this.f4777a = iqp;
        this.f4778b = ilp;
        this.f4779c = ilp2;
        this.f4780d = ilp3;
        this.f4781e = ilp4;
    }

    /* renamed from: a */
    public static fxg m2410a(iqp iqp, ilp ilp, ilp ilp2, ilp ilp3, fha fha, ilp ilp4) {
        ilp ilp5;
        if (fha.mo1127c()) {
            ilp5 = ilp2;
        } else {
            ilp5 = ilq.m3818a(Boolean.valueOf(false));
        }
        return new fxg(iqp, ilp3, ilp5, ilp, ilp4);
    }
}
