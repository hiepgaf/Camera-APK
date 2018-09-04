package p000;

/* compiled from: PG */
/* renamed from: ebs */
final class ebs implements ctt {
    /* renamed from: a */
    private final /* synthetic */ csp f14958a;
    /* renamed from: b */
    private final /* synthetic */ ebq f14959b;

    ebs(ebq ebq, csp csp) {
        this.f14959b = ebq;
        this.f14958a = csp;
    }

    /* renamed from: a */
    public final void mo1099a() {
        bli.m869c(ebq.f14940a, "onTransitionCancel");
    }

    /* renamed from: b */
    public final void mo1100b() {
        bli.m869c(ebq.f14940a, "onTransitionEnd");
        ebq ebq = this.f14959b;
        csp csp = this.f14958a;
        hfz hfz = (hfz) ebq.f14941b.mo345a();
        err a = ebq.m9633a(hfz);
        if (a == null) {
            bli.m863a(ebq.f14940a, "no item found at index 0, requestLoad");
            hfz.mo1007a(new ebr(ebq, hfz, csp));
            return;
        }
        ebq.m9635a(csp, hfz, a);
    }

    /* renamed from: c */
    public final void mo1101c() {
    }
}
