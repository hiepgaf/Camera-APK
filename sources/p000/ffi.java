package p000;

/* renamed from: ffi */
public final /* synthetic */ class ffi implements iqo {
    /* renamed from: a */
    private final fff f15948a;

    public ffi(fff fff) {
        this.f15948a = fff;
    }

    public final void close() {
        fff fff = this.f15948a;
        synchronized (fff.f4525c) {
            kpm kpm = fff.f4526d;
            if (kpm != null) {
                kpm.shutdown();
            }
            fff.f4527e = true;
        }
    }
}
