package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PG */
/* renamed from: sb */
final class sb extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ ux f9176a;
    /* renamed from: b */
    private final /* synthetic */ int f9177b;
    /* renamed from: c */
    private final /* synthetic */ View f9178c;
    /* renamed from: d */
    private final /* synthetic */ int f9179d;
    /* renamed from: e */
    private final /* synthetic */ ViewPropertyAnimator f9180e;
    /* renamed from: f */
    private final /* synthetic */ rv f9181f;

    sb(rv rvVar, ux uxVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f9181f = rvVar;
        this.f9176a = uxVar;
        this.f9177b = i;
        this.f9178c = view;
        this.f9179d = i2;
        this.f9180e = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.f9177b != 0) {
            this.f9178c.setTranslationX(0.0f);
        }
        if (this.f9179d != 0) {
            this.f9178c.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.f9180e.setListener(null);
        this.f9181f.m5911f(this.f9176a);
        this.f9181f.f22563e.remove(this.f9176a);
        this.f9181f.m16781a();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
