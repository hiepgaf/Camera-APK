package p000;

/* renamed from: ikg */
final /* synthetic */ class ikg implements Runnable {
    /* renamed from: a */
    private final Runnable f7047a;
    /* renamed from: b */
    private final kpw f7048b;

    ikg(Runnable runnable, kpw kpw) {
        this.f7047a = runnable;
        this.f7048b = kpw;
    }

    public final void run() {
        Runnable runnable = this.f7047a;
        knk knk = this.f7048b;
        try {
            runnable.run();
            knk.mo3557a(Boolean.valueOf(true));
        } catch (Throwable th) {
            knk.m17780a(th);
        } finally {
            knk.mo3557a(Boolean.valueOf(false));
        }
    }
}
