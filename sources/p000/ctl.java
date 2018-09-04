package p000;

import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;

/* compiled from: PG */
/* renamed from: ctl */
final class ctl extends SimpleOnScaleGestureListener {
    /* renamed from: a */
    private final /* synthetic */ cti f2698a;

    ctl(cti cti) {
        this.f2698a = cti;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        cth cth = this.f2698a.f12624a;
        return cth != null ? cth.mo1084a(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), scaleGestureDetector.getScaleFactor()) : false;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        cth cth = this.f2698a.f12624a;
        return cth != null ? cth.mo1091e(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()) : false;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        cth cth = this.f2698a.f12624a;
        if (cth != null) {
            cth.mo1082a();
        }
    }
}
