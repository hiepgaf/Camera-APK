package p000;

/* renamed from: ewm */
public final /* synthetic */ class ewm implements fvg {
    /* renamed from: a */
    private final ird f15659a;
    /* renamed from: b */
    private final kwk f15660b;

    public ewm(ird ird, kwk kwk) {
        this.f15659a = ird;
        this.f15660b = kwk;
    }

    public final void run() {
        ird ird = this.f15659a;
        kwk kwk = this.f15660b;
        ird.mo1903a("MICRO_GyroModule#stopGyroCapture");
        ((exx) kwk.mo345a()).m2190b();
        ird.mo1904b();
    }
}
