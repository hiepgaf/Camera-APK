package com.google.android.apps.camera.ui.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import p000.bli;
import p000.go;
import p000.hfd;
import p000.hfe;
import p000.hff;
import p000.hfg;

/* compiled from: PG */
public class CaptureAnimationOverlay extends View {
    /* renamed from: a */
    public int f2428a = go.bs;
    /* renamed from: b */
    public final RectF f2429b = new RectF();
    /* renamed from: c */
    public final Paint f2430c = new Paint();
    /* renamed from: d */
    public AnimatorSet f2431d;
    /* renamed from: e */
    public AnimatorSet f2432e;
    /* renamed from: f */
    private final Interpolator f2433f;
    /* renamed from: g */
    private final Interpolator f2434g;
    /* renamed from: h */
    private final Interpolator f2435h;
    /* renamed from: i */
    private final AnimatorUpdateListener f2436i;

    static {
        bli.m862a("CaptureAnimOverlay");
    }

    public CaptureAnimationOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2430c.setColor(-16777216);
        this.f2433f = new LinearInterpolator();
        this.f2434g = AnimationUtils.loadInterpolator(getContext(), 17563661);
        this.f2435h = AnimationUtils.loadInterpolator(getContext(), 17563663);
        this.f2436i = new hfd(this);
    }

    /* renamed from: a */
    public final void m1336a(boolean z) {
        Animator ofFloat;
        AnimatorSet animatorSet = this.f2432e;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f2432e.cancel();
        }
        if (z) {
            ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 0.6f});
            ofFloat.setDuration(167);
            ofFloat.setInterpolator(this.f2434g);
        } else {
            ofFloat = ValueAnimator.ofFloat(new float[]{0.6f, 0.0f});
            ofFloat.setDuration(133);
            ofFloat.setInterpolator(this.f2435h);
        }
        ofFloat.addUpdateListener(this.f2436i);
        this.f2432e = new AnimatorSet();
        this.f2432e.play(ofFloat);
        this.f2432e.addListener(new hfg(this, z));
        this.f2432e.start();
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public void onDraw(Canvas canvas) {
        if (this.f2428a != go.bs) {
            canvas.drawRect(this.f2429b, this.f2430c);
            canvas.clipRect(this.f2429b);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f2429b.set((float) i, (float) i2, (float) i3, (float) i4);
    }

    /* renamed from: a */
    public final void m1335a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.76f, 0.76f});
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.76f, 0.0f});
        ofFloat.setDuration(66);
        ofFloat2.setDuration(166);
        ofFloat.addUpdateListener(this.f2436i);
        ofFloat2.addUpdateListener(this.f2436i);
        ofFloat.setInterpolator(this.f2433f);
        ofFloat2.setInterpolator(this.f2433f);
        ofFloat.addListener(new hfe(this, ofFloat2));
        ofFloat2.addListener(new hff(this));
        ofFloat.start();
    }
}
