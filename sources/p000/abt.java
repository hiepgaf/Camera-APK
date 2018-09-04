package p000;

/* compiled from: PG */
/* renamed from: abt */
final class abt implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ abs f175a;

    abt(abs abs) {
        this.f175a = abs;
    }

    public final void run() {
        synchronized (this.f175a) {
            this.f175a.notifyAll();
        }
    }
}
