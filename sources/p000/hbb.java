package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;

/* renamed from: hbb */
public final /* synthetic */ class hbb implements AnimatorUpdateListener {
    /* renamed from: a */
    private final ShutterButton f5889a;

    public hbb(ShutterButton shutterButton) {
        this.f5889a = shutterButton;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f5889a.lambda$runEnableChangeAnimation$0$ShutterButton(valueAnimator);
    }
}
