package p000;

/* compiled from: PG */
/* renamed from: fso */
final class fso implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Exception f4692a;

    fso(Exception exception) {
        this.f4692a = exception;
    }

    public final void run() {
        throw new RuntimeException(this.f4692a);
    }
}
