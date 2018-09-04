package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;

/* compiled from: PG */
/* renamed from: hfe */
public final class hfe extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ ValueAnimator f6141a;
    /* renamed from: b */
    private final /* synthetic */ CaptureAnimationOverlay f6142b;

    public hfe(CaptureAnimationOverlay captureAnimationOverlay, ValueAnimator valueAnimator) {
        this.f6142b = captureAnimationOverlay;
        this.f6141a = valueAnimator;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6141a.start();
    }

    public final void onAnimationStart(Animator animator) {
        this.f6142b.f2428a = go.bt;
        this.f6142b.setVisibility(0);
    }
}
