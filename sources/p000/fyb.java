package p000;

/* compiled from: PG */
/* renamed from: fyb */
public final class fyb implements AutoCloseable {
    /* renamed from: a */
    public final fyr f4817a;
    /* renamed from: b */
    public final Object f4818b = new Object();
    /* renamed from: c */
    public boolean f4819c = false;
    /* renamed from: d */
    public int f4820d = 0;

    public fyb(fyr fyr) {
        this.f4817a = fyr;
    }

    public final void close() {
        fyr fyr;
        synchronized (this.f4818b) {
            jri.m13153b(this.f4819c ^ 1);
            this.f4819c = true;
            if (this.f4820d == 0) {
                fyr = this.f4817a;
            } else {
                fyr = null;
            }
        }
        if (fyr != null) {
            fyr.close();
        }
    }

    /* renamed from: a */
    public final fyr m2415a() {
        synchronized (this.f4818b) {
            jri.m13153b(this.f4819c ^ 1);
            this.f4820d++;
        }
        return new fyc(this);
    }
}
