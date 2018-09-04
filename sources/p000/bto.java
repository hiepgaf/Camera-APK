package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: bto */
final class bto implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ btl f1549a;

    bto(btl btl) {
        this.f1549a = btl;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1549a.f1546e.m961a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f1549a.f1544c.invalidate();
    }
}
