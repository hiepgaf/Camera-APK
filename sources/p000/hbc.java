package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;

/* compiled from: PG */
/* renamed from: hbc */
public final class hbc implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ ShutterButton f5890a;

    public hbc(ShutterButton shutterButton) {
        this.f5890a = shutterButton;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5890a.currentScaleFactor = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f5890a.updateButtonRect();
        this.f5890a.invalidateOutline();
        this.f5890a.invalidate();
    }
}
