package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.legacy.app.filmstrip.transition.FilmstripTransitionLayout;

/* compiled from: PG */
/* renamed from: cts */
public final class cts extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ FilmstripTransitionLayout f2712a;

    public cts(FilmstripTransitionLayout filmstripTransitionLayout) {
        this.f2712a = filmstripTransitionLayout;
    }

    public final void onAnimationCancel(Animator animator) {
        ctt ctt = this.f2712a.f2325i;
        if (ctt != null) {
            ctt.mo1099a();
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2712a.setVisibility(4);
        this.f2712a.f2323g.setVisibility(0);
        FilmstripTransitionLayout filmstripTransitionLayout = this.f2712a;
        if (filmstripTransitionLayout.f2321e) {
            filmstripTransitionLayout.f2321e = false;
            return;
        }
        ctt ctt = filmstripTransitionLayout.f2325i;
        if (ctt != null) {
            ctt.mo1100b();
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f2712a.setVisibility(0);
    }
}
