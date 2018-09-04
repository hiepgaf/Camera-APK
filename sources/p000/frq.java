package p000;

/* compiled from: PG */
/* renamed from: frq */
final class frq extends iww {
    /* renamed from: a */
    private final /* synthetic */ frp f23212a;

    frq(frp frp, iwz iwz) {
        this.f23212a = frp;
        super(iwz);
    }

    public final void close() {
        super.close();
        synchronized (this.f23212a.f4675e.f16442a) {
            frp frp = this.f23212a;
            frp.f4675e.f16451j.remove(frp);
            frp = this.f23212a;
            frp.f4675e.f16452k.remove(frp);
            frp = this.f23212a;
            frp.f4675e.f16453l.remove(frp);
            this.f23212a.f4675e.f16448g.m16083a();
            this.f23212a.f4675e.m10709d();
        }
    }
}
