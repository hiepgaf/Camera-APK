package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbk */
public final /* synthetic */ class hbk implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f5933a;

    public hbk(hbh hbh) {
        this.f5933a = hbh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5933a.f5908b.currentSpec.m3061f(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
