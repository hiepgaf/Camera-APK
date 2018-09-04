package p000;

/* compiled from: PG */
/* renamed from: ivc */
final class ivc implements ixd {
    /* renamed from: a */
    private final ixd f18605a;
    /* renamed from: b */
    private final /* synthetic */ ivb f18606b;

    ivc(ivb ivb, ixd ixd) {
        this.f18606b = ivb;
        this.f18605a = ixd;
    }

    /* renamed from: a */
    public final void mo507a() {
        synchronized (this.f18606b.f23369a) {
            ivb ivb = this.f18606b;
            if (ivb.f23370b) {
                ivb.m17600j();
                return;
            }
            this.f18605a.mo507a();
        }
    }
}
