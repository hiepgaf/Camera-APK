package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* renamed from: gab */
final class gab extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ View f4949a;

    gab(View view) {
        this.f4949a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f4949a.setVisibility(4);
    }
}
