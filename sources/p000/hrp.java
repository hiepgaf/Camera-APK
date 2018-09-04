package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: hrp */
final class hrp implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ hrm f6513a;

    hrp(hrm hrm) {
        this.f6513a = hrm;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        hrm hrm = this.f6513a;
        hrm.m11971a(hrm.f18088a, floatValue);
    }
}
