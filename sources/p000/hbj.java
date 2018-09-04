package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbj */
public final /* synthetic */ class hbj implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f5932a;

    public hbj(hbh hbh) {
        this.f5932a = hbh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5932a.f5908b.currentSpec.m3072m(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
