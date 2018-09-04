package p000;

/* compiled from: PG */
/* renamed from: baj */
final class baj implements iqo {
    /* renamed from: a */
    private final ikb f10610a;
    /* renamed from: b */
    private final /* synthetic */ bai f10611b;

    public baj(bai bai, ikb ikb) {
        this.f10611b = bai;
        this.f10610a = ikb;
    }

    public final void close() {
        synchronized (this.f10611b.f10599a) {
            this.f10610a.close();
        }
    }
}
