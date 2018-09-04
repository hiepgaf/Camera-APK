package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* compiled from: PG */
/* renamed from: btb */
public final class btb extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ FocusIndicatorView f1519a;

    public btb(FocusIndicatorView focusIndicatorView) {
        this.f1519a = focusIndicatorView;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1519a.f20362m = null;
    }

    public final void onAnimationStart(Animator animator) {
        this.f1519a.f20362m = animator;
    }
}
