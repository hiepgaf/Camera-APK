package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: gyx */
final class gyx extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ hhx f5824a;
    /* renamed from: b */
    private final /* synthetic */ gyz f5825b;

    gyx(gyz gyz, hhx hhx) {
        this.f5825b = gyz;
        this.f5824a = hhx;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f5825b.m2938c(this.f5824a);
        this.f5825b.f5831e = false;
    }
}
