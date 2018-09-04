package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: eta */
public final class eta implements kwk {
    /* renamed from: a */
    private final kwk f15514a;
    /* renamed from: b */
    private final kwk f15515b;

    public eta(kwk kwk, kwk kwk2) {
        this.f15514a = kwk;
        this.f15515b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object a;
        kwk kwk = this.f15514a;
        if (((bmb) this.f15515b.mo345a()).m886d()) {
            a = keu.m13472a((gqd) kwk.mo345a());
        } else {
            a = kgn.f22045a;
        }
        return (Set) ktm.m13963a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
