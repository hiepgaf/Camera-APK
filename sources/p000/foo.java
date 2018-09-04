package p000;

/* compiled from: PG */
/* renamed from: foo */
public final class foo implements kwk {
    /* renamed from: a */
    private final fpn f16263a;
    /* renamed from: b */
    private final kwk f16264b;
    /* renamed from: c */
    private final kwk f16265c;

    private foo(fpn fpn, kwk kwk, kwk kwk2) {
        this.f16263a = fpn;
        this.f16264b = kwk;
        this.f16265c = kwk2;
    }

    /* renamed from: a */
    public static foo m10581a(fpn fpn, kwk kwk, kwk kwk2) {
        return new foo(fpn, kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        fpn fpn = this.f16263a;
        kwk kwk = this.f16264b;
        return (fne) ktm.m13963a(new fna(kny.m18045a(kny.m18045a((kpk) kwk.mo345a(), new fpo(), kpq.f8410a), new fni((fnh) this.f16265c.mo345a(), fpn.f4662b, 3), kpq.f8410a), 3), "Cannot return null from a non-@Nullable @Provides method");
    }
}
