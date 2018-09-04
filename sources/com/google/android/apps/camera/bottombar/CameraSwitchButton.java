package com.google.android.apps.camera.bottombar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import p000.hif;
import p000.him;
import p000.ks;

/* compiled from: PG */
public class CameraSwitchButton extends him implements AnimatedImageButton {
    public static final int CAMERA_FACING_BACK = 0;
    public static final int CAMERA_FACING_FRONT = 1;
    public static final int RIPPLE_ALPHA_START = 66;
    public static final int RIPPLE_DURATION_MS = 500;
    public static final int RIPPLE_RADIUS_END = 48;
    public static final int RIPPLE_RADIUS_START = 28;
    public Animatable buttonAnimatable;
    public final int buttonColorLight;
    public boolean clickEnabled = true;
    public int currentButtonColor;
    public float currentRippleAlpha;
    public float currentRippleRadius;
    public ValueAnimator fastOutSlowInAnimator;
    public OnStateChangeListener onStateChangeListener;
    public OnStateChangeListener onStatePreChangeListener;
    public Paint paint;
    public float pixelDensity;
    public int state;

    /* compiled from: PG */
    /* renamed from: com.google.android.apps.camera.bottombar.CameraSwitchButton$1 */
    class C00381 implements OnClickListener {
        C00381() {
        }

        public void onClick(View view) {
            if (CameraSwitchButton.this.clickEnabled) {
                int i;
                if (CameraSwitchButton.this.state == 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                CameraSwitchButton.this.setStateAnimated(i, true);
            }
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.apps.camera.bottombar.CameraSwitchButton$2 */
    class C00392 implements AnimatorUpdateListener {
        C00392() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            CameraSwitchButton.this.currentRippleAlpha = (1.0f - valueAnimator.getAnimatedFraction()) * 66.0f;
            CameraSwitchButton.this.currentRippleRadius = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            CameraSwitchButton.this.invalidate();
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.android.apps.camera.bottombar.CameraSwitchButton$3 */
    class C01403 implements hif {
        C01403() {
        }

        public int getColor() {
            return CameraSwitchButton.this.getSwitchColor();
        }

        public void setColor(int i) {
            CameraSwitchButton.this.setSwitchColor(i);
        }
    }

    public CameraSwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.buttonColorLight = context.getColor(C0042R.color.front_back_switch_button_color);
        this.currentButtonColor = this.buttonColorLight;
        initialize();
    }

    public hif getCameraSwitchColorProperty() {
        return new C01403();
    }

    public int getState() {
        return this.state;
    }

    public int getSwitchColor() {
        return this.currentButtonColor;
    }

    private void initialize() {
        unsetDarkFrontFacingDrawable();
        this.buttonAnimatable = (Animatable) getDrawable();
        this.pixelDensity = getResources().getDisplayMetrics().density;
        this.paint = new Paint();
        this.paint.setColor(-1);
        this.paint.setStyle(Style.FILL);
        this.paint.setAntiAlias(true);
        setOnClickListener(new C00381());
        setFocusable(false);
        this.fastOutSlowInAnimator = ValueAnimator.ofFloat(new float[]{28.0f, 48.0f});
        this.fastOutSlowInAnimator.setDuration(500);
        this.fastOutSlowInAnimator.setInterpolator(new ks());
        this.fastOutSlowInAnimator.addUpdateListener(new C00392());
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = (float) (canvas.getWidth() / 2);
        float height = (float) (canvas.getHeight() / 2);
        if (isPressed()) {
            this.paint.setAlpha(66);
            canvas.save();
            canvas.drawCircle(width, height, this.pixelDensity * 28.0f, this.paint);
            canvas.restore();
            return;
        }
        this.paint.setAlpha((int) this.currentRippleAlpha);
        canvas.save();
        canvas.drawCircle(width, height, this.currentRippleRadius * this.pixelDensity, this.paint);
        canvas.restore();
    }

    public void resetCameraSwitchButton() {
        setPressed(false);
        invalidate();
    }

    public void setClickEnabled(boolean z) {
        this.clickEnabled = z;
    }

    private void setNewDescription() {
        CharSequence string;
        if (this.state == 1) {
            string = getResources().getString(C0042R.string.camera_id_front_desc);
        } else {
            string = getResources().getString(C0042R.string.camera_id_back_desc);
        }
        setContentDescription(string);
    }

    public void setOnPreChangeListener(OnStateChangeListener onStateChangeListener) {
        this.onStatePreChangeListener = onStateChangeListener;
    }

    public void setOnStateChangeListener(OnStateChangeListener onStateChangeListener) {
        this.onStateChangeListener = onStateChangeListener;
    }

    public void setPressed(boolean z) {
        super.setPressed(z);
        invalidate();
    }

    public void setState(int i, boolean z) {
        if (this.state == i) {
            setNewDescription();
            return;
        }
        this.state = i;
        setNewDescription();
        if (z) {
            OnStateChangeListener onStateChangeListener = this.onStateChangeListener;
            if (onStateChangeListener != null) {
                onStateChangeListener.stateChanged(this, getState());
            }
        }
    }

    public void setStateAnimated(int i, boolean z) {
        int i2 = this.state;
        if (i2 != i) {
            if (z) {
                OnStateChangeListener onStateChangeListener = this.onStatePreChangeListener;
                if (onStateChangeListener != null) {
                    onStateChangeListener.stateChanged(this, i2);
                }
            }
            setState(i, z);
            this.buttonAnimatable.start();
            this.fastOutSlowInAnimator.start();
        }
    }

    public void setSwitchColor(int i) {
        this.currentButtonColor = i;
        setColorFilter(this.currentButtonColor);
    }

    public void unsetDarkFrontFacingDrawable() {
        setSwitchColor(this.buttonColorLight);
    }
}
