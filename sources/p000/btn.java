package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: btn */
final class btn implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ btl f1548a;

    btn(btl btl) {
        this.f1548a = btl;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bta bta = this.f1548a.f1546e;
        if (floatValue > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        bta.f1518b = floatValue;
        this.f1548a.f1544c.invalidate();
    }
}
