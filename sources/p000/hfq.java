package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: hfq */
final class hfq extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ hfl f6168a;

    hfq(hfl hfl) {
        this.f6168a = hfl;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f6168a.f6153f = go.bv;
        this.f6168a.setVisibility(4);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6168a.f6153f = go.bv;
        this.f6168a.setVisibility(4);
    }

    public final void onAnimationStart(Animator animator) {
        hfl hfl = this.f6168a;
        hfl.f6154g = hfl.f6149b;
        hfl.f6153f = go.bx;
    }
}
