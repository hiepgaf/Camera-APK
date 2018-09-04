package p000;

/* renamed from: bxl */
final /* synthetic */ class bxl implements Runnable {
    /* renamed from: a */
    private final bxj f1710a;

    bxl(bxj bxj) {
        this.f1710a = bxj;
    }

    public final void run() {
        bxj bxj = this.f1710a;
        bxj.m1040a(1.0f);
        synchronized (bxj.f1704a) {
            bxj.f1706c = null;
        }
    }
}
