package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.PointF;
import com.google.android.apps.camera.legacy.app.filmstrip.transition.FilmstripTransitionLayout;

/* compiled from: PG */
/* renamed from: ctr */
public final class ctr implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ FilmstripTransitionLayout f2711a;

    public ctr(FilmstripTransitionLayout filmstripTransitionLayout) {
        this.f2711a = filmstripTransitionLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        FilmstripTransitionLayout filmstripTransitionLayout = this.f2711a;
        jri.m13152b(filmstripTransitionLayout.f2327k);
        float c = filmstripTransitionLayout.f2327k.m1518c(animatedFraction);
        filmstripTransitionLayout.f2322f.setScaleX(c);
        filmstripTransitionLayout.f2322f.setScaleY(c);
        PointF d = filmstripTransitionLayout.f2327k.m1519d(animatedFraction);
        filmstripTransitionLayout.f2322f.setTranslationX(d.x);
        filmstripTransitionLayout.f2322f.setTranslationY(d.y);
        filmstripTransitionLayout.f2322f.m1249a(filmstripTransitionLayout.f2327k.m1517b(animatedFraction));
        filmstripTransitionLayout.m1241a(filmstripTransitionLayout.f2327k.m1516a(animatedFraction));
        this.f2711a.invalidate();
        ctt ctt = this.f2711a.f2325i;
        if (ctt != null) {
            ctt.mo1101c();
        }
    }
}
