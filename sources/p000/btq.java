package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: btq */
final class btq implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ btl f1551a;

    btq(btl btl) {
        this.f1551a = btl;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1551a.f1545d.m959c(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f1551a.f1544c.invalidate();
    }
}
