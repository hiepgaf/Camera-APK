package p000;

/* compiled from: PG */
/* renamed from: atu */
public final class atu implements kwk {
    /* renamed from: a */
    private final kwk f10231a;
    /* renamed from: b */
    private final kwk f10232b;
    /* renamed from: c */
    private final kwk f10233c;
    /* renamed from: d */
    private final kwk f10234d;
    /* renamed from: e */
    private final kwk f10235e;

    private atu(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f10231a = kwk;
        this.f10232b = kwk2;
        this.f10233c = kwk3;
        this.f10234d = kwk4;
        this.f10235e = kwk5;
    }

    /* renamed from: a */
    public static atu m6997a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new atu(kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object obj;
        kwk kwk = this.f10231a;
        kwk kwk2 = this.f10232b;
        kwk kwk3 = this.f10234d;
        kwk kwk4 = this.f10235e;
        ffc ffc = (ffc) kwk.mo345a();
        kwk2.mo345a();
        if (ffc.mo1937s()) {
            obj = (fiw) kwk3.mo345a();
        } else {
            fiw fiw = (fiw) kwk4.mo345a();
        }
        return (fiw) ktm.m13963a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
