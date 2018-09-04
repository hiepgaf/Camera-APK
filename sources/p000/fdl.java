package p000;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: fdl */
public final class fdl {
    /* renamed from: a */
    public final Object f4484a = new Object();
    /* renamed from: b */
    public boolean f4485b;
    /* renamed from: c */
    public long f4486c;
    /* renamed from: d */
    public kpw f4487d;
    /* renamed from: e */
    public final fiw f4488e = new fdm(this);
    /* renamed from: f */
    public final fiw f4489f = new fdn(this);

    /* renamed from: a */
    static /* synthetic */ void m2259a(fdl fdl, iwp iwp) {
        knk knk;
        synchronized (fdl.f4484a) {
            long b = iwp.mo3144b() - fdl.f4486c;
            if (fcp.f21344a.contains((Integer) iwp.mo3143a(CaptureResult.CONTROL_AF_STATE)) || b >= 120) {
                fdl.f4485b = false;
                knk = fdl.f4487d;
            } else {
                knk = null;
            }
        }
        if (knk != null) {
            knk.mo3557a(Long.valueOf(iwp.mo3144b()));
        }
    }

    /* renamed from: a */
    public final kpk m2260a() {
        kpk kpk;
        synchronized (this.f4484a) {
            kpk = this.f4487d;
        }
        return kpk;
    }
}
