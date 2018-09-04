package p000;

/* compiled from: PG */
/* renamed from: ikr */
final class ikr implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ikq f7068a;

    ikr(ikq ikq) {
        this.f7068a = ikq;
    }

    public final void run() {
        synchronized (this.f7068a.f18333a) {
            ikq ikq = this.f7068a;
            Runnable runnable = ikq.f18334b;
            if (runnable == null) {
                return;
            }
            ikq.f18334b = null;
            runnable.run();
        }
    }
}
