package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbv */
public final /* synthetic */ class hbv implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f5945a;

    public hbv(hbh hbh) {
        this.f5945a = hbh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5945a.f5908b.currentSpec.m3067i(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
