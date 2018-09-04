package p000;

/* compiled from: PG */
/* renamed from: cwt */
final class cwt implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ilp f2825a;
    /* renamed from: b */
    private final /* synthetic */ cws f2826b;

    cwt(cws cws, ilp ilp) {
        this.f2826b = cws;
        this.f2825a = ilp;
    }

    public final void run() {
        if (!this.f2826b.f20813e) {
            jri.m13152b(this.f2825a);
            this.f2826b.f20811c.close();
            this.f2826b.m15232a(this.f2825a);
        }
    }
}
