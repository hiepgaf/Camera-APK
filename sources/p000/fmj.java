package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: fmj */
public final class fmj implements fmm {
    /* renamed from: a */
    private fmd f16185a;
    /* renamed from: b */
    private fmp f16186b;
    /* renamed from: c */
    private fmo f16187c;
    /* renamed from: d */
    private kwk f16188d;
    /* renamed from: e */
    private kwk f16189e;
    /* renamed from: f */
    private kwk f16190f = new fml(this.f16189e);
    /* renamed from: g */
    private iqy f16191g = iqy.m12398a(this.f16190f);
    /* renamed from: h */
    private blg f16192h;
    /* renamed from: i */
    private kwk f16193i;
    /* renamed from: j */
    private kwk f16194j;
    /* renamed from: k */
    private kwk f16195k;
    /* renamed from: l */
    private kwk f16196l;
    /* renamed from: m */
    private kwk f16197m;
    /* renamed from: n */
    private fmq f16198n;
    /* renamed from: o */
    private kwk f16199o;

    fmj(fmk fmk) {
        this.f16185a = fmk.f4624a;
        this.f16186b = new fmp(fmk.f4625b);
        this.f16187c = new fmo(fmk.f4625b);
        this.f16188d = kwc.m14017b(new fme(fmk.f4624a));
        this.f16189e = kwh.m14023a(blf.m7508a(fmk.f4626c));
        this.f16192h = blg.m7510a(fmk.f4626c, this.f16191g);
        this.f16193i = kwh.m14023a(bcd.m7257a(fmk.f4627d));
        this.f16194j = kwh.m14023a(new fjy(this.f16192h, this.f16193i));
        this.f16195k = kwc.m14017b(new flm(this.f16186b, this.f16188d, this.f16194j));
        this.f16196l = kwc.m14017b(new flw(this.f16186b, this.f16187c, this.f16188d, this.f16195k));
        this.f16197m = kwc.m14017b(new flt(this.f16186b, this.f16187c, this.f16188d, this.f16195k));
        this.f16198n = new fmq(fmk.f4625b);
        this.f16199o = kwc.m14017b(new flo(fmk.f4628e, this.f16196l, this.f16197m, this.f16198n));
    }

    /* renamed from: a */
    public static fmk m10515a() {
        return new fmk();
    }

    /* renamed from: b */
    public final fjm mo1405b() {
        return (fjm) this.f16199o.mo345a();
    }

    /* renamed from: c */
    public final Surface mo1406c() {
        return (Surface) ktm.m13963a(this.f16185a.f4621a.mo3154g(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
