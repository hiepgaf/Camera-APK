package p000;

/* compiled from: PG */
/* renamed from: ehq */
class ehq extends gqj {
    /* renamed from: a */
    private final /* synthetic */ ehp f21289a;

    ehq(ehp ehp) {
        this.f21289a = ehp;
        super(null);
    }

    /* renamed from: a */
    public final void mo1562a() {
        this.f21289a.f21287i.m2462b();
        bli.m863a(ehp.f21284f, "enter calibration state.");
        this.f21289a.f21288j.mo348a(Boolean.valueOf(true));
    }

    /* renamed from: b */
    public final void mo1563b() {
        this.f21289a.f21288j.mo348a(Boolean.valueOf(false));
    }

    /* renamed from: F */
    public void mo3010F() {
        this.f21289a.f21287i.m2458a();
        this.f21289a.f21285g.stopPanoramaCapture();
        this.f21289a.f21286h.m3025a(hbf.PHOTO_IDLE);
        bli.m863a(ehp.f21284f, "Cancel photosphere capture");
    }

    /* renamed from: J */
    public void mo3011J() {
        this.f21289a.f21286h.m3025a(hbf.CONFIRM_ENABLED);
    }
}
