package com.google.android.apps.camera.bottombar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewOutlineProvider;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import p000.bli;
import p000.hid;
import p000.him;
import p000.hip;
import p000.ikd;
import p000.jqk;
import p000.jri;
import p000.kau;
import p000.kbg;

@TargetApi(21)
/* compiled from: PG */
public class RoundedThumbnailView extends him {
    public static final float HIT_STATE_CIRCLE_OPACITY_BEGIN = 0.7f;
    public static final float HIT_STATE_CIRCLE_OPACITY_END = 0.0f;
    public static final float HIT_STATE_CIRCLE_OPACITY_HIDDEN = -1.0f;
    public static final long HIT_STATE_DURATION_MS = 150;
    public static final int MAX_THUMBNAIL_BITMAP_SIZE = 512;
    public static final long RIPPLE_DURATION_MS = 200;
    public static final float RIPPLE_OPACITY_BEGIN = 0.4f;
    public static final float RIPPLE_OPACITY_END = 0.0f;
    public static final long RIPPLE_START_DELAY_MS = 100;
    public static final String TAG = bli.m862a("RoundedThumbnail");
    public static final float THUMBNAIL_FLASH_CIRCLE_OPACITY_BEGIN = 0.8f;
    public static final float THUMBNAIL_FLASH_CIRCLE_OPACITY_END = 0.0f;
    public static final long THUMBNAIL_FLASH_DURATION_MS = 200;
    public static final float THUMBNAIL_REVEAL_CIRCLE_OPACITY_BEGIN = 0.5f;
    public static final float THUMBNAIL_REVEAL_CIRCLE_OPACITY_END = 0.0f;
    public static final long THUMBNAIL_SHRINK_DURATION_MS = 200;
    public static final long THUMBNAIL_STRETCH_DURATION_MS = 200;
    public RevealRequest backgroundRequest;
    public Paint borderStrokePaint;
    public ValueAnimator burstFlashAnimator;
    public kbg callback;
    public float currentHitStateCircleOpacity;
    public float currentRevealCircleOpacity;
    public float currentRippleRingDiameter;
    public float currentRippleRingOpacity;
    public float currentRippleRingThickness;
    public float currentThumbnailDiameter;
    public RevealRequest foregroundRequest;
    public Paint hitStateCirclePaint;
    public float innerStrokeWidth;
    public boolean isVisibilityDisabled = false;
    public final OnClickListener onClickListener = new C00451();
    public kbg optionalOnClickListener;
    public RevealRequest pendingRequest;
    public Paint revealCirclePaint;
    public ValueAnimator rippleAnimator;
    public Paint ripplePaint;
    public float rippleRingDiameterBegin;
    public float rippleRingDiameterEnd;
    public float rippleRingThicknessBegin;
    public float rippleRingThicknessEnd;
    public AnimatorSet thumbnailAnimatorSet;
    public float thumbnailPadding;
    public float thumbnailShrinkDiameterBegin;
    public float thumbnailShrinkDiameterEnd;
    public float thumbnailStretchDiameterBegin;
    public float thumbnailStretchDiameterEnd;
    public float thumbnailTypeIconSize;
    public RectF viewRect;

    /* compiled from: PG */
    /* renamed from: com.google.android.apps.camera.bottombar.RoundedThumbnailView$1 */
    class C00451 implements OnClickListener {

        /* compiled from: PG */
        /* renamed from: com.google.android.apps.camera.bottombar.RoundedThumbnailView$1$1 */
        class C00431 implements AnimatorUpdateListener {
            C00431() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                RoundedThumbnailView.this.currentHitStateCircleOpacity = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RoundedThumbnailView.this.invalidate();
            }
        }

        /* compiled from: PG */
        /* renamed from: com.google.android.apps.camera.bottombar.RoundedThumbnailView$1$2 */
        class C00442 extends AnimatorListenerAdapter {
            C00442() {
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                RoundedThumbnailView.this.currentHitStateCircleOpacity = -1.0f;
                if (RoundedThumbnailView.this.callback.mo2084b()) {
                    ((Callback) RoundedThumbnailView.this.callback.mo2081a()).onHitStateFinished();
                }
            }
        }

        C00451() {
        }

