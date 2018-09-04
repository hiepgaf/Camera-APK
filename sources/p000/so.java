package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: so */
final class so implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ sk f9218a;

    so(sk skVar) {
        this.f9218a = skVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        this.f9218a.f19572b.setAlpha(floatValue);
        this.f9218a.f19573c.setAlpha(floatValue);
        this.f9218a.f19580j.invalidate();
    }
}
