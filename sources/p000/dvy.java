package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: dvy */
public final class dvy implements kwk {
    /* renamed from: a */
    private final kwk f14630a;

    private dvy(kwk kwk) {
        this.f14630a = kwk;
    }

    /* renamed from: a */
    public static dvy m9478a(kwk kwk) {
        return new dvy(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object a;
        ivs ivs = (ivs) this.f14630a.mo345a();
        if (ivs.m4264b()) {
            a = keu.m13472a(ilq.m3819a(fds.m10234a(), kny.m18045a(ivs.m4263a(), new dvw(), kpq.f8410a)));
        } else {
            a = kgn.f22045a;
        }
        return (Set) ktm.m13963a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
