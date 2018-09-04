package p000;

/* renamed from: ebr */
final /* synthetic */ class ebr implements iqb {
    /* renamed from: a */
    private final ebq f14955a;
    /* renamed from: b */
    private final hfz f14956b;
    /* renamed from: c */
    private final csp f14957c;

    ebr(ebq ebq, hfz hfz, csp csp) {
        this.f14955a = ebq;
        this.f14956b = hfz;
        this.f14957c = csp;
    }

    /* renamed from: a */
    public final void mo369a(Object obj) {
        ebq ebq = this.f14955a;
        hfz hfz = this.f14956b;
        csp csp = this.f14957c;
        err a = ebq.m9633a(hfz);
        if (a != null) {
            ebq.m9635a(csp, hfz, a);
        } else {
            bli.m866b(ebq.f14940a, "filmstrip item was null");
        }
    }
}
