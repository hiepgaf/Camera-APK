package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;

/* compiled from: PG */
/* renamed from: hfd */
public final class hfd implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ CaptureAnimationOverlay f6140a;

    public hfd(CaptureAnimationOverlay captureAnimationOverlay) {
        this.f6140a = captureAnimationOverlay;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f6140a.f2430c.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
        this.f6140a.invalidate();
    }
}
