package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* compiled from: PG */
/* renamed from: kf */
final class kf implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ ki f8262a;

    kf(ki kiVar) {
        this.f8262a = kiVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ((View) this.f8262a.f8309a.f19404c.getParent()).invalidate();
    }
}
