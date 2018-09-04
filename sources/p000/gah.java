package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* compiled from: PG */
/* renamed from: gah */
final class gah implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ View f4954a;

    gah(View view) {
        this.f4954a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4954a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
