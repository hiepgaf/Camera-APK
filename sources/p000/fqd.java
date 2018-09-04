package p000;

/* compiled from: PG */
/* renamed from: fqd */
public final class fqd implements fux {
    /* renamed from: a */
    public final /* synthetic */ fqc f21383a;
    /* renamed from: b */
    private final axm f21384b;
    /* renamed from: c */
    private final gkr f21385c;
    /* renamed from: d */
    private final ggc f21386d;
    /* renamed from: e */
    private final ggb f21387e;
    /* renamed from: f */
    private final gfz f21388f;
    /* renamed from: g */
    private int f21389g = 0;
    /* renamed from: h */
    private iqm f21390h;

    fqd(fqc fqc, fwa fwa, fux fux, axm axm, ggc ggc) {
        this.f21383a = fqc;
        this.f21384b = axm;
        this.f21385c = fwa.f4753b;
        this.f21386d = ggc;
        this.f21387e = new ggb(this, fux);
        this.f21388f = gfz.m17361a(fqc.f16368c, fqc.f16369d, kbg.m4745c(this.f21387e), new fqe(), this.f21386d, fqc.f16367b);
        gfz gfz = this.f21388f;
        kow.m13622a(gfz.mo3056a(), new gga(gfz, this.f21385c), kpq.f8410a);
        ((grg) jri.m13152b(this.f21385c.mo1482h())).mo1522b();
    }

    /* renamed from: a */
    public final void mo2642a(iwz iwz, kpk kpk) {
        this.f21389g++;
        this.f21390h = iqm.m4037a(((Integer) this.f21384b.m736b().mo2860b()).intValue());
        this.f21388f.mo3057a(new gfw(iwz, this.f21390h, kpk, this.f21383a.f16370e), this.f21385c);
    }

    public final void close() {
        this.f21388f.close();
        if (this.f21389g == 0) {
            this.f21385c.mo2861a();
        }
    }
}
