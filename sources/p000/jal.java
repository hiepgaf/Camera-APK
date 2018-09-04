package p000;

/* compiled from: PG */
/* renamed from: jal */
public final class jal implements Runnable {
    /* renamed from: a */
    private final Object f7614a;
    /* renamed from: b */
    private final jbj f7615b;
    /* renamed from: c */
    private final izi f7616c;
    /* renamed from: d */
    private final jcc f7617d;

    public jal(Object obj, izi izi, jbj jbj, jcc jcc) {
        this.f7614a = obj;
        this.f7615b = jbj;
        this.f7616c = izi;
        this.f7617d = jcc;
    }

    public final void run() {
        Object obj = this.f7614a;
        izi izi = this.f7616c;
        jbj jbj = this.f7615b;
        try {
            jbj.m12763a(izi.mo711a(obj));
        } catch (jar e) {
            jbj.m12762a(e);
        } catch (Throwable th) {
            jbj.m12762a(jar.m4390a(th));
        }
    }

    public final String toString() {
        return this.f7616c.toString();
    }
}
