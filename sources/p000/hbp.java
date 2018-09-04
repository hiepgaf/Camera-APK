package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbp */
public final /* synthetic */ class hbp implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f5937a;

    public hbp(hbh hbh) {
        this.f5937a = hbh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5937a.f5908b.currentSpec.m3070k(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
