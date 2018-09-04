package p000;

/* compiled from: PG */
/* renamed from: cfo */
final class cfo implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ cfn f1920a;

    cfo(cfn cfn) {
        this.f1920a = cfn;
    }

    public final void run() {
        if (this.f1920a.f1919a.f20270U) {
            bli.m863a(cfk.f20249a, "isPreviewStopTimeoutExpired = true");
            cfk cfk = this.f1920a.f1919a;
            cfk.f20271V = true;
            cfk.ad.mo348a((Boolean) cfk.f20276b.mo693b().mo2860b());
        }
    }
}
