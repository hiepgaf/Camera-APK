package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: cnj */
final class cnj implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ cng f2212a;

    cnj(cng cng) {
        this.f2212a = cng;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2212a.m15043a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
