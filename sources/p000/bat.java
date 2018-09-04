package p000;

/* renamed from: bat */
final /* synthetic */ class bat implements Runnable {
    /* renamed from: a */
    private final bas f1048a;
    /* renamed from: b */
    private final Thread f1049b;
    /* renamed from: c */
    private final Throwable f1050c;

    bat(bas bas, Thread thread, Throwable th) {
        this.f1048a = bas;
        this.f1049b = thread;
        this.f1050c = th;
    }

    public final void run() {
        this.f1048a.m778a(this.f1049b, this.f1050c);
    }
}
