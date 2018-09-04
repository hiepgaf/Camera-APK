package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: faz */
final class faz extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ far f4419a;

    faz(far far) {
        this.f4419a = far;
    }

    public final void onAnimationEnd(Animator animator) {
        synchronized (far.f15835a) {
            fbe fbe = this.f4419a.f15840e;
        }
        if (fbe != null) {
            this.f4419a.mo1336a(fbe);
        }
    }
}
