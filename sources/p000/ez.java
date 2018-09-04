package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: ez */
final class ez extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ ex f4376a;

    ez(ex exVar) {
        this.f4376a = exVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f4376a.m2170c();
        animator.removeListener(this);
    }
}
