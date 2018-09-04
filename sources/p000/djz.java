package p000;

/* compiled from: PG */
/* renamed from: djz */
public final class djz implements iqo {
    /* renamed from: a */
    public final ilb f13499a;
    /* renamed from: b */
    public final ilb f13500b;
    /* renamed from: c */
    public final Object f13501c;
    /* renamed from: d */
    public boolean f13502d;
    /* renamed from: e */
    private final iut f13503e;
    /* renamed from: f */
    private final ffc f13504f;
    /* renamed from: g */
    private final gci f13505g;
    /* renamed from: h */
    private final gbw f13506h = new dka(this);

    public djz(iut iut, ffc ffc, gci gci) {
        this.f13503e = iut;
        this.f13504f = ffc;
        this.f13505g = gci;
        this.f13499a = new ilb(m9148a(this.f13505g.mo1441a()));
        this.f13500b = new ilb(iqm.m4037a(m9148a(this.f13505g.mo1441a()).intValue()));
        this.f13501c = new Object();
        this.f13502d = false;
        this.f13505g.mo1442a(this.f13506h);
    }

    /* renamed from: a */
    final Integer m9148a(iqm iqm) {
        return Integer.valueOf(axm.m733a(this.f13504f.mo1933o(), iqm.f7326e, this.f13503e == iut.FRONT));
    }

    public final void close() {
        this.f13505g.mo1443b(this.f13506h);
    }

    /* renamed from: a */
    public final void m9149a() {
        synchronized (this.f13501c) {
            if (this.f13502d) {
                return;
            }
            this.f13502d = true;
        }
    }

    /* renamed from: b */
    public final void m9150b() {
        synchronized (this.f13501c) {
            if (this.f13502d) {
                this.f13502d = false;
                this.f13499a.mo348a(m9148a(this.f13505g.mo1441a()));
                return;
            }
        }
    }
}
