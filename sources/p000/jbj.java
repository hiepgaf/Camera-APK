package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jbj */
public final class jbj implements jaq {
    /* renamed from: a */
    public volatile Object f18721a = null;
    /* renamed from: b */
    public volatile jar f18722b = null;
    /* renamed from: c */
    private jbv f18723c = null;
    /* renamed from: d */
    private jbv f18724d = null;

    private jbj() {
    }

    /* renamed from: a */
    private final void m12748a(Executor executor, Runnable runnable, jbj jbj, jcc jcc) {
        synchronized (this) {
            if (mo1983c()) {
                throw new IllegalStateException("Should not be delaying execution when done");
            }
            jbv jbv = new jbv(executor, runnable, jbj, jcc);
            jbv jbv2 = this.f18724d;
            if (jbv2 != null) {
                jbv2.f7676a = jbv;
            } else {
                this.f18723c = jbv;
            }
            this.f18724d = jbv;
        }
    }

    /* renamed from: a */
    final void m12761a(Executor executor, Runnable runnable, jcc jcc) {
        synchronized (this) {
            if (mo1983c()) {
                throw new IllegalStateException("Should not be delaying execution when done");
            }
            jbv jbv = new jbv(executor, runnable, jcc);
            jbv jbv2 = this.f18724d;
            if (jbv2 != null) {
                jbv2.f7676a = jbv;
            } else {
                this.f18723c = jbv;
            }
            this.f18724d = jbv;
        }
    }

    /* renamed from: a */
    static void m12739a(jar jar, izi izi, jbj jbj) {
        try {
            jbj.m12763a(izi.mo711a(jar));
        } catch (jar e) {
            jbj.m12762a(e);
        } catch (Throwable th) {
            jbj.m12762a(jar.m4390a(th));
        }
    }

    /* renamed from: a */
    static void m12744a(Object obj, izi izi, jbj jbj) {
        try {
            jbj.m12763a(izi.mo711a(obj));
        } catch (jar e) {
            jbj.m12762a(e);
        } catch (Throwable th) {
            jbj.m12762a(jar.m4390a(th));
        }
    }

    /* renamed from: b */
    private static void m12749b(Object obj, jau jau, Executor executor, jbj jbj, jcc jcc) {
        try {
            jau.mo716a(obj, executor).mo1974a(kpq.f8410a, new jbx(jbj), new jbw(jbj, jcc)).mo1980a(izw.f18704a);
        } catch (jar e) {
            jbj.m12762a(e);
        } catch (Throwable th) {
            jbj.m12762a(jar.m4390a(th));
        }
    }

