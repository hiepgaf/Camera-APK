package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jam */
public final class jam implements Runnable {
    /* renamed from: a */
    private final Object f7618a;
    /* renamed from: b */
    private final Executor f7619b;
    /* renamed from: c */
    private final jbj f7620c;
    /* renamed from: d */
    private final jau f7621d;
    /* renamed from: e */
    private final jcc f7622e;

    public jam(Object obj, jau jau, Executor executor, jbj jbj, jcc jcc) {
        this.f7618a = obj;
        this.f7619b = executor;
        this.f7620c = jbj;
        this.f7621d = jau;
        this.f7622e = jcc;
    }

    public final void run() {
        Object obj = this.f7618a;
        jau jau = this.f7621d;
        Executor executor = this.f7619b;
        jbj jbj = this.f7620c;
        try {
            jau.mo716a(obj, executor).mo1974a(kpq.f8410a, new jao(jbj), new jan(jbj, this.f7622e)).mo1980a(izw.f18704a);
        } catch (jar e) {
            jbj.m12762a(e);
        } catch (Throwable th) {
            jbj.m12762a(jar.m4390a(th));
        }
    }

    public final String toString() {
        return this.f7621d.toString();
    }
}
