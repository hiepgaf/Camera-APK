package p000;

import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;

/* compiled from: PG */
/* renamed from: kvy */
final class kvy extends SimpleOnScaleGestureListener {
    /* renamed from: a */
    private final /* synthetic */ kvr f8719a;

    kvy(kvr kvr) {
        this.f8719a = kvr;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.f8719a.m5461a((double) scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), true);
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f8719a.f8676c = go.ch;
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        boolean z;
        super.onScaleEnd(scaleGestureDetector);
        this.f8719a.f8676c = go.cf;
        kvr kvr = this.f8719a;
        float f = kvr.f8674a;
        float f2 = kvr.f8678e;
        if (f > f2) {
            z = true;
        } else {
            f2 = kvr.f8677d;
            if (f < f2) {
                z = true;
            } else {
                z = false;
                f2 = f;
            }
        }
        if (z) {
            this.f8719a.postOnAnimation(new kvu(kvr, f2, (float) (kvr.f8682i / 2), (float) (kvr.f8683j / 2), true));
        }
    }
}
