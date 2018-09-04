package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: hcc */
final class hcc extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ hbz f5954a;

    hcc(hbz hbz) {
        this.f5954a = hbz;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f5954a.f5951b.f5908b.currentSpec.f5963c = null;
    }
}
