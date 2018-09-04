package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: gvh */
public final class gvh implements asu {
    /* renamed from: a */
    private final kwk f17392a;
    /* renamed from: b */
    private final kwk f17393b;
    /* renamed from: c */
    private final kwk f17394c;
    /* renamed from: d */
    private final kwk f17395d;
    /* renamed from: e */
    private final kwk f17396e;
    /* renamed from: f */
    private final kwk f17397f;
    /* renamed from: g */
    private final kwk f17398g;
    /* renamed from: h */
    private final kwk f17399h;
    /* renamed from: i */
    private final kwk f17400i;
    /* renamed from: j */
    private final kwk f17401j;
    /* renamed from: k */
    private final kwk f17402k;

    public gvh(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10, kwk kwk11, kwk kwk12) {
        this.f17392a = (kwk) gvh.m11573a(kwk, 1);
        this.f17393b = (kwk) gvh.m11573a(kwk2, 2);
        this.f17394c = (kwk) gvh.m11573a(kwk3, 3);
        this.f17395d = (kwk) gvh.m11573a(kwk4, 4);
        this.f17396e = (kwk) gvh.m11573a(kwk5, 5);
        this.f17397f = (kwk) gvh.m11573a(kwk6, 6);
        this.f17398g = (kwk) gvh.m11573a(kwk7, 7);
        this.f17399h = (kwk) gvh.m11573a(kwk8, 8);
        gvh.m11573a(kwk9, 9);
        this.f17400i = (kwk) gvh.m11573a(kwk10, 10);
        this.f17401j = (kwk) gvh.m11573a(kwk11, 11);
        this.f17402k = (kwk) gvh.m11573a(kwk12, 12);
    }

    /* renamed from: a */
    private static Object m11573a(Object obj, int i) {
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
        asl asl = (asl) gvh.m11573a((asl) this.f17392a.mo345a(), 1);
        aso aso = (aso) gvh.m11573a((aso) this.f17393b.mo345a(), 2);
        asy asy = (asy) gvh.m11573a((asy) this.f17394c.mo345a(), 3);
        atb atb = (atb) gvh.m11573a((atb) this.f17395d.mo345a(), 4);
        atn atn = (atn) gvh.m11573a((atn) this.f17396e.mo345a(), 5);
        hnh hnh = (hnh) gvh.m11573a((hnh) this.f17397f.mo345a(), 6);
        gvh.m11573a((hnf) this.f17398g.mo345a(), 7);
        ikd ikd = (ikd) gvh.m11573a((ikd) this.f17399h.mo345a(), 8);
        hig hig = (hig) gvh.m11573a((hig) this.f17400i.mo345a(), 10);
        hik hik = (hik) gvh.m11573a((hik) this.f17401j.mo345a(), 11);
        Set set = (Set) gvh.m11573a((Set) this.f17402k.mo345a(), 12);
        asn asn2 = (asn) gvh.m11573a(asn, 13);
        ffc ffc2 = (ffc) gvh.m11573a(ffc, 14);
        ilp ilp3 = (ilp) gvh.m11573a(ilp, 15);
        gvh.m11573a(kbg, 16);
        return new gvf(asl, aso, asy, atb, atn, hnh, ikd, hig, hik, set, asn2, ffc2, ilp3, (ilp) gvh.m11573a(ilp2, 17));
    }
}
