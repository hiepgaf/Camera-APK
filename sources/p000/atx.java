package p000;

/* compiled from: PG */
/* renamed from: atx */
public final class atx implements kwk {
    /* renamed from: a */
    private final kwk f10240a;
    /* renamed from: b */
    private final kwk f10241b;
    /* renamed from: c */
    private final kwk f10242c;
    /* renamed from: d */
    private final kwk f10243d;
    /* renamed from: e */
    private final kwk f10244e;
    /* renamed from: f */
    private final kwk f10245f;

    private atx(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        this.f10240a = kwk;
        this.f10241b = kwk2;
        this.f10242c = kwk3;
        this.f10243d = kwk4;
        this.f10244e = kwk5;
        this.f10245f = kwk6;
    }

    /* renamed from: a */
    public static atx m7003a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        return new atx(kwk, kwk2, kwk3, kwk4, kwk5, kwk6);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object obj;
        kwk kwk = this.f10240a;
        kwk kwk2 = this.f10241b;
        kwk kwk3 = this.f10242c;
        kwk kwk4 = this.f10243d;
        kwk kwk5 = this.f10244e;
        kwk kwk6 = this.f10245f;
        ffc ffc = (ffc) kwk.mo345a();
        kwk2.mo345a();
        kbg kbg = (kbg) kwk3.mo345a();
        asn asn;
        if (!ffc.mo1937s()) {
            asn = (asn) kwk4.mo345a();
        } else if (kbg.mo2084b()) {
            obj = (asn) kwk6.mo345a();
        } else {
            asn = (asn) kwk5.mo345a();
        }
        return (asn) ktm.m13963a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
