package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: PG */
/* renamed from: fw */
final class fw extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ fn f4750a;
    /* renamed from: b */
    private final /* synthetic */ View f4751b;

    fw(fn fnVar, View view) {
        this.f4750a = fnVar;
        this.f4751b = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f4750a.m2346a(this.f4751b);
    }
}
