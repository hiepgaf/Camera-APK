package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: hbn */
public final /* synthetic */ class hbn implements AnimatorUpdateListener {
    /* renamed from: a */
    private final hbh f5936a;

    public hbn(hbh hbh) {
        this.f5936a = hbh;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5936a.f5908b.invalidate();
    }
}
