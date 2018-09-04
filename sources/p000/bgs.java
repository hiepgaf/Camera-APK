package p000;

/* compiled from: PG */
/* renamed from: bgs */
public final class bgs extends fiw {
    /* renamed from: a */
    private final fcb f10828a;
    /* renamed from: b */
    private final fcp f10829b;
    /* renamed from: c */
    private boolean f10830c = false;

    static {
        bli.m862a("AaaReqCalbak");
    }

    public bgs(fcb fcb, fcp fcp) {
        this.f10828a = fcb;
        this.f10829b = fcp;
    }

    public final void a_(iwp iwp) {
        this.f10829b.m15663a(iwp);
        this.f10830c = this.f10829b.f21345b.isDone();
        if (this.f10830c) {
            this.f10828a.m15658a(iwp);
        }
    }
}
