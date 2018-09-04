package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbl */
public final /* synthetic */ class hbl implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f5934a;

    public hbl(hbh hbh) {
        this.f5934a = hbh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5934a.f5908b.currentSpec.m3063g(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
