package p000;

/* compiled from: PG */
/* renamed from: edj */
class edj extends gqj {
    /* renamed from: a */
    private final /* synthetic */ edf f21251a;

    edj(edf edf) {
        this.f21251a = edf;
        super(null);
    }

    /* renamed from: a */
    public final void mo1562a() {
        bli.m863a(edf.f21234a, "enter SlowMo state");
        edf edf = this.f21251a;
        edf.f21236c.f2450e = true;
        edf.f21237d.setVisibility(0);
        this.f21251a.f21239f.switchToVideoHfr();
        hcd hcd = this.f21251a.f21240g;
        hcd.m3025a(hbf.VIDEO_IDLE);
        hcd.f5955a.setVisibility(0);
        this.f21251a.f21247n.mo348a(hhx.SLOW_MOTION);
        this.f21251a.f21242i.mo1757c();
        this.f21251a.f21235b.m15622a(edj.class);
        this.f21251a.f21246m.m1041b();
    }

    /* renamed from: b */
    public final void mo1563b() {
        bli.m863a(edf.f21234a, "exit SlowMo state");
        this.f21251a.f21235b.m15623b(edj.class);
        edf edf = this.f21251a;
        edf.f21236c.f2450e = false;
        edf.f21242i.mo1750a();
        this.f21251a.f21242i.mo1764i();
        this.f21251a.f21246m.m1039a();
    }

    /* renamed from: s */
    public void mo3002s() {
    }
}
