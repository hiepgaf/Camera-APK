package p000;

/* compiled from: PG */
/* renamed from: cwu */
final class cwu implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ilp f2827a;
    /* renamed from: b */
    private final /* synthetic */ cws f2828b;

    cwu(cws cws, ilp ilp) {
        this.f2828b = cws;
        this.f2827a = ilp;
    }

    public final void run() {
        if (!this.f2828b.f20813e) {
            jri.m13152b(this.f2827a);
            this.f2828b.f20812d.close();
            this.f2828b.m15234b(this.f2827a);
        }
    }
}
