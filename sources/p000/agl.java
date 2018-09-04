package p000;

/* compiled from: PG */
/* renamed from: agl */
final class agl implements agn, ary {
    /* renamed from: a */
    private static final iw f9750a = ars.m660a(20, new agm());
    /* renamed from: b */
    private final asa f9751b = asa.m667a();
    /* renamed from: c */
    private agn f9752c;
    /* renamed from: d */
    private boolean f9753d;
    /* renamed from: e */
    private boolean f9754e;

    agl() {
    }

    /* renamed from: b */
    public final Object mo55b() {
        return this.f9752c.mo55b();
    }

    /* renamed from: c */
    public final Class mo56c() {
        return this.f9752c.mo56c();
    }

    /* renamed from: d */
    public final int mo57d() {
        return this.f9752c.mo57d();
    }

    /* renamed from: a */
    public final asa mo39a() {
        return this.f9751b;
    }

    /* renamed from: a */
    static agl m6406a(agn agn) {
        agl agl = (agl) aqe.m585a((agl) f9750a.mo341a(), "Argument must not be null");
        agl.f9754e = false;
        agl.f9753d = true;
        agl.f9752c = agn;
        return agl;
    }

    /* renamed from: e */
    public final synchronized void mo58e() {
        this.f9751b.mo344b();
        this.f9754e = true;
        if (!this.f9753d) {
            this.f9752c.mo58e();
            this.f9752c = null;
            f9750a.mo342a(this);
        }
    }

    /* renamed from: f */
    final synchronized void m6412f() {
        this.f9751b.mo344b();
        if (this.f9753d) {
            this.f9753d = false;
            if (this.f9754e) {
                mo58e();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }
}
