package p000;

/* compiled from: PG */
/* renamed from: eun */
public final class eun {
    /* renamed from: a */
    private final exi f4247a;
    /* renamed from: b */
    private final kbg f4248b;
    /* renamed from: c */
    private final exx f4249c;
    /* renamed from: d */
    private boolean f4250d = false;
    /* renamed from: e */
    private boolean f4251e = true;
    /* renamed from: f */
    private boolean f4252f = false;

    public eun(exi exi, kbg kbg, exx exx) {
        this.f4247a = exi;
        this.f4248b = kbg;
        this.f4249c = exx;
    }

    /* renamed from: a */
    public final synchronized void m2135a(boolean z) {
        this.f4251e = z;
        m2134a();
    }

    /* renamed from: b */
    public final synchronized void m2136b(boolean z) {
        this.f4252f = z;
        m2134a();
    }

    /* renamed from: a */
    private final void m2134a() {
        boolean z;
        if (this.f4251e) {
            z = true;
        } else if (this.f4252f) {
            z = true;
        } else {
            z = false;
        }
        if (this.f4250d != z) {
            if (z) {
                this.f4247a.mo3030a(true);
                if (this.f4248b.mo2084b()) {
                    this.f4248b.mo2081a();
                    throw new NoSuchMethodError();
                } else {
                    this.f4249c.m2189a();
                    bli.m863a("MvCapAdj", "starting gyro capture and adjusting upwards HLINE CIRCLE");
                }
            } else {
                this.f4247a.mo3030a(false);
                if (this.f4248b.mo2084b()) {
                    this.f4248b.mo2081a();
                    throw new NoSuchMethodError();
                } else {
                    this.f4249c.m2190b();
                    bli.m863a("MvCapAdj", "stopping gyro capture and adjusting downwards HLINE CIRCLE");
                }
            }
            this.f4250d = z;
        }
    }
}
