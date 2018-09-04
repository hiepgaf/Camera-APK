package p000;

/* compiled from: PG */
/* renamed from: dcr */
public final class dcr extends dbx {
    /* renamed from: c */
    public static final String f20927c = bli.m862a("StateReadyCap");
    /* renamed from: d */
    public final bco f20928d;
    /* renamed from: e */
    public boolean f20929e;
    /* renamed from: f */
    public boolean f20930f;
    /* renamed from: g */
    public boolean f20931g;
    /* renamed from: h */
    private ikb f20932h;
    /* renamed from: i */
    private final dbw f20933i = new dcx(this);
    /* renamed from: j */
    private final dbw f20934j = new dcz(this);
    /* renamed from: k */
    private final fbl f20935k = new ddb(this);
    /* renamed from: l */
    private final glq f20936l = new ddc(this);

    public dcr(dbx dbx, bco bco) {
        super((bug) dbx);
        this.f20928d = bco;
        this.f20929e = false;
        this.f20930f = false;
        this.f20931g = false;
        m988a(dbd.class, new dcs(this));
        m988a(daq.class, this.f20933i);
        m988a(das.class, this.f20934j);
        m988a(dbi.class, new ddi(this));
        m988a(dbk.class, new ddj(this));
        m988a(dbj.class, new ddk(this));
        m988a(dbl.class, new ddl(this));
        m988a(dba.class, new ddm(this));
        m988a(dbb.class, new ddo(this));
        m988a(dat.class, new ddq(this));
        m988a(dar.class, new dds(this));
        m988a(dau.class, new dcu(this));
    }

    /* renamed from: f */
    final void mo2954f() {
        this.f20929e = false;
        ((dbu) m991d()).mo2908G().execute(new ddf(this));
    }

    /* renamed from: b */
    public final /* synthetic */ bug mo1134b() {
        return mo2952e();
    }

    /* renamed from: e */
    public final dbx mo2952e() {
        Object G = ((dbu) m991d()).mo2908G();
        this.f20932h = new ikb();
        fbj a = ((dbm) this.f20928d.f10663a).mo2893c().mo2895a();
        this.f20932h.mo1879a(a.mo2855a().f4453a.mo2859a(new dcv(this), G));
        ((dbu) m991d()).mo2918Q().m2639a(this.f20936l);
        G.execute(new dcw(this));
        if (((dbu) m991d()).mo2949y().mo2084b()) {
            ((fbd) ((dbu) m991d()).mo2949y().mo2081a()).m2216a(a.mo2855a().f4460h);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo2953c() {
        ((dbu) m991d()).mo2915N().f17947a = null;
        ((dbu) m991d()).mo2914M();
        ((dbu) m991d()).mo2918Q().m2641b(this.f20936l);
        if (!this.f20930f) {
            this.f20928d.close();
        }
        this.f20932h.close();
        if (((dbu) m991d()).mo2949y().mo2084b()) {
            ((fbd) ((dbu) m991d()).mo2949y().mo2081a()).m2215a();
        }
    }

    /* renamed from: a */
    final void m15352a(dbn dbn) {
        this.f20930f = true;
        ((dbm) this.f20928d.f10663a).mo2891a(this.f20935k, dbn);
        this.f1596b.remove(dbi.class);
    }
}
