package p000;

/* renamed from: jgr */
final /* synthetic */ class jgr implements Runnable {
    /* renamed from: a */
    private final jgp f7811a;
    /* renamed from: b */
    private final jgu f7812b;
    /* renamed from: c */
    private final jhl f7813c;

    jgr(jgp jgp, jgu jgu, jhl jhl) {
        this.f7811a = jgp;
        this.f7812b = jgu;
        this.f7813c = jhl;
    }

    public final void run() {
        jgp jgp = this.f7811a;
        jgu jgu = this.f7812b;
        jhl jhl = this.f7813c;
        synchronized (jgp.f21846a) {
            for (jgy a : jgu.f18776b) {
                jgp.m16263a(jhl, a);
            }
        }
    }
}
