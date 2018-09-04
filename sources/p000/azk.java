package p000;

/* renamed from: azk */
final /* synthetic */ class azk implements Runnable {
    /* renamed from: a */
    private final azj f1035a;
    /* renamed from: b */
    private final ayp f1036b;

    azk(azj azj, ayp ayp) {
        this.f1035a = azj;
        this.f1036b = ayp;
    }

    public final void run() {
        azj azj = this.f1035a;
        ayp ayp = this.f1036b;
        azj.f19837b = true;
        ayp.f1031b.mo348a(Boolean.valueOf(true));
        ayp.f1030a.mo348a(Integer.valueOf(15));
    }
}
