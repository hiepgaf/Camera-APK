package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* renamed from: rz */
final class rz extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ ux f9168a;
    /* renamed from: b */
    private final /* synthetic */ ViewPropertyAnimator f9169b;
    /* renamed from: c */
    private final /* synthetic */ View f9170c;
    /* renamed from: d */
    private final /* synthetic */ rv f9171d;

    rz(rv rvVar, ux uxVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f9171d = rvVar;
        this.f9168a = uxVar;
        this.f9169b = viewPropertyAnimator;
        this.f9170c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f9169b.setListener(null);
        this.f9170c.setAlpha(1.0f);
        this.f9171d.m5911f(this.f9168a);
        this.f9171d.f22564f.remove(this.f9168a);
        this.f9171d.m16781a();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
