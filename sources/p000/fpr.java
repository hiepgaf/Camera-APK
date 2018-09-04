package p000;

/* compiled from: PG */
/* renamed from: fpr */
public final class fpr implements kwk {
    /* renamed from: a */
    private final kwk f16322a;
    /* renamed from: b */
    private final kwk f16323b;
    /* renamed from: c */
    private final kwk f16324c;

    private fpr(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f16322a = kwk;
        this.f16323b = kwk2;
        this.f16324c = kwk3;
    }

    /* renamed from: a */
    public static fpr m10627a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new fpr(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f16322a;
        kwk kwk2 = this.f16323b;
        return (fre) ktm.m13963a(new fpa(new frh((frk) kwk.mo345a(), (hju) this.f16324c.mo345a()), (fqx) kwk2.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
