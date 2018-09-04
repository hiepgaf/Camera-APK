package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: bqy */
public final class bqy implements kwk {
    /* renamed from: a */
    private final kwk f11201a;
    /* renamed from: b */
    private final kwk f11202b;
    /* renamed from: c */
    private final kwk f11203c;
    /* renamed from: d */
    private final kwk f11204d;

    private bqy(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f11201a = kwk;
        this.f11202b = kwk2;
        this.f11203c = kwk3;
        this.f11204d = kwk4;
    }

    /* renamed from: a */
    public static bqy m7683a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new bqy(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object a;
        kwk kwk = this.f11201a;
        kwk kwk2 = this.f11202b;
        kwk kwk3 = this.f11203c;
        bsn bsn = (bsn) kwk.mo345a();
        bsq bsq = (bsq) kwk3.mo345a();
        brm brm = (brm) this.f11204d.mo345a();
        if (bsn.m954a((bsq) kwk2.mo345a()) && bsn.m954a(bsq)) {
            a = keu.m13472a(new bqx(brm));
        } else {
            a = kgn.f22045a;
        }
        return (Set) ktm.m13963a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
