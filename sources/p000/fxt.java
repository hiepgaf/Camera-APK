package p000;

/* compiled from: PG */
/* renamed from: fxt */
final class fxt {
    /* renamed from: a */
    public final int f4806a;
    /* renamed from: b */
    public final bcp f4807b = bcp.m14749d();
    /* renamed from: c */
    public Exception f4808c;
    /* renamed from: d */
    public bbo f4809d;
    /* renamed from: e */
    public final /* synthetic */ fxr f4810e;

    fxt(fxr fxr, int i) {
        this.f4810e = fxr;
        this.f4806a = i;
    }

    /* renamed from: a */
    final void m2414a() {
        boolean z = true;
        Exception exception = this.f4808c;
        if (exception != null) {
            if (this.f4809d != null) {
                z = false;
            }
            jri.m13153b(z);
            this.f4807b.m14754a(new fys((Throwable) jqk.m13102c(this.f4808c)));
        } else if (this.f4809d != null) {
            if (exception != null) {
                z = false;
            }
            jri.m13153b(z);
            iqo iqo = this.f4809d;
            jri.m13152b((Object) iqo);
            this.f4807b.m14753a(iqo);
        } else {
            throw new IllegalStateException("No result set");
        }
    }
}
