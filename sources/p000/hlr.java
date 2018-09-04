package p000;

/* compiled from: PG */
/* renamed from: hlr */
final class hlr implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ hlq f6341a;

    hlr(hlq hlq) {
        this.f6341a = hlq;
    }

    public final void run() {
        hlq hlq = this.f6341a;
        if (hlq.f6340d) {
            jqk.m13102c(hlq.f6338b);
            jqk.m13102c(this.f6341a.f6337a);
            hlq = this.f6341a;
            hlq.f6337a.m3244b(hlq.f6338b.getCurrentPosition());
            this.f6341a.f6338b.postDelayed(this, 10);
        }
    }
}
