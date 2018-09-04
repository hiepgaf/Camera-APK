package p000;

/* compiled from: PG */
/* renamed from: flh */
final class flh extends bcj implements fjl {
    /* renamed from: a */
    private final fhz f23189a;
    /* renamed from: b */
    private final fyd f23190b;
    /* renamed from: c */
    private final ikb f23191c;

    flh(fhz fhz, ikb ikb, bbf bbf, fyd fyd) {
        super(bbf);
        this.f23189a = fhz;
        this.f23191c = ikb;
        this.f23190b = fyd;
    }

    public final void close() {
        super.close();
        this.f23191c.close();
    }

    /* renamed from: d */
    public final int mo3439d() {
        return this.f23190b.m10884e();
    }

    public final fhz x_() {
        return this.f23189a;
    }

    /* renamed from: a */
    public final kpk mo3437a(int i) {
        return this.f23190b.m10879b(i);
    }

    /* renamed from: b */
    public final boolean mo3438b(int i) {
        return this.f23190b.m10882c(i);
    }
}
