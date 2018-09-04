package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: ey */
final class ey extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ ih f4338a;
    /* renamed from: b */
    private final /* synthetic */ ex f4339b;

    ey(ex exVar, ih ihVar) {
        this.f4339b = exVar;
        this.f4338a = ihVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f4338a.remove(animator);
        this.f4339b.f4314l.remove(animator);
    }

    public final void onAnimationStart(Animator animator) {
        this.f4339b.f4314l.add(animator);
    }
}
