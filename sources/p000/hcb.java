package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: hcb */
final class hcb extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ hbz f5953a;

    hcb(hbz hbz) {
        this.f5953a = hbz;
    }

    public final void onAnimationEnd(Animator animator) {
        hbh hbh = this.f5953a.f5951b;
        hbh.f5908b.currentSpec.m3051a(hbh.f5910d.mo1702a());
    }

    public final void onAnimationStart(Animator animator) {
        this.f5953a.f5951b.f5908b.currentSpec.m3051a(true);
    }
}
