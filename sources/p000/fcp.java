package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;

/* compiled from: PG */
/* renamed from: fcp */
public final class fcp implements fdx {
    /* renamed from: a */
    public static final keu f21344a = keu.m13474a(Integer.valueOf(0), Integer.valueOf(4), Integer.valueOf(5));
    /* renamed from: b */
    public final kpw f21345b = kpw.m18056d();
    /* renamed from: c */
    private final fen f21346c = new fen(Integer.valueOf(1), f21344a, 120, fep.AF);

    /* renamed from: a */
    public final iwp mo3032a() {
        try {
            return (iwp) this.f21345b.get();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final void m15663a(iwp iwp) {
        if (this.f21346c.m2270a(iwp.mo3144b(), (Integer) iwp.mo3146d().mo3139a(CaptureRequest.CONTROL_AF_TRIGGER), (Integer) iwp.mo3143a(CaptureResult.CONTROL_AF_STATE), (Long) iwp.mo3143a(CaptureResult.SENSOR_TIMESTAMP))) {
            this.f21345b.mo3557a((Object) iwp);
        }
    }
}
