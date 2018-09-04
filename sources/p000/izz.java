package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: izz */
public final class izz implements jaq {
    /* renamed from: a */
    private final kpk f18705a;

    public izz(kpk kpk) {
        jri.m13152b((Object) kpk);
        this.f18705a = kpk;
    }

    /* renamed from: a */
    public final void mo1980a(izh izh) {
        kpk kpk = this.f18705a;
        kpk.mo1985a(new jae(kpk, izh), kpq.f8410a);
    }

    /* renamed from: a */
    public final kpk mo1979a() {
        return this.f18705a;
    }

    /* renamed from: b */
    public final Object mo1982b() {
        try {
            Object obj = this.f18705a.get();
            if (obj != null) {
                return obj;
            }
            throw jar.m4390a(new IllegalStateException("Result value was null"));
        } catch (ExecutionException e) {
            throw jar.m4390a(e.getCause());
        }
    }

    /* renamed from: c */
    public final boolean mo1983c() {
        return this.f18705a.isDone();
    }

    /* renamed from: a */
    public final jaq mo1973a(Executor executor, izi izi) {
        jri.m13152b((Object) executor);
        jri.m13152b((Object) izi);
        kpk kpk = this.f18705a;
        Object jai = new jai(kpk, new jaf(izi), null, executor, jcd.f18731b);
        kpk.mo1985a(jai, kpq.f8410a);
        return jai.f7604a;
    }

    /* renamed from: a */
    public final jaq mo1974a(Executor executor, izi izi, izi izi2) {
        jri.m13152b((Object) executor);
        jri.m13152b((Object) izi);
        jri.m13152b((Object) izi2);
        kpk kpk = this.f18705a;
        Object jai = new jai(kpk, new jaf(izi), new jaf(izi2), executor, jcd.f18731b);
        kpk.mo1985a(jai, kpq.f8410a);
        return jai.f7604a;
    }

    /* renamed from: a */
    public final jaq mo1975a(Executor executor, jau jau) {
        jri.m13152b((Object) executor);
        jri.m13152b((Object) jau);
        kpk kpk = this.f18705a;
        Object jai = new jai(kpk, new jag(jau), null, executor, jcd.f18731b);
        kpk.mo1985a(jai, kpq.f8410a);
        return jai.f7604a;
    }

    /* renamed from: a */
    public final jaq mo1976a(Executor executor, jau jau, jau jau2) {
        jri.m13152b((Object) executor);
        jri.m13152b((Object) jau);
        jri.m13152b((Object) jau2);
        kpk kpk = this.f18705a;
        Object jai = new jai(kpk, new jag(jau), new jag(jau2), executor, jcd.f18731b);
        kpk.mo1985a(jai, kpq.f8410a);
        return jai.f7604a;
    }

    /* renamed from: a */
    public final jaq mo1977a(Executor executor, Runnable runnable) {
        jri.m13152b((Object) executor);
        jri.m13152b((Object) runnable);
        return mo1974a(executor, new jaa(runnable), new jab(runnable));
    }

    /* renamed from: a */
    public final jaq mo1978a(Executor executor, jlf jlf) {
        return mo1976a(executor, new jac(jlf), new jad(jlf));
    }

    /* renamed from: b */
    public final jaq mo1981b(Executor executor, izi izi) {
        jri.m13152b((Object) executor);
        jri.m13152b((Object) izi);
        return mo1974a(executor, new izk(), izi);
    }
}
