package p000;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: fbw */
public final class fbw implements fdx {
    /* renamed from: a */
    private final fen f21336a;
    /* renamed from: b */
    private final kpw f21337b = kpw.m18056d();

    public fbw(gie gie) {
        this.f21336a = new fen(keu.m13472a(Integer.valueOf(gie.f5215d)), fep.AE_MODE_PASSIVE);
    }

    /* renamed from: a */
    public final iwp mo3032a() {
        try {
            return (iwp) this.f21337b.get();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        obj = (iwp) obj;
        if (this.f21336a.m2270a(obj.mo3144b(), null, (Integer) obj.mo3143a(CaptureResult.CONTROL_AE_MODE), (Long) obj.mo3143a(CaptureResult.SENSOR_TIMESTAMP))) {
            this.f21337b.mo3557a(obj);
        }
    }
}
