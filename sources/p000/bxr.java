package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: bxr */
public final class bxr implements kwk {
    /* renamed from: a */
    private final kwk f11421a;
    /* renamed from: b */
    private final kwk f11422b;

    private bxr(kwk kwk, kwk kwk2) {
        this.f11421a = kwk;
        this.f11422b = kwk2;
    }

    /* renamed from: a */
    public static bxr m7853a(kwk kwk, kwk kwk2) {
        return new bxr(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object a;
        kwk kwk = this.f11421a;
        kwk kwk2 = this.f11422b;
        if (((Integer) kwk.mo345a()).intValue() >= 0) {
            a = keu.m13472a(fds.m10239a(ken.m13453a((fiw) kwk2.mo345a())));
        } else {
            a = kgn.f22045a;
        }
        return (Set) ktm.m13963a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
