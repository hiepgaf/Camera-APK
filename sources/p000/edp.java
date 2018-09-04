package p000;

/* compiled from: PG */
/* renamed from: edp */
class edp extends edn {
    /* renamed from: a */
    private final /* synthetic */ edo f23085a;

    edp(edo edo) {
        this.f23085a = edo;
    }

    /* renamed from: a */
    public final void mo1562a() {
        bli.m863a(edo.f23070a, "enter Lens Blur state");
        this.f23085a.f23075f.setVisibility(0);
        this.f23085a.f23077h.switchToLensBlur();
        hcd hcd = this.f23085a.f23078i;
        hcd.m3025a(hbf.PHOTO_IDLE);
        hcd.f5955a.setVisibility(0);
        edo edo = this.f23085a;
        edo.f23074e.f2450e = true;
        edo.f23084o.mo348a(hhx.LENS_BLUR);
    }

    /* renamed from: b */
    public final void mo1563b() {
        bli.m863a(edo.f23070a, "exit Lens Blur state");
        this.f23085a.f23074e.f2450e = false;
    }

    /* renamed from: s */
    public void mo3002s() {
    }
}
