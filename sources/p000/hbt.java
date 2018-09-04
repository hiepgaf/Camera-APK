package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbt */
public final /* synthetic */ class hbt implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f5942a;

    public hbt(hbh hbh) {
        this.f5942a = hbh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5942a.f5908b.currentSpec.m3065h(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
