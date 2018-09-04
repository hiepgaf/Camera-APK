package p000;

/* compiled from: PG */
/* renamed from: ikt */
final class ikt implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Throwable f7070a;

    ikt(Throwable th) {
        this.f7070a = th;
    }

    public final void run() {
        throw new RuntimeException(this.f7070a);
    }
}
