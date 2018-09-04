package p000;

/* compiled from: PG */
/* renamed from: awg */
public final class awg implements asu {
    /* renamed from: a */
    private final kwk f10423a;
    /* renamed from: b */
    private final kwk f10424b;
    /* renamed from: c */
    private final kwk f10425c;
    /* renamed from: d */
    private final kwk f10426d;
    /* renamed from: e */
    private final kwk f10427e;
    /* renamed from: f */
    private final kwk f10428f;
    /* renamed from: g */
    private final kwk f10429g;

    public awg(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7) {
        this.f10423a = (kwk) awg.m7092a(kwk, 1);
        this.f10424b = (kwk) awg.m7092a(kwk2, 2);
        this.f10425c = (kwk) awg.m7092a(kwk3, 3);
        this.f10426d = (kwk) awg.m7092a(kwk4, 4);
        this.f10427e = (kwk) awg.m7092a(kwk5, 5);
        this.f10428f = (kwk) awg.m7092a(kwk6, 6);
        this.f10429g = (kwk) awg.m7092a(kwk7, 7);
    }

    /* renamed from: a */
    private static Object m7092a(Object obj, int i) {
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
        asl asl = (asl) awg.m7092a((asl) this.f10423a.mo345a(), 1);
        aso aso = (aso) awg.m7092a((aso) this.f10424b.mo345a(), 2);
        asy asy = (asy) awg.m7092a((asy) this.f10425c.mo345a(), 3);
        atb atb = (atb) awg.m7092a((atb) this.f10426d.mo345a(), 4);
        hnh hnh = (hnh) awg.m7092a((hnh) this.f10427e.mo345a(), 5);
        hnf hnf = (hnf) awg.m7092a((hnf) this.f10428f.mo345a(), 6);
        ikd ikd = (ikd) awg.m7092a((ikd) this.f10429g.mo345a(), 7);
        asn asn2 = (asn) awg.m7092a(asn, 8);
        ffc ffc2 = (ffc) awg.m7092a(ffc, 9);
        ilp ilp3 = (ilp) awg.m7092a(ilp, 10);
        awg.m7092a(kbg, 11);
        return new awe(asl, aso, asy, atb, hnh, hnf, ikd, asn2, ffc2, ilp3, (ilp) awg.m7092a(ilp2, 12));
    }
}
