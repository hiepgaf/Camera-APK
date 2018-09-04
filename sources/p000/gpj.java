package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: gpj */
public final class gpj implements kwk {
    /* renamed from: a */
    private final kwk f17182a;
    /* renamed from: b */
    private final kwk f17183b;

    private gpj(kwk kwk, kwk kwk2) {
        this.f17182a = kwk;
        this.f17183b = kwk2;
    }

    /* renamed from: a */
    public static gpj m11283a(kwk kwk, kwk kwk2) {
        return new gpj(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object a;
        kwk kwk = this.f17182a;
        kbg kbg = (kbg) this.f17183b.mo345a();
        if (kbg.mo2084b()) {
            a = keu.m13472a(new gpi(kbg, kwk));
        } else {
            a = kgn.f22045a;
        }
        return (Set) ktm.m13963a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
