package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbr */
public final /* synthetic */ class hbr implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f5939a;
    /* renamed from: b */
    private final hcj f5940b;

    public hbr(hbh hbh, hcj hcj) {
        this.f5939a = hbh;
        this.f5940b = hcj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        hbh hbh = this.f5939a;
        hbh.f5908b.currentSpec.m3057d(((Integer) hbh.f5926t.evaluate(valueAnimator.getAnimatedFraction(), Integer.valueOf(hbh.f5909c.mo1708g()), Integer.valueOf(this.f5940b.mo1708g()))).intValue());
    }
}
