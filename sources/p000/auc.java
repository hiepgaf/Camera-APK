package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: auc */
public final class auc implements asu {
    /* renamed from: a */
    private final kwk f10253a;
    /* renamed from: b */
    private final kwk f10254b;
    /* renamed from: c */
    private final kwk f10255c;
    /* renamed from: d */
    private final kwk f10256d;
    /* renamed from: e */
    private final kwk f10257e;
    /* renamed from: f */
    private final kwk f10258f;
    /* renamed from: g */
    private final kwk f10259g;
    /* renamed from: h */
    private final kwk f10260h;
    /* renamed from: i */
    private final kwk f10261i;

    public auc(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10) {
        this.f10253a = (kwk) auc.m7012a(kwk, 1);
        this.f10254b = (kwk) auc.m7012a(kwk2, 2);
        this.f10255c = (kwk) auc.m7012a(kwk3, 3);
        this.f10256d = (kwk) auc.m7012a(kwk4, 4);
        this.f10257e = (kwk) auc.m7012a(kwk5, 5);
        this.f10258f = (kwk) auc.m7012a(kwk6, 6);
        this.f10259g = (kwk) auc.m7012a(kwk7, 7);
        this.f10260h = (kwk) auc.m7012a(kwk8, 8);
        auc.m7012a(kwk9, 9);
        this.f10261i = (kwk) auc.m7012a(kwk10, 10);
    }

    /* renamed from: a */
    private static Object m7012a(Object obj, int i) {
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
        asl asl = (asl) auc.m7012a((asl) this.f10253a.mo345a(), 1);
        aso aso = (aso) auc.m7012a((aso) this.f10254b.mo345a(), 2);
        asy asy = (asy) auc.m7012a((asy) this.f10255c.mo345a(), 3);
        atb atb = (atb) auc.m7012a((atb) this.f10256d.mo345a(), 4);
        atn atn = (atn) auc.m7012a((atn) this.f10257e.mo345a(), 5);
        hnh hnh = (hnh) auc.m7012a((hnh) this.f10258f.mo345a(), 6);
        hnf hnf = (hnf) auc.m7012a((hnf) this.f10259g.mo345a(), 7);
        ikd ikd = (ikd) auc.m7012a((ikd) this.f10260h.mo345a(), 8);
        Set set = (Set) auc.m7012a((Set) this.f10261i.mo345a(), 10);
        asn asn2 = (asn) auc.m7012a(asn, 11);
        ffc ffc2 = (ffc) auc.m7012a(ffc, 12);
        ilp ilp3 = (ilp) auc.m7012a(ilp, 13);
        auc.m7012a(kbg, 14);
        return new avc(asl, aso, asy, atb, atn, hnh, hnf, ikd, set, asn2, ffc2, ilp3, (ilp) auc.m7012a(ilp2, 15), (byte) 0);
    }
}
