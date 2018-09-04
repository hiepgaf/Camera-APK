package p000;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.CaptureResult.Key;

/* compiled from: PG */
/* renamed from: fte */
public final class fte implements fsl {
    /* renamed from: a */
    private final /* synthetic */ fsw f16509a;

    public fte(fsw fsw) {
        this.f16509a = fsw;
    }

    /* renamed from: a */
    public final ftn mo1422a(fsm fsm) {
        fsx a = this.f16509a.m2370a(fsm);
        fto a2 = new fto("flash").m2384a("single image", a.m2377d());
        r2 = new Integer[2];
        Integer valueOf = Integer.valueOf(0);
        r2[0] = valueOf;
        Object valueOf2 = Integer.valueOf(1);
        r2[1] = valueOf2;
        String str = "hw jpeg, sw jpeg, reprocessing";
        str = "edge";
        str = "noise reduction";
        a2 = a2.m2384a("limited or full", a.m2374a(r2)).m2384a(str, a.m2373a(fss.HW_JPEG, fss.SW_JPEG, fss.REPROCESSING)).m2384a("flash fired", a.f4704a.m2379a().m2381a(CaptureResult.FLASH_STATE, Integer.valueOf(3))).m2384a(str, a.m2371a()).m2384a(str, a.m2378e());
        Key key = CaptureResult.COLOR_CORRECTION_ABERRATION_MODE;
        Object valueOf3 = Integer.valueOf(2);
        return a2.m2384a("aberration", a.m2372a(key, valueOf, keu.m13473a(valueOf2, valueOf3), keu.m13473a(valueOf2, valueOf3))).m2384a("af converged", a.m2376c()).m2383a();
    }
}
