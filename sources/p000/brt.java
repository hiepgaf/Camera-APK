package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: brt */
final class brt extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ brq f1501a;

    brt(brq brq) {
        this.f1501a = brq;
    }

    public final void onAnimationEnd(Animator animator) {
        brq brq = this.f1501a;
        brq.f1491d.postDelayed(brq.f1496i, 1000);
    }
}
