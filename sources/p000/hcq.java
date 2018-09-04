package p000;

/* renamed from: hcq */
final /* synthetic */ class hcq implements Runnable {
    /* renamed from: a */
    private final hcx f5990a;
    /* renamed from: b */
    private final hcn f5991b;
    /* renamed from: c */
    private final hcz f5992c;

    hcq(hcx hcx, hcn hcn, hcz hcz) {
        this.f5990a = hcx;
        this.f5991b = hcn;
        this.f5992c = hcz;
    }

    public final void run() {
        hcx hcx = this.f5990a;
        hcx.f17653g.post(new hcu(hcx, this.f5991b, this.f5992c));
    }
}
