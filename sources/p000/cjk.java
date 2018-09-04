package p000;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: cjk */
public final class cjk implements kwk {
    /* renamed from: a */
    private final kwk f12091a;
    /* renamed from: b */
    private final kwk f12092b;

    private cjk(kwk kwk, kwk kwk2) {
        this.f12091a = kwk;
        this.f12092b = kwk2;
    }

    /* renamed from: a */
    public static cjk m8257a(kwk kwk, kwk kwk2) {
        return new cjk(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f12091a;
        kwk kwk2 = this.f12092b;
        Set hashSet = new HashSet();
        gij gij = new gij();
        for (int i = 0; i < 3; i++) {
            hashSet.add(new gil(gij, (gin) kwk.mo345a(), (hju) kwk2.mo345a()));
        }
        return (Set) ktm.m13963a(hashSet, "Cannot return null from a non-@Nullable @Provides method");
    }
}
