package p000;

/* renamed from: eyc */
final /* synthetic */ class eyc implements Runnable {
    /* renamed from: a */
    private final eyb f4340a;
    /* renamed from: b */
    private final iwp f4341b;
    /* renamed from: c */
    private final iqm f4342c;

    eyc(eyb eyb, iwp iwp, iqm iqm) {
        this.f4340a = eyb;
        this.f4341b = iwp;
        this.f4342c = iqm;
    }

    public final void run() {
        eyb eyb = this.f4340a;
        gid gid = new gid(this.f4341b, this.f4342c.f7326e, eyb.f15746c);
        long j = gid.f16923a;
        eyb.f15747d = j;
        exd exd = eyb.f15744a;
        exd.f4326a.mo1953a(euh.m2125a(j), gid);
        exd.m2185a(gid);
    }
}