    /* renamed from: d */
    public static jbj m12751d() {
        return new jbj();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo1980a(p000.izh r4) {
        /*
        r3 = this;
        r1 = p000.jcd.f18731b;
        r0 = r3.f18721a;
        if (r0 == 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r0 = r3.f18722b;
        if (r0 == 0) goto L_0x000f;
    L_0x000b:
        r4.mo1972a(r0);
        goto L_0x0006;
    L_0x000f:
        monitor-enter(r3);
        r2 = r3.f18721a;	 Catch:{ all -> 0x002b }
        if (r2 != 0) goto L_0x0018;
    L_0x0014:
        r0 = r3.f18722b;	 Catch:{ all -> 0x002b }
        if (r0 == 0) goto L_0x001f;
    L_0x0018:
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        if (r2 != 0) goto L_0x0006;
    L_0x001b:
        r4.mo1972a(r0);
        goto L_0x0006;
    L_0x001f:
        r0 = p000.kpq.f8410a;	 Catch:{ all -> 0x002b }
        r2 = new jbn;	 Catch:{ all -> 0x002b }
        r2.<init>(r3, r4);	 Catch:{ all -> 0x002b }
        r3.m12761a(r0, r2, r1);	 Catch:{ all -> 0x002b }
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        goto L_0x0006;
    L_0x002b:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: jbj.a(izh):void");
    }

    /* renamed from: a */
    public final kpk mo1979a() {
        return new jca(this);
    }

    /* renamed from: b */
    public final Object mo1982b() {
        Object obj = this.f18721a;
        if (obj == null) {
            if (this.f18722b != null) {
                throw this.f18722b;
            }
            synchronized (this) {
                while (!mo1983c()) {
                    wait();
                }
                obj = this.f18721a;
                if (obj != null) {
                } else {
                    throw this.f18722b;
                }
            }
        }
        return obj;
    }

    /* renamed from: a */
    private static void m12738a(jar jar, izi izi, Executor executor, jbj jbj, jcc jcc) {
        try {
            executor.execute(new jbt(jar, izi, jbj, jcc));
        } catch (Throwable th) {
            jbj.m12762a(jar.m4390a(th));
        }
    }

    /* renamed from: a */
    private static void m12740a(jar jar, jau jau, Executor executor, jbj jbj, jcc jcc) {
        try {
            executor.execute(new jbu(jar, jau, executor, jbj, jcc));
        } catch (Throwable th) {
            jbj.m12762a(jar.m4390a(th));
        }
    }

    /* renamed from: a */
    private static void m12741a(jar jar, Runnable runnable, Executor executor, jbj jbj, jcc jcc) {
        try {
            executor.execute(new jby(jar, runnable, jbj, jcc));
        } catch (Throwable th) {
            jbj.m12762a(jar.m4390a(th));
        }
    }

    /* renamed from: a */
    private static void m12743a(Object obj, izi izi, Executor executor, jbj jbj, jcc jcc) {
        try {
            executor.execute(new jbt(obj, izi, jbj, jcc));
        } catch (Throwable th) {
            jbj.m12762a(jar.m4390a(th));
        }
    }

    /* renamed from: c */
    private static void m12750c(Object obj, jau jau, Executor executor, jbj jbj, jcc jcc) {
        try {
            executor.execute(new jbu(obj, jau, executor, jbj, jcc));
        } catch (Throwable th) {
            jbj.m12762a(jar.m4390a(th));
        }
    }

    /* renamed from: a */
    private static void m12746a(Object obj, Runnable runnable, Executor executor, jbj jbj, jcc jcc) {
        try {
            executor.execute(new jbz(obj, runnable, jbj, jcc));
        } catch (Throwable th) {
            jbj.m12762a(jar.m4390a(th));
        }
    }

    /* renamed from: c */
    public final boolean mo1983c() {
        return (this.f18721a == null && this.f18722b == null) ? false : true;
    }

    /* renamed from: a */
    static void m12742a(jar jar, Runnable runnable, jbj jbj) {
        try {
            runnable.run();
            jbj.m12762a(jar);
        } catch (Throwable th) {
            kqg.m5044a(jar, jar.m4390a(th));
            jbj.m12762a(jar);
        }
    }

    /* renamed from: a */
    static void m12747a(Object obj, Runnable runnable, jbj jbj) {
        try {
            runnable.run();
            jbj.m12763a(obj);
        } catch (Throwable th) {
            jbj.m12762a(jar.m4390a(th));
        }
    }

    /* renamed from: a */
    public final boolean m12763a(Object obj) {
        if (mo1983c()) {
            return false;
        }
        synchronized (this) {
            if (mo1983c()) {
                return false;
            }
            this.f18721a = obj;
            m12752e();
            return true;
        }
    }

    /* renamed from: a */
    public final boolean m12762a(jar jar) {
        if (mo1983c()) {
            return false;
        }
        synchronized (this) {
            if (mo1983c()) {
                return false;
            }
            this.f18722b = jar;
            m12752e();
            return true;
        }
    }

    /* renamed from: a */
    public final jaq mo1973a(Executor executor, izi izi) {
        jcc jcc = jcd.f18731b;
        jbj d = jbj.m12751d();
        Object obj = this.f18721a;
        if (obj != null) {
            jbj.m12743a(obj, izi, executor, d, jcc);
        } else {
            jar jar = this.f18722b;
            if (jar != null) {
                d.m12762a(jar);
            } else {
                synchronized (this) {
                    Object obj2 = this.f18721a;
                    if (obj2 == null) {
                        jar = this.f18722b;
                        if (jar == null) {
                            m12748a(executor, new jbk(this, izi, d, jcc), d, jcc);
                        }
                    }
                    if (obj2 != null) {
                        jbj.m12743a(obj2, izi, executor, d, jcc);
                    } else {
                        d.m12762a(jar);
                    }
                }
            }
        }
        return d;
    }

    /* renamed from: a */
    public final jaq mo1974a(Executor executor, izi izi, izi izi2) {
        jcc jcc = jcd.f18731b;
        jbj d = jbj.m12751d();
        Object obj = this.f18721a;
        if (obj != null) {
            jbj.m12743a(obj, izi, executor, d, jcc);
        } else {
            jar jar = this.f18722b;
            if (jar != null) {
                jbj.m12738a(jar, izi2, executor, d, jcc);
            } else {
                synchronized (this) {
                    Object obj2 = this.f18721a;
                    if (obj2 == null) {
                        jar = this.f18722b;
                        if (jar == null) {
                            m12748a(executor, new jbo(this, izi, d, jcc, izi2), d, jcc);
                        }
                    }
                    if (obj2 != null) {
                        jbj.m12743a(obj2, izi, executor, d, jcc);
                    } else {
                        jbj.m12738a(jar, izi2, executor, d, jcc);
                    }
                }
            }
        }
        return d;
    }

    /* renamed from: a */
    public final jaq mo1975a(Executor executor, jau jau) {
        jcc jcc = jcd.f18731b;
        jbj d = jbj.m12751d();
        Object obj = this.f18721a;
        if (obj != null) {
            jbj.m12750c(obj, jau, executor, d, jcc);
        } else {
            jar jar = this.f18722b;
            if (jar != null) {
                d.m12762a(jar);
            } else {
                synchronized (this) {
                    Object obj2 = this.f18721a;
                    if (obj2 == null) {
                        jar = this.f18722b;
                        if (jar == null) {
                            m12748a(executor, new jbp(this, jau, executor, d, jcc), d, jcc);
                        }
                    }
                    if (obj2 != null) {
                        jbj.m12750c(obj2, jau, executor, d, jcc);
                    } else {
                        d.m12762a(jar);
                    }
                }
            }
        }
        return d;
    }

    /* renamed from: a */
    public final jaq mo1976a(Executor executor, jau jau, jau jau2) {
        jcc jcc = jcd.f18731b;
        jbj d = jbj.m12751d();
        Object obj = this.f18721a;
        if (obj != null) {
            jbj.m12750c(obj, jau, executor, d, jcc);
        } else {
            jar jar = this.f18722b;
            if (jar != null) {
                jbj.m12740a(jar, jau2, executor, d, jcc);
            } else {
                synchronized (this) {
                    Object obj2 = this.f18721a;
                    if (obj2 == null) {
                        jar = this.f18722b;
                        if (jar == null) {
                            m12748a(executor, new jbq(this, jau, executor, d, jcc, jau2), d, jcc);
                        }
                    }
                    if (obj2 != null) {
                        jbj.m12750c(obj2, jau, executor, d, jcc);
                    } else {
                        jbj.m12740a(jar, jau2, executor, d, jcc);
                    }
                }
            }
        }
        return d;
    }

    /* renamed from: a */
    public final jaq mo1977a(Executor executor, Runnable runnable) {
        jcc jcc = jcd.f18731b;
        jbj d = jbj.m12751d();
        Object obj = this.f18721a;
        if (obj != null) {
            jbj.m12746a(obj, runnable, executor, d, jcc);
        } else {
            jar jar = this.f18722b;
            if (jar != null) {
                jbj.m12741a(jar, runnable, executor, d, jcc);
            } else {
                synchronized (this) {
                    Object obj2 = this.f18721a;
                    if (obj2 == null) {
                        jar = this.f18722b;
                        if (jar == null) {
                            m12748a(executor, new jbs(this, runnable, d, jcc), d, jcc);
                        }
                    }
                    if (obj2 != null) {
                        jbj.m12746a(obj2, runnable, executor, d, jcc);
                    } else {
                        jbj.m12741a(jar, runnable, executor, d, jcc);
                    }
                }
            }
        }
        return d;
    }

    /* renamed from: a */
    public final jaq mo1978a(Executor executor, jlf jlf) {
        return mo1976a(executor, new jbl(this, jlf), new jbm(this, jlf));
    }

    /* renamed from: b */
    public final jaq mo1981b(Executor executor, izi izi) {
        jcc jcc = jcd.f18731b;
        jbj d = jbj.m12751d();
        Object obj = this.f18721a;
        if (obj != null) {
            d.m12763a(obj);
        } else {
            jar jar = this.f18722b;
            if (jar != null) {
                jbj.m12738a(jar, izi, executor, d, jcc);
            } else {
                synchronized (this) {
                    Object obj2 = this.f18721a;
                    if (obj2 == null) {
                        jar = this.f18722b;
                        if (jar == null) {
                            m12748a(executor, new jbr(this, d, izi, jcc), d, jcc);
                        }
                    }
                    if (obj2 != null) {
                        d.m12763a(obj2);
                    } else {
                        jbj.m12738a(jar, izi, executor, d, jcc);
                    }
                }
            }
        }
        return d;
    }

    /* renamed from: e */
    private final void m12752e() {
        synchronized (this) {
            jbv jbv = this.f18723c;
            this.f18723c = null;
            this.f18724d = null;
            notifyAll();
        }
        for (jbv jbv2 = jbv; jbv2 != null; jbv2 = jbv2.f7676a) {
            try {
                jbv2.f7677b.execute(jbv2.f7678c);
            } catch (Throwable th) {
                jbj jbj = jbv2.f7679d;
                if (jbj != null) {
                    jbj.m12762a(jar.m4390a(th));
                }
            }
        }
    }
}
