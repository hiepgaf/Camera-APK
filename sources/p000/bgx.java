package p000;

import android.graphics.PointF;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import java.util.List;

/* compiled from: PG */
/* renamed from: bgx */
public final class bgx implements bgw {
    /* renamed from: a */
    public static final String f10835a = bli.m862a("AFreqSendImp");
    /* renamed from: b */
    public final bhu f10836b;
    /* renamed from: c */
    public kpk f10837c;
    /* renamed from: d */
    private final bhr f10838d;
    /* renamed from: e */
    private final ijx f10839e;
    /* renamed from: f */
    private final ffc f10840f;
    /* renamed from: g */
    private final fdy f10841g;
    /* renamed from: h */
    private final iqt f10842h;
    /* renamed from: i */
    private final iqt f10843i;
    /* renamed from: j */
    private final ilp f10844j;

    public bgx(bhr bhr, bhu bhu, ijx ijx, ffc ffc, fdy fdy, iqt iqt, iqt iqt2, ilp ilp) {
        this.f10838d = bhr;
        this.f10836b = bhu;
        this.f10839e = ijx;
        this.f10840f = ffc;
        this.f10841g = fdy;
        this.f10842h = iqt;
        this.f10843i = iqt2;
        this.f10844j = ilp;
    }

    /* renamed from: a */
    private final iwn m7365a(bhj bhj, boolean z, List list) {
        iwn b;
        if (z) {
            b = this.f10838d.m822b(bhj);
        } else {
            b = this.f10838d.m820a(bhj);
        }
        for (Surface a : list) {
            b.m4293a(a);
        }
        b.m4292a(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(1));
        b.m4292a(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(false));
        return b;
    }

    /* renamed from: a */
    public final kpk mo438a(bhj bhj, bhs bhs, boolean z, PointF pointF, List list) {
        atz a = atz.m7009a(pointF, pointF, this.f10840f.mo1933o(), this.f10841g);
        this.f10842h.mo348a(a);
        this.f10843i.mo348a(a);
        kpk kpk = this.f10837c;
        if (kpk != null) {
            kpk.cancel(true);
        }
        fcb fcb = new fcb();
        fcp fcp = new fcp();
        kpk = iel.m3718a(fcb.f21339a, fcp.f21345b, new bgy(bhs.m7399a(new bgs(fcb, fcp))));
        kpk d = kpw.m18056d();
        this.f10837c = d;
        kow.m13622a(kpk, new bgz(this, d), kpq.f8410a);
        try {
            iwn a2 = m7365a(bhj, z, list);
            iwn a3 = m7365a(bhj, z, list);
            a3.m4292a(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
            this.f10839e.execute(new bha(this, list, d, bhj, a2, bhs, a3));
            kny.m18045a(fcb.f21339a, new bhb(this, a2, bhj, bhs, d), this.f10839e);
            return d;
        } catch (Throwable e) {
            return kow.m13618a(e);
        }
    }
}
