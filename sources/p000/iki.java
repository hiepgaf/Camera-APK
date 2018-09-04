package p000;

/* compiled from: PG */
/* renamed from: iki */
final class iki implements Runnable {
    /* renamed from: a */
    private final Runnable f7051a;
    /* renamed from: b */
    private final /* synthetic */ ikh f7052b;

    public iki(ikh ikh, Runnable runnable) {
        this.f7052b = ikh;
        this.f7051a = runnable;
    }

    public final void run() {
        try {
            this.f7051a.run();
        } catch (Exception e) {
            this.f7052b.f7049a.execute(new ikj(e));
        }
    }
}
