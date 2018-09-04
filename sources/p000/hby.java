package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: hby */
public final class hby extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ hbh f5949a;

    public hby(hbh hbh) {
        this.f5949a = hbh;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f5949a.f5908b.setVideoButtonAnimating(false);
    }

    public final void onAnimationStart(Animator animator) {
        this.f5949a.f5908b.setVideoButtonAnimating(true);
    }
}
