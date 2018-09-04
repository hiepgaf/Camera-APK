package p000;

/* renamed from: hcv */
final /* synthetic */ class hcv implements Runnable {
    /* renamed from: a */
    private final hcx f6000a;
    /* renamed from: b */
    private final hcn f6001b;
    /* renamed from: c */
    private final hcz f6002c;

    hcv(hcx hcx, hcn hcn, hcz hcz) {
        this.f6000a = hcx;
        this.f6001b = hcn;
        this.f6002c = hcz;
    }

    public final void run() {
        hcx hcx = this.f6000a;
        hcn hcn = this.f6001b;
        hcz hcz = this.f6002c;
        hcn.f5985a.m3079a();
        if (hcx.f17662p && hcx.f17652f.get() > 0) {
            hcz.mo3075b();
        }
    }
}
