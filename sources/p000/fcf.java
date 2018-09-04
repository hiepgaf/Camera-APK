package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: fcf */
final class fcf implements fdx {
    /* renamed from: a */
    private static final keu f21341a = keu.m13475a(Integer.valueOf(0), Integer.valueOf(4), Integer.valueOf(2), Integer.valueOf(3));
    /* renamed from: b */
    private final fen f21342b = new fen(Integer.valueOf(1), f21341a, 60, fep.AE);
    /* renamed from: c */
    private final kpw f21343c = kpw.m18056d();

    /* renamed from: a */
    public final iwp mo3032a() {
        try {
            return (iwp) this.f21343c.get();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        obj = (iwp) obj;
        if (this.f21342b.m2270a(obj.mo3144b(), (Integer) obj.mo3146d().mo3139a(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), (Integer) obj.mo3143a(CaptureResult.CONTROL_AE_STATE), (Long) obj.mo3143a(CaptureResult.SENSOR_TIMESTAMP))) {
            this.f21343c.mo3557a(obj);
        }
    }
}
