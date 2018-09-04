package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: gvf */
public final class gvf implements ast {
    /* renamed from: a */
    private final ikb f21551a = new ikb();
    /* renamed from: b */
    private final hnh f21552b;
    /* renamed from: c */
    private final aso f21553c;

    public gvf(asl asl, aso aso, asy asy, atb atb, atn atn, hnh hnh, ikd ikd, hig hig, hik hik, Set set, asn asn, ffc ffc, ilp ilp, ilp ilp2) {
        this.f21552b = hnh;
        this.f21553c = aso;
        boolean z = !ffc.mo1937s() ? ffc.mo1936r() : true;
        jri.m13143a(z);
        asx a = asy.m689a(asn, ilp, ffc);
        if (ffc.mo1937s()) {
            this.f21551a.mo1879a(atn.m693a(ilp));
        }
        hnh.m11904a(new gvj(a, atb, hig, hik, ffc.mo1921c(), asl, set));
        aso.m685a();
        this.f21551a.mo1879a(aso.m684a(ilp));
        this.f21551a.mo1879a(ilp2.mo2859a(new gvg(atb), ikd));
    }

    public final void close() {
        this.f21551a.close();
        this.f21553c.m685a();
        this.f21552b.f17947a = null;
    }
}
