package p000;

/* renamed from: cwk */
final /* synthetic */ class cwk implements bnx {
    /* renamed from: a */
    private final cwj f12731a;
    /* renamed from: b */
    private final bnx f12732b;

    cwk(cwj cwj, bnx bnx) {
        this.f12731a = cwj;
        this.f12732b = bnx;
    }

    /* renamed from: a */
    public final void mo548a(int i) {
        cwj cwj = this.f12731a;
        this.f12732b.mo548a(i);
        if (i >= 1000) {
            cwj.f12706b.execute(new cwl(cwj));
        }
    }
}
