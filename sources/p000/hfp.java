package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: hfp */
final class hfp implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ hfl f6167a;

    hfp(hfl hfl) {
        this.f6167a = hfl;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6167a.f6155h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f6167a.invalidate();
    }
}
