package com.google.android.apps.camera.ui.shutterbutton;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageButton;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.stats.CameraActivitySession;
import com.google.android.libraries.smartburst.filterfw.filterpacks.video.VideoProviderSource;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.bli;
import p000.epf;
import p000.eph;
import p000.hbb;
import p000.hbc;
import p000.hbd;
import p000.hbe;
import p000.hbf;
import p000.hbg;
import p000.hbh;
import p000.hbi;
import p000.hbj;
import p000.hbk;
import p000.hbl;
import p000.hbm;
import p000.hbn;
import p000.hbo;
import p000.hbp;
import p000.hbq;
import p000.hbr;
import p000.hbs;
import p000.hbt;
import p000.hbu;
import p000.hbv;
import p000.hbw;
import p000.hbx;
import p000.hby;
import p000.hbz;
import p000.hch;
import p000.hcj;
import p000.hck;
import p000.hcl;
import p000.hin;
import p000.ilb;
import p000.ilp;
import p000.ilq;
import p000.iya;
import p000.jri;
import p000.kda;
import p000.ken;
import p000.ks;

/* compiled from: PG */
public class ShutterButton extends ImageButton {
    public static final float BUTTON_CLICK_SPLASH_FACTOR = 1.06f;
    public static final int BUTTON_CLICK_SPLASH_IN_DURATION_MS = 250;
    public static final int BUTTON_CLICK_SPLASH_OUT_DURATION_MS = 100;
    public static final int BUTTON_DISABLED_DELAY_MS = 500;
    public static final int DISABLED_FILTER_COLOR_VALUE = 165;
    public static final int LONG_PRESS_DURATION_MS = 350;
    public static final int PHOTO_DISABLE_ANIMATION_DURATION_MS = 150;
    public static final String TAG = bli.m862a("ShutterButton");
    public int buttonCenterX;
    public int buttonCenterY;
    public RectF buttonRect;
    public int buttonSize;
    public boolean clickEnabled = true;
    public ilb clickEnabledObservable = new ilb(Boolean.valueOf(this.clickEnabled));
    public Paint currentInnerPortraitRingPaint;
    public Paint currentMainButtonPaint;
    public Paint currentOuterPortraitRingPaint;
    public Paint currentPhotoCirclePaint;
    public Paint currentRipplePaint;
    public float currentScaleFactor;
    public hck currentSpec;
    public Paint currentVideoCirclePaint;
    public int disabledFilterGreyValue;
    public ValueAnimator enableStateChangeAnimator;
    public final ilp filteredClickEnabledObservable = ilq.m3831b(this.clickEnabledObservable);
    public hcl gestureDetector;
    public final AtomicBoolean isLongPressInProgress = new AtomicBoolean(false);
    public boolean isVideoButtonAnimating;
    public hch listener;
    public AnimatorSet modeTransitionAnimatorSet;
    public boolean oldPressed;
    public hbe onDrawListener;
    public hin touchCoordinate;
    public int videoButtonStopSquareHalfSize;
    public Paint videoButtonStopSquarePaint;