        public void onClick(View view) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.7f, 0.0f});
            ofFloat.setDuration(150);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new C00431());
            ofFloat.addListener(new C00442());
            ofFloat.start();
            if (RoundedThumbnailView.this.optionalOnClickListener.mo2084b()) {
                ((OnClickListener) RoundedThumbnailView.this.optionalOnClickListener.mo2081a()).onClick(view);
            }
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.apps.camera.bottombar.RoundedThumbnailView$2 */
    class C00462 implements AnimatorUpdateListener {
        C00462() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RoundedThumbnailView.this.currentThumbnailDiameter = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            RoundedThumbnailView.this.currentRevealCircleOpacity = (valueAnimator.getAnimatedFraction() * -0.5f) + 0.5f;
            RoundedThumbnailView.this.invalidate();
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.apps.camera.bottombar.RoundedThumbnailView$3 */
    class C00473 implements AnimatorUpdateListener {
        C00473() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RoundedThumbnailView.this.currentThumbnailDiameter = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            RoundedThumbnailView.this.invalidate();
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.apps.camera.bottombar.RoundedThumbnailView$4 */
    class C00484 extends AnimatorListenerAdapter {
        C00484() {
        }

        public void onAnimationEnd(Animator animator) {
            if (RoundedThumbnailView.this.foregroundRequest != null) {
                RoundedThumbnailView.this.foregroundRequest.finishThumbnailAnimation();
                RoundedThumbnailView.this.processRevealRequests();
            }
            RoundedThumbnailView.this.thumbnailAnimatorSet = null;
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.apps.camera.bottombar.RoundedThumbnailView$5 */
    class C00495 extends AnimatorListenerAdapter {
        C00495() {
        }

        public void onAnimationEnd(Animator animator) {
            if (RoundedThumbnailView.this.foregroundRequest != null) {
                RoundedThumbnailView.this.foregroundRequest.finishRippleAnimation();
                RoundedThumbnailView.this.processRevealRequests();
            }
            RoundedThumbnailView.this.rippleAnimator = null;
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.apps.camera.bottombar.RoundedThumbnailView$6 */
    class C00506 implements AnimatorUpdateListener {
        C00506() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RoundedThumbnailView.this.currentRippleRingDiameter = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            RoundedThumbnailView roundedThumbnailView = RoundedThumbnailView.this;
            roundedThumbnailView.currentRippleRingThickness = roundedThumbnailView.rippleRingThicknessBegin + ((RoundedThumbnailView.this.rippleRingThicknessEnd - RoundedThumbnailView.this.rippleRingThicknessBegin) * animatedFraction);
            RoundedThumbnailView.this.currentRippleRingOpacity = (animatedFraction * -0.4f) + 0.4f;
            RoundedThumbnailView.this.invalidate();
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.apps.camera.bottombar.RoundedThumbnailView$7 */
    class C00517 implements AnimatorUpdateListener {
        C00517() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RoundedThumbnailView.this.currentThumbnailDiameter = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            RoundedThumbnailView.this.currentRevealCircleOpacity = (valueAnimator.getAnimatedFraction() * -0.8f) + 0.8f;
            RoundedThumbnailView.this.invalidate();
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.apps.camera.bottombar.RoundedThumbnailView$8 */
    class C00528 extends AnimatorListenerAdapter {
        C00528() {
        }

        public void onAnimationEnd(Animator animator) {
            RoundedThumbnailView.this.burstFlashAnimator = null;
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.apps.camera.bottombar.RoundedThumbnailView$9 */
    /* synthetic */ class C00539 {
        /* renamed from: $SwitchMap$com$google$android$apps$camera$uiutils$TypedThumbnailBitmap$ThumbnailType */
        public static final /* synthetic */ int[] f2242x2330d0c4 = new int[hip.values().length];

        static {
            try {
                f2242x2330d0c4[hip.BURST.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f2242x2330d0c4[hip.PHOTO.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f2242x2330d0c4[hip.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f2242x2330d0c4[hip.SECURE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    /* compiled from: PG */
    public interface Callback {
        void onHitStateFinished();
    }

    /* compiled from: PG */
    class RevealRequest {
        public String accessibilityString;
        public boolean animationDisabled;
        public boolean rippleAnimationFinished;
        public boolean thumbnailAnimationFinished;
        public Paint thumbnailPaint;
        public float viewSize;

        private RevealRequest(float f, String str) {
            this.accessibilityString = str;
            this.viewSize = f;
        }

        static RevealRequest createAnimatedRevealRequest(float f, String str) {
            return new RevealRequest(f, str);
        }

        static RevealRequest createNonAnimatedRevealRequest(float f, String str) {
            RevealRequest revealRequest = new RevealRequest(f, str);
            revealRequest.animationDisabled = true;
            return revealRequest;
        }

        public void finishRippleAnimation() {
            this.rippleAnimationFinished = true;
        }

        public void finishThumbnailAnimation() {
            this.thumbnailAnimationFinished = true;
        }

        public String getAccessibilityString() {
            return this.accessibilityString;
        }

        public Paint getThumbnailPaint() {
            return this.thumbnailPaint;
        }

        public boolean isAnimationDisabled() {
            return this.animationDisabled;
        }

        public boolean isFinished() {
            return this.thumbnailAnimationFinished && this.rippleAnimationFinished;
        }

        private void precomputeThumbnailPaint(Bitmap bitmap, int i) {
            String access$1600 = RoundedThumbnailView.TAG;
            String valueOf = String.valueOf(bitmap);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
            stringBuilder.append("precomputeThumbnailPaint: ");
            stringBuilder.append(valueOf);
            bli.m871d(access$1600, stringBuilder.toString());
            if (this.thumbnailPaint == null && bitmap != null && bitmap.getWidth() == bitmap.getHeight()) {
                Shader bitmapShader = new BitmapShader(bitmap, TileMode.CLAMP, TileMode.CLAMP);
                if (((float) bitmap.getWidth()) != this.viewSize) {
                    RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
                    float f = this.viewSize;
                    RectF rectF2 = new RectF(0.0f, 0.0f, f, f);
                    Matrix matrix = new Matrix();
                    matrix.setRectToRect(rectF, rectF2, ScaleToFit.FILL);
                    matrix.preRotate((float) i, rectF.width() / 2.0f, rectF.height() / 2.0f);
                    bitmapShader.setLocalMatrix(matrix);
                }
                this.thumbnailPaint = new Paint();
                this.thumbnailPaint.setAntiAlias(true);
                this.thumbnailPaint.setShader(bitmapShader);
                bli.m871d(RoundedThumbnailView.TAG, "precomputeThumbnailPaint finished");
            }
        }

        public void setThumbnailBitmap(Bitmap bitmap, int i) {
            if (bitmap.getWidth() != bitmap.getHeight()) {
                bitmap = hid.m3166a(hid.m3169b(bitmap));
            }
            precomputeThumbnailPaint(bitmap, i);
        }
    }

    /* compiled from: PG */
    class RoundedThumbnailOutlineProvider extends ViewOutlineProvider {
        public final float thumbnailShrinkDiameterEnd;
        public final RectF viewRect;

        private RoundedThumbnailOutlineProvider(float f, RectF rectF) {
            this.thumbnailShrinkDiameterEnd = f;
            this.viewRect = rectF;
        }

        public void getOutline(View view, Outline outline) {
            int i = (int) (this.thumbnailShrinkDiameterEnd / 2.0f);
            int centerX = (int) this.viewRect.centerX();
            int centerY = (int) this.viewRect.centerY();
            outline.setOval(centerX - i, centerY - i, centerX + i, i + centerY);
        }
    }

    public RoundedThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize();
    }

    private void clearAnimations() {
        AnimatorSet animatorSet = this.thumbnailAnimatorSet;
        if (animatorSet != null && animatorSet.isStarted()) {
            this.thumbnailAnimatorSet.removeAllListeners();
            this.thumbnailAnimatorSet.cancel();
            this.thumbnailAnimatorSet = null;
        }
        ValueAnimator valueAnimator = this.rippleAnimator;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.rippleAnimator.removeAllListeners();
            this.rippleAnimator.cancel();
            this.rippleAnimator = null;
        }
        valueAnimator = this.burstFlashAnimator;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.burstFlashAnimator.removeAllListeners();
            this.burstFlashAnimator.cancel();
            this.burstFlashAnimator = null;
        }
    }

    public void disableVisibilityAndHide() {
        setVisibility(8);
        this.isVisibilityDisabled = true;
    }

    public void enableVisibilityAndShow() {
        if (this.isVisibilityDisabled) {
            this.isVisibilityDisabled = false;
            setVisibility(0);
        }
    }

    public void flashThumbnail() {
        bli.m871d(TAG, "flashThumbnail");
        ikd.m12259a();
        runBurstFlashAnimation();
    }

    private int getColor(int i) {
        return getResources().getColor(i, null);
    }

    public Bitmap getDefaultThumbnail(hip hip) {
        Drawable drawable = null;
        bli.m871d(TAG, "showDefaultThumbnail");
        int i = (int) this.thumbnailShrinkDiameterEnd;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Config.ARGB_8888);
        createBitmap.eraseColor(getColor(C0042R.color.indicator_background));
        switch (hip.ordinal()) {
            case 1:
                drawable = getResources().getDrawable(C0042R.drawable.ic_camera_thumbnail, null);
                break;
            case 2:
                drawable = getResources().getDrawable(C0042R.drawable.ic_burst_thumbnail, null);
                break;
            case 3:
                drawable = getResources().getDrawable(C0042R.drawable.ic_videocam_thumbnail, null);
                break;
            case 4:
                drawable = getResources().getDrawable(C0042R.drawable.ic_secure_thumbnail, null);
                break;
        }
        Canvas canvas = new Canvas(createBitmap);
        if (drawable != null) {
            float f = this.thumbnailTypeIconSize;
            i = (int) ((((float) i) - f) / 2.0f);
            int i2 = ((int) f) + i;
            drawable.setBounds(i, i, i2, i2);
            drawable.draw(canvas);
        }
        return createBitmap;
    }

    public float getRippleRingMaxDiameterDp() {
        return this.rippleRingDiameterEnd;
    }

    public float getThumbnailFinalDiameter() {
        return this.thumbnailShrinkDiameterEnd;
    }

    public float getThumbnailPadding() {
        return this.thumbnailPadding;
    }

    public boolean hasOverlappingRendering() {
        return true;
    }

    private void initialize() {
        this.callback = kau.f19138a;
        this.optionalOnClickListener = kau.f19138a;
        setClickable(true);
        super.setOnClickListener(this.onClickListener);
        this.thumbnailPadding = getResources().getDimension(C0042R.dimen.rounded_thumbnail_padding);
        this.thumbnailStretchDiameterBegin = getResources().getDimension(C0042R.dimen.rounded_thumbnail_diameter_min);
        this.thumbnailStretchDiameterEnd = getResources().getDimension(C0042R.dimen.rounded_thumbnail_diameter_max);
        this.thumbnailShrinkDiameterBegin = this.thumbnailStretchDiameterEnd;
        this.thumbnailShrinkDiameterEnd = getResources().getDimension(C0042R.dimen.rounded_thumbnail_diameter_normal);
        this.thumbnailTypeIconSize = getResources().getDimension(C0042R.dimen.rounded_thumbnail_type_icon_size);
        this.rippleRingDiameterEnd = getResources().getDimension(C0042R.dimen.rounded_thumbnail_ripple_ring_diameter_max);
        float f = this.rippleRingDiameterEnd;
        this.viewRect = new RectF(0.0f, 0.0f, f, f);
        this.rippleRingDiameterBegin = getResources().getDimension(C0042R.dimen.rounded_thumbnail_ripple_ring_diameter_min);
        this.rippleRingThicknessBegin = getResources().getDimension(C0042R.dimen.rounded_thumbnail_ripple_ring_thick_max);
        this.rippleRingThicknessEnd = getResources().getDimension(C0042R.dimen.rounded_thumbnail_ripple_ring_thick_min);
        this.currentHitStateCircleOpacity = -1.0f;
        this.hitStateCirclePaint = new Paint(1);
        this.hitStateCirclePaint.setColor(-1);
        this.hitStateCirclePaint.setStyle(Style.FILL);
        this.ripplePaint = new Paint(1);
        this.ripplePaint.setColor(-1);
        this.ripplePaint.setStyle(Style.STROKE);
        this.revealCirclePaint = new Paint(1);
        this.revealCirclePaint.setColor(-1);
        this.revealCirclePaint.setStyle(Style.FILL);
        this.borderStrokePaint = new Paint(1);
        this.borderStrokePaint.setStyle(Style.STROKE);
        this.innerStrokeWidth = getResources().getDimension(C0042R.dimen.rounded_thumbnail_inner_stroke_width);
        this.borderStrokePaint.setStrokeWidth(this.innerStrokeWidth);
        f = 0.0f;
        float f2 = 0.0f;
        this.borderStrokePaint.setShader(new LinearGradient(0.0f, f, f2, this.thumbnailShrinkDiameterEnd, new int[]{getResources().getColor(C0042R.color.button_border_gradient_top, null), getResources().getColor(C0042R.color.button_border_gradient_bottom, null)}, null, TileMode.CLAMP));
        setOutlineProvider(new RoundedThumbnailOutlineProvider(this.thumbnailShrinkDiameterEnd, this.viewRect));
        setEnabled(false);
        setThumbnail(getDefaultThumbnail(hip.PLACEHOLDER), 0);
        disableVisibilityAndHide();
    }

    protected void onDraw(Canvas canvas) {
        Paint thumbnailPaint;
        super.onDraw(canvas);
        float width = (float) (canvas.getWidth() / 2);
        float height = (float) (canvas.getHeight() / 2);
        float f = this.rippleRingDiameterEnd;
        float f2 = this.thumbnailShrinkDiameterEnd;
        canvas.clipRect(this.viewRect);
        RevealRequest revealRequest = this.backgroundRequest;
        if (revealRequest != null) {
            thumbnailPaint = revealRequest.getThumbnailPaint();
            if (thumbnailPaint != null) {
                float f3 = f2 / f;
                canvas.save();
                canvas.scale(f3, f3, width, height);
                canvas.drawRoundRect(this.viewRect, width, height, thumbnailPaint);
                canvas.drawCircle(width, height, width - (this.innerStrokeWidth / 2.0f), this.borderStrokePaint);
                canvas.restore();
            }
        }
        if (this.foregroundRequest != null) {
            if (this.currentRippleRingThickness > 0.0f) {
                ValueAnimator valueAnimator = this.rippleAnimator;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.ripplePaint.setAlpha((int) (this.currentRippleRingOpacity * 255.0f));
                    this.ripplePaint.setStrokeWidth(this.currentRippleRingThickness);
                    canvas.save();
                    canvas.drawCircle(width, height, this.currentRippleRingDiameter / 2.0f, this.ripplePaint);
                    canvas.restore();
                }
            }
            float f4 = this.currentThumbnailDiameter / this.rippleRingDiameterEnd;
            canvas.save();
            canvas.scale(f4, f4, width, height);
            thumbnailPaint = ((RevealRequest) jqk.m13102c(this.foregroundRequest)).getThumbnailPaint();
            if (thumbnailPaint != null) {
                canvas.drawRoundRect(this.viewRect, width, height, thumbnailPaint);
                canvas.drawCircle(width, height, width - (this.innerStrokeWidth / 2.0f), this.borderStrokePaint);
            }
            this.revealCirclePaint.setAlpha((int) (this.currentRevealCircleOpacity * 255.0f));
            canvas.drawCircle(width, height, this.rippleRingDiameterEnd / 2.0f, this.revealCirclePaint);
            canvas.restore();
        }
        if (this.currentHitStateCircleOpacity != -1.0f) {
            canvas.save();
            f4 = f2 / f;
            canvas.scale(f4, f4, width, height);
            this.hitStateCirclePaint.setAlpha((int) (this.currentHitStateCircleOpacity * 255.0f));
            canvas.drawCircle(width, height, this.rippleRingDiameterEnd / 2.0f, this.hitStateCirclePaint);
            canvas.restore();
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3 = (int) this.rippleRingDiameterEnd;
        setMeasuredDimension(i3, i3);
    }

    private void processRevealRequests() {
        RevealRequest revealRequest = this.foregroundRequest;
        if (revealRequest != null && revealRequest.isFinished()) {
            this.backgroundRequest = this.foregroundRequest;
            this.foregroundRequest = null;
        }
    }

    public void resetThumbnailView() {
        setPressed(false);
        invalidate();
    }

    private void runBurstFlashAnimation() {
        bli.m871d(TAG, "runPendingFlashAnimation");
        RevealRequest revealRequest = this.foregroundRequest;
        if (revealRequest != null) {
            this.backgroundRequest = revealRequest;
            this.backgroundRequest.finishRippleAnimation();
            this.backgroundRequest.finishThumbnailAnimation();
        }
        this.foregroundRequest = this.backgroundRequest;
        this.pendingRequest = null;
        clearAnimations();
        setVisibility(0);
        TimeInterpolator loadInterpolator = AnimationUtils.loadInterpolator(getContext(), 17563661);
        this.burstFlashAnimator = ValueAnimator.ofFloat(new float[]{this.thumbnailStretchDiameterBegin, this.thumbnailShrinkDiameterEnd});
        this.burstFlashAnimator.setDuration(200);
        this.burstFlashAnimator.setInterpolator(loadInterpolator);
        this.burstFlashAnimator.setRepeatCount(-1);
        this.burstFlashAnimator.addUpdateListener(new C00517());
        this.burstFlashAnimator.addListener(new C00528());
        this.burstFlashAnimator.start();
    }

    private void runPendingRequestAnimation(boolean z) {
        bli.m871d(TAG, "runPendingRequestAnimation");
        int isAnimationDisabled = ((RevealRequest) jqk.m13102c(this.pendingRequest)).isAnimationDisabled() ^ 1;
        if (isAnimationDisabled != 0) {
            this.backgroundRequest = null;
            RevealRequest revealRequest = this.foregroundRequest;
            if (revealRequest != null && z) {
                this.backgroundRequest = revealRequest;
                this.backgroundRequest.finishRippleAnimation();
                this.backgroundRequest.finishThumbnailAnimation();
            }
        }
        this.foregroundRequest = this.pendingRequest;
        this.pendingRequest = null;
        if (isAnimationDisabled == 0) {
            if (this.thumbnailAnimatorSet == null) {
                this.currentThumbnailDiameter = this.thumbnailShrinkDiameterEnd;
                this.currentRevealCircleOpacity = 0.0f;
                ((RevealRequest) jqk.m13102c(this.foregroundRequest)).finishThumbnailAnimation();
            }
            if (this.rippleAnimator == null) {
                ((RevealRequest) jqk.m13102c(this.foregroundRequest)).finishRippleAnimation();
            }
            invalidate();
            return;
        }
        clearAnimations();
        setVisibility(0);
        TimeInterpolator loadInterpolator = AnimationUtils.loadInterpolator(getContext(), 17563661);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.thumbnailStretchDiameterBegin, this.thumbnailStretchDiameterEnd});
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(loadInterpolator);
        ofFloat.addUpdateListener(new C00462());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{this.thumbnailShrinkDiameterBegin, this.thumbnailShrinkDiameterEnd});
        ofFloat2.setDuration(200);
        ofFloat2.setInterpolator(loadInterpolator);
        ofFloat2.addUpdateListener(new C00473());
        this.thumbnailAnimatorSet = new AnimatorSet();
        this.thumbnailAnimatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
        this.thumbnailAnimatorSet.addListener(new C00484());
        this.thumbnailAnimatorSet.start();
        loadInterpolator = AnimationUtils.loadInterpolator(getContext(), 17563662);
        this.rippleAnimator = ValueAnimator.ofFloat(new float[]{this.rippleRingDiameterBegin, this.rippleRingDiameterEnd});
        this.rippleAnimator.setDuration(200);
        this.rippleAnimator.setInterpolator(loadInterpolator);
        this.rippleAnimator.addListener(new C00495());
        this.rippleAnimator.addUpdateListener(new C00506());
        this.rippleAnimator.setStartDelay(100);
        this.rippleAnimator.start();
        announceForAccessibility(((RevealRequest) jqk.m13102c(this.foregroundRequest)).getAccessibilityString());
    }

    public void setCallback(Callback callback) {
        this.callback = kbg.m4745c(callback);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.optionalOnClickListener = kbg.m4744b(onClickListener);
    }

    public void setThumbnail(Bitmap bitmap, int i) {
        setThumbnail(bitmap, i, true);
        enableVisibilityAndShow();
    }

    private void setThumbnail(Bitmap bitmap, int i, boolean z) {
        bli.m871d(TAG, "setThumbnail");
        jri.m13152b((Object) bitmap);
        ikd.m12259a();
        if (this.pendingRequest == null) {
            this.pendingRequest = RevealRequest.createNonAnimatedRevealRequest(this.rippleRingDiameterEnd, "");
        }
        this.pendingRequest.setThumbnailBitmap(bitmap, i);
        if (getVisibility() != 0) {
            this.backgroundRequest = null;
            this.foregroundRequest = null;
        }
        runPendingRequestAnimation(z);
    }

    public void setVisibility(int i) {
        if (!this.isVisibilityDisabled) {
            super.setVisibility(i);
        }
    }

    public void startRevealThumbnailAnimation(String str) {
        bli.m871d(TAG, "startRevealThumbnailAnimation");
        ikd.m12259a();
        this.pendingRequest = RevealRequest.createAnimatedRevealRequest((float) getMeasuredWidth(), str);
    }

    private void stopBurstFlashAnimation() {
        bli.m871d(TAG, "runPendingFlashAnimation");
        ValueAnimator valueAnimator = this.burstFlashAnimator;
        if (valueAnimator != null) {
            valueAnimator.setRepeatCount(0);
        }
    }

    public void stopFlashThumbnail() {
        bli.m871d(TAG, "stopFlashThumbnail");
        ikd.m12259a();
        stopBurstFlashAnimation();
    }
}
