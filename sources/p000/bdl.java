package p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import com.google.android.apps.camera.burstchip.BurstChip;

/* compiled from: PG */
/* renamed from: bdl */
public final class bdl implements AnimatorUpdateListener {
    /* renamed from: a */
    private final /* synthetic */ BurstChip f1088a;

    public bdl(BurstChip burstChip) {
        this.f1088a = burstChip;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1088a.f2252i.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        this.f1088a.invalidate();
    }
}
