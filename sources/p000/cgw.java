package p000;

/* renamed from: cgw */
final /* synthetic */ class cgw implements Runnable {
    /* renamed from: a */
    private final cgu f1961a;
    /* renamed from: b */
    private final int f1962b;

    cgw(cgu cgu, int i) {
        this.f1961a = cgu;
        this.f1962b = i;
    }

    public final void run() {
        this.f1961a.mo673a(this.f1962b, "Acquiring semaphore");
        Thread.currentThread().interrupt();
    }
}
