package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbu */
public final /* synthetic */ class hbu implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f5943a;
    /* renamed from: b */
    private final hcj f5944b;

    public hbu(hbh hbh, hcj hcj) {
        this.f5943a = hbh;
        this.f5944b = hcj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        hbh hbh = this.f5943a;
        hbh.f5908b.currentSpec.m3071l(((Integer) hbh.f5926t.evaluate(valueAnimator.getAnimatedFraction(), Integer.valueOf(hbh.f5909c.mo1716o()), Integer.valueOf(this.f5944b.mo1716o()))).intValue());
    }
}
