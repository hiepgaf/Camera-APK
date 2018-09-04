package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.burstchip.BurstChip;

/* compiled from: PG */
/* renamed from: bdt */
public final class bdt implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ BurstChip f1096a;

    public bdt(BurstChip burstChip) {
        this.f1096a = burstChip;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1096a.f2252i.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
