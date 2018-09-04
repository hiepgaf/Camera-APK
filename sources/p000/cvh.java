package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: cvh */
final class cvh implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ cvf f2805a;

    cvh(cvf cvf) {
        this.f2805a = cvf;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2805a.m1538c(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
