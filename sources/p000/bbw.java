package p000;

/* compiled from: PG */
/* renamed from: bbw */
final class bbw implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Runnable f1069a;
    /* renamed from: b */
    private final /* synthetic */ bbv f1070b;

    bbw(bbv bbv, Runnable runnable) {
        this.f1070b = bbv;
        this.f1069a = runnable;
    }

    public final void run() {
        this.f1070b.f10647a.execute(this.f1069a);
    }
}
