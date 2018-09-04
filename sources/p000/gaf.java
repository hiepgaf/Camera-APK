package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: gaf */
final class gaf extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ fzz f4952a;

    gaf(fzz fzz) {
        this.f4952a = fzz;
    }

    public final void onAnimationStart(Animator animator) {
        gbt gbt = this.f4952a.f4938b;
        gbt.f5036b = true;
        gbt.m2466a(0.0f);
    }
}
