package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbq */
public final /* synthetic */ class hbq implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f5938a;

    public hbq(hbh hbh) {
        this.f5938a = hbh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5938a.f5908b.currentSpec.m3049a(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
