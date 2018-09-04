package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jcb */
public final class jcb implements jaq {
    /* renamed from: a */
    private final Object f18730a;

    public jcb(Object obj) {
        this.f18730a = obj;
    }

    /* renamed from: a */
    public final void mo1980a(izh izh) {
    }

    /* renamed from: a */
    public final kpk mo1979a() {
        return kow.m13617a(this.f18730a);
    }

    /* renamed from: b */
    public final Object mo1982b() {
        return this.f18730a;
    }

    /* renamed from: c */
    private final jaq m12772c(Executor executor, izi izi) {
        jcc jcc = jcd.f18731b;
        jbj d = jbj.m12751d();
        jcb.m12770a(executor, new jal(this.f18730a, izi, d, jcc), d);
        return d;
    }

    /* renamed from: b */
    private final jaq m12771b(Executor executor, jau jau) {
        jcc jcc = jcd.f18731b;
        jbj d = jbj.m12751d();
        jcb.m12770a(executor, new jam(this.f18730a, jau, executor, d, jcc), d);
        return d;
    }

    /* renamed from: c */
    public final boolean mo1983c() {
        return true;
    }

    /* renamed from: a */
    private static void m12770a(Executor executor, Runnable runnable, jbj jbj) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            jbj.m12762a(jar.m4390a(th));
        }
    }

    /* renamed from: a */
    public final jaq mo1973a(Executor executor, izi izi) {
        return m12772c(executor, izi);
    }

    /* renamed from: a */
    public final jaq mo1974a(Executor executor, izi izi, izi izi2) {
        return m12772c(executor, izi);
    }

    /* renamed from: a */
    public final jaq mo1975a(Executor executor, jau jau) {
        return m12771b(executor, jau);
    }

    /* renamed from: a */
    public final jaq mo1976a(Executor executor, jau jau, jau jau2) {
        return m12771b(executor, jau);
    }

    /* renamed from: a */
    public final jaq mo1977a(Executor executor, Runnable runnable) {
        jcc jcc = jcd.f18731b;
        Object d = jbj.m12751d();
        try {
            executor.execute(new jap(this.f18730a, runnable, d, jcc));
        } catch (Throwable th) {
            d.m12762a(jar.m4390a(th));
        }
        return d;
    }

    /* renamed from: a */
    public final jaq mo1978a(Executor executor, jlf jlf) {
        return mo1976a(executor, new jea(jlf), new jiz(jlf));
    }

    /* renamed from: b */
    public final jaq mo1981b(Executor executor, izi izi) {
        return this;
    }
}
