package p000;

/* compiled from: PG */
/* renamed from: ikq */
public final class ikq implements iqo {
    /* renamed from: a */
    public final Object f18333a = new Object();
    /* renamed from: b */
    public Runnable f18334b;
    /* renamed from: c */
    private final ikp f18335c;
    /* renamed from: d */
    private final Runnable f18336d = new ikr(this);

    public ikq(ikp ikp) {
        this.f18335c = ikp;
    }

    /* renamed from: a */
    public final void m12263a() {
        synchronized (this.f18333a) {
            this.f18334b = null;
            this.f18335c.m12262a();
        }
    }

    public final void close() {
        synchronized (this.f18333a) {
            if (this.f18334b != null) {
                this.f18334b = null;
            }
        }
        this.f18335c.close();
    }

    /* renamed from: a */
    public final void m12264a(Runnable runnable) {
        synchronized (this.f18333a) {
            this.f18334b = runnable;
            this.f18335c.execute(this.f18336d);
        }
    }
}
