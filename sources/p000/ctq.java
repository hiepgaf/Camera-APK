package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.legacy.app.filmstrip.transition.FilmstripTransitionLayout;

/* compiled from: PG */
/* renamed from: ctq */
public final class ctq extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ FilmstripTransitionLayout f2710a;

    public ctq(FilmstripTransitionLayout filmstripTransitionLayout) {
        this.f2710a = filmstripTransitionLayout;
    }

    public final void onAnimationCancel(Animator animator) {
        ctt ctt = this.f2710a.f2324h;
        if (ctt != null) {
            ctt.mo1099a();
        }
    }

    public final void onAnimationEnd(Animator animator) {
        FilmstripTransitionLayout filmstripTransitionLayout = this.f2710a;
        if (filmstripTransitionLayout.f2326j) {
            filmstripTransitionLayout.setVisibility(4);
        }
        filmstripTransitionLayout = this.f2710a;
        if (filmstripTransitionLayout.f2320d) {
            filmstripTransitionLayout.f2320d = false;
            return;
        }
        ctt ctt = filmstripTransitionLayout.f2324h;
        if (ctt != null) {
            ctt.mo1100b();
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f2710a.setVisibility(0);
        this.f2710a.f2323g.setVisibility(4);
    }
}
