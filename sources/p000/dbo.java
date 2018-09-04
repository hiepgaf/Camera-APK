package p000;

import android.content.Context;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dbo */
public final class dbo implements dbm {
    /* renamed from: b */
    private static final String f20837b = bli.m862a("ResCapTools");
    /* renamed from: a */
    public final dak f20838a;
    /* renamed from: c */
    private final dbr f20839c;
    /* renamed from: d */
    private final gke f20840d;
    /* renamed from: e */
    private final gpn f20841e;
    /* renamed from: f */
    private final Context f20842f;
    /* renamed from: g */
    private final gtf f20843g;
    /* renamed from: h */
    private final ikd f20844h;
    /* renamed from: i */
    private final hjw f20845i;
    /* renamed from: j */
    private final gci f20846j;
    /* renamed from: k */
    private final ilp f20847k;
    /* renamed from: l */
    private final irs f20848l;
    /* renamed from: m */
    private final grg f20849m;
    /* renamed from: n */
    private final gnh f20850n;
    /* renamed from: o */
    private final fbm f20851o = new dbq();

    private dbo(dbr dbr, gke gke, gpn gpn, Context context, gtf gtf, ikd ikd, dak dak, hjw hjw, gci gci, ilp ilp, grg grg, gnh gnh, irs irs) {
        this.f20839c = dbr;
        this.f20840d = gke;
        this.f20840d.m2584a();
        this.f20841e = gpn;
        this.f20842f = context;
        this.f20843g = gtf;
        this.f20844h = ikd;
        this.f20838a = dak;
        this.f20845i = hjw;
        this.f20846j = gci;
        this.f20847k = ilp;
        this.f20849m = grg;
        this.f20850n = gnh;
        this.f20848l = irs;
    }

    public final void close() {
        bli.m863a(f20837b, "close");
        this.f20839c.close();
        this.f20840d.m2585b();
    }

    /* renamed from: a */
    public static bco m15270a(dbr dbr, Context context, gtf gtf, gsl gsl, ikd ikd, gpn gpn, dak dak, hjw hjw, gci gci, cbu cbu, ilp ilp, irs irs, grg grg, gnh gnh) {
        glo glo = new glo(gnv.m11222a(context, gsl), ikd, new iya(), irs);
        return new bco(new dbo(dbr, new gke(cbu.m1101b()), gpn, context, gtf, ikd, dak, hjw, gci, ilp, grg, gnh, irs));
    }

    /* renamed from: a */
    public final gpn mo2889a() {
        return this.f20841e;
    }

    /* renamed from: b */
    public final ffc mo2892b() {
        return this.f20839c.mo2896b();
    }

    /* renamed from: c */
    public final dbr mo2893c() {
        return this.f20839c;
    }

    /* renamed from: a */
    public final void mo2890a(int i) {
        if (i == 1) {
            this.f20841e.mo1548a(R.raw.timer_final);
        } else if (i == 2 || i == 3) {
            this.f20841e.mo1548a(R.raw.timer_increment);
        }
    }

    /* renamed from: d */
    public final void mo2894d() {
        this.f20841e.mo1548a(R.raw.timer_start);
    }

    /* renamed from: a */
    public final void mo2891a(fbl fbl, dbn dbn) {
        boolean z;
        iut c;
        boolean z2 = true;
        this.f20844h.execute(new dbp(this));
        long currentTimeMillis = System.currentTimeMillis();
        gkr dap = new dap(this.f20843g.m2812a(currentTimeMillis), currentTimeMillis, this.f20845i.mo1244d(), this.f20850n, this.f20849m);
        ((grg) jri.m13152b(dap.mo1482h())).mo1516a(new grj(this.f20848l, new iya()));
        dap.mo2872a(this.f20839c.mo2899e(), glw.IMAGE_INTENT);
        float floatValue = ((Float) this.f20839c.mo2900f().mo2860b()).floatValue();
        if (((Integer) this.f20847k.mo2860b()).intValue() != gxk.OFF.f5765e) {
            z = true;
        } else {
            z = false;
        }
        grg h = dap.mo1482h();
        eps a = epr.m1954o().m1971a(19).m1974a(String.valueOf(dap.mo2886n()).concat(".jpg"));
        if (this.f20839c.mo2897c() != iut.FRONT) {
            z2 = false;
        }
        h.mo1514a(a.m1976a(z2).m1983c(false).m1977b(floatValue).m1979b(((fxi) this.f20839c.mo2898d().f4778b.mo2860b()).f4787d).m1982c(((fxj) this.f20839c.mo2898d().f4780d.mo2860b()).f4793d).m1981b(z).m1970a((float) dbn.f2931b).m1980b(kbg.m4744b(dbn.f2930a.f2927a)).m1978b(Boolean.valueOf(dbn.f2930a.f2928b)).m1972a(this.f20839c.mo2896b().mo1932n()).m1975a(kau.f19138a).m1973a((Boolean) this.f20839c.mo2898d().f4781e.mo2860b()).m1969a());
        ffc b = mo2892b();
        int i = this.f20846j.mo1441a().f7326e;
        this.f20842f.getExternalCacheDir();
        fbm fbm = this.f20851o;
        int i2 = this.f20840d.f5297a;
        if (b != null) {
            c = b.mo1921c();
        } else {
            c = iut.BACK;
        }
        this.f20839c.mo2895a().mo2856a(new fbk(i, fbl, fbm, i2, c, mo2892b().mo1931m(), imh.m3845a(Boolean.valueOf(false))), dap);
    }
}
