package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: hrh */
public final class hrh extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ hrg f6491a;

    public hrh(hrg hrg) {
        this.f6491a = hrg;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6491a.f6490a.setAlpha(1.0f);
        this.f6491a.f6490a.setVisibility(8);
    }
}
