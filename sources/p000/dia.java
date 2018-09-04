package p000;

/* renamed from: dia */
final /* synthetic */ class dia implements Runnable {
    /* renamed from: a */
    private final dhz f3046a;
    /* renamed from: b */
    private final boolean f3047b;

    dia(dhz dhz, boolean z) {
        this.f3046a = dhz;
        this.f3047b = z;
    }

    public final void run() {
        dhz dhz = this.f3046a;
        boolean z = this.f3047b;
        hkv hkv = dhz.f22902k;
        if (hkv != null) {
            hkv.m3237b(z);
        }
    }
}
