package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.burstchip.BurstChip;

/* compiled from: PG */
/* renamed from: bdr */
public final class bdr extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ BurstChip f1094a;

    public bdr(BurstChip burstChip) {
        this.f1094a = burstChip;
    }

    public final void onAnimationStart(Animator animator) {
        this.f1094a.setVisibility(0);
        this.f1094a.setAlpha(1.0f);
        this.f1094a.f2245b.setAlpha(0);
        this.f1094a.f2245b.setVisible(false, true);
        this.f1094a.f2252i.setAlpha(0);
    }
}
