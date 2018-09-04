package p000;

/* compiled from: PG */
/* renamed from: duq */
public final class duq implements kwk {
    /* renamed from: a */
    private final kwk f14576a;
    /* renamed from: b */
    private final kwk f14577b;
    /* renamed from: c */
    private final kwk f14578c;

    private duq(dul dul, kwk kwk, kwk kwk2, kwk kwk3) {
        this.f14576a = kwk;
        this.f14577b = kwk2;
        this.f14578c = kwk3;
    }

    /* renamed from: a */
    public static duq m9417a(dul dul, kwk kwk, kwk kwk2, kwk kwk3) {
        return new duq(dul, kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        boolean z;
        kwk kwk = this.f14576a;
        ikb ikb = (ikb) kwk.mo345a();
        if (((bym) this.f14577b.mo345a()).mo620c(bya.m1047b((ffc) this.f14578c.mo345a())) >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        return (dub) ktm.m13963a((dub) ikb.mo1879a(new dub()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
