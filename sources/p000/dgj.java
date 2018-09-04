package p000;

/* compiled from: PG */
/* renamed from: dgj */
public final class dgj implements kwk {
    /* renamed from: a */
    private final kwk f13169a;
    /* renamed from: b */
    private final kwk f13170b;

    public dgj(kwk kwk, kwk kwk2) {
        this.f13169a = kwk;
        this.f13170b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        String str;
        kwk kwk = this.f13169a;
        kwk kwk2 = this.f13170b;
        kwk.mo345a();
        if (((bsn) kwk2.mo345a()).m954a(gdp.f5094d)) {
            str = "PhotoModule";
        } else {
            str = "GoudaModule";
        }
        return (cwa) ktm.m13963a(new cwa(hhx.PORTRAIT, str, false), "Cannot return null from a non-@Nullable @Provides method");
    }
}
