package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: cut */
final class cut implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ cur f2769a;

    cut(cur cur) {
        this.f2769a = cur;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2769a.f2762b.m1522a(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
