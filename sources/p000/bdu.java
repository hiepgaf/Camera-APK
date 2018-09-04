package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.burstchip.BurstChip;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: bdu */
public final class bdu extends AnimatorListenerAdapter {
    /* renamed from: a */
    private final /* synthetic */ BurstChip f1097a;

    public bdu(BurstChip burstChip) {
        this.f1097a = burstChip;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1097a.f2252i.setAlpha(Illuminant.kOther);
    }

    public final void onAnimationStart(Animator animator) {
        this.f1097a.setVisibility(0);
        this.f1097a.setAlpha(1.0f);
        this.f1097a.f2245b.setAlpha(0);
        this.f1097a.f2245b.setVisible(false, false);
        this.f1097a.f2252i.setAlpha(0);
    }
}
