package p000;

/* compiled from: PG */
/* renamed from: ehv */
class ehv extends gqj {
    /* renamed from: a */
    private final /* synthetic */ ehu f21303a;

    ehv(ehu ehu) {
        this.f21303a = ehu;
        super(null);
    }

    /* renamed from: a */
    public final void mo1562a() {
        bli.m863a(ehu.f21293d, "enter Photo state");
        this.f21303a.f21301j.m2934b(hhx.PHOTO);
        this.f21303a.f21298g.setProgress(1.0f, true);
        this.f21303a.f21298g.switchToPhoto();
        hcd hcd = this.f21303a.f21299h;
        hcd.m3025a(hbf.PHOTO_IDLE);
        hcd.f5955a.setVisibility(0);
        this.f21303a.f21295b.mo348a(hhx.PHOTO);
    }

    /* renamed from: b */
    public final void mo1563b() {
        bli.m863a(ehu.f21293d, "exit Photo state");
        this.f21303a.f21300i.mo1760e();
    }

    /* renamed from: L */
    public void mo3015L() {
    }
}
