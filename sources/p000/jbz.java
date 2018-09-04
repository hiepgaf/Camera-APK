package p000;

/* compiled from: PG */
/* renamed from: jbz */
final class jbz implements Runnable {
    /* renamed from: a */
    private final Object f7684a;
    /* renamed from: b */
    private final jbj f7685b;
    /* renamed from: c */
    private final Runnable f7686c;
    /* renamed from: d */
    private final jcc f7687d;

    public jbz(Object obj, Runnable runnable, jbj jbj, jcc jcc) {
        this.f7684a = obj;
        this.f7685b = jbj;
        this.f7686c = runnable;
        this.f7687d = jcc;
    }

    public final void run() {
        jbj.m12747a(this.f7684a, this.f7686c, this.f7685b);
    }

    public final String toString() {
        return this.f7686c.toString();
    }
}
