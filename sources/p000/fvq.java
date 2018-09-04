package p000;

import android.hardware.camera2.CaptureResult;
import android.util.Pair;

/* compiled from: PG */
/* renamed from: fvq */
final class fvq extends fiw {
    /* renamed from: a */
    private final iqt f16566a;

    fvq(iqt iqt) {
        this.f16566a = iqt;
    }

    public final void a_(iwp iwp) {
        if (iwp != null) {
            this.f16566a.mo348a(fvr.m2402a((Float) iwp.mo3143a(CaptureResult.LENS_FOCUS_DISTANCE), (Pair) iwp.mo3143a(CaptureResult.LENS_FOCUS_RANGE)));
        }
    }
}
