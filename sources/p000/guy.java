package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: guy */
public final class guy implements kwk {
    /* renamed from: a */
    private final kwk f17384a;

    private guy(kwk kwk) {
        this.f17384a = kwk;
    }

    /* renamed from: a */
    public static guy m11562a(kwk kwk) {
        return new guy(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object a;
        kbg kbg = (kbg) this.f17384a.mo345a();
        if (kbg.mo2084b()) {
            a = keu.m13472a(new gut(kbg));
        } else {
            a = kgn.f22045a;
        }
        return (Set) ktm.m13963a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
