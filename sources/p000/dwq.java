package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* renamed from: dwq */
final class dwq extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ boolean f3328a;
    /* renamed from: b */
    private final /* synthetic */ View f3329b;

    dwq(boolean z, View view) {
        this.f3328a = z;
        this.f3329b = view;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f3328a) {
            this.f3329b.setVisibility(8);
            this.f3329b.setAlpha(1.0f);
        }
    }
}
