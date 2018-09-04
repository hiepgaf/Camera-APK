package p000;

/* compiled from: PG */
/* renamed from: edl */
class edl extends gqj {
    /* renamed from: a */
    private final /* synthetic */ edk f21260a;

    edl(edk edk) {
        this.f21260a = edk;
        super(null);
    }

    /* renamed from: a */
    public final void mo1562a() {
        this.f21260a.f21253b.mo348a(Boolean.valueOf(true));
        edk edk = this.f21260a;
        gyz gyz = edk.f21252a;
        edk.f21258g = gyz.f5830d.f5846e;
        gyz.m2931a(false);
        this.f21260a.f21254c.f1417a.mo2701e();
        this.f21260a.f21255d.startCountdown();
        this.f21260a.f21256e.m3025a(hbf.CANCEL);
        this.f21260a.f21257f.m11618a(false);
        this.f21260a.f21259h.m2462b();
        hnu.f6384a = false;
    }

    /* renamed from: b */
    public final void mo1563b() {
        this.f21260a.f21253b.mo348a(Boolean.valueOf(false));
        edk edk = this.f21260a;
        edk.f21252a.m2931a(edk.f21258g);
        this.f21260a.f21255d.stopCountdown();
        hcd hcd = this.f21260a.f21256e;
        hcd.m3025a(hcd.f5958d);
        this.f21260a.f21257f.m11618a(true);
        this.f21260a.f21259h.m2458a();
        hnu.f6384a = true;
    }

    /* renamed from: t */
    public void mo3003t() {
    }
}
