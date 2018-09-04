package p000;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: exs */
public final class exs implements kwk {
    /* renamed from: a */
    private final kwk f15717a;
    /* renamed from: b */
    private final kwk f15718b;
    /* renamed from: c */
    private final kwk f15719c;
    /* renamed from: d */
    private final kwk f15720d;

    private exs(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f15717a = kwk;
        this.f15718b = kwk2;
        this.f15719c = kwk3;
        this.f15720d = kwk4;
    }

    /* renamed from: a */
    public static exs m10058a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new exs(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        Object a;
        kwk kwk = this.f15717a;
        kwk kwk2 = this.f15718b;
        kwk kwk3 = this.f15719c;
        bmb bmb = (bmb) kwk2.mo345a();
        etg etg = (etg) kwk3.mo345a();
        this.f15720d.mo345a();
        if (euh.m2131a(bmb, etg)) {
            Collection hashSet = new HashSet();
            hashSet.add(fds.m10237a(new exl(kwk)));
            if (hsz.f6632z != null) {
                hashSet.add(fds.m10236a(hsz.f6632z, hsz.f6604A));
            }
            a = keu.m13477a(hashSet);
        } else {
            a = kgn.f22045a;
        }
        return (Set) ktm.m13963a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
