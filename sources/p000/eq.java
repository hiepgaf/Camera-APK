package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* renamed from: eq */
final class eq extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final View f4075a;
    /* renamed from: b */
    private boolean f4076b = false;

    eq(View view) {
        this.f4075a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        fo.m2352a(this.f4075a, 1.0f);
        if (this.f4076b) {
            this.f4075a.setLayerType(0, null);
        }
    }

    public final void onAnimationStart(Animator animator) {
        if (jm.m4587u(this.f4075a) && this.f4075a.getLayerType() == 0) {
            this.f4076b = true;
            this.f4075a.setLayerType(2, null);
        }
    }
}
