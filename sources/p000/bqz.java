package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: bqz */
public final class bqz implements kwk {
    /* renamed from: a */
    private final kwk f11205a;
    /* renamed from: b */
    private final kwk f11206b;
    /* renamed from: c */
    private final kwk f11207c;
    /* renamed from: d */
    private final kwk f11208d;
    /* renamed from: e */
    private final kwk f11209e;

    private bqz(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f11205a = kwk;
        this.f11206b = kwk2;
        this.f11207c = kwk3;
        this.f11208d = kwk4;
        this.f11209e = kwk5;
    }

    /* renamed from: a */
    public static bqz m7685a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new bqz(kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object a;
        kwk kwk = this.f11205a;
        kwk kwk2 = this.f11206b;
        kwk kwk3 = this.f11207c;
        kwk kwk4 = this.f11208d;
        bsn bsn = (bsn) kwk.mo345a();
        bsq bsq = (bsq) kwk3.mo345a();
        ffc ffc = (ffc) kwk4.mo345a();
        brm brm = (brm) this.f11209e.mo345a();
        if (bsn.m954a((bsq) kwk2.mo345a()) && bsn.m954a(bsq)) {
            a = keu.m13472a(aqe.m583a(new bqw(brm, ffc)));
        } else {
            a = kgn.f22045a;
        }
        return (Set) ktm.m13963a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
