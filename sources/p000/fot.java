package p000;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fot */
public final class fot implements kwk {
    /* renamed from: a */
    private final kwk f16276a;
    /* renamed from: b */
    private final kwk f16277b;

    private fot(kwk kwk, kwk kwk2) {
        this.f16276a = kwk;
        this.f16277b = kwk2;
    }

    /* renamed from: a */
    public static fot m10587a(kwk kwk, kwk kwk2) {
        return new fot(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f16276a;
        Set<Object> set = (Set) kwk.mo345a();
        Set<ivs> set2 = (Set) this.f16277b.mo345a();
        Collection a = khb.m4863a(set.size());
        for (ivs add : set2) {
            a.add(add);
        }
        for (Object a2 : set) {
            a.add(ivs.m4261a(kow.m13617a(a2)));
        }
        return (Set) ktm.m13963a(keu.m13477a(a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
