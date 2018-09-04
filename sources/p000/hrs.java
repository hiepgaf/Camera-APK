package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;

/* compiled from: PG */
/* renamed from: hrs */
final class hrs implements AnimatorListener {
    /* renamed from: a */
    private boolean f6516a = false;
    /* renamed from: b */
    private final /* synthetic */ AnimatorSet f6517b;

    hrs(AnimatorSet animatorSet) {
        this.f6517b = animatorSet;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f6516a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f6516a) {
            this.f6517b.start();
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.f6516a = false;
    }
}
