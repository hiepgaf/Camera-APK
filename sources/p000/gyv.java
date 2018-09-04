package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: gyv */
final /* synthetic */ class gyv implements AnimatorUpdateListener {
    /* renamed from: a */
    private final gyz f5821a;
    /* renamed from: b */
    private final hhx f5822b;
    /* renamed from: c */
    private final int f5823c;

    gyv(gyz gyz, hhx hhx, int i) {
        this.f5821a = gyz;
        this.f5822b = hhx;
        this.f5823c = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        gyz gyz = this.f5821a;
        hhx hhx = this.f5822b;
        int i = this.f5823c;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (hhx != null) {
            gyz.f5829c.m8432a(intValue, hhx, i);
        }
    }
}
