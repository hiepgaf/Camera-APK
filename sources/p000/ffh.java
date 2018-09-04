package p000;

/* compiled from: PG */
/* renamed from: ffh */
final class ffh implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Exception f4531a;

    ffh(Exception exception) {
        this.f4531a = exception;
    }

    public final void run() {
        throw new RuntimeException(this.f4531a);
    }
}
