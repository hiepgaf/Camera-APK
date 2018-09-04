package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.optionsbar.OptionsBarView;

/* compiled from: PG */
/* renamed from: gbo */
public final class gbo extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ OptionsBarView f5027a;

    public gbo(OptionsBarView optionsBarView) {
        this.f5027a = optionsBarView;
    }

    public final void onAnimationEnd(Animator animator) {
        int a = this.f5027a.f20408n;
        this.f5027a.f20408n = go.aD;
        if (a == go.aF) {
            this.f5027a.m15076a();
        }
    }
}
