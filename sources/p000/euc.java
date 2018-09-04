package p000;

/* renamed from: euc */
final /* synthetic */ class euc implements Runnable {
    /* renamed from: a */
    private final eua f4245a;
    /* renamed from: b */
    private final eux f4246b;

    euc(eua eua, eux eux) {
        this.f4245a = eua;
        this.f4246b = eux;
    }

    public final void run() {
        eua eua = this.f4245a;
        eux eux = this.f4246b;
        synchronized (eua.f4234a) {
            eua.f4239f.put(eux, Boolean.valueOf(false));
            if (eua.m2117a()) {
                eua.f4235b.m2136b(false);
                if (eua.f4240g) {
                    eua.m2118b();
                }
            }
        }
    }
}
