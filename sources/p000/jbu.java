package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jbu */
final class jbu implements Runnable {
    /* renamed from: a */
    private final Object f7671a;
    /* renamed from: b */
    private final Executor f7672b;
    /* renamed from: c */
    private final jbj f7673c;
    /* renamed from: d */
    private final jau f7674d;
    /* renamed from: e */
    private final jcc f7675e;

    public jbu(Object obj, jau jau, Executor executor, jbj jbj, jcc jcc) {
        this.f7671a = obj;
        this.f7672b = executor;
        this.f7673c = jbj;
        this.f7674d = jau;
        this.f7675e = jcc;
    }

    public final void run() {
        jbj.m12749b(this.f7671a, this.f7674d, this.f7672b, this.f7673c, this.f7675e);
    }

    public final String toString() {
        return this.f7674d.toString();
    }
}
