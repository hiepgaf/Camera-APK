package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* renamed from: hbx */
public final class hbx extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ hbh f5948a;

    public hbx(hbh hbh) {
        this.f5948a = hbh;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f5948a.f5908b.resetTo(hbf.PHOTO_IDLE);
    }
}
