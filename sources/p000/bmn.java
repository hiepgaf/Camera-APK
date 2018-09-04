package p000;

/* renamed from: bmn */
final /* synthetic */ class bmn implements iqo {
    /* renamed from: a */
    private final bmm f11030a;

    bmn(bmm bmm) {
        this.f11030a = bmm;
    }

    public final void close() {
        bmm bmm = this.f11030a;
        synchronized (bmm.f11026a) {
            iqo iqo = bmm.f11027b;
            if (iqo != null) {
                iqo.close();
            }
            bmm.f11027b = null;
        }
    }
}
