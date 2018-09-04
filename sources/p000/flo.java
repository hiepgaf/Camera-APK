package p000;

/* compiled from: PG */
/* renamed from: flo */
public final class flo implements kwk {
    /* renamed from: a */
    private final fln f16143a;
    /* renamed from: b */
    private final kwk f16144b;
    /* renamed from: c */
    private final kwk f16145c;
    /* renamed from: d */
    private final kwk f16146d;

    public flo(fln fln, kwk kwk, kwk kwk2, kwk kwk3) {
        this.f16143a = fln;
        this.f16144b = kwk;
        this.f16145c = kwk2;
        this.f16146d = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        fjm fjm;
        fln fln = this.f16143a;
        kwk kwk = this.f16144b;
        kwk kwk2 = this.f16145c;
        fyt fyt = (fyt) this.f16146d.mo345a();
        if (fln.f4616a) {
            fjm = (fjm) kwk2.mo345a();
        } else {
            fjm = (fjm) kwk.mo345a();
        }
        return (fjm) ktm.m13963a(new fkv(fjm, fyt), "Cannot return null from a non-@Nullable @Provides method");
    }
}
