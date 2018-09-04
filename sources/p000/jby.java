package p000;

/* compiled from: PG */
/* renamed from: jby */
final class jby implements Runnable {
    /* renamed from: a */
    private final jar f7680a;
    /* renamed from: b */
    private final jbj f7681b;
    /* renamed from: c */
    private final Runnable f7682c;
    /* renamed from: d */
    private final jcc f7683d;

    public jby(jar jar, Runnable runnable, jbj jbj, jcc jcc) {
        this.f7680a = jar;
        this.f7681b = jbj;
        this.f7682c = runnable;
        this.f7683d = jcc;
    }

    public final void run() {
        jbj.m12742a(this.f7680a, this.f7682c, this.f7681b);
    }

    public final String toString() {
        return this.f7682c.toString();
    }
}
