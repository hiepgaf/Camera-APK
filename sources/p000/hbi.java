package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbi */
public final /* synthetic */ class hbi implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f5931a;

    public hbi(hbh hbh) {
        this.f5931a = hbh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5931a.f5908b.currentSpec.m3059e(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
