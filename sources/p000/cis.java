package p000;

/* renamed from: cis */
final /* synthetic */ class cis implements iqo {
    /* renamed from: a */
    private final bnd f12039a;

    cis(bnd bnd) {
        this.f12039a = bnd;
    }

    public final void close() {
        bnd bnd = this.f12039a;
        if (bnd.f11056n.compareAndSet(false, true)) {
            bnd.f11045c.m7585b();
            bnd.mo530f();
            bnd.m7575h();
        }
    }
}
