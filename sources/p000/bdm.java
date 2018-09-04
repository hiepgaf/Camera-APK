package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.burstchip.BurstChip;

/* compiled from: PG */
/* renamed from: bdm */
public final class bdm implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ BurstChip f1089a;

    public bdm(BurstChip burstChip) {
        this.f1089a = burstChip;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1089a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
