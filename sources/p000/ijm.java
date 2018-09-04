package p000;

/* compiled from: PG */
/* renamed from: ijm */
final class ijm implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ijl f7036a;

    ijm(ijl ijl) {
        this.f7036a = ijl;
    }

    public final void run() {
        Object obj = null;
        synchronized (this.f7036a.f18308d) {
            ijl ijl = this.f7036a;
            if (!ijl.f18310f) {
                if (ijl.f18306b == 0) {
                    ijl.f18310f = true;
                    int i = 1;
                }
            }
        }
        if (obj != null) {
            this.f7036a.f18305a.close();
        }
    }
}
