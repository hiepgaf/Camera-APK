package p000;

/* compiled from: PG */
/* renamed from: gwm */
public final class gwm implements kwk {
    /* renamed from: a */
    private final kwk f17471a;
    /* renamed from: b */
    private final kwk f17472b;
    /* renamed from: c */
    private final kwk f17473c;
    /* renamed from: d */
    private final kwk f17474d;
    /* renamed from: e */
    private final kwk f17475e;
    /* renamed from: f */
    private final kwk f17476f;

    public gwm(gwl gwl, kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        this.f17471a = kwk;
        this.f17472b = kwk2;
        this.f17473c = kwk3;
        this.f17474d = kwk4;
        this.f17475e = kwk5;
        this.f17476f = kwk6;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object gwn;
        kwk kwk = this.f17471a;
        kwk kwk2 = this.f17472b;
        kwk kwk3 = this.f17473c;
        kwk kwk4 = this.f17474d;
        kwk kwk5 = this.f17475e;
        kwk kwk6 = this.f17476f;
        boolean booleanValue = ((Boolean) kwk.mo345a()).booleanValue();
        ena ena = (ena) kwk4.mo345a();
        ikd ikd = (ikd) kwk5.mo345a();
        if (awl.m714b((awr) kwk6.mo345a())) {
            gwn = new gwn();
        } else if (booleanValue) {
            gwa gwa = (gwa) kwk3.mo345a();
            eio.m1756a(ikd, ena, gwa);
        } else {
            gvv gvv = (gvv) kwk2.mo345a();
            eio.m1756a(ikd, ena, gvv);
        }
        return (gvt) ktm.m13963a(gwn, "Cannot return null from a non-@Nullable @Provides method");
    }
}
