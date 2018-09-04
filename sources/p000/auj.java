package p000;

import android.graphics.PointF;

/* compiled from: PG */
/* renamed from: auj */
public final class auj implements asn {
    /* renamed from: a */
    public static final String f10288a = bli.m862a("SmartTouchToFocus");
    /* renamed from: b */
    public final ilb f10289b;
    /* renamed from: c */
    public final fbr f10290c;
    /* renamed from: d */
    public final ilb f10291d;
    /* renamed from: e */
    public final ikp f10292e;
    /* renamed from: f */
    public final aug f10293f;
    /* renamed from: g */
    public kpk f10294g;
    /* renamed from: h */
    public kpw f10295h;
    /* renamed from: i */
    public final Runnable f10296i = new aum(this);
    /* renamed from: j */
    private final ffc f10297j;
    /* renamed from: k */
    private final fff f10298k;
    /* renamed from: l */
    private final fdy f10299l;
    /* renamed from: m */
    private final kwk f10300m;

    auj(ilb ilb, ikp ikp, ffc ffc, fff fff, ilb ilb2, fdy fdy, kwk kwk, aug aug, fbr fbr) {
        this.f10289b = ilb;
        this.f10297j = ffc;
        this.f10298k = fff;
        this.f10291d = ilb2;
        this.f10299l = fdy;
        this.f10300m = kwk;
        this.f10292e = ikp;
        this.f10293f = aug;
        this.f10290c = fbr;
    }

    /* renamed from: a */
    public final aub mo363a(asw asw) {
        boolean z = true;
        this.f10292e.m12262a();
        this.f10293f.f10275b = null;
        kpk kpk = this.f10294g;
        if (!(kpk == null || kpk.isDone())) {
            this.f10294g.cancel(true);
        }
        ilb ilb = this.f10291d;
        PointF pointF = asw.f949a;
        ilb.mo348a(atz.m7009a(pointF, pointF, this.f10297j.mo1933o(), this.f10299l));
        this.f10289b.mo348a(gig.AUTO);
        ash ash = (ash) this.f10300m.mo345a();
        this.f10294g = ash.m681a(this.f10298k);
        if (this.f10294g == null) {
            z = false;
        }
        jqk.m13095a(z);
        kpw d = kpw.m18056d();
        this.f10295h = d;
        kow.m13622a(ash.m680a(), new auk(this), kpq.f8410a);
        return new aul(this, ash, d, asw);
    }
}
