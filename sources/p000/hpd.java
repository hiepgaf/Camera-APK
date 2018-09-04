package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.zoomui.ZoomMarkerView;

/* compiled from: PG */
/* renamed from: hpd */
final class hpd implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ hox f6424a;

    hpd(hox hox) {
        this.f6424a = hox;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z;
        ZoomMarkerView zoomMarkerView = this.f6424a.f17966d;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        if (animatedFraction != 0.0f) {
            z = true;
        } else {
            z = false;
        }
        zoomMarkerView.f2454b = z;
        zoomMarkerView.f2456d = animatedFraction;
        zoomMarkerView.invalidate();
    }
}
