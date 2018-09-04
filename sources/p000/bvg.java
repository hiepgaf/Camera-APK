package p000;

/* renamed from: bvg */
final /* synthetic */ class bvg implements Runnable {
    /* renamed from: a */
    private final bvf f1627a;
    /* renamed from: b */
    private final bvk f1628b;

    bvg(bvf bvf, bvk bvk) {
        this.f1627a = bvf;
        this.f1628b = bvk;
    }

    public final void run() {
        bvf bvf = this.f1627a;
        bvk bvk = this.f1628b;
        ((kpw) jri.m13152b(bvf.f1624b)).mo3557a(bvk.getReadableDatabase());
        ((kpw) jri.m13152b(bvf.f1625c)).mo3557a(bvk.getWritableDatabase());
    }
}
