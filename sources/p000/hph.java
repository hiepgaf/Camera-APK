package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: hph */
final class hph extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ hpf f6426a;

    hph(hpf hpf) {
        this.f6426a = hpf;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6426a.ai();
    }
}
