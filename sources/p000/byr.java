package p000;

/* compiled from: PG */
/* renamed from: byr */
public final class byr implements kwk {
    /* renamed from: a */
    private final kwk f11509a;
    /* renamed from: b */
    private final kwk f11510b;
    /* renamed from: c */
    private final kwk f11511c;
    /* renamed from: d */
    private final kwk f11512d;

    private byr(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f11509a = kwk;
        this.f11510b = kwk2;
        this.f11511c = kwk3;
        this.f11512d = kwk4;
    }

    /* renamed from: a */
    public static byr m7904a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new byr(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object c;
        kwk kwk = this.f11509a;
        kwk kwk2 = this.f11510b;
        kwk kwk3 = this.f11511c;
        kbg kbg = (kbg) kwk.mo345a();
        ikb ikb = (ikb) kwk2.mo345a();
        fgw fgw = (fgw) kwk3.mo345a();
        this.f11512d.mo345a();
        if (fgw.m2285c() && kbg.mo2084b()) {
            iqo b = ((bwo) kbg.mo2081a()).mo606b();
            ikb.mo1879a(b);
            c = kbg.m4745c(b);
        } else {
            c = kau.f19138a;
        }
        return (kbg) ktm.m13963a(c, "Cannot return null from a non-@Nullable @Provides method");
    }
}
