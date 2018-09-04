package p000;

/* compiled from: PG */
/* renamed from: asy */
public final class asy {
    /* renamed from: a */
    private final kwk f955a;
    /* renamed from: b */
    private final kwk f956b;
    /* renamed from: c */
    private final kwk f957c;
    /* renamed from: d */
    private final kwk f958d;
    /* renamed from: e */
    private final kwk f959e;

    public asy(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        asy.m688a(kwk, 1);
        this.f955a = (kwk) asy.m688a(kwk2, 2);
        this.f956b = (kwk) asy.m688a(kwk3, 3);
        this.f957c = (kwk) asy.m688a(kwk4, 4);
        this.f958d = (kwk) asy.m688a(kwk5, 5);
        this.f959e = (kwk) asy.m688a(kwk6, 6);
    }

    /* renamed from: a */
    private static Object m688a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final /* synthetic */ asx m689a(asn asn, ilp ilp, ffc ffc) {
        hig hig = (hig) asy.m688a((hig) this.f955a.mo345a(), 2);
        hik hik = (hik) asy.m688a((hik) this.f956b.mo345a(), 3);
        ilp ilp2 = (ilp) asy.m688a((ilp) this.f957c.mo345a(), 4);
        irs irs = (irs) asy.m688a((irs) this.f958d.mo345a(), 5);
        asy.m688a((ikd) this.f959e.mo345a(), 6);
        asn asn2 = (asn) asy.m688a(asn, 7);
        asy.m688a(ilp, 8);
        asy.m688a(ffc, 9);
        return new asx(hig, hik, ilp2, irs, asn2);
    }
}
