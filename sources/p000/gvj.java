package p000;

import android.graphics.PointF;
import java.util.Set;

/* compiled from: PG */
/* renamed from: gvj */
public final class gvj implements hns {
    /* renamed from: a */
    public final atb f17415a;
    /* renamed from: b */
    public final hig f17416b;
    /* renamed from: c */
    public final hik f17417c;
    /* renamed from: d */
    public final iut f17418d;
    /* renamed from: e */
    public aub f17419e;
    /* renamed from: f */
    public hiv f17420f = null;
    /* renamed from: g */
    public hiv f17421g = null;
    /* renamed from: h */
    private final asl f17422h;
    /* renamed from: i */
    private final asx f17423i;
    /* renamed from: j */
    private final Set f17424j;
    /* renamed from: k */
    private iqo f17425k = null;
    /* renamed from: l */
    private final iju f17426l = new gvp(this);

    public gvj(asx asx, atb atb, hig hig, hik hik, iut iut, asl asl, Set set) {
        this.f17415a = atb;
        this.f17416b = hig;
        this.f17417c = hik;
        this.f17418d = iut;
        this.f17422h = asl;
        this.f17423i = asx;
        this.f17424j = set;
    }

    /* renamed from: a */
    public final void mo1653a() {
        aub aub = this.f17419e;
        if (aub != null) {
            aub.mo359e();
        }
    }

    /* renamed from: a */
    public final boolean mo1654a(PointF pointF) {
        return true;
    }

    /* renamed from: b */
    public final boolean mo1655b(PointF pointF) {
        hiv hiv = this.f17420f;
        if (hiv != null) {
            hiv.mo1733a();
        }
        hiv = this.f17421g;
        if (hiv != null) {
            hiv.mo1733a();
        }
        iqo iqo = this.f17425k;
        if (iqo != null) {
            iqo.close();
        }
        for (hnr a : this.f17424j) {
            a.mo1654a(pointF);
        }
        this.f17422h.m682a();
        this.f17420f = this.f17415a.mo2788a(pointF);
        this.f17420f.mo1734a(new gvk(this));
        atc a2 = this.f17422h.m682a();
        this.f17419e = this.f17423i.m687a(this.f17418d, pointF, a2);
        iel.m3717a(this.f17420f.mo1735b(), this.f17419e.mo357c(), this.f17426l, iel.m3714a());
        this.f17425k = this.f17419e.mo356b().mo2859a(new gvl(this), kpq.f8410a);
        kpk c = this.f17419e.mo357c();
        atb atb = this.f17415a;
        atb.getClass();
        c.mo1985a(new gvm(atb), iel.m3714a());
        iel.m3719a(a2.mo351a(), new gvn(this), kpq.f8410a);
        iel.m3719a(a2.mo352b(), new gvo(this), kpq.f8410a);
        return true;
    }
}
