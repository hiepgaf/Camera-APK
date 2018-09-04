package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: hiu */
public final class hiu extends AnimatorListenerAdapter {
    /* renamed from: a */
    private static final String f6254a = bli.m862a("AnimatorLogger");
    /* renamed from: b */
    private final String f6255b;

    public hiu(String str) {
        this.f6255b = str;
    }

    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        bli.m871d(f6254a, String.valueOf(this.f6255b).concat(" cancel"));
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        bli.m871d(f6254a, String.valueOf(this.f6255b).concat(" end"));
    }

    public final void onAnimationPause(Animator animator) {
        super.onAnimationPause(animator);
        bli.m871d(f6254a, String.valueOf(this.f6255b).concat(" pause"));
    }

    public final void onAnimationRepeat(Animator animator) {
        super.onAnimationRepeat(animator);
        bli.m871d(f6254a, String.valueOf(this.f6255b).concat(" repeat"));
    }

    public final void onAnimationResume(Animator animator) {
        super.onAnimationResume(animator);
        bli.m871d(f6254a, String.valueOf(this.f6255b).concat(" resume"));
    }

    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        bli.m871d(f6254a, String.valueOf(this.f6255b).concat(" start"));
    }
}
