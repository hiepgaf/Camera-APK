package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;

/* compiled from: PG */
/* renamed from: cvb */
final class cvb implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ ValueAnimator f2785a;
    /* renamed from: b */
    private final /* synthetic */ ValueAnimator f2786b;
    /* renamed from: c */
    private final /* synthetic */ cvf f2787c;
    /* renamed from: d */
    private final /* synthetic */ cuw f2788d;

    cvb(cuw cuw, ValueAnimator valueAnimator, ValueAnimator valueAnimator2, cvf cvf) {
        this.f2788d = cuw;
        this.f2785a = valueAnimator;
        this.f2786b = valueAnimator2;
        this.f2787c = cvf;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) this.f2785a.getAnimatedValue()).floatValue();
        float floatValue2 = ((Float) this.f2786b.getAnimatedValue()).floatValue();
        cvf cvf = this.f2787c;
        FilmstripView filmstripView = this.f2788d.f12668f;
        float f = filmstripView.f2349j;
        cvf.m1529a(floatValue, floatValue2, f, f, filmstripView.f2348i.width(), this.f2788d.f12668f.f2348i.height());
    }
}
