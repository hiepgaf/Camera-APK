package p000;

/* compiled from: PG */
/* renamed from: dgi */
public final class dgi implements kwk {
    /* renamed from: a */
    private final kwk f13166a;
    /* renamed from: b */
    private final kwk f13167b;
    /* renamed from: c */
    private final kwk f13168c;

    public dgi(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f13166a = kwk;
        this.f13167b = kwk2;
        this.f13168c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object c;
        kwk kwk = this.f13166a;
        kwk kwk2 = this.f13167b;
        kwk kwk3 = this.f13168c;
        cwa cwa = (cwa) kwk2.mo345a();
        if (((kbg) kwk.mo345a()).mo2084b()) {
            c = kbg.m4745c(new cwg(cwa, kwk3));
        } else {
            c = kau.f19138a;
        }
        return (kbg) ktm.m13963a(c, "Cannot return null from a non-@Nullable @Provides method");
    }
}