    public ShutterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize();
    }

    private void animateMainButton(hbf hbf, hbh hbh) {
        cancelModeTransitionAnimations(true);
        hcj a = hcj.m3029a(hbf, getResources());
        while (true) {
            hbh.f5909c = hbh.f5908b.getSpec();
            hbh.f5910d = a;
            hbh.f5911e = hbh.m3011a(hbh.f5909c.mo1709h(), a.mo1709h(), new hbi(hbh));
            hbh.f5912f = hbh.m3011a(hbh.f5909c.mo1717p(), a.mo1717p(), new hbj(hbh));
            hbh.f5913g = hbh.m3011a(hbh.f5909c.mo1715n(), a.mo1715n(), new hbp(hbh));
            hbh.f5915i = hbh.m3011a(hbh.f5909c.mo1704c(), a.mo1704c(), new hbq(hbh));
            hbh.f5916j = hbh.m3011a(0, 1, new hbr(hbh, a));
            hbh.f5914h = hbh.m3011a(hbh.f5909c.mo1707f(), a.mo1707f(), new hbs(hbh));
            hbh.f5917k = hbh.m3011a(hbh.f5909c.mo1712k(), a.mo1712k(), new hbt(hbh));
            hbh.f5918l = hbh.m3011a(0, 1, new hbu(hbh, a));
            hbh.f5919m = hbh.m3011a(hbh.f5909c.mo1713l(), a.mo1713l(), new hbv(hbh));
            hbh.f5920n = hbh.m3011a(0, 1, new hbw(hbh, a));
            hbh.f5922p = hbh.m3011a(hbh.f5909c.mo1710i(), a.mo1710i(), new hbk(hbh));
            hbh.f5921o = hbh.m3011a(hbh.f5909c.mo1711j(), a.mo1711j(), new hbl(hbh));
            hbh.f5923q = hbh.m3011a(hbh.f5909c.mo1714m(), a.mo1714m(), new hbm(hbh));
            hbh.f5924r = hbh.m3011a(0, 1, new hbn(hbh));
            hbh.f5925s = ken.m13457a(hbh.f5924r, hbh.f5913g, hbh.f5911e, hbh.f5914h, hbh.f5912f, hbh.f5915i, hbh.f5916j, hbh.f5917k, hbh.f5919m, hbh.f5920n, hbh.f5918l, hbh.f5922p, hbh.f5921o);
            switch (hbh.f5909c.mo1706e().ordinal()) {
                case 0:
                    switch (hbh.f5910d.mo1706e().ordinal()) {
                        case 1:
                            hbh.m3013a(hbh.f5914h).m3016a(50).m3019d();
                            hbh.m3013a(hbh.f5917k).m3016a(50).m3017b();
                            break;
                        case 2:
                            hbh.m3013a(hbh.f5916j).m3016a(VideoProviderSource.TIMESTAMP_FILTER_SIZE);
                            hbh.m3013a(hbh.f5919m).m3016a(VideoProviderSource.TIMESTAMP_FILTER_SIZE);
                            hbh.m3013a(hbh.f5917k).m3016a(VideoProviderSource.TIMESTAMP_FILTER_SIZE);
                            hbh.m3013a(hbh.f5911e).m3016a(VideoProviderSource.TIMESTAMP_FILTER_SIZE);
                            hbh.m3013a(hbh.f5922p).m3016a(400);
                            hbh.m3013a(hbh.f5921o).m3016a(600);
                            hbh.m3013a(hbh.f5923q).m3016a(800);
                            break;
                        case 4:
                            hbh.f5908b.resetTo(hbf.PHOTO_PRESSED);
                            a = hbh.f5910d;
                            continue;
                            continue;
                        case 5:
                            hbh.m3013a(hbh.f5911e).m3016a(400);
                            hbh.m3013a(hbh.f5914h).m3019d().m3016a(LONG_PRESS_DURATION_MS).m3015a();
                            hbh.m3013a(hbh.f5912f).m3016a(LONG_PRESS_DURATION_MS).m3015a();
                            break;
                        case 6:
                            hbh.m3013a(hbh.f5915i).m3016a(500);
                            hbh.m3013a(hbh.f5916j).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS);
                            hbh.f5908b.currentSpec.f5963c = hbh.f5910d.mo1703b();
                            break;
                        case 8:
                            hbh.f5908b.setClickEnabled(false);
                            hbh.m3013a(hbh.f5911e).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).m3019d();
                            hbh.m3013a(hbh.f5916j).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).m3019d();
                            hbh.m3013a(hbh.f5915i).m3016a(500);
                            hbh.f5908b.currentSpec.f5963c = hbh.f5910d.mo1703b();
                            break;
                        case 9:
                            hbh.m3013a(hbh.f5911e).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).m3019d().m3020e();
                            hbh.m3013a(hbh.f5916j).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).m3019d();
                            hbh.m3013a(hbh.f5915i).m3016a(500);
                            hbh.f5908b.currentSpec.f5963c = hbh.f5910d.mo1703b();
                            break;
                        default:
                            hbh.m3014a();
                            break;
                    }
                case 1:
                    switch (hbh.f5910d.mo1706e().ordinal()) {
                        case 0:
                            hbh.m3013a(hbh.f5914h).m3016a(50).m3019d();
                            hbh.m3013a(hbh.f5917k).m3016a(50).m3017b();
                            break;
                        case 4:
                            hbh.f5919m.setRepeatCount(9);
                            hbh.f5919m.setRepeatMode(1);
                            hbh.m3013a(hbh.f5919m).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS);
                            hbh.m3013a(hbh.f5917k).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).m3019d().m3017b();
                            hbh.m3013a(hbh.f5920n).m3016a(1967).m3019d();
                            break;
                        default:
                            hbh.f5908b.resetTo(hbf.PHOTO_IDLE);
                            a = hbh.f5910d;
                            continue;
                            continue;
                    }
                case 2:
                    switch (hbh.f5910d.mo1706e().ordinal()) {
                        case 0:
                            hbh.m3013a(hbh.f5916j).m3016a(VideoProviderSource.TIMESTAMP_FILTER_SIZE);
                            hbh.m3013a(hbh.f5919m).m3016a(VideoProviderSource.TIMESTAMP_FILTER_SIZE);
                            hbh.m3013a(hbh.f5917k).m3016a(VideoProviderSource.TIMESTAMP_FILTER_SIZE);
                            hbh.m3013a(hbh.f5911e).m3016a(VideoProviderSource.TIMESTAMP_FILTER_SIZE);
                            hbh.m3013a(hbh.f5922p).m3016a(400);
                            hbh.m3013a(hbh.f5921o).m3016a(600);
                            hbh.m3013a(hbh.f5923q).m3016a(800);
                            break;
                        case 3:
                            hbh.m3013a(hbh.f5917k).m3016a(80);
                            hbh.m3013a(hbh.f5919m).m3016a(80).m3017b();
                            hbh.m3013a(hbh.f5911e).m3016a(80);
                            hbh.m3013a(hbh.f5922p).m3016a(80);
                            hbh.m3013a(hbh.f5921o).m3016a(80);
                            break;
                        case 5:
                            hbh.m3013a(hbh.f5911e).m3016a(400);
                            hbh.m3013a(hbh.f5914h).m3019d().m3016a(LONG_PRESS_DURATION_MS).m3015a();
                            hbh.m3013a(hbh.f5912f).m3016a(LONG_PRESS_DURATION_MS).m3015a();
                            hbh.m3013a(hbh.f5922p).m3019d().m3016a(LONG_PRESS_DURATION_MS).m3015a();
                            hbh.m3013a(hbh.f5921o).m3019d().m3016a(LONG_PRESS_DURATION_MS).m3015a();
                            break;
                        case 6:
                            hbh.m3013a(hbh.f5915i).m3016a(500);
                            hbh.m3013a(hbh.f5916j).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS);
                            hbh.f5908b.currentSpec.f5963c = hbh.f5910d.mo1703b();
                            break;
                        default:
                            hbh.m3014a();
                            break;
                    }
                case 3:
                    switch (hbh.f5910d.mo1706e().ordinal()) {
                        case 0:
                        case 5:
                            break;
                        case 2:
                            hbh.m3013a(hbh.f5919m).m3016a(VideoProviderSource.TIMESTAMP_FILTER_SIZE);
                            hbh.m3013a(hbh.f5917k).m3016a(VideoProviderSource.TIMESTAMP_FILTER_SIZE);
                            hbh.m3013a(hbh.f5911e).m3016a(VideoProviderSource.TIMESTAMP_FILTER_SIZE);
                            hbh.m3013a(hbh.f5922p).m3016a(400);
                            hbh.m3013a(hbh.f5921o).m3016a(600);
                            hbh.m3013a(hbh.f5923q).m3016a(800);
                            break;
                        default:
                            hbh.f5908b.resetTo(hbf.PORTRAIT_IDLE);
                            a = hbh.f5910d;
                            continue;
                            continue;
                    }
                case 4:
                    switch (hbh.f5910d.mo1706e().ordinal()) {
                        case 0:
                            hbh.m3013a(hbh.f5917k).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).m3019d().m3017b();
                            hbh.m3013a(hbh.f5920n).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).m3019d();
                            break;
                        default:
                            hbh.m3014a();
                            break;
                    }
                case 5:
                    switch (hbh.f5910d.mo1706e().ordinal()) {
                        case 0:
                            hbh.m3013a(hbh.f5911e).m3016a(400);
                            hbh.m3013a(hbh.f5914h).m3019d().m3016a(LONG_PRESS_DURATION_MS);
                            hbh.m3013a(hbh.f5912f).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS);
                            break;
                        case 2:
                            hbh.m3013a(hbh.f5911e).m3016a(400);
                            hbh.m3013a(hbh.f5914h).m3019d().m3016a(LONG_PRESS_DURATION_MS);
                            hbh.m3013a(hbh.f5912f).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS);
                            hbh.m3013a(hbh.f5922p).m3016a(400);
                            hbh.m3013a(hbh.f5921o).m3016a(600);
                            hbh.m3013a(hbh.f5923q).m3016a(800);
                            break;
                        case 10:
                            hbz a2 = hbh.m3013a(hbh.f5912f).m3016a(LONG_PRESS_DURATION_MS);
                            a2.f5950a.setInterpolator(a2.f5951b.f5928v);
                            a2.m3020e();
                            a2 = hbh.m3013a(hbh.f5913g).m3016a(500);
                            a2.f5950a.setInterpolator(a2.f5951b.f5927u);
                            break;
                        default:
                            hbh.m3014a();
                            break;
                    }
                case 6:
                    switch (hbh.f5910d.mo1706e().ordinal()) {
                        case 0:
                            hbh.m3013a(hbh.f5911e).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).m3019d().m3020e();
                            hbh.m3013a(hbh.f5916j).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).m3019d();
                            hbh.m3013a(hbh.f5915i).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).m3018c();
                            break;
                        case 2:
                            hbh.m3013a(hbh.f5911e).m3016a(400);
                            hbh.m3013a(hbh.f5914h).m3019d().m3016a(LONG_PRESS_DURATION_MS);
                            hbh.m3013a(hbh.f5912f).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS);
                            hbh.m3013a(hbh.f5922p).m3016a(400);
                            hbh.m3013a(hbh.f5921o).m3016a(600);
                            hbh.m3013a(hbh.f5923q).m3016a(800);
                            break;
                        default:
                            hbh.m3014a();
                            break;
                    }
                case 8:
                    switch (hbh.f5910d.mo1706e().ordinal()) {
                        case 0:
                            hbh.f5908b.setClickEnabled(true);
                            hbh.m3013a(hbh.f5911e).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).m3019d();
                            hbh.m3013a(hbh.f5916j).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).m3019d();
                            hbh.m3013a(hbh.f5915i).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).m3018c();
                            break;
                        case 9:
                            hbh.f5908b.setClickEnabled(true);
                            hbh.m3013a(hbh.f5916j).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS);
                            break;
                        default:
                            hbh.m3014a();
                            break;
                    }
                case 9:
                    switch (hbh.f5910d.mo1706e().ordinal()) {
                        case 0:
                            hbh.m3013a(hbh.f5911e).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).m3019d().m3020e();
                            hbh.m3013a(hbh.f5916j).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).m3019d();
                            hbh.m3013a(hbh.f5915i).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).m3018c();
                            break;
                        case 5:
                            hbh.m3013a(hbh.f5912f).m3016a(500);
                            hbh.m3013a(hbh.f5918l).m3016a(200).m3020e();
                            hbh.m3013a(hbh.f5915i).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).m3018c();
                            break;
                        case 7:
                            hbh.m3013a(hbh.f5918l).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).m3019d();
                            hbh.m3013a(hbh.f5912f).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).m3019d();
                            hbh.m3013a(hbh.f5915i).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS).m3020e();
                            hbh.f5915i.addListener(new hbx(hbh));
                            break;
                        default:
                            hbh.m3014a();
                            break;
                    }
                case 10:
                    switch (hbh.f5910d.mo1706e().ordinal()) {
                        case 5:
                            hbh.m3013a(hbh.f5912f).m3016a(LONG_PRESS_DURATION_MS).m3020e();
                            hbh.m3013a(hbh.f5913g).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS);
                            break;
                        case 9:
                            hbh.m3013a(hbh.f5913g).m3016a(BUTTON_CLICK_SPLASH_IN_DURATION_MS);
                            hbh.m3013a(hbh.f5918l).m3016a(500).m3020e();
                            hbh.m3013a(hbh.f5915i).m3016a(500);
                            hbh.f5908b.currentSpec.f5963c = hbh.f5910d.mo1703b();
                            break;
                        default:
                            hbh.m3014a();
                            break;
                    }
                default:
                    hbh.m3014a();
                    break;
            }
            hbh.f5924r.setDuration(((Long) Collections.max(new kda(hbh.f5925s, hbo.f17636a))).longValue());
            hbh.f5924r.addListener(new hby(hbh));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(hbh.f5925s);
            this.modeTransitionAnimatorSet = animatorSet;
            this.modeTransitionAnimatorSet.start();
            return;
        }
    }

    public void animateToScale(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.currentScaleFactor, getDefaultScale() * f});
        ofFloat.addUpdateListener(new hbc(this));
        ofFloat.setDuration(250);
        ofFloat.setInterpolator(new ks());
        ofFloat.start();
    }

    public void buildDrawingCache(boolean z) {
        invalidate();
        super.buildDrawingCache(z);
    }

    void cancelModeTransitionAnimations(boolean z) {
        AnimatorSet animatorSet = this.modeTransitionAnimatorSet;
        if (animatorSet != null) {
            if (z) {
                animatorSet.end();
            }
            this.modeTransitionAnimatorSet.cancel();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = motionEvent.getX() >= 0.0f ? motionEvent.getY() >= 0.0f ? motionEvent.getX() < ((float) getWidth()) ? motionEvent.getY() >= ((float) getHeight()) : true : true : true;
        if (!(motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 2) || z) {
            hcl hcl;
            if (z) {
                hcl = this.gestureDetector;
                synchronized (hcl.f5977a) {
                    if (hcl.f5982f != null) {
                        hcl.f5980d.removeCallbacks(hcl.f5983g);
                    }
                    hcl.f5982f = null;
                }
            } else {
                hcl = this.gestureDetector;
                synchronized (hcl.f5977a) {
                    if (motionEvent.getActionMasked() == 0) {
                        if (hcl.f5982f != null) {
                        } else {
                            hcl.f5982f = MotionEvent.obtain(motionEvent);
                            hcl.f5980d.postDelayed(hcl.f5983g, hcl.f5979c);
                        }
                    } else if (motionEvent.getActionMasked() == 1) {
                        if (hcl.f5982f != null) {
                            hcl.f5980d.removeCallbacks(hcl.f5983g);
                        }
                        hcl.f5982f = null;
                    }
                }
            }
            if (this.isLongPressInProgress.compareAndSet(true, false)) {
                hch hch = this.listener;
                if (hch != null) {
                    hch.onShutterButtonLongPressRelease();
                }
            }
        }
        if (motionEvent.getActionMasked() == 1) {
            this.touchCoordinate = new hin(motionEvent.getX(), motionEvent.getY(), (float) getMeasuredWidth(), (float) getMeasuredHeight());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        boolean isPressed = isPressed();
        if (isPressed != this.oldPressed) {
            hch hch = this.listener;
            if (hch != null) {
                hch.onShutterButtonPressedStateChanged(isPressed);
            }
            this.oldPressed = isPressed;
        }
    }

    public ilp getClickEnabledObservable() {
        return this.filteredClickEnabledObservable;
    }

    public float getDefaultScale() {
        return 1.0f;
    }

    public Drawable getDrawable() {
        return getBackground();
    }

    public hbf getMode() {
        return this.currentSpec.m3054c();
    }

    public hcj getSpec() {
        return this.currentSpec.m3048a();
    }

    private void initialize() {
        setLayerType(2, null);
        this.gestureDetector = new hcl(new hbd(this));
        initializeButtonDimensions();
        this.currentMainButtonPaint = new Paint();
        this.currentMainButtonPaint.setAntiAlias(true);
        this.currentMainButtonPaint.setColor(-1);
        this.currentPhotoCirclePaint = new Paint(this.currentMainButtonPaint);
        this.currentPhotoCirclePaint.setColor(getResources().getColor(R.color.camera_mode_idle_color, null));
        this.currentInnerPortraitRingPaint = new Paint(this.currentMainButtonPaint);
        this.currentInnerPortraitRingPaint.setColor(getResources().getColor(R.color.portrait_mode_inner_color, null));
        this.currentOuterPortraitRingPaint = new Paint(this.currentMainButtonPaint);
        this.currentOuterPortraitRingPaint.setColor(getResources().getColor(R.color.portrait_mode_outer_color, null));
        this.disabledFilterGreyValue = Illuminant.kOther;
        this.currentRipplePaint = new Paint(this.currentMainButtonPaint);
        this.currentRipplePaint.setColor(getResources().getColor(R.color.camera_mode_color, null));
        this.videoButtonStopSquarePaint = new Paint(this.currentMainButtonPaint);
        this.currentVideoCirclePaint = new Paint(this.currentMainButtonPaint);
        this.currentVideoCirclePaint.setColor(getResources().getColor(R.color.video_mode_color, null));
        this.currentSpec = hcj.m3029a(hbf.PHOTO_IDLE, getResources()).m3047q();
        resetShutterButton();
        this.buttonRect = new RectF();
        this.currentScaleFactor = getDefaultScale();
        setOutlineProvider(new hbg(this));
        updateContentDescription(this.currentSpec.m3054c());
        setClickEnabled(false);
    }

    protected void initializeButtonDimensions() {
        this.buttonSize = getResources().getDimensionPixelSize(R.dimen.bottom_bar_content_size);
        this.videoButtonStopSquareHalfSize = getResources().getDimensionPixelSize(R.dimen.video_button_stop_square_size) / 2;
    }

    public boolean isClickEnabled() {
        return this.clickEnabled;
    }

    private boolean isVideoMode(hbf hbf) {
        return hbf == hbf.VIDEO_IDLE || hbf == hbf.CONFIRM_ENABLED || hbf == hbf.CONFIRM_DISABLED || hbf == hbf.VIDEO_RECORDING;
    }

    public final /* synthetic */ void lambda$runEnableChangeAnimation$0$ShutterButton(ValueAnimator valueAnimator) {
        this.disabledFilterGreyValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        updateShutterButtonColor();
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        Paint paint = this.currentPhotoCirclePaint;
        Integer num = this.currentSpec.f5961a;
        if (num == null) {
            throw new IllegalStateException("Property \"photoCircleColor\" has not been set");
        }
        paint.setColor(num.intValue());
        this.currentPhotoCirclePaint.setAlpha(this.currentSpec.m3056d());
        this.currentInnerPortraitRingPaint.setColor(getResources().getColor(R.color.portrait_mode_inner_color, null));
        this.currentOuterPortraitRingPaint.setColor(getResources().getColor(R.color.portrait_mode_outer_color, null));
        paint = this.currentRipplePaint;
        num = this.currentSpec.f5965e;
        if (num == null) {
            throw new IllegalStateException("Property \"ripplePaintAlpha\" has not been set");
        }
        paint.setAlpha(num.intValue());
        paint = this.currentVideoCirclePaint;
        num = this.currentSpec.f5962b;
        if (num == null) {
            throw new IllegalStateException("Property \"videoCircleColor\" has not been set");
        }
        paint.setColor(num.intValue());
        paint = this.currentMainButtonPaint;
        num = this.currentSpec.f5967g;
        if (num == null) {
            throw new IllegalStateException("Property \"mainButtonColor\" has not been set");
        }
        paint.setColor(num.intValue());
        if (!isEnabled() && (this.currentSpec.m3054c() == hbf.PHOTO_IDLE || this.currentSpec.m3054c() == hbf.PORTRAIT_IDLE)) {
            updateShutterButtonColor();
        }
        hbe hbe = this.onDrawListener;
        if (hbe != null) {
            iya iya;
            CameraActivitySession cameraActivitySession = hbe.f5892a.f20284j;
            if (cameraActivitySession.f12312i == 0) {
                iya = cameraActivitySession.m;
                cameraActivitySession.f12312i = SystemClock.elapsedRealtimeNanos();
                cameraActivitySession.m1326a("Shutter button first draw", cameraActivitySession.f12312i);
            }
            epf a = epf.m1944a();
            if (a.f4007g.m1945a(eph.f4012f)) {
                a.f4005e = SystemClock.elapsedRealtimeNanos();
            }
            if (this.clickEnabled) {
                cameraActivitySession = this.onDrawListener.f5892a.f20284j;
                if (cameraActivitySession.f12313j == 0) {
                    iya = cameraActivitySession.m;
                    cameraActivitySession.f12313j = SystemClock.elapsedRealtimeNanos();
                    cameraActivitySession.m1326a("Shutter button first enabled", cameraActivitySession.f12313j);
                }
                a = epf.m1944a();
                if (a.f4007g.m1945a(eph.f4013g)) {
                    a.f4006f = SystemClock.elapsedRealtimeNanos();
                }
            }
        }
        canvas.drawCircle((float) this.buttonCenterX, (float) this.buttonCenterY, ((float) this.currentSpec.m3064h()) * this.currentScaleFactor, this.currentMainButtonPaint);
        if (this.currentSpec.m3062g() > this.currentSpec.m3058e()) {
            canvas.drawCircle((float) this.buttonCenterX, (float) this.buttonCenterY, ((float) this.currentSpec.m3062g()) * this.currentScaleFactor, this.currentOuterPortraitRingPaint);
        }
        if (this.currentSpec.m3060f() > this.currentSpec.m3058e()) {
            canvas.drawCircle((float) this.buttonCenterX, (float) this.buttonCenterY, ((float) this.currentSpec.m3060f()) * this.currentScaleFactor, this.currentInnerPortraitRingPaint);
        }
        if (this.currentSpec.m3056d() > 0) {
            canvas.drawCircle((float) this.buttonCenterX, (float) this.buttonCenterY, ((float) this.currentSpec.m3058e()) * this.currentScaleFactor, this.currentPhotoCirclePaint);
        }
        Boolean bool = this.currentSpec.f5964d;
        if (bool == null) {
            throw new IllegalStateException("Property \"animateRippleEffect\" has not been set");
        }
        float f;
        if (bool.booleanValue()) {
            f = (float) this.buttonCenterX;
            float f2 = (float) this.buttonCenterY;
            Integer num2 = this.currentSpec.f5966f;
            if (num2 == null) {
                throw new IllegalStateException("Property \"rippleRadius\" has not been set");
            }
            canvas.drawCircle(f, f2, ((float) num2.intValue()) * this.currentScaleFactor, this.currentRipplePaint);
        }
        if (isVideoMode(this.currentSpec.m3054c()) || this.isVideoButtonAnimating) {
            if (this.currentSpec.m3068j() > 0) {
                canvas.drawCircle((float) this.buttonCenterX, (float) this.buttonCenterY, ((float) this.currentSpec.m3068j()) * this.currentScaleFactor, this.currentVideoCirclePaint);
            }
            if (this.currentSpec.m3066i() > 0) {
                f = ((float) this.currentSpec.m3066i()) * this.currentScaleFactor;
                float f3 = (float) this.buttonCenterX;
                float f4 = (float) this.buttonCenterY;
                canvas.drawRect(f3 - f, f4 - f, f3 + f, f4 + f, this.videoButtonStopSquarePaint);
            }
        }
        hck hck = this.currentSpec;
        Drawable drawable = hck.f5963c;
        if (drawable != null) {
            drawable.setBounds(this.buttonCenterX - hck.m3052b(), this.buttonCenterY - this.currentSpec.m3052b(), this.buttonCenterX + this.currentSpec.m3052b(), this.buttonCenterY + this.currentSpec.m3052b());
            drawable.draw(canvas);
        }
    }

    protected void onMeasure(int i, int i2) {
        updateButtonRect();
        int i3 = this.buttonSize;
        setMeasuredDimension(i3, i3);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        this.buttonCenterX = i / 2;
        this.buttonCenterY = i2 / 2;
        updateButtonRect();
    }

    public boolean performClick() {
        if (!this.clickEnabled) {
            return false;
        }
        boolean performClick = super.performClick();
        if (getVisibility() != 0) {
            return performClick;
        }
        hch hch = this.listener;
        if (hch == null) {
            return performClick;
        }
        hin hin = this.touchCoordinate;
        if (hin != null) {
            hch.onShutterTouch(hin);
        }
        this.touchCoordinate = null;
        this.listener.onShutterButtonClick();
        return performClick;
    }

    public void removeListener() {
        this.listener = null;
    }

    private void resetShutterButton() {
        String str = TAG;
        String valueOf = String.valueOf(this.currentSpec.m3054c());
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 41);
        stringBuilder.append("Resetting ShutterButton in current mode :");
        stringBuilder.append(valueOf);
        bli.m863a(str, stringBuilder.toString());
        cancelModeTransitionAnimations(false);
        this.currentSpec = hcj.m3029a(this.currentSpec.m3054c(), getResources()).m3047q();
        invalidate();
    }

    public void resetTo(hbf hbf) {
        this.currentSpec.m3050a(hbf);
        resetShutterButton();
    }

    private void runEnableChangeAnimation(boolean z) {
        int i;
        ValueAnimator valueAnimator = this.enableStateChangeAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z) {
            i = Illuminant.kOther;
        } else {
            i = DISABLED_FILTER_COLOR_VALUE;
        }
        this.enableStateChangeAnimator = ValueAnimator.ofInt(new int[]{this.disabledFilterGreyValue, i});
        this.enableStateChangeAnimator.setDuration(150);
        this.enableStateChangeAnimator.addUpdateListener(new hbb(this));
        if (!z) {
            this.enableStateChangeAnimator.setStartDelay(500);
        }
        this.enableStateChangeAnimator.start();
    }

    public void runPressedStateAnimation(boolean z, hbh hbh) {
        String str = TAG;
        StringBuilder stringBuilder = new StringBuilder(52);
        stringBuilder.append("Running pressed state animation with isPressed=");
        stringBuilder.append(z);
        bli.m863a(str, stringBuilder.toString());
        if (!z) {
            hbh.m3012a(1.0f, BUTTON_CLICK_SPLASH_IN_DURATION_MS).start();
            if (this.currentSpec.m3054c() == hbf.PHOTO_PRESSED) {
                setMode(hbf.PHOTO_IDLE, hbh);
            } else if (this.currentSpec.m3054c() == hbf.PORTRAIT_PRESSED) {
                setMode(hbf.PORTRAIT_IDLE, hbh);
            }
        } else if (isEnabled() && ((Boolean) getClickEnabledObservable().mo2860b()).booleanValue()) {
            hbh.m3012a(1.06f, 100).start();
            if (this.currentSpec.m3054c() == hbf.PHOTO_IDLE) {
                setMode(hbf.PHOTO_PRESSED, hbh);
            } else if (this.currentSpec.m3054c() == hbf.PORTRAIT_IDLE) {
                setMode(hbf.PORTRAIT_PRESSED, hbh);
            }
        } else {
            str = TAG;
            boolean isEnabled = isEnabled();
            String valueOf = String.valueOf(getClickEnabledObservable().mo2860b());
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 81);
            stringBuilder2.append("Ignoring pressed state animation. Button enabled: ");
            stringBuilder2.append(isEnabled);
            stringBuilder2.append(", clickEnabledObservable: ");
            stringBuilder2.append(valueOf);
            bli.m871d(str, stringBuilder2.toString());
        }
    }

    public void setClickEnabled(boolean z) {
        this.clickEnabled = z;
        this.clickEnabledObservable.mo348a(Boolean.valueOf(this.clickEnabled));
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setClickEnabled(z);
        runEnableChangeAnimation(z);
    }

    public void setListener(hch hch) {
        this.listener = hch;
    }

    public void setMode(hbf hbf, hbh hbh) {
        if (hbf != this.currentSpec.m3054c()) {
            String str = TAG;
            String valueOf = String.valueOf(hbf);
            String valueOf2 = String.valueOf(this.currentSpec.m3054c());
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 15) + String.valueOf(valueOf2).length());
            stringBuilder.append("Entering ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" from ");
            stringBuilder.append(valueOf2);
            bli.m863a(str, stringBuilder.toString());
            animateMainButton(hbf, hbh);
            this.currentSpec.m3050a(hbf);
            str = TAG;
            valueOf = String.valueOf(this.currentSpec.m3054c());
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 12);
            stringBuilder2.append("Mode set to ");
            stringBuilder2.append(valueOf);
            bli.m863a(str, stringBuilder2.toString());
            setTag(hbf.toString());
            updateContentDescription(hbf);
        }
    }

    public void setOnDrawListener(hbe hbe) {
        boolean z;
        if (this.onDrawListener == null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13154b(z, (Object) "Cannot set on draw listener more than once.");
        this.onDrawListener = hbe;
        invalidate();
    }

    public void setVideoButtonAnimating(boolean z) {
        this.isVideoButtonAnimating = z;
    }

    private void updateButtonRect() {
        int h = (int) (((float) this.currentSpec.m3064h()) * this.currentScaleFactor);
        int i = this.buttonCenterX - h;
        int i2 = this.buttonCenterY - h;
        h += h;
        this.buttonRect.set((float) i, (float) i2, (float) (i + h), (float) (h + i2));
    }

    private void updateContentDescription(hbf hbf) {
        CharSequence string;
        if (hbf == hbf.CONFIRM_ENABLED) {
            string = getResources().getString(R.string.accessibility_done_button);
        } else if (hbf == hbf.CANCEL) {
            string = getResources().getString(R.string.accessibility_cancel_button);
        } else if (hbf == hbf.VIDEO_IDLE) {
            string = getResources().getString(R.string.accessibility_capture_video_start);
        } else if (hbf == hbf.VIDEO_RECORDING) {
            string = getResources().getString(R.string.accessibility_capture_video_stop);
        } else {
            string = getResources().getString(R.string.accessibility_shutter_button);
        }
        setContentDescription(string);
    }

    private void updateShutterButtonColor() {
        int i = this.disabledFilterGreyValue;
        ColorFilter lightingColorFilter = new LightingColorFilter(Color.rgb(i, i, i), 0);
        this.currentInnerPortraitRingPaint.setColorFilter(lightingColorFilter);
        this.currentOuterPortraitRingPaint.setColorFilter(lightingColorFilter);
        this.currentPhotoCirclePaint.setColorFilter(lightingColorFilter);
        this.currentMainButtonPaint.setColorFilter(lightingColorFilter);
    }
}
