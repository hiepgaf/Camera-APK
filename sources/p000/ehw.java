package p000;

/* compiled from: PG */
/* renamed from: ehw */
class ehw extends gqj {
    /* renamed from: a */
    private final /* synthetic */ ehu f21304a;

    ehw(ehu ehu) {
        this.f21304a = ehu;
        super(null);
    }

    /* renamed from: a */
    public final void mo1562a() {
        bli.m863a(ehu.f21293d, "enter Video state");
        if (!((Boolean) this.f21304a.f21294a.mo2860b()).booleanValue()) {
            this.f21304a.f21294a.mo348a(Boolean.valueOf(true));
        }
        this.f21304a.f21301j.m2934b(hhx.VIDEO);
        this.f21304a.f21298g.switchToVideo();
        this.f21304a.f21299h.m3024a();
        this.f21304a.f21298g.setProgress(1.0f, false);
        this.f21304a.f21295b.mo348a(hhx.VIDEO);
        this.f21304a.f21296e.m15622a(ehw.class);
        this.f21304a.f21297f.m1041b();
    }

    /* renamed from: b */
    public final void mo1563b() {
        bli.m863a(ehu.f21293d, "exit Video state");
        this.f21304a.f21296e.m15623b(ehw.class);
        this.f21304a.f21300i.mo1760e();
        this.f21304a.f21297f.m1039a();
    }

    /* renamed from: K */
    public void mo3016K() {
    }
}
