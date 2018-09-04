package p000;

/* compiled from: PG */
/* renamed from: izq */
public abstract class izq implements ize {
    /* renamed from: a */
    private final Object f21826a = new Object();
    /* renamed from: b */
    private volatile jas f21827b = null;

    /* renamed from: b */
    public abstract void mo3487b();

    /* renamed from: c */
    public abstract jas mo3488c();

    public final void close() {
        jaq jaq = this.f21827b;
        if (jaq == null) {
            synchronized (this.f21826a) {
                jaq = this.f21827b;
                if (jaq == null) {
                    mo3487b();
                    jaq = jas.m12717d();
                    this.f21827b = jaq;
                }
            }
        }
        jli.m12951c(jaq);
    }

    /* renamed from: a */
    public final jas mo3162a() {
        jas jas = this.f21827b;
        if (jas == null) {
            synchronized (this.f21826a) {
                jas = this.f21827b;
                if (jas == null) {
                    jas = mo3488c();
                    this.f21827b = jas;
                }
            }
        }
        return jas;
    }
}
