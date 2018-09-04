package com.google.android.apps.camera.bottombar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import p000.him;

/* compiled from: PG */
public class HfrButton extends him implements AnimatedImageButton {
    public static final int ANIMATION_DURATION = 0;
    public static final int FPS_TEXT_SIZE_DIP = 12;
    public static final int INITIAL_STATE = 0;
    public static final String RATE_STRING_240 = "240";
    public static final int RATE_TEXT_SIZE_DIP = 14;
    public Animator animator;
    public Paint backgroundPaint;
    public String[] descriptionStrings;
    public String fpsString;
    public Paint fpsTextPaint;
    public boolean is240FpsSupported;
    public int numStates;
    public OnStateChangeListener onStateChangeListener;
    public OnStateChangeListener onStatePreChangeListener;
    public String[] rateStrings;
    public Paint rateTextPaint;
    public int state;
    public String text;

    /* compiled from: PG */
    /* renamed from: com.google.android.apps.camera.bottombar.HfrButton$1 */
    class C00401 implements OnClickListener {
        C00401() {
        }

        public void onClick(View view) {
            HfrButton hfrButton = HfrButton.this;
            hfrButton.nextState(hfrButton.state, false);
        }
    }

    public HfrButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize();
    }

    private Paint createTextPaint(int i) {
        Paint paint = new Paint();
        paint.setTextSize(TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics()));
        paint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        paint.setTextAlign(Align.CENTER);
        paint.setAntiAlias(true);
        return paint;
    }

    private int getColor(int i) {
        return getResources().getColor(i, null);
    }

    public int getState() {
        return this.state;
    }

    private void initialize() {
        setOnClickListener(new C00401());
        this.animator = ValueAnimator.ofInt(new int[]{0});
        this.animator.setDuration(0);
        this.backgroundPaint = new Paint();
        this.backgroundPaint.setColor(getColor(C0042R.color.hfr_button_background_color));
        this.backgroundPaint.setAntiAlias(true);
        this.rateTextPaint = createTextPaint(14);
        this.rateTextPaint.setColor(getColor(C0042R.color.hfr_button_text_color));
        this.fpsTextPaint = createTextPaint(12);
        this.fpsTextPaint.setColor(getColor(C0042R.color.hfr_button_text_color));
        this.fpsString = getResources().getString(C0042R.string.fps);
        this.rateStrings = getResources().getStringArray(C0042R.array.toybox_hfr_mode_rates);
        this.descriptionStrings = getResources().getStringArray(C0042R.array.toybox_hfr_mode_descriptions);
        this.numStates = this.rateStrings.length;
        this.state = 0;
        setTextFromState(0);
    }

    private void nextState(int i, boolean z) {
        int i2 = i + 1;
        if (i2 >= this.numStates) {
            i2 = 0;
        }
        if (z) {
            setStateAnimated(i2, true);
        } else {
            setState(i2, true);
        }
    }

    protected void onDraw(Canvas canvas) {
        canvas.drawCircle((float) (canvas.getWidth() / 2), (float) (canvas.getHeight() / 2), (float) (canvas.getWidth() / 2), this.backgroundPaint);
        float width = (float) (canvas.getWidth() / 2);
        canvas.drawText(this.text, width, (float) (canvas.getHeight() / 2), this.rateTextPaint);
        int height = canvas.getHeight();
        canvas.drawText(this.fpsString, width, ((float) (height / 2)) + this.fpsTextPaint.getTextSize(), this.fpsTextPaint);
    }

    protected void setIs240FpsSupported(boolean z) {
        this.is240FpsSupported = z;
    }

    public void setOnPreChangeListener(OnStateChangeListener onStateChangeListener) {
        this.onStatePreChangeListener = onStateChangeListener;
    }

    public void setOnStateChangeListener(OnStateChangeListener onStateChangeListener) {
        this.onStateChangeListener = onStateChangeListener;
    }

    public void setState(int i, boolean z) {
        if (!shouldSetState(i, false)) {
            OnStateChangeListener onStateChangeListener;
            if (z) {
                onStateChangeListener = this.onStatePreChangeListener;
                if (onStateChangeListener != null) {
                    onStateChangeListener.stateChanged(this, this.state);
                }
            }
            this.state = i;
            setTextFromState(i);
            if (z) {
                onStateChangeListener = this.onStateChangeListener;
                if (onStateChangeListener != null) {
                    onStateChangeListener.stateChanged(this, i);
                }
            }
        }
    }

    public void setStateAnimated(final int i, final boolean z) {
        if (!shouldSetState(i, true)) {
            this.animator.removeAllListeners();
            this.animator.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    HfrButton.this.setState(i, false);
                    if (z && HfrButton.this.onStateChangeListener != null) {
                        HfrButton.this.onStateChangeListener.stateChanged(HfrButton.this, i);
                    }
                    HfrButton.this.setClickable(true);
                }

                public void onAnimationStart(Animator animator) {
                    HfrButton.this.setClickable(false);
                    if (z && HfrButton.this.onStatePreChangeListener != null) {
                        OnStateChangeListener access$200 = HfrButton.this.onStatePreChangeListener;
                        View view = HfrButton.this;
                        access$200.stateChanged(view, view.state);
                    }
                }
            });
            this.animator.start();
        }
    }

    private void setTextFromState(int i) {
        this.text = this.rateStrings[i];
        setContentDescription(this.descriptionStrings[i]);
        invalidate();
    }

    private boolean shouldSetState(int i, boolean z) {
        if (i == this.state) {
            return true;
        }
        if (this.is240FpsSupported || !this.rateStrings[i].equals(RATE_STRING_240)) {
            return false;
        }
        nextState(i, z);
        return true;
    }
}
