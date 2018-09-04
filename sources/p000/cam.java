package p000;

/* compiled from: PG */
/* renamed from: cam */
public final class cam implements kwk {
    /* renamed from: a */
    private final kwk f11568a;
    /* renamed from: b */
    private final kwk f11569b;

    private cam(kwk kwk, kwk kwk2) {
        this.f11568a = kwk;
        this.f11569b = kwk2;
    }

    /* renamed from: a */
    public static cam m7931a(kwk kwk, kwk kwk2) {
        return new cam(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object cdj;
        kwk kwk = this.f11568a;
        Integer num = (Integer) kwk.mo345a();
        fyy fyy = (fyy) this.f11569b.mo345a();
        if (num.intValue() < 0) {
            cdj = new cdj();
        } else {
            cdl cdl = new cdl(num.intValue(), fyy.f4831b.f7495b);
        }
        return (cdk) ktm.m13963a(cdj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
