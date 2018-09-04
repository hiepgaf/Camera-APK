package p000;

/* compiled from: PG */
/* renamed from: jap */
public final class jap implements Runnable {
    /* renamed from: a */
    private final Object f7623a;
    /* renamed from: b */
    private final jbj f7624b;
    /* renamed from: c */
    private final Runnable f7625c;
    /* renamed from: d */
    private final jcc f7626d;

    public jap(Object obj, Runnable runnable, jbj jbj, jcc jcc) {
        this.f7623a = obj;
        this.f7624b = jbj;
        this.f7625c = runnable;
        this.f7626d = jcc;
    }

    public final void run() {
        Object obj = this.f7623a;
        Runnable runnable = this.f7625c;
        jbj jbj = this.f7624b;
        try {
            runnable.run();
            jbj.m12763a(obj);
        } catch (Throwable th) {
            jbj.m12762a(jar.m4390a(th));
        }
    }

    public final String toString() {
        return this.f7625c.toString();
    }
}
