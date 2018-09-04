package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* renamed from: gai */
final class gai extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ View f4955a;

    gai(View view) {
        this.f4955a = view;
    }

    public final void onAnimationStart(Animator animator) {
        this.f4955a.setVisibility(0);
    }
}
