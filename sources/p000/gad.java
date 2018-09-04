package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: gad */
final class gad implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ gak f4950a;

    gad(gak gak) {
        this.f4950a = gak;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4950a.mo1434a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
