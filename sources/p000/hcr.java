package p000;

/* renamed from: hcr */
final /* synthetic */ class hcr implements Runnable {
    /* renamed from: a */
    private final hcx f5993a;
    /* renamed from: b */
    private final hcn f5994b;
    /* renamed from: c */
    private final hcz f5995c;

    hcr(hcx hcx, hcn hcn, hcz hcz) {
        this.f5993a = hcx;
        this.f5994b = hcn;
        this.f5995c = hcz;
    }

    public final void run() {
        hcx hcx = this.f5993a;
        hcx.f17653g.post(new hcv(hcx, this.f5994b, this.f5995c));
    }
}
