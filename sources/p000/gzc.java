package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.ui.modeswitch.ViewfinderCover;

/* compiled from: PG */
/* renamed from: gzc */
public final class gzc extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ ViewfinderCover f5852a;

    public gzc(ViewfinderCover viewfinderCover) {
        this.f5852a = viewfinderCover;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f5852a.setVisibility(8);
    }
}
