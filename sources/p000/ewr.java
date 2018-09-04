package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: ewr */
public final class ewr implements kwk {
    /* renamed from: a */
    private final kwk f15673a;
    /* renamed from: b */
    private final kwk f15674b;
    /* renamed from: c */
    private final kwk f15675c;
    /* renamed from: d */
    private final kwk f15676d;
    /* renamed from: e */
    private final kwk f15677e;

    private ewr(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f15673a = kwk;
        this.f15674b = kwk2;
        this.f15675c = kwk3;
        this.f15676d = kwk4;
        this.f15677e = kwk5;
    }

    /* renamed from: a */
    public static ewr m10017a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new ewr(kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f15673a;
        return (Set) ktm.m13963a(euh.m2132b((Integer) kwk.mo345a(), this.f15674b, (bmb) this.f15675c.mo345a(), (etg) this.f15676d.mo345a(), (ird) this.f15677e.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
