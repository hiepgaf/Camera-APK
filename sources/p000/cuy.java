package p000;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;

/* compiled from: PG */
/* renamed from: cuy */
final class cuy implements AnimatorListener {
    /* renamed from: a */
    private final /* synthetic */ cuw f2774a;

    cuy(cuw cuw) {
        this.f2774a = cuw;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        FilmstripView filmstripView = this.f2774a.f12668f;
        float f = filmstripView.f2349j;
        cst cst;
        if (f == 1.0f) {
            filmstripView.f2360u = false;
            cst = filmstripView.f2353n;
            if (cst != null) {
                filmstripView.m1274d();
                cst.m8720d();
            }
        } else if (f == 0.7f) {
            bli.m863a(FilmstripView.f2338a, "onEnterFilmstrip()");
            cst = filmstripView.f2353n;
            if (cst != null) {
                filmstripView.m1274d();
                cst.m8719c();
            }
        }
        this.f2774a.f12668f.m1283m();
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        FilmstripView filmstripView = this.f2774a.f12668f;
        float f = filmstripView.f2349j;
        if (f != 1.0f) {
            if (f == 0.7f && filmstripView.f2353n != null) {
                filmstripView.m1274d();
            }
        } else if (filmstripView.f2353n != null) {
            filmstripView.m1274d();
        }
    }
}
