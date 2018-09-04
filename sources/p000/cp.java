package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: cp */
final class cp extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ co f2534a;

    cp(co coVar) {
        this.f2534a = coVar;
    }

    public final void onAnimationEnd(Animator animator) {
        co coVar = this.f2534a;
        if (coVar.f2222c == animator) {
            coVar.f2222c = null;
        }
    }
}
