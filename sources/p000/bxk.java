package p000;

/* renamed from: bxk */
final /* synthetic */ class bxk implements iqo {
    /* renamed from: a */
    private final bxj f11413a;
    /* renamed from: b */
    private final bxm f11414b;

    bxk(bxj bxj, bxm bxm) {
        this.f11413a = bxj;
        this.f11414b = bxm;
    }

    public final void close() {
        bxj bxj = this.f11413a;
        bxm bxm = this.f11414b;
        synchronized (bxj.f1704a) {
            bxj.f1705b.remove(bxm);
        }
    }
}
