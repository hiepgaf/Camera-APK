package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* renamed from: sa */
final class sa extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ ux f9172a;
    /* renamed from: b */
    private final /* synthetic */ View f9173b;
    /* renamed from: c */
    private final /* synthetic */ ViewPropertyAnimator f9174c;
    /* renamed from: d */
    private final /* synthetic */ rv f9175d;

    sa(rv rvVar, ux uxVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f9175d = rvVar;
        this.f9172a = uxVar;
        this.f9173b = view;
        this.f9174c = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f9173b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f9174c.setListener(null);
        this.f9175d.m5911f(this.f9172a);
        this.f9175d.f22562d.remove(this.f9172a);
        this.f9175d.m16781a();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
