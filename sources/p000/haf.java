package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* renamed from: haf */
final class haf extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ View f5876a;

    haf(View view) {
        this.f5876a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f5876a.setVisibility(8);
    }
}
