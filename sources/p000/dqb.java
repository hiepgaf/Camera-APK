package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: dqb */
public final class dqb implements kwk {
    /* renamed from: a */
    private final kwk f14233a;
    /* renamed from: b */
    private final kwk f14234b;

    private dqb(kwk kwk, kwk kwk2) {
        this.f14233a = kwk;
        this.f14234b = kwk2;
    }

    /* renamed from: a */
    public static dqb m9245a(kwk kwk, kwk kwk2) {
        return new dqb(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f14233a;
        kwk kwk2 = this.f14234b;
        Object a = kwk.mo345a();
        kwk2.mo345a();
        return (Set) ktm.m13963a(keu.m13472a(fds.m10239a(ken.m13453a((dqe) a))), "Cannot return null from a non-@Nullable @Provides method");
    }
}
