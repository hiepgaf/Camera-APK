package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* renamed from: gys */
final /* synthetic */ class gys implements AnimatorUpdateListener {
    /* renamed from: a */
    private final gyz f5814a;
    /* renamed from: b */
    private final int f5815b;

    gys(gyz gyz, int i) {
        this.f5814a = gyz;
        this.f5815b = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        gyz gyz = this.f5814a;
        int i = this.f5815b;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        gyz.f5829c.setAlpha(floatValue);
        if (!gyz.f5833g) {
            boolean z;
            BottomBarController bottomBarController = gyz.f5827a;
            if (i == go.bo) {
                z = true;
            } else {
                z = false;
            }
            bottomBarController.setProgress(floatValue, z);
        }
    }
}
