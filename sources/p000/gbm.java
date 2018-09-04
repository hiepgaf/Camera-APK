package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.optionsbar.OptionsBarView;

/* compiled from: PG */
/* renamed from: gbm */
final class gbm extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ OptionsBarView f5025a;

    gbm(OptionsBarView optionsBarView) {
        this.f5025a = optionsBarView;
    }

    public final void onAnimationStart(Animator animator) {
        this.f5025a.setVisibility(0);
    }
}
