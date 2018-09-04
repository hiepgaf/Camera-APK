package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: gyt */
final /* synthetic */ class gyt implements AnimatorUpdateListener {
    /* renamed from: a */
    private final gyz f5816a;
    /* renamed from: b */
    private final hhx f5817b;
    /* renamed from: c */
    private final int f5818c;

    gyt(gyz gyz, hhx hhx, int i) {
        this.f5816a = gyz;
        this.f5817b = hhx;
        this.f5818c = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        gyz gyz = this.f5816a;
        hhx hhx = this.f5817b;
        int i = this.f5818c;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (hhx != null) {
            gyz.f5829c.m8432a(intValue, hhx, i);
        }
    }
}
