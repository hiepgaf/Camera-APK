package p000;

/* compiled from: PG */
/* renamed from: exx */
public final class exx {
    /* renamed from: a */
    private final exd f4332a;
    /* renamed from: b */
    private final ccr f4333b;
    /* renamed from: c */
    private final iqp f4334c;
    /* renamed from: d */
    private final hjf f4335d;
    /* renamed from: e */
    private final eyb f4336e;
    /* renamed from: f */
    private volatile boolean f4337f = false;

    public exx(exd exd, ccr ccr, hjf hjf, iqp iqp, eyb eyb) {
        this.f4332a = exd;
        this.f4336e = eyb;
        this.f4333b = ccr;
        this.f4334c = iqp;
        this.f4335d = hjf;
    }

    /* renamed from: a */
    public final boolean m2189a() {
        if (!this.f4335d.f6267b.f7509e && !this.f4333b.m8018c()) {
            bli.m866b("GyroCaptureInitializer", "One of several gyro sensor properties is null. No gyro available for microvideo");
            return false;
        } else if (this.f4337f) {
            return true;
        } else {
            iqp iqp = this.f4334c;
            iqp iqp2 = new iqp(iqp.f7329a, iqp.f7330b);
            this.f4336e.m10073a(true);
            this.f4332a.m2182a();
            this.f4333b.m8015a(iqp2);
            this.f4337f = true;
            return true;
        }
    }

    /* renamed from: b */
    public final void m2190b() {
        this.f4336e.m10073a(false);
        this.f4333b.m8019d();
        this.f4337f = false;
    }
}
