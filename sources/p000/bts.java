package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: bts */
final class bts implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ btl f1553a;

    bts(btl btl) {
        this.f1553a = btl;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1553a.f1545d.m957a(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f1553a.f1544c.invalidate();
    }
}
