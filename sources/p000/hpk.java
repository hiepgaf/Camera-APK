package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: hpk */
final class hpk implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ hpf f6429a;

    hpk(hpf hpf) {
        this.f6429a = hpf;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6429a.f23308k.mo348a(Float.valueOf(((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }
}
