package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.google.android.apps.camera.legacy.app.burst.editor.grid.BurstImageView;

/* compiled from: PG */
/* renamed from: cms */
public final class cms implements OnPreDrawListener {
    /* renamed from: a */
    private final /* synthetic */ BurstImageView f2173a;
    /* renamed from: b */
    private final /* synthetic */ cmp f2174b;

    public cms(cmp cmp, BurstImageView burstImageView) {
        this.f2174b = cmp;
        this.f2173a = burstImageView;
    }

    public final boolean onPreDraw() {
        cmp cmp = this.f2174b;
        BurstImageView burstImageView = this.f2173a;
        kvr kvr = (kvr) cmp.f2171l.get(((cot) cmp.f2161b.get(cmp.f2172m.f585e)).f12527c.f12515e.f4155h);
        cmp.m1189b(kvr);
        cnb a = cmp.m1191a(burstImageView, kvr);
        cmp.f2166g = a;
        Animator animatorSet = new AnimatorSet();
        cmp.f2163d = animatorSet;
        Animator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat.addUpdateListener(new cmo(kvr, a));
        animatorSet.play(ObjectAnimator.ofFloat(kvr, View.TRANSLATION_X, new float[]{a.f2195b, 0.0f})).with(ObjectAnimator.ofFloat(kvr, View.TRANSLATION_Y, new float[]{a.f2196c, 0.0f})).with(ObjectAnimator.ofFloat(kvr, View.SCALE_X, new float[]{a.f2197d, 1.0f})).with(ObjectAnimator.ofFloat(kvr, View.SCALE_Y, new float[]{a.f2197d, 1.0f})).with(ObjectAnimator.ofFloat(cmp.f2165f, View.ALPHA, new float[]{1.0f, 0.0f})).with(ObjectAnimator.ofFloat(cmp.f2169j, View.ALPHA, new float[]{0.0f, 1.0f})).with(ofFloat);
        animatorSet.setDuration(250);
        animatorSet.setInterpolator(axl.f1008a);
        animatorSet.addListener(new cmt(cmp, burstImageView, kvr));
        animatorSet.start();
        this.f2174b.f2172m.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}
