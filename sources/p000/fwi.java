package p000;

/* compiled from: PG */
/* renamed from: fwi */
final class fwi implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ float f4769a;
    /* renamed from: b */
    private final /* synthetic */ fwd f4770b;

    fwi(fwd fwd, float f) {
        this.f4770b = fwd;
        this.f4769a = f;
    }

    public final void run() {
        this.f4770b.f21420b.mo2875b((int) (this.f4769a * 100.0f));
    }
}
