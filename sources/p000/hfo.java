package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: hfo */
public final class hfo extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ hfl f6166a;

    public hfo(hfl hfl) {
        this.f6166a = hfl;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f6166a.f6153f = go.by;
        hfl hfl = this.f6166a;
        hfl.f6154g = hfl.f6149b;
        hfl.f6155h = (float) hfl.f6150c;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6166a.f6153f = go.by;
    }

    public final void onAnimationStart(Animator animator) {
        this.f6166a.f6153f = go.bw;
        this.f6166a.setVisibility(0);
    }
}
