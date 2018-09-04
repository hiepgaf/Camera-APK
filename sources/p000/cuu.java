package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;

/* compiled from: PG */
/* renamed from: cuu */
final class cuu implements AnimatorListener {
    /* renamed from: a */
    private final /* synthetic */ cur f2770a;

    cuu(cur cur) {
        this.f2770a = cur;
    }

    public final void onAnimationCancel(Animator animator) {
        bli.m871d(FilmstripView.f2338a, "[fling] mXScrollAnimatorListener.onAnimationCancel");
    }

    public final void onAnimationEnd(Animator animator) {
        bli.m863a(FilmstripView.f2338a, "[fling] onScrollEnd from mXScrollAnimatorListener.onAnimationEnd");
        this.f2770a.f2762b.m1521a();
    }

    public final void onAnimationRepeat(Animator animator) {
        bli.m863a(FilmstripView.f2338a, "[fling] mXScrollAnimatorListener.onAnimationRepeat");
    }

    public final void onAnimationStart(Animator animator) {
        bli.m863a(FilmstripView.f2338a, "[fling] mXScrollAnimatorListener.onAnimationStart");
    }
}
