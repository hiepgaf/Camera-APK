package p000;

/* compiled from: PG */
/* renamed from: ehn */
class ehn extends gqj {
    /* renamed from: a */
    private final /* synthetic */ ehm f21283a;

    ehn(ehm ehm) {
        this.f21283a = ehm;
        super(null);
    }

    /* renamed from: a */
    public final void mo1562a() {
        bli.m863a(ehm.f21278d, "enter capturing state");
        this.f21283a.f21282h.m2462b();
        this.f21283a.f21279e.startLensBlurCapture();
        this.f21283a.f21280f.m3025a(hbf.CANCEL);
        this.f21283a.f21281g.m11618a(false);
    }

    /* renamed from: b */
    public final void mo1563b() {
        bli.m863a(ehm.f21278d, "exit capturing state");
        this.f21283a.f21282h.m2458a();
        this.f21283a.f21279e.stopLensBlurCapture();
        this.f21283a.f21280f.m3025a(hbf.PHOTO_IDLE);
        this.f21283a.f21281g.m11618a(true);
    }

    /* renamed from: E */
    public void mo3008E() {
    }
}
