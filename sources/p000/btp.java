package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: btp */
final class btp implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ btl f1550a;

    btp(btl btl) {
        this.f1550a = btl;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1550a.f1545d.m958b(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f1550a.f1544c.invalidate();
    }
}
