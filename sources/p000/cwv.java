package p000;

/* compiled from: PG */
/* renamed from: cwv */
final class cwv implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ cws f2829a;

    cwv(cws cws) {
        this.f2829a = cws;
    }

    public final void run() {
        cws cws = this.f2829a;
        if (!cws.f20813e) {
            cws.f20813e = true;
            cws.f20811c.close();
            this.f2829a.f20812d.close();
            this.f2829a.f20809a.mo348a(Boolean.valueOf(false));
        }
    }
}
