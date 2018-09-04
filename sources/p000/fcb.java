package p000;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: fcb */
public final class fcb implements fdx {
    /* renamed from: b */
    private static final keu f21338b = keu.m13475a(Integer.valueOf(0), Integer.valueOf(4), Integer.valueOf(2), Integer.valueOf(3));
    /* renamed from: a */
    public final kpw f21339a = kpw.m18056d();
    /* renamed from: c */
    private final fen f21340c = new fen(f21338b, fep.AE_STATE);

    /* renamed from: a */
    public final iwp mo3032a() {
        try {
            return (iwp) this.f21339a.get();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final void m15658a(iwp iwp) {
        if (this.f21340c.m2270a(iwp.mo3144b(), null, (Integer) iwp.mo3143a(CaptureResult.CONTROL_AE_STATE), (Long) iwp.mo3143a(CaptureResult.SENSOR_TIMESTAMP))) {
            this.f21339a.mo3557a((Object) iwp);
        }
    }
}
