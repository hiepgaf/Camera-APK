package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: cvi */
final class cvi implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ cvf f2806a;

    cvi(cvf cvf) {
        this.f2806a = cvf;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2806a.m1528a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
