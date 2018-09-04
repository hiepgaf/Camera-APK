package p000;

/* compiled from: PG */
/* renamed from: kpv */
final class kpv extends knk implements Runnable {
    /* renamed from: e */
    private final Runnable f23581e;

    public kpv(Runnable runnable) {
        this.f23581e = (Runnable) jri.m13152b((Object) runnable);
    }

    public final void run() {
        try {
            this.f23581e.run();
        } catch (Throwable th) {
            m17780a(th);
            RuntimeException a = kbr.m4756a(th);
        }
    }
}
