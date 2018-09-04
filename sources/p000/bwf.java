package p000;

/* compiled from: PG */
/* renamed from: bwf */
final class bwf implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Object f1656a;

    bwf(Object obj) {
        this.f1656a = obj;
    }

    public final void run() {
        synchronized (this.f1656a) {
            this.f1656a.notifyAll();
        }
    }
}
