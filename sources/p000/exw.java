package p000;

/* compiled from: PG */
/* renamed from: exw */
public final class exw implements kwk {
    /* renamed from: a */
    private final kwk f15733a;
    /* renamed from: b */
    private final kwk f15734b;
    /* renamed from: c */
    private final kwk f15735c;
    /* renamed from: d */
    private final kwk f15736d;

    private exw(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f15733a = kwk;
        this.f15734b = kwk2;
        this.f15735c = kwk3;
        this.f15736d = kwk4;
    }

    /* renamed from: a */
    public static exw m10066a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new exw(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        int i;
        kwk kwk = this.f15733a;
        kwk kwk2 = this.f15734b;
        kwk kwk3 = this.f15735c;
        ixb ixb = (ixb) kwk.mo345a();
        ikb ikb = (ikb) kwk2.mo345a();
        bmb bmb = (bmb) kwk3.mo345a();
        etg etg = (etg) this.f15736d.mo345a();
        if (bmb.m885c()) {
            i = 3;
        } else {
            i = 0;
        }
        if (euh.m2133b(bmb, etg)) {
            i += 45;
        }
        iqo exj = new exj(bmb, ixb, i);
        ikb.mo1879a(exj);
        return (exi) ktm.m13963a(exj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
