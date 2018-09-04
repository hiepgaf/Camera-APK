package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: ewu */
public final class ewu implements kwk {
    /* renamed from: a */
    private final kwk f15684a;
    /* renamed from: b */
    private final kwk f15685b;
    /* renamed from: c */
    private final kwk f15686c;
    /* renamed from: d */
    private final kwk f15687d;

    private ewu(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f15684a = kwk;
        this.f15685b = kwk2;
        this.f15686c = kwk3;
        this.f15687d = kwk4;
    }

    /* renamed from: a */
    public static ewu m10022a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new ewu(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (Set) ktm.m13963a(euh.m2129a(this.f15684a, (bmb) this.f15685b.mo345a(), (etg) this.f15686c.mo345a(), (ird) this.f15687d.mo345a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
