package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.camera.optionsbar.OptionsBarView;

/* compiled from: PG */
/* renamed from: gbl */
public final class gbl extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ View f5023a;
    /* renamed from: b */
    private final /* synthetic */ OptionsBarView f5024b;

    public gbl(OptionsBarView optionsBarView, View view) {
        this.f5024b = optionsBarView;
        this.f5023a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f5024b.f20408n = go.aD;
        this.f5024b.removeView((View) jqk.m13102c(this.f5023a));
        this.f5024b.f20401f = null;
    }
}
