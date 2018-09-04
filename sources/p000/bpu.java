package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.evcomp.EvCompView;

/* renamed from: bpu */
public final /* synthetic */ class bpu implements AnimatorUpdateListener {
    /* renamed from: a */
    private final float f1423a;
    /* renamed from: b */
    private final float f1424b;
    /* renamed from: c */
    private final EvCompView f1425c;

    public bpu(float f, float f2, EvCompView evCompView) {
        this.f1423a = f;
        this.f1424b = f2;
        this.f1425c = evCompView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z;
        float f = this.f1423a;
        float f2 = this.f1424b;
        EvCompView evCompView = this.f1425c;
        evCompView.f2281c = f + ((f2 - f) * valueAnimator.getAnimatedFraction());
        evCompView.invalidate();
        f2 = valueAnimator.getAnimatedFraction();
        if (f2 != 0.0f) {
            z = true;
        } else {
            z = false;
        }
        evCompView.f2284f = z;
        evCompView.f2282d = f2;
        evCompView.invalidate();
    }
}
