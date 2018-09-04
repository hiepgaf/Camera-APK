package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.View;

/* compiled from: PG */
/* renamed from: elr */
public final class elr implements AnimatorListener {
    /* renamed from: a */
    private final /* synthetic */ View f3945a;
    /* renamed from: b */
    private final /* synthetic */ elq f3946b;

    public elr(elq elq, View view) {
        this.f3946b = elq;
        this.f3945a = view;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.f3945a.setAlpha(0.0f);
        this.f3945a.setVisibility(8);
        this.f3946b.f3944a.removeAllListeners();
        this.f3946b.f3944a = null;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.f3945a.setVisibility(0);
    }
}
