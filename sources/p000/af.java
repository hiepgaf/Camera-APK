package p000;

/* compiled from: PG */
/* renamed from: af */
final class af extends ag implements C0159t {
    /* renamed from: d */
    private final C0132y f19779d;
    /* renamed from: e */
    private final /* synthetic */ ac f19780e;

    af(ac acVar, C0132y c0132y, ai aiVar) {
        this.f19780e = acVar;
        super(acVar, aiVar);
        this.f19779d = c0132y;
    }

    /* renamed from: b */
    final void mo2590b() {
        this.f19779d.getLifecycle().mo2583b(this);
    }

    /* renamed from: a */
    final boolean mo2589a(C0132y c0132y) {
        return this.f19779d == c0132y;
    }

    /* renamed from: a */
    public final void mo2588a(C0132y c0132y, C0129v c0129v) {
        if (this.f19779d.getLifecycle().mo2581a() == C0130w.DESTROYED) {
            this.f19780e.removeObserver(this.a);
        } else {
            m226a(mo28a());
        }
    }

    /* renamed from: a */
    final boolean mo28a() {
        return this.f19779d.getLifecycle().mo2581a().m6096a(C0130w.STARTED);
    }
}
