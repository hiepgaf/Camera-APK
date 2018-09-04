package p000;

/* compiled from: PG */
/* renamed from: gqw */
public final class gqw {
    /* renamed from: a */
    public kbg f5642a = kau.f19138a;
    /* renamed from: b */
    public klu f5643b = null;
    /* renamed from: c */
    private final gqx f5644c;

    public gqw(gqx gqx) {
        this.f5644c = gqx;
    }

    /* renamed from: a */
    public final void m2740a() {
        klu klu = this.f5643b;
        if (klu != null) {
            this.f5644c.mo695a(klu);
            this.f5643b = null;
        }
        this.f5642a = kau.f19138a;
    }

    /* renamed from: b */
    public final void m2742b() {
        if (this.f5643b == null) {
            this.f5643b = new klu();
        }
        this.f5643b.f22406f = true;
        m2740a();
    }

    /* renamed from: c */
    public final void m2743c() {
        if (this.f5643b != null) {
            m2742b();
            return;
        }
        this.f5643b = new klu();
        klu klu = this.f5643b;
        klu.f22401a = false;
        klu.f22403c = true;
        m2740a();
    }

    /* renamed from: a */
    public final void m2741a(boolean z) {
        klu klu = this.f5643b;
        if (klu == null) {
            m2742b();
            return;
        }
        klu.f22405e = z;
        m2740a();
    }
}
