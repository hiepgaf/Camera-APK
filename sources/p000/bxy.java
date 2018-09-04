package p000;

/* compiled from: PG */
/* renamed from: bxy */
public final class bxy implements kwk {
    /* renamed from: a */
    private final kwk f11433a;
    /* renamed from: b */
    private final kwk f11434b;
    /* renamed from: c */
    private final kwk f11435c;
    /* renamed from: d */
    private final kwk f11436d;
    /* renamed from: e */
    private final kwk f11437e;
    /* renamed from: f */
    private final kwk f11438f;

    private bxy(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        this.f11433a = kwk;
        this.f11434b = kwk2;
        this.f11435c = kwk3;
        this.f11436d = kwk4;
        this.f11437e = kwk5;
        this.f11438f = kwk6;
    }

    /* renamed from: a */
    public static bxy m7863a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        return new bxy(kwk, kwk2, kwk3, kwk4, kwk5, kwk6);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object a;
        kwk kwk = this.f11433a;
        kwk kwk2 = this.f11434b;
        kwk kwk3 = this.f11435c;
        kwk kwk4 = this.f11436d;
        kwk kwk5 = this.f11437e;
        ffc ffc = (ffc) kwk.mo345a();
        bsn bsn = (bsn) kwk2.mo345a();
        ilp ilp = (ilp) kwk3.mo345a();
        bmb bmb = (bmb) kwk4.mo345a();
        bsq bsq = (bsq) kwk5.mo345a();
        if (((Boolean) ((ilp) this.f11438f.mo345a()).mo2860b()).booleanValue()) {
            a = ilq.m3818a(bxh.RGB);
        } else {
            a = ilq.m3817a(ilp, new bxs(ffc, bsn, bsq, bmb));
        }
        return (ilp) ktm.m13963a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
