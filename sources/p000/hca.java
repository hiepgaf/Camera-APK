package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: hca */
final class hca extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ hbz f5952a;

    hca(hbz hbz) {
        this.f5952a = hbz;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f5952a.f5951b.f5908b.setClickEnabled(true);
    }

    public final void onAnimationStart(Animator animator) {
        this.f5952a.f5951b.f5908b.setClickEnabled(false);
    }
}
