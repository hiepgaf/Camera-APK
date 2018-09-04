package p000;

/* renamed from: hct */
final /* synthetic */ class hct implements iqo {
    /* renamed from: a */
    private final hcx f17642a;
    /* renamed from: b */
    private final hcn f17643b;
    /* renamed from: c */
    private final hcz f17644c;

    hct(hcx hcx, hcn hcn, hcz hcz) {
        this.f17642a = hcx;
        this.f17643b = hcn;
        this.f17644c = hcz;
    }

    public final void close() {
        hcx hcx = this.f17642a;
        hcn hcn = this.f17643b;
        hcz hcz = this.f17644c;
        synchronized (hcx.f17666t) {
            hcx.f17665s = true;
        }
        hcn.close();
        hcz.close();
    }
}
