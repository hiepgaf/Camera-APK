package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbs */
public final /* synthetic */ class hbs implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f5941a;

    public hbs(hbh hbh) {
        this.f5941a = hbh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5941a.f5908b.currentSpec.m3055c(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
