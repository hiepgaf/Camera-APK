package p000;

/* compiled from: PG */
/* renamed from: cgh */
public final class cgh extends bcs {
    /* renamed from: d */
    private static final String f20302d = bli.m862a("CamActvtyCtrInit");
    /* renamed from: e */
    private final kwk f20303e;
    /* renamed from: f */
    private final ird f20304f;
    /* renamed from: g */
    private final enr f20305g;
    /* renamed from: h */
    private boolean f20306h = false;

    public cgh(kwk kwk, ikd ikd, enr enr, ird ird) {
        super(null, ikd);
        this.f20303e = kwk;
        this.f20304f = ird;
        this.f20305g = enr;
    }

    /* renamed from: d */
    final boolean m15028d() {
        if (this.f20306h) {
            return true;
        }
        this.f20304f.mo1903a("CameraActivityControllerInitializer#initialize");
        cfh cfh = (cfh) this.f20303e.mo345a();
        this.f20304f.mo1902a();
        this.f20306h = cfh.mo2729D();
        this.f20304f.mo1902a();
        this.f20304f.mo1904b();
        return this.f20306h;
    }

    /* renamed from: c */
    protected final void mo2725c() {
        if (!m15028d()) {
            bli.m869c(f20302d, "Postponing controller initialization to onStart");
            this.f20305g.m1906a(new cgi(this));
        }
        m7269b();
    }
}
