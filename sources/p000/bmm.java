package p000;

/* compiled from: PG */
/* renamed from: bmm */
public final class bmm implements eoj, eol, gqd {
    /* renamed from: a */
    public final Object f11026a = new Object();
    /* renamed from: b */
    public iqo f11027b;
    /* renamed from: c */
    private final ivw f11028c;
    /* renamed from: d */
    private final ise f11029d;

    public bmm(ivw ivw, ise ise) {
        this.f11028c = ivw;
        this.f11029d = ise;
    }

    /* renamed from: a */
    private final void m7547a() {
        synchronized (this.f11026a) {
            if (this.f11027b != null) {
                return;
            }
            this.f11027b = this.f11029d.m4138a();
            this.f11028c.mo417d().mo1879a(new bmn(this));
        }
    }

    /* renamed from: i */
    public final void mo381i() {
        m7547a();
    }

    public final void run() {
        m7547a();
    }
}
