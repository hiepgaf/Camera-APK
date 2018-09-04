package p000;

import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;

/* compiled from: PG */
/* renamed from: hnw */
final class hnw extends SimpleOnScaleGestureListener {
    /* renamed from: a */
    private final /* synthetic */ hnu f6406a;

    hnw(hnu hnu) {
        this.f6406a = hnu;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        hnq hnq = this.f6406a.f6392i;
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        bli.m863a(hhs.f17872a, "ScaleListener zoomUi onScale");
        hnq.f6383a.mo1751a(scaleFactor);
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        hnu hnu = this.f6406a;
        hnu.f6397n = true;
        hnq hnq = hnu.f6392i;
        bli.m863a(hhs.f17872a, "ScaleListener zoomUi onScaleBegin");
        hnq.f6383a.mo1762g();
        this.f6406a.f6390g.mo1747c();
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        hnq hnq = this.f6406a.f6392i;
        bli.m863a(hhs.f17872a, "ScaleListener zoomUi onScaleEnd");
        hnq.f6383a.mo1763h();
    }
}
