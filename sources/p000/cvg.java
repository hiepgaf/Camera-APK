package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: PG */
/* renamed from: cvg */
public final class cvg implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ cvf f2804a;

    public cvg(cvf cvf) {
        this.f2804a = cvf;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2804a.f2791a.invalidate();
    }
}
