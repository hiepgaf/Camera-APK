package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;

/* compiled from: PG */
/* renamed from: cux */
final class cux implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ cuw f2773a;

    cux(cuw cuw) {
        this.f2773a = cuw;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        FilmstripView filmstripView = this.f2773a.f12668f;
        if (filmstripView.f2352m[2] != null) {
            filmstripView.f2349j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f2773a.f12668f.invalidate();
        }
    }
}
