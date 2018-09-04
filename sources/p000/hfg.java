package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.views.CaptureAnimationOverlay;

/* compiled from: PG */
/* renamed from: hfg */
public final class hfg extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ boolean f6144a;
    /* renamed from: b */
    private final /* synthetic */ CaptureAnimationOverlay f6145b;

    public hfg(CaptureAnimationOverlay captureAnimationOverlay, boolean z) {
        this.f6145b = captureAnimationOverlay;
        this.f6144a = z;
    }

    public final void onAnimationCancel(Animator animator) {
        if (!this.f6144a) {
            this.f6145b.f2428a = go.bs;
            this.f6145b.setVisibility(4);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f6144a) {
            this.f6145b.f2428a = go.bs;
            this.f6145b.setVisibility(4);
        }
    }

    public final void onAnimationStart(Animator animator) {
        if (this.f6144a) {
            this.f6145b.f2428a = go.bu;
            this.f6145b.setVisibility(0);
        }
    }
}
