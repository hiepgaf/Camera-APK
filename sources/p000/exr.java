package p000;

/* compiled from: PG */
/* renamed from: exr */
public final class exr implements kwk {
    /* renamed from: a */
    private final kwk f15713a;
    /* renamed from: b */
    private final kwk f15714b;
    /* renamed from: c */
    private final kwk f15715c;
    /* renamed from: d */
    private final kwk f15716d;

    private exr(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f15713a = kwk;
        this.f15714b = kwk2;
        this.f15715c = kwk3;
        this.f15716d = kwk4;
    }

    /* renamed from: a */
    public static exr m10056a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new exr(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        int i;
        kwk kwk = this.f15713a;
        kwk kwk2 = this.f15714b;
        kwk kwk3 = this.f15715c;
        ixc ixc = (ixc) kwk.mo345a();
        iqp iqp = (iqp) kwk2.mo345a();
        bmb bmb = (bmb) kwk3.mo345a();
        etg etg = (etg) this.f15716d.mo345a();
        int i2 = iqp.f7329a;
        int i3 = iqp.f7330b;
        if (bmb.m885c()) {
            i = 8;
        } else {
            i = 0;
        }
        if (euh.m2133b(bmb, etg)) {
            i += 48;
        }
        return (ixb) ktm.m13963a(ixc.mo1910a(i2, i3, 35, Math.min(52, i)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
