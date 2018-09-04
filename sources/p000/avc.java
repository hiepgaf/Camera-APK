package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: avc */
public final class avc implements ast {
    /* renamed from: a */
    private final ikb f19816a;
    /* renamed from: b */
    private final aso f19817b;
    /* renamed from: c */
    private final hnh f19818c;
    /* renamed from: d */
    private final hnf f19819d;

    public avc(asl asl, aso aso, asy asy, atb atb, atn atn, hnh hnh, hnf hnf, ikd ikd, Set set, asn asn, ffc ffc, ilp ilp, ilp ilp2) {
        this.f19816a = new ikb();
        boolean z = !ffc.mo1937s() ? ffc.mo1936r() : true;
        jri.m13143a(z);
        this.f19817b = aso;
        this.f19818c = hnh;
        this.f19819d = hnf;
        asx a = asy.m689a(asn, ilp, ffc);
        if (ffc.mo1937s()) {
            this.f19816a.mo1879a(atn.m693a(ilp));
        }
        hnh.m11904a(new avn(asl, a, atb, ffc.mo1921c(), set));
        aso.m685a();
        this.f19816a.mo1879a(aso.m684a(ilp));
        this.f19816a.mo1879a(ilp2.mo2859a(new avd(atb), ikd));
    }

    public avc(asl asl, aso aso, asy asy, atb atb, atn atn, hnh hnh, hnf hnf, ikd ikd, Set set, asn asn, ffc ffc, ilp ilp, ilp ilp2, byte b) {
        this(asl, aso, asy, atb, atn, hnh, hnf, ikd, set, asn, ffc, ilp, ilp2);
    }

    public final void close() {
        this.f19816a.close();
        this.f19817b.m685a();
        this.f19818c.f17947a = null;
    }
}
