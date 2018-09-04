package p000;

/* compiled from: PG */
/* renamed from: gfl */
final class gfl implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ gfk f5148a;

    gfl(gfk gfk) {
        this.f5148a = gfk;
    }

    public final void run() {
        if (this.f5148a.f21442a.decrementAndGet() == 0) {
            synchronized (this.f5148a.f21443b) {
                this.f5148a.m15735b();
            }
        }
    }
}
