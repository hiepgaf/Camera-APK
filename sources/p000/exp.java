package p000;

/* compiled from: PG */
/* renamed from: exp */
public final class exp implements kwk {
    /* renamed from: a */
    private final kwk f15710a;

    private exp(kwk kwk) {
        this.f15710a = kwk;
    }

    /* renamed from: a */
    public static exp m10052a(kwk kwk) {
        return new exp(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object obj;
        iqp iqp = ((fyy) this.f15710a.mo345a()).f4833d;
        if (ipz.f7304b.m4025a(ipz.m4019b(iqp))) {
            obj = exa.f4325b;
        } else {
            jri.m13143a(ipz.f7303a.m4025a(ipz.m4019b(iqp)));
            obj = exa.f4324a;
        }
        return (iqp) ktm.m13963a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
