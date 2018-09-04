package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: brs */
final /* synthetic */ class brs implements AnimatorUpdateListener {
    /* renamed from: a */
    private final brq f1500a;

    brs(brq brq) {
        this.f1500a = brq;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1500a.f1493f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
    }
}
