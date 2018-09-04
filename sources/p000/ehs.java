package p000;

/* compiled from: PG */
/* renamed from: ehs */
class ehs extends gqj {
    /* renamed from: a */
    private final /* synthetic */ ehp f21291a;

    ehs(ehp ehp) {
        this.f21291a = ehp;
        super(null);
    }

    /* renamed from: a */
    public final void mo1562a() {
        bli.m863a(ehp.f21284f, "enter ready for capture state");
        this.f21291a.f21287i.m2458a();
    }

    /* renamed from: b */
    public final void mo1563b() {
        bli.m863a(ehp.f21284f, "exit ready for capture state");
    }

    /* renamed from: I */
    public void mo3013I() {
        this.f21291a.f21285g.startPanoramaCalibration();
        this.f21291a.f21286h.m3025a(hbf.CONFIRM_DISABLED);
    }
}
