package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

/* compiled from: PG */
/* renamed from: hro */
final class hro implements AnimatorListener {
    /* renamed from: a */
    private final /* synthetic */ hrm f6512a;

    hro(hrm hrm) {
        this.f6512a = hrm;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        hrm hrm = this.f6512a;
        hrm.m11971a(hrm.f18088a, -10.0f);
        animator.setStartDelay(0);
    }
}
