package p000;

/* compiled from: PG */
/* renamed from: gfb */
final class gfb implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ gfn f5131a;
    /* renamed from: b */
    private final /* synthetic */ gfa f5132b;

    gfb(gfa gfa, gfn gfn) {
        this.f5132b = gfa;
        this.f5131a = gfn;
    }

    public final void run() {
        gfo gfo = this.f5132b.f16866f;
        gfn gfn = this.f5131a;
        synchronized (gfo.f16883a) {
            if (gfo.f16883a.contains(gfn)) {
                gfo.f16883a.remove(gfn);
                gfo.f16884b.remove(gfn);
                gfr gfr = new gfr(gfo);
            } else {
                gfs gfs = new gfs(gfo);
            }
        }
    }
}
