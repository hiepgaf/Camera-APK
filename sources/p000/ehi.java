package p000;

/* compiled from: PG */
/* renamed from: ehi */
class ehi extends gqj {
    /* renamed from: a */
    private final /* synthetic */ ehg f21269a;

    ehi(ehg ehg) {
        this.f21269a = ehg;
        super(null);
    }

    /* renamed from: a */
    public final void mo1562a() {
        ehg ehg = this.f21269a;
        ehg.f21265d = true;
        ehg.f21268g.f4984b.m15085b();
        this.f21269a.f21268g.m2462b();
        this.f21269a.f21266e.startHfrRecording();
        this.f21269a.f21267f.m3025a(hbf.VIDEO_RECORDING);
    }

    /* renamed from: b */
    public final void mo1563b() {
        ehg ehg = this.f21269a;
        ehg.f21265d = false;
        ehg.f21268g.m2458a();
        this.f21269a.f21268g.f4984b.m15087c();
        this.f21269a.f21266e.stopHfrRecording();
        this.f21269a.f21267f.m3025a(hbf.VIDEO_IDLE);
    }

    /* renamed from: A */
    public void mo1560A() {
    }
}
