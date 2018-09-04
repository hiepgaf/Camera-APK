package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* compiled from: PG */
/* renamed from: gaj */
final class gaj implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ View f4956a;

    gaj(View view) {
        this.f4956a = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4956a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
