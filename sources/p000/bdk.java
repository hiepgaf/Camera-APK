package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.burstchip.BurstChip;

/* compiled from: PG */
/* renamed from: bdk */
public final class bdk implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ BurstChip f1087a;

    public bdk(BurstChip burstChip) {
        this.f1087a = burstChip;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        BurstChip burstChip = this.f1087a;
        float f = burstChip.f2248e;
        burstChip.f2244a.setCornerRadius(f + ((burstChip.f2251h - f) * floatValue));
        burstChip = this.f1087a;
        f = burstChip.f2246c;
        burstChip.f2253j = Math.round(f + ((burstChip.f2249f - f) * floatValue));
        burstChip = this.f1087a;
        f = burstChip.f2247d;
        burstChip.f2254k = Math.round((floatValue * (burstChip.f2250g - f)) + f);
        this.f1087a.requestLayout();
    }
}
