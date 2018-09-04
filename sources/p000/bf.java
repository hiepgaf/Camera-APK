package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.design.behavior.HideBottomViewOnScrollBehavior;

/* compiled from: PG */
/* renamed from: bf */
public final class bf extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ HideBottomViewOnScrollBehavior f1115a;

    public bf(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.f1115a = hideBottomViewOnScrollBehavior;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1115a.f9901a = null;
    }
}
