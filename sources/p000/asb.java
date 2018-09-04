package p000;

/* compiled from: PG */
/* renamed from: asb */
final class asb extends asa {
    /* renamed from: a */
    private volatile boolean f10176a;

    asb() {
        super();
    }

    /* renamed from: a */
    public final void mo343a(boolean z) {
        this.f10176a = z;
    }

    /* renamed from: b */
    public final void mo344b() {
        if (this.f10176a) {
            throw new IllegalStateException("Already released");
        }
    }
}
