package p000;

/* compiled from: PG */
/* renamed from: ehr */
class ehr extends gqj {
    /* renamed from: a */
    private final /* synthetic */ ehp f21290a;

    ehr(ehp ehp) {
        this.f21290a = ehp;
        super(null);
    }

    /* renamed from: a */
    public final void mo1562a() {
        this.f21290a.f21287i.m2462b();
        bli.m863a(ehp.f21284f, "enter capturing state.");
    }

    /* renamed from: b */
    public final void mo1563b() {
        bli.m863a(ehp.f21284f, "exit capturing state.");
    }

    /* renamed from: F */
    public void mo3010F() {
        this.f21290a.f21285g.stopPanoramaCapture();
        this.f21290a.f21286h.m3025a(hbf.PHOTO_IDLE);
        bli.m863a(ehp.f21284f, "Cancel photosphere capture");
    }

    /* renamed from: G */
    public void mo3012G() {
        this.f21290a.f21285g.stopPanoramaCapture();
        this.f21290a.f21286h.m3025a(hbf.CONFIRM_YES_TRANSIENT);
        bli.m863a(ehp.f21284f, "Finish photosphere capture");
    }
}
