package p000;

import android.graphics.PointF;

/* compiled from: PG */
/* renamed from: avg */
public final class avg implements asn {
    /* renamed from: a */
    public static final String f10356a = bli.m862a("TouchToFocus");
    /* renamed from: b */
    public final iqt f10357b;
    /* renamed from: c */
    public final ilb f10358c;
    /* renamed from: d */
    public final ikp f10359d;
    /* renamed from: e */
    public final fbr f10360e;
    /* renamed from: f */
    public kpk f10361f;
    /* renamed from: g */
    public kpw f10362g;
    /* renamed from: h */
    private final int f10363h;
    /* renamed from: i */
    private final fdy f10364i;
    /* renamed from: j */
    private final kwk f10365j;
    /* renamed from: k */
    private final fff f10366k;
    /* renamed from: l */
    private final ilp f10367l;

    avg(ikb ikb, ilb ilb, ffc ffc, fdy fdy, kwk kwk, fff fff, ilb ilb2, ikp ikp, fbr fbr, bps bps) {
        this.f10357b = ilb;
        this.f10366k = fff;
        this.f10358c = ilb2;
        this.f10359d = ikp;
        this.f10363h = ffc.mo1933o();
        this.f10364i = fdy;
        this.f10365j = kwk;
        this.f10360e = fbr;
        this.f10367l = bps.f1415a;
        ikb.mo1879a(fbr.f4463b.mo2859a(new avh(this), kpq.f8410a));
        ikb.mo1879a(this.f10367l.mo2859a(new avi(ikp), kpq.f8410a));
    }

    /* renamed from: a */
    public final aub mo363a(asw asw) {
        ikd.m12259a();
        this.f10359d.m12262a();
        kpk kpk = this.f10361f;
        if (!(kpk == null || kpk.isDone())) {
            this.f10361f.cancel(true);
        }
        iqt iqt = this.f10357b;
        PointF pointF = asw.f949a;
        iqt.mo348a(atz.m7009a(pointF, pointF, this.f10363h, this.f10364i));
        this.f10358c.mo348a(gig.AUTO);
        ash ash = (ash) this.f10365j.mo345a();
        this.f10361f = ash.m681a(this.f10366k);
        kow.m13622a(ash.m680a(), new avj(this), kpq.f8410a);
        kpw d = kpw.m18056d();
        this.f10362g = d;
        return new avk(this, ash, d, asw);
    }
}
