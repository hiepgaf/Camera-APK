package p000;

/* compiled from: PG */
/* renamed from: cid */
final class cid implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ chz f2024a;

    cid(chz chz) {
        this.f2024a = chz;
    }

    public final void run() {
        if (this.f2024a.f12001a.get() != null) {
            ((clh) this.f2024a.f12001a.get()).close();
            this.f2024a.f12001a.set(null);
        }
    }
}
