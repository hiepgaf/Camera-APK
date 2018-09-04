package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Rect;

/* compiled from: PG */
/* renamed from: cmo */
final class cmo implements AnimatorUpdateListener {
    /* renamed from: a */
    private final kvr f2157a;
    /* renamed from: b */
    private final cnb f2158b;

    public cmo(kvr kvr, cnb cnb) {
        this.f2157a = kvr;
        this.f2158b = cnb;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cnb cnb = this.f2158b;
        Rect rect = cnb.f2198e;
        Rect rect2 = cnb.f2199f;
        float f = 1.0f - floatValue;
        this.f2157a.setClipBounds(new Rect((int) ((((float) rect.left) * floatValue) + (((float) rect2.left) * f)), (int) ((((float) rect.top) * floatValue) + (((float) rect2.top) * f)), (int) ((((float) rect.right) * floatValue) + (((float) rect2.right) * f)), (int) ((floatValue * ((float) rect.bottom)) + (((float) rect2.bottom) * f))));
    }
}
