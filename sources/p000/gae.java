package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: gae */
final class gae implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ fzz f4951a;

    gae(fzz fzz) {
        this.f4951a = fzz;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4951a.f4938b.m2466a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f4951a.f4937a.invalidateSelf();
    }
}
