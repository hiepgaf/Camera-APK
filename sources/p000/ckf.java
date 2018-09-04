package p000;

/* compiled from: PG */
/* renamed from: ckf */
final class ckf implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ckk f2096a;
    /* renamed from: b */
    private final /* synthetic */ cke f2097b;

    ckf(cke cke, ckk ckk) {
        this.f2097b = cke;
        this.f2096a = ckk;
    }

    public final void run() {
        try {
            this.f2097b.mo2777b(this.f2096a);
            synchronized (this.f2097b.f20312a) {
                if (this.f2097b.f20312a.isEmpty()) {
                    cke cke = this.f2097b;
                    if (cke.f20314c) {
                        cke.f20313b.shutdown();
                    }
                }
            }
        } catch (Throwable th) {
            synchronized (this.f2097b.f20312a) {
                if (this.f2097b.f20312a.isEmpty()) {
                    cke cke2 = this.f2097b;
                    if (cke2.f20314c) {
                        cke2.f20313b.shutdown();
                    }
                }
            }
        }
    }
}
