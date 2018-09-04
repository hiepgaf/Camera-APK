package p000;

/* compiled from: PG */
/* renamed from: hcg */
final class hcg implements iqo {
    /* renamed from: a */
    private final /* synthetic */ hch f17638a;
    /* renamed from: b */
    private final /* synthetic */ hcd f17639b;

    hcg(hcd hcd, hch hch) {
        this.f17639b = hcd;
        this.f17638a = hch;
    }

    public final void close() {
        synchronized (this.f17639b.f5956b) {
            this.f17639b.f5957c.remove(this.f17638a);
        }
    }
}
