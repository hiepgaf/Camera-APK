package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: hfm */
public final class hfm implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ hfl f6164a;

    public hfm(hfl hfl) {
        this.f6164a = hfl;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6164a.f6154g = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f6164a.invalidate();
    }
}
