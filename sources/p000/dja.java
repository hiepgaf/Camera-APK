package p000;

/* renamed from: dja */
final /* synthetic */ class dja implements Runnable {
    /* renamed from: a */
    private final dix f3091a;
    /* renamed from: b */
    private final int f3092b;
    /* renamed from: c */
    private final kpw f3093c;

    dja(dix dix, int i, kpw kpw) {
        this.f3091a = dix;
        this.f3092b = i;
        this.f3093c = kpw;
    }

    public final void run() {
        dix dix = this.f3091a;
        int i = this.f3092b;
        knk knk = this.f3093c;
        for (int i2 = 0; i2 < i; i2++) {
            dix.f13475p.add(dix.m9125c());
        }
        knk.mo3557a(Boolean.valueOf(true));
    }
}
