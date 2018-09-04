package p000;

/* compiled from: PG */
/* renamed from: ehl */
class ehl extends gqj {
    /* renamed from: a */
    private final /* synthetic */ ehj f21277a;

    ehl(ehj ehj) {
        this.f21277a = ehj;
        super(null);
    }

    /* renamed from: a */
    public final void mo1562a() {
        this.f21277a.f21272d.switchToPhotoIntentReview();
        hcd hcd = this.f21277a.f21273e;
        hcd.f5955a.setEnabled(true);
        hcd.m3025a(hbf.CONFIRM_ENABLED);
        this.f21277a.f21275g.f4984b.m15085b();
        this.f21277a.f21275g.m2462b();
    }

    /* renamed from: b */
    public final void mo1563b() {
        this.f21277a.f21272d.returnToPhotoIntent();
        this.f21277a.f21273e.m3025a(hbf.PHOTO_IDLE);
        this.f21277a.f21275g.m2458a();
        this.f21277a.f21275g.f4984b.m15087c();
    }

    /* renamed from: C */
    public void mo3007C() {
    }
}
