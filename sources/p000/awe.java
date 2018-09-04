package p000;

/* compiled from: PG */
/* renamed from: awe */
public final class awe implements ast {
    /* renamed from: a */
    private final ikb f19828a = new ikb();
    /* renamed from: b */
    private final aso f19829b;
    /* renamed from: c */
    private final hnh f19830c;
    /* renamed from: d */
    private final hnf f19831d;

    public awe(asl asl, aso aso, asy asy, atb atb, hnh hnh, hnf hnf, ikd ikd, asn asn, ffc ffc, ilp ilp, ilp ilp2) {
        boolean z = !ffc.mo1937s() ? ffc.mo1936r() : true;
        jri.m13143a(z);
        this.f19829b = aso;
        this.f19830c = hnh;
        this.f19831d = hnf;
        hnh.m11904a(new avn(asl, asy.m689a(asn, ilp, ffc), atb, ffc.mo1921c(), kgn.f22045a));
        aso.m685a();
        this.f19828a.mo1879a(aso.m684a(ilp));
        this.f19828a.mo1879a(ilp2.mo2859a(new awf(atb), ikd));
    }

    public final void close() {
        this.f19828a.close();
        this.f19829b.m685a();
        this.f19830c.f17947a = null;
    }
}
