package p000;

/* renamed from: ewa */
public final /* synthetic */ class ewa implements fvg {
    /* renamed from: a */
    private final ird f15624a;
    /* renamed from: b */
    private final kwk f15625b;
    /* renamed from: c */
    private final kwk f15626c;
    /* renamed from: d */
    private final kwk f15627d;

    public ewa(ird ird, kwk kwk, kwk kwk2, kwk kwk3) {
        this.f15624a = ird;
        this.f15625b = kwk;
        this.f15626c = kwk2;
        this.f15627d = kwk3;
    }

    public final void run() {
        ird ird = this.f15624a;
        kwk kwk = this.f15625b;
        kwk kwk2 = this.f15626c;
        kwk kwk3 = this.f15627d;
        ird.mo1903a("MICRO_EncoderModule#shutdown_controller");
        ((etl) kwk.mo345a()).close();
        ((etc) kwk2.mo345a()).mo1287b((esu) kwk3.mo345a());
        ird.mo1904b();
    }
}
