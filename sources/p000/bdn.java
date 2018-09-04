package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.burstchip.BurstChip;

/* compiled from: PG */
/* renamed from: bdn */
public final class bdn extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ BurstChip f1090a;

    public bdn(BurstChip burstChip) {
        this.f1090a = burstChip;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1090a.setVisibility(8);
    }
}
