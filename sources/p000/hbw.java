package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbw */
public final /* synthetic */ class hbw implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f5946a;
    /* renamed from: b */
    private final hcj f5947b;

    public hbw(hbh hbh, hcj hcj) {
        this.f5946a = hbh;
        this.f5947b = hcj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        hbh hbh = this.f5946a;
        hbh.f5908b.currentSpec.m3053b(((Integer) hbh.f5926t.evaluate(valueAnimator.getAnimatedFraction(), Integer.valueOf(hbh.f5909c.mo1705d()), Integer.valueOf(this.f5947b.mo1705d()))).intValue());
    }
}
