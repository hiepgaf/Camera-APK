package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: exu */
public final class exu implements kwk {
    /* renamed from: a */
    private final kwk f15723a;
    /* renamed from: b */
    private final kwk f15724b;
    /* renamed from: c */
    private final kwk f15725c;
    /* renamed from: d */
    private final kwk f15726d;
    /* renamed from: e */
    private final kwk f15727e;

    private exu(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f15723a = kwk;
        this.f15724b = kwk2;
        this.f15725c = kwk3;
        this.f15726d = kwk4;
        this.f15727e = kwk5;
    }

    /* renamed from: a */
    public static exu m10062a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new exu(kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object a;
        kwk kwk = this.f15723a;
        kwk kwk2 = this.f15724b;
        kwk kwk3 = this.f15725c;
        kwk kwk4 = this.f15726d;
        ird ird = (ird) this.f15727e.mo345a();
        if (euh.m2131a((bmb) kwk3.mo345a(), (etg) kwk4.mo345a())) {
            a = keu.m13472a(new exn(kwk2, ird, kwk));
        } else {
            a = kgn.f22045a;
        }
        return (Set) ktm.m13963a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
