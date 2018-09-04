package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: hpi */
final class hpi extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ hpf f6427a;

    hpi(hpf hpf) {
        this.f6427a = hpf;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6427a.al();
    }
}
