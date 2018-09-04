package p000;

/* compiled from: PG */
/* renamed from: aax */
final class aax implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ aaw f40a;

    aax(aaw aaw) {
        this.f40a = aaw;
    }

    public final void run() {
        synchronized (this.f40a.f39b) {
            this.f40a.f39b.notifyAll();
        }
    }
}
