package p000;

/* compiled from: PG */
/* renamed from: dbs */
public final class dbs implements dbr {
    /* renamed from: a */
    private static final String f20852a = bli.m862a("ResOpenedCam");
    /* renamed from: b */
    private final fbj f20853b;
    /* renamed from: c */
    private final iut f20854c;
    /* renamed from: d */
    private final ffc f20855d;
    /* renamed from: e */
    private final iqp f20856e;
    /* renamed from: f */
    private final fxg f20857f;
    /* renamed from: g */
    private final ilp f20858g;
    /* renamed from: h */
    private final ikb f20859h;

    public dbs(fbj fbj, iut iut, ffc ffc, iqp iqp, fxg fxg, ilp ilp, ikb ikb) {
        this.f20853b = fbj;
        this.f20854c = iut;
        this.f20855d = ffc;
        this.f20856e = iqp;
        this.f20857f = fxg;
        this.f20858g = ilp;
        this.f20859h = ikb;
    }

    public final void close() {
        bli.m863a(f20852a, "close");
        this.f20859h.close();
        this.f20853b.close();
    }

    /* renamed from: a */
    public final fbj mo2895a() {
        return this.f20853b;
    }

    /* renamed from: b */
    public final ffc mo2896b() {
        return this.f20855d;
    }

    /* renamed from: c */
    public final iut mo2897c() {
        return this.f20854c;
    }

    /* renamed from: d */
    public final fxg mo2898d() {
        return this.f20857f;
    }

    /* renamed from: e */
    public final iqp mo2899e() {
        return this.f20856e;
    }

    /* renamed from: f */
    public final ilp mo2900f() {
        return this.f20858g;
    }

    /* renamed from: g */
    public final kpk mo2901g() {
        return this.f20853b.mo2858d();
    }
}
