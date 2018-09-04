package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* renamed from: sc */
final class sc extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ se f9182a;
    /* renamed from: b */
    private final /* synthetic */ ViewPropertyAnimator f9183b;
    /* renamed from: c */
    private final /* synthetic */ View f9184c;
    /* renamed from: d */
    private final /* synthetic */ rv f9185d;

    sc(rv rvVar, se seVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f9185d = rvVar;
        this.f9182a = seVar;
        this.f9183b = viewPropertyAnimator;
        this.f9184c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f9183b.setListener(null);
        this.f9184c.setAlpha(1.0f);
        this.f9184c.setTranslationX(0.0f);
        this.f9184c.setTranslationY(0.0f);
        this.f9185d.m5911f(this.f9182a.f9190a);
        this.f9185d.f22565g.remove(this.f9182a.f9190a);
        this.f9185d.m16781a();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
