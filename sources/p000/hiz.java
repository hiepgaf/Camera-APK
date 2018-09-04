package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

/* compiled from: PG */
/* renamed from: hiz */
public final class hiz implements hix {
    /* renamed from: b */
    private final Animator f17901b;

    hiz(Animator animator) {
        this.f17901b = animator;
    }

    /* renamed from: a */
    public final void mo1732a(AnimatorListener animatorListener) {
        this.f17901b.addListener(animatorListener);
    }

    /* renamed from: a */
    public final hiv mo1731a() {
        kpk d = kpw.m18056d();
        this.f17901b.addListener(new hja(d));
        this.f17901b.start();
        return new hjd(this.f17901b, d);
    }
}
