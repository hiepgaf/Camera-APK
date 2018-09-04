package p000;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;

/* compiled from: PG */
/* renamed from: dqe */
final class dqe extends fiw {
    /* renamed from: a */
    private final iqt f14237a;

    public dqe(iqt iqt) {
        this.f14237a = iqt;
    }

    public final void a_(iwp iwp) {
        if (iwp != null) {
            this.f14237a.mo348a(new fvj((Face[]) iwp.mo3143a(CaptureResult.STATISTICS_FACES), (Rect) iwp.mo3143a(CaptureResult.SCALER_CROP_REGION)));
        }
    }
}
