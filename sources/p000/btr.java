package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: btr */
final class btr implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ btl f1552a;

    btr(btl btl) {
        this.f1552a = btl;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1552a.f1545d.m960d(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f1552a.f1544c.invalidate();
    }
}
