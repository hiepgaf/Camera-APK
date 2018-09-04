package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: dvz */
public final class dvz implements kwk {
    /* renamed from: a */
    private final kwk f14631a;

    private dvz(kwk kwk) {
        this.f14631a = kwk;
    }

    /* renamed from: a */
    public static dvz m9480a(kwk kwk) {
        return new dvz(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object obj;
        ivs ivs = (ivs) this.f14631a.mo345a();
        if (ivs.m4264b()) {
            obj = kgn.f22045a;
        } else {
            obj = keu.m13472a(kny.m18045a(ivs.f7498a, new dvx(), kpq.f8410a));
        }
        return (Set) ktm.m13963a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
