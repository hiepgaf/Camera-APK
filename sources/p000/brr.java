package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: brr */
final /* synthetic */ class brr implements AnimatorUpdateListener {
    /* renamed from: a */
    private final brq f1499a;

    brr(brq brq) {
        this.f1499a = brq;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        brq brq = this.f1499a;
        brq.f1492e = ((Float) valueAnimator.getAnimatedValue()).floatValue() * brq.f1490c.f6274a;
        brq.f1493f = (int) (valueAnimator.getAnimatedFraction() * 204.0f);
    }
}
