package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* renamed from: hae */
final class hae extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ View f5875a;

    hae(View view) {
        this.f5875a = view;
    }

    public final void onAnimationStart(Animator animator) {
        this.f5875a.setAlpha(0.0f);
        this.f5875a.setVisibility(0);
    }
}
