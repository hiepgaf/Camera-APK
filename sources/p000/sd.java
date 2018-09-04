package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* renamed from: sd */
final class sd extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ se f9186a;
    /* renamed from: b */
    private final /* synthetic */ ViewPropertyAnimator f9187b;
    /* renamed from: c */
    private final /* synthetic */ View f9188c;
    /* renamed from: d */
    private final /* synthetic */ rv f9189d;

    sd(rv rvVar, se seVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f9189d = rvVar;
        this.f9186a = seVar;
        this.f9187b = viewPropertyAnimator;
        this.f9188c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f9187b.setListener(null);
        this.f9188c.setAlpha(1.0f);
        this.f9188c.setTranslationX(0.0f);
        this.f9188c.setTranslationY(0.0f);
        this.f9189d.m5911f(this.f9186a.f9191b);
        this.f9189d.f22565g.remove(this.f9186a.f9191b);
        this.f9189d.m16781a();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
