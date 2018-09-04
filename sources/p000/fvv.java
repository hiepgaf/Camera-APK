package p000;

/* compiled from: PG */
/* renamed from: fvv */
final class fvv implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ fvz f4737a;

    fvv(fvz fvz) {
        this.f4737a = fvz;
    }

    public final void run() {
        if (this.f4737a.f4748d.getAndSet(false)) {
            this.f4737a.f4745a.f4446b.mo1136s();
        }
    }
}
