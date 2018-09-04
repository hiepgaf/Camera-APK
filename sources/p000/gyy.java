package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: gyy */
final class gyy extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ gyz f5826a;

    gyy(gyz gyz) {
        this.f5826a = gyz;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f5826a.f5829c.setVisibility(8);
        this.f5826a.f5831e = false;
    }
}
