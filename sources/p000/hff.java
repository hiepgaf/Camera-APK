package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;

/* compiled from: PG */
/* renamed from: hff */
public final class hff extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ CaptureAnimationOverlay f6143a;

    public hff(CaptureAnimationOverlay captureAnimationOverlay) {
        this.f6143a = captureAnimationOverlay;
    }

    public final void onAnimationEnd(Animator animator) {
        CaptureAnimationOverlay captureAnimationOverlay = this.f6143a;
        captureAnimationOverlay.f2431d = null;
        captureAnimationOverlay.f2428a = go.bs;
        this.f6143a.setVisibility(4);
    }
}
