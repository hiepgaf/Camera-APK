package p000;

/* compiled from: PG */
/* renamed from: jab */
final class jab implements izi {
    /* renamed from: a */
    private final /* synthetic */ Runnable f18707a;

    jab(Runnable runnable) {
        this.f18707a = runnable;
    }

    /* renamed from: a */
    private final Object m12709a(Throwable th) {
        try {
            this.f18707a.run();
        } catch (Throwable th2) {
            kqg.m5044a(th, th2);
        }
        throw th;
    }
}
