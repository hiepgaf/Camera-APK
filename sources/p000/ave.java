package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: ave */
public final class ave implements asu {
    /* renamed from: a */
    private final kwk f10337a;
    /* renamed from: b */
    private final kwk f10338b;
    /* renamed from: c */
    private final kwk f10339c;
    /* renamed from: d */
    private final kwk f10340d;
    /* renamed from: e */
    private final kwk f10341e;
    /* renamed from: f */
    private final kwk f10342f;
    /* renamed from: g */
    private final kwk f10343g;
    /* renamed from: h */
    private final kwk f10344h;
    /* renamed from: i */
    private final kwk f10345i;

    public ave(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10) {
        this.f10337a = (kwk) ave.m7047a(kwk, 1);
        this.f10338b = (kwk) ave.m7047a(kwk2, 2);
        this.f10339c = (kwk) ave.m7047a(kwk3, 3);
        this.f10340d = (kwk) ave.m7047a(kwk4, 4);
        this.f10341e = (kwk) ave.m7047a(kwk5, 5);
        this.f10342f = (kwk) ave.m7047a(kwk6, 6);
        this.f10343g = (kwk) ave.m7047a(kwk7, 7);
        this.f10344h = (kwk) ave.m7047a(kwk8, 8);
        ave.m7047a(kwk9, 9);
        this.f10345i = (kwk) ave.m7047a(kwk10, 10);
    }

    /* renamed from: a */
    private static Object m7047a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final /* synthetic */ ast mo354a(asn asn, ffc ffc, ilp ilp, kbg kbg, ilp ilp2) {
        asl asl = (asl) ave.m7047a((asl) this.f10337a.mo345a(), 1);
        aso aso = (aso) ave.m7047a((aso) this.f10338b.mo345a(), 2);
        asy asy = (asy) ave.m7047a((asy) this.f10339c.mo345a(), 3);
        atb atb = (atb) ave.m7047a((atb) this.f10340d.mo345a(), 4);
        atn atn = (atn) ave.m7047a((atn) this.f10341e.mo345a(), 5);
        hnh hnh = (hnh) ave.m7047a((hnh) this.f10342f.mo345a(), 6);
        hnf hnf = (hnf) ave.m7047a((hnf) this.f10343g.mo345a(), 7);
        ikd ikd = (ikd) ave.m7047a((ikd) this.f10344h.mo345a(), 8);
        Set set = (Set) ave.m7047a((Set) this.f10345i.mo345a(), 10);
        asn asn2 = (asn) ave.m7047a(asn, 11);
        ffc ffc2 = (ffc) ave.m7047a(ffc, 12);
        ilp ilp3 = (ilp) ave.m7047a(ilp, 13);
        ave.m7047a(kbg, 14);
        return new avc(asl, aso, asy, atb, atn, hnh, hnf, ikd, set, asn2, ffc2, ilp3, (ilp) ave.m7047a(ilp2, 15));
    }
}
