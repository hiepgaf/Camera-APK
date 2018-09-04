package p000;

/* compiled from: PG */
/* renamed from: kpp */
final class kpp implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Runnable f8408a;
    /* renamed from: b */
    private final /* synthetic */ kpo f8409b;

    kpp(kpo kpo, Runnable runnable) {
        this.f8409b = kpo;
        this.f8408a = runnable;
    }

    public final void run() {
        this.f8409b.f8405a = false;
        this.f8408a.run();
    }
}
