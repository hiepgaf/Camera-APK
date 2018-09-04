package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;

/* compiled from: PG */
/* renamed from: cva */
final class cva implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ cvf f2781a;
    /* renamed from: b */
    private final /* synthetic */ float f2782b;
    /* renamed from: c */
    private final /* synthetic */ float f2783c;
    /* renamed from: d */
    private final /* synthetic */ cuw f2784d;

    cva(cuw cuw, cvf cvf, float f, float f2) {
        this.f2784d = cuw;
        this.f2781a = cvf;
        this.f2782b = f;
        this.f2783c = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        FilmstripView filmstripView = this.f2784d.f12668f;
        float f = filmstripView.f2349j;
        filmstripView.f2349j = floatValue;
        this.f2781a.m1530a(this.f2782b, this.f2783c, floatValue / f, filmstripView.f2348i.width(), this.f2784d.f12668f.f2348i.height());
    }
}
