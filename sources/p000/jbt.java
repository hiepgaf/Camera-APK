package p000;

/* compiled from: PG */
/* renamed from: jbt */
final class jbt implements Runnable {
    /* renamed from: a */
    private final Object f7667a;
    /* renamed from: b */
    private final jbj f7668b;
    /* renamed from: c */
    private final izi f7669c;
    /* renamed from: d */
    private final jcc f7670d;

    public jbt(Object obj, izi izi, jbj jbj, jcc jcc) {
        this.f7667a = obj;
        this.f7668b = jbj;
        this.f7669c = izi;
        this.f7670d = jcc;
    }

    public final void run() {
        jbj.m12744a(this.f7667a, this.f7669c, this.f7668b);
    }

    public final String toString() {
        return this.f7669c.toString();
    }
}
