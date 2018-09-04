package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: hmf */
public final class hmf extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ hlz f6363a;

    public hmf(hlz hlz) {
        this.f6363a = hlz;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6363a.f6357n.setVisibility(8);
    }
}
