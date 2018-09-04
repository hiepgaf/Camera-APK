package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* renamed from: ke */
final class ke extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ kg f8245a;

    ke(kg kgVar, View view) {
        this.f8245a = kgVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f8245a.mo2166a();
    }

    public final void onAnimationEnd(Animator animator) {
        this.f8245a.mo2167b();
    }

    public final void onAnimationStart(Animator animator) {
        this.f8245a.mo2168c();
    }
}
