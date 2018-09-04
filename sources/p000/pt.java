package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.ActionBarOverlayLayout;

/* compiled from: PG */
/* renamed from: pt */
public final class pt extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ ActionBarOverlayLayout f9037a;

    public pt(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f9037a = actionBarOverlayLayout;
    }

    public final void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f9037a;
        actionBarOverlayLayout.f10053h = null;
        actionBarOverlayLayout.f10050e = false;
    }

    public final void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f9037a;
        actionBarOverlayLayout.f10053h = null;
        actionBarOverlayLayout.f10050e = false;
    }
}
