package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: hfn */
public final class hfn implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ hfl f6165a;

    public hfn(hfl hfl) {
        this.f6165a = hfl;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6165a.f6155h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        hfl hfl = this.f6165a;
        hfl.f6151d.setStrokeWidth(hfl.f6155h);
        this.f6165a.invalidate();
    }
}
