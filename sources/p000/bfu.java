package p000;

/* renamed from: bfu */
final /* synthetic */ class bfu implements Runnable {
    /* renamed from: a */
    private final bft f1120a;
    /* renamed from: b */
    private final kpw f1121b;
    /* renamed from: c */
    private final boolean f1122c;

    bfu(bft bft, kpw kpw, boolean z) {
        this.f1120a = bft;
        this.f1121b = kpw;
        this.f1122c = z;
    }

    public final void run() {
        bft bft = this.f1120a;
        this.f1121b.mo3616b(bft.f19970e.mo506a(bft.f19968c, this.f1122c ^ 1));
    }
}
