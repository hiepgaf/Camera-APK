package p000;

/* compiled from: PG */
/* renamed from: cwh */
public final class cwh implements fbj {
    /* renamed from: a */
    public final ikb f20804a;
    /* renamed from: b */
    public final cwc f20805b;
    /* renamed from: c */
    public final ffc f20806c;
    /* renamed from: d */
    private final fbj f20807d;

    public cwh(fbj fbj, ikb ikb, cwc cwc, ffc ffc) {
        jri.m13152b((Object) fbj);
        jri.m13152b((Object) ikb);
        jri.m13152b((Object) cwc);
        jri.m13152b((Object) ffc);
        this.f20807d = fbj;
        this.f20804a = ikb;
        this.f20805b = cwc;
        this.f20806c = ffc;
    }

    public final void close() {
        this.f20807d.close();
        this.f20804a.close();
    }

    /* renamed from: a */
    public final fbp mo2855a() {
        return this.f20807d.mo2855a();
    }

    /* renamed from: b */
    public final ilp m15227b() {
        return this.f20807d.mo2855a().f4453a;
    }

    /* renamed from: c */
    public final boolean mo2857c() {
        return this.f20804a.mo3049a();
    }

    /* renamed from: d */
    public final kpk mo2858d() {
        return this.f20807d.mo2858d();
    }

    /* renamed from: a */
    public final kpk mo2856a(fbk fbk, gkr gkr) {
        return this.f20807d.mo2856a(fbk, gkr);
    }

    /* renamed from: a */
    public final aub mo363a(asw asw) {
        return this.f20807d.mo363a(asw);
    }
}
