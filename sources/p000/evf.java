package p000;

/* renamed from: evf */
final /* synthetic */ class evf implements Runnable {
    /* renamed from: a */
    private final evb f4268a;

    evf(evb evb) {
        this.f4268a = evb;
    }

    public final void run() {
        this.f4268a.f15596d.getLooper().quitSafely();
    }
}
