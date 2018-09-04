package p000;

import android.graphics.PointF;
import java.util.Set;

/* compiled from: PG */
/* renamed from: avn */
public final class avn extends hnr {
    /* renamed from: a */
    public final atb f19820a;
    /* renamed from: b */
    public hiv f19821b = null;
    /* renamed from: c */
    public hiv f19822c = null;
    /* renamed from: d */
    private final asl f19823d;
    /* renamed from: e */
    private final asx f19824e;
    /* renamed from: f */
    private final iut f19825f;
    /* renamed from: g */
    private final Set f19826g;
    /* renamed from: h */
    private final iju f19827h = new avs(this);

    public avn(asl asl, asx asx, atb atb, iut iut, Set set) {
        this.f19823d = asl;
        this.f19824e = asx;
        this.f19820a = atb;
        this.f19825f = iut;
        this.f19826g = set;
    }

    /* renamed from: a */
    public final boolean mo1654a(PointF pointF) {
        hiv hiv = this.f19821b;
        if (hiv != null) {
            hiv.mo1733a();
        }
        hiv = this.f19822c;
        if (hiv != null) {
            hiv.mo1733a();
        }
        for (hnr a : this.f19826g) {
            a.mo1654a(pointF);
        }
        atc a2 = this.f19823d.m682a();
        this.f19821b = this.f19820a.mo2788a(pointF);
        this.f19821b.mo1734a(new avo(this));
        aub a3 = this.f19824e.m687a(this.f19825f, pointF, a2);
        iel.m3717a(this.f19821b.mo1735b(), a3.mo357c(), this.f19827h, iel.m3714a());
        kpk a4 = a2.mo351a();
        iel.m3719a(a4, new avp(a3), kpq.f8410a);
        iel.m3719a(a3.mo358d(), new avq(a4, a3), kpq.f8410a);
        iel.m3719a(a2.mo352b(), new avr(a3), kpq.f8410a);
        return true;
    }
}
