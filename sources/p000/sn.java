package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: sn */
final class sn extends AnimatorListenerAdapter {
    /* renamed from: a */
    private boolean f9216a = false;
    /* renamed from: b */
    private final /* synthetic */ sk f9217b;

    sn(sk skVar) {
        this.f9217b = skVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f9216a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f9216a) {
            this.f9216a = false;
        } else if (((Float) this.f9217b.f19584n.getAnimatedValue()).floatValue() == 0.0f) {
            r0 = this.f9217b;
            r0.f19585o = 0;
            r0.m14343a(0);
        } else {
            r0 = this.f9217b;
            r0.f19585o = 2;
            r0.f19580j.invalidate();
        }
    }
}
