package p000;

/* renamed from: eub */
final /* synthetic */ class eub implements Runnable {
    /* renamed from: a */
    private final eua f4244a;

    eub(eua eua) {
        this.f4244a = eua;
    }

    public final void run() {
        for (eux close : this.f4244a.f4237d) {
            close.close();
        }
    }
}
