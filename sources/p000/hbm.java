package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbm */
public final /* synthetic */ class hbm implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f5935a;

    public hbm(hbh hbh) {
        this.f5935a = hbh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5935a.f5908b.currentSpec.m3069j(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
