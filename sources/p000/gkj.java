package p000;

/* renamed from: gkj */
final /* synthetic */ class gkj implements Runnable {
    /* renamed from: a */
    private final gki f5311a;
    /* renamed from: b */
    private final Runnable f5312b;

    gkj(gki gki, Runnable runnable) {
        this.f5311a = gki;
        this.f5312b = runnable;
    }

    public final void run() {
        gki gki = this.f5311a;
        gki.f5309a.execute(this.f5312b);
    }
}
