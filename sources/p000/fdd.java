package p000;

import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: fdd */
final class fdd implements fdx {
    /* renamed from: a */
    private static final keu f21347a = keu.m13474a(Integer.valueOf(0), Integer.valueOf(3), Integer.valueOf(2));
    /* renamed from: b */
    private final fen f21348b = new fen(f21347a, fep.AWB);
    /* renamed from: c */
    private final kpw f21349c = kpw.m18056d();

    /* renamed from: a */
    public final iwp mo3032a() {
        try {
            return (iwp) this.f21349c.get();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        obj = (iwp) obj;
        if (this.f21348b.m2270a(obj.mo3144b(), null, (Integer) obj.mo3143a(CaptureResult.CONTROL_AWB_STATE), (Long) obj.mo3143a(CaptureResult.SENSOR_TIMESTAMP))) {
            this.f21349c.mo3557a(obj);
        }
    }
}
