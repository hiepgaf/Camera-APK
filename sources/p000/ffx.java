package p000;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ffx */
public final class ffx implements kwk {
    /* renamed from: a */
    private final kwk f15967a;
    /* renamed from: b */
    private final kwk f15968b;
    /* renamed from: c */
    private final kwk f15969c;

    private ffx(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f15967a = kwk;
        this.f15968b = kwk2;
        this.f15969c = kwk3;
    }

    /* renamed from: a */
    public static ffx m10305a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new ffx(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f15967a;
        kwk kwk2 = this.f15968b;
        Set set = (Set) this.f15969c.mo345a();
        return (kpk) ktm.m13963a(kny.m18045a(kow.m13616a((Set) kwk2.mo345a()), new fmf(new ArrayList((Set) kwk.mo345a()), set), kpq.f8410a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
