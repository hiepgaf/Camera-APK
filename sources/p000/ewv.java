package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: ewv */
public final class ewv implements kwk {
    /* renamed from: a */
    private final kwk f15688a;
    /* renamed from: b */
    private final kwk f15689b;
    /* renamed from: c */
    private final kwk f15690c;
    /* renamed from: d */
    private final kwk f15691d;
    /* renamed from: e */
    private final kwk f15692e;

    private ewv(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f15688a = kwk;
        this.f15689b = kwk2;
        this.f15690c = kwk3;
        this.f15691d = kwk4;
        this.f15692e = kwk5;
    }

    /* renamed from: a */
    public static ewv m10024a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new ewv(kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object a;
        kwk kwk = this.f15688a;
        kwk kwk2 = this.f15689b;
        kwk kwk3 = this.f15690c;
        kwk kwk4 = this.f15691d;
        etg etg = (etg) kwk4.mo345a();
        ird ird = (ird) this.f15692e.mo345a();
        if (((bmb) kwk3.mo345a()).m886d() && etg.f4217a) {
            a = keu.m13472a(new ewl(ird, kwk2, kwk));
        } else {
            a = kgn.f22045a;
        }
        return (Set) ktm.m13963a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
