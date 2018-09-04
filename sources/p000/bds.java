package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.burstchip.BurstChip;

/* compiled from: PG */
/* renamed from: bds */
public final class bds implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ BurstChip f1095a;

    public bds(BurstChip burstChip) {
        this.f1095a = burstChip;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BurstChip burstChip = this.f1095a;
        burstChip.f2244a.setCornerRadius(((burstChip.f2248e + 0.0f) * floatValue) + 0.0f);
        burstChip = this.f1095a;
        burstChip.f2253j = Math.round(((burstChip.f2246c + 0.0f) * floatValue) + 0.0f);
        burstChip = this.f1095a;
        burstChip.f2254k = Math.round((floatValue * (burstChip.f2247d + 0.0f)) + 0.0f);
        this.f1095a.requestLayout();
    }
}
