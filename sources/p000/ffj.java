package p000;

/* renamed from: ffj */
public final /* synthetic */ class ffj implements iqo {
    /* renamed from: a */
    private final fff f15949a;

    public ffj(fff fff) {
        this.f15949a = fff;
    }

    public final void close() {
        fff fff = this.f15949a;
        synchronized (fff.f4525c) {
            kpm kpm = fff.f4526d;
            if (kpm != null) {
                kpm.shutdownNow();
            }
            fff.f4526d = null;
            fff.f4527e = true;
        }
    }
}
