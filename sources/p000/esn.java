package p000;

/* renamed from: esn */
final /* synthetic */ class esn implements Runnable {
    /* renamed from: a */
    private final esd f4204a;

    esn(esd esd) {
        this.f4204a = esd;
    }

    public final void run() {
        esd esd = this.f4204a;
        synchronized (esd) {
            eth eth = esd.f15454l;
            if (eth == null) {
                return;
            }
            eth.mo3026c();
        }
    }
}
