package p000;

/* compiled from: PG */
/* renamed from: fyo */
final class fyo implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ fyk f4828a;

    fyo(fyk fyk) {
        this.f4828a = fyk;
    }

    public final void run() {
        synchronized (this.f4828a.f16640a) {
            fyk fyk = this.f4828a;
            fyk.f16643d--;
        }
    }
}
