package p000;

/* renamed from: bxs */
final /* synthetic */ class bxs implements kaw {
    /* renamed from: a */
    private final ffc f11423a;
    /* renamed from: b */
    private final bsn f11424b;
    /* renamed from: c */
    private final bsq f11425c;
    /* renamed from: d */
    private final bmb f11426d;

    bxs(ffc ffc, bsn bsn, bsq bsq, bmb bmb) {
        this.f11423a = ffc;
        this.f11424b = bsn;
        this.f11425c = bsq;
        this.f11426d = bmb;
    }

    /* renamed from: a */
    public final Object mo370a(Object obj) {
        Object obj2 = null;
        ffc ffc = this.f11423a;
        bsn bsn = this.f11424b;
        bsq bsq = this.f11425c;
        if (ffc.mo1921c() == iut.FRONT && bsn.m954a(bsq)) {
            obj2 = 1;
        }
        if (obj2 != null) {
            return bxh.YUV;
        }
        return bxh.JPEG;
    }
}
