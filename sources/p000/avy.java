package p000;

import android.graphics.PointF;
import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: avy */
public final class avy implements asn {
    /* renamed from: a */
    public static final String f10396a = bli.m862a("TrackingTTF");
    /* renamed from: b */
    public final kbg f10397b;
    /* renamed from: c */
    public final fdw f10398c;
    /* renamed from: d */
    public final kpk f10399d;
    /* renamed from: e */
    public final fbr f10400e;
    /* renamed from: f */
    private final ffc f10401f;
    /* renamed from: g */
    private final ilb f10402g;
    /* renamed from: h */
    private final fdy f10403h;
    /* renamed from: i */
    private final gve f10404i = new gve();
    /* renamed from: j */
    private final auj f10405j;
    /* renamed from: k */
    private final fhg f10406k;

    avy(ffc ffc, ilb ilb, fdy fdy, kbg kbg, auj auj, fhg fhg, kpk kpk, fbr fbr) {
        this.f10401f = ffc;
        this.f10402g = ilb;
        this.f10403h = fdy;
        this.f10397b = kbg;
        this.f10398c = new fdw(ffc.mo1933o());
        this.f10405j = auj;
        this.f10406k = fhg;
        this.f10399d = kpk;
        this.f10400e = fbr;
    }

    /* renamed from: a */
    final void m7078a() {
        this.f10400e.m2231a();
        m7076b();
        this.f10402g.mo348a(fdp.m10231a());
        if (this.f10397b.mo2084b()) {
            ((gva) this.f10397b.mo2081a()).m11569e();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    final void m7080a(p000.fim r4) {
        /*
        r3 = this;
        r0 = r3.f10406k;
        r1 = r0.mo1382a();
        r0 = 1;
        r0 = new p000.fim[r0];	 Catch:{ all -> 0x001b }
        r2 = 0;
        r0[r2] = r4;	 Catch:{ all -> 0x001b }
        r0 = java.util.Arrays.asList(r0);	 Catch:{ all -> 0x001b }
        r2 = p000.fiv.NON_REPEATING;	 Catch:{ all -> 0x001b }
        r1.mo1381a(r0, r2);	 Catch:{ all -> 0x001b }
        if (r1 == 0) goto L_0x001a;
    L_0x0017:
        r1.close();
    L_0x001a:
        return;
    L_0x001b:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x001d }
    L_0x001d:
        r2 = move-exception;
        if (r1 == 0) goto L_0x0023;
    L_0x0020:
        r1.close();	 Catch:{ all -> 0x0024 }
    L_0x0023:
        throw r2;
    L_0x0024:
        r1 = move-exception;
        p000.kqg.m5044a(r0, r1);
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: avy.a(fim):void");
    }

    /* renamed from: a */
    public final synchronized aub mo363a(asw asw) {
        aub awc;
        if (this.f10397b.mo2084b()) {
            bli.m863a(f10396a, "Resetting ae/af on tracking touch to focus.");
            m7076b();
            this.f10404i.f5713b = new PointF(-1.0f, -1.0f);
            kpw d = kpw.m18056d();
            m7079a(asw.f949a);
            gva gva = (gva) this.f10397b.mo2081a();
            this.f10398c.m2264a(asw.f949a);
            ilp d2 = gva.m11568d();
            if (((gvd) d2.mo2860b()).m2837a()) {
                ilp a = ilq.m3817a(d2, new awb(this));
                a.mo2859a(new avz(this), kpq.f8410a);
                d2.mo2859a(new awa(this, d), kpq.f8410a);
                awc = new awc(this, d, a);
            } else {
                awc = this.f10405j.mo363a(asw);
            }
        } else {
            awc = new atl();
        }
        return awc;
    }

    /* renamed from: b */
    private final void m7076b() {
        Object e;
        try {
            this.f10400e.f4462a.mo348a(Boolean.valueOf(false));
            fio fio = new fio((fim) ((ffw) isr.m4143a(this.f10399d)).mo2860b());
            fio.m2303a(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
            m7080a(fio.m2301a());
            return;
        } catch (isr e2) {
            e = e2;
        } catch (InterruptedException e3) {
            e = e3;
        }
        String str = f10396a;
        String valueOf = String.valueOf(e);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
        stringBuilder.append("Error when unlocking ae/af. ");
        stringBuilder.append(valueOf);
        bli.m866b(str, stringBuilder.toString());
    }

    /* renamed from: a */
    final void m7079a(PointF pointF) {
        Object obj = null;
        gve gve = this.f10404i;
        if (pointF.x >= 0.0f && pointF.y >= 0.0f && (Math.abs(pointF.x - gve.f5713b.x) > gve.f5712a || Math.abs(pointF.y - gve.f5713b.y) > gve.f5712a)) {
            gve.f5713b = pointF;
            obj = 1;
        }
        if (obj != null) {
            this.f10402g.mo348a(atz.m7009a(pointF, pointF, this.f10401f.mo1933o(), this.f10403h));
        }
    }
}
