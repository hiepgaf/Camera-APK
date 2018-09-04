package p000;

import java.util.Collections;

/* compiled from: PG */
/* renamed from: drf */
public final class drf implements kwk {
    /* renamed from: a */
    private final kwk f14283a;
    /* renamed from: b */
    private final kwk f14284b;
    /* renamed from: c */
    private final kwk f14285c;

    private drf(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f14283a = kwk;
        this.f14284b = kwk2;
        this.f14285c = kwk3;
    }

    /* renamed from: a */
    public static drf m9281a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new drf(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f14283a;
        kwk kwk2 = this.f14284b;
        drg drg = (drg) kwk.mo345a();
        dst dst = (dst) kwk2.mo345a();
        dsq dsq = (dsq) this.f14285c.mo345a();
        dsw dsw = new dsw(new drs(dsq.f3284a, dsq.f3285b, dsq.f3292i, dsq.f3286c, dsq.f3287d, dsq.f3288e, kny.m18045a(dsq.f3288e, new dsr(fds.m10234a()), kpq.f8410a), dsq.f3289f, dsq.f3290g, dsq.f3291h, dsq.f3293j, 1), 2, false);
        fdh fdh = fdh.ANY;
        fdg fdg = new fdg(fdh, fdh, fdh);
        if (dst.f3300g.mo1937s()) {
            fdg.m2257b(fdh.LOCKED);
        }
        dsw dsw2 = dsw;
        return (fwl) ktm.m13963a(drg.m1669a(new dsw(new dtx(dst.f3295b, dst.f3294a, dst.f3296c.m2276a(1, new fju(dst.f3299f.m1670a(100000000), new fjt())), dst.f3298e, dsw2, new dts(fdg), dst.f3301h, 1, 1, 100000000, Collections.emptySet(), dst.f3297d), 3, false)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
