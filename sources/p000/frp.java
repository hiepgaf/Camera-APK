package p000;

/* compiled from: PG */
/* renamed from: frp */
final class frp {
    /* renamed from: a */
    public final fri f4671a;
    /* renamed from: b */
    public final kpk f4672b;
    /* renamed from: c */
    public final kpw f4673c = kpw.m18056d();
    /* renamed from: d */
    public final fwn f4674d = new fwn();
    /* renamed from: e */
    public final /* synthetic */ frk f4675e;

    frp(frk frk, fri fri) {
        this.f4675e = frk;
        this.f4671a = fri;
        this.f4672b = (kpk) jri.m13152b(fri.d);
    }

    /* renamed from: a */
    public final void m2366a(Throwable th) {
        if (this.f4673c.m17780a(th) || this.f4673c.isCancelled()) {
            synchronized (this.f4675e.f16442a) {
                this.f4675e.f16451j.remove(this);
                this.f4675e.f16452k.remove(this);
                this.f4675e.f16453l.remove(this);
                this.f4675e.f16448g.m16083a();
                this.f4675e.m10709d();
            }
        }
    }

    /* renamed from: a */
    public final long m2365a() {
        return this.f4675e.m10706b(this.f4672b);
    }
}
