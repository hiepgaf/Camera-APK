package com.google.android.apps.camera.bottombar;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* compiled from: PG */
public class PauseResumeButton extends ImageButton {
    public static final int[] STATE_PAUSED = new int[]{C0042R.attr.state_paused};
    public boolean isPaused;
    public PauseResumeButtonListener listener;
    public Drawable pauseResumeAnimatable;
    public Drawable resumePauseAnimatable;

    /* compiled from: PG */
    public interface PauseResumeButtonListener {
        void onPauseButtonClicked();

        void onResumeButtonClicked();
    }

    public PauseResumeButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.pauseResumeAnimatable = context.getResources().getDrawable(C0042R.drawable.ic_pause_resume_animation, null);
        this.resumePauseAnimatable = context.getResources().getDrawable(C0042R.drawable.ic_resume_pause_animation, null);
    }

    public boolean isPaused() {
        return this.isPaused;
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.isPaused) {
            return super.onCreateDrawableState(i);
        }
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        mergeDrawableStates(onCreateDrawableState, STATE_PAUSED);
        return onCreateDrawableState;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        transitionToPauseState();
    }

    public boolean performClick() {
        PauseResumeButtonListener pauseResumeButtonListener;
        if (this.isPaused) {
            pauseResumeButtonListener = this.listener;
            if (pauseResumeButtonListener != null) {
                pauseResumeButtonListener.onResumeButtonClicked();
            }
        } else {
            pauseResumeButtonListener = this.listener;
            if (pauseResumeButtonListener != null) {
                pauseResumeButtonListener.onPauseButtonClicked();
            }
        }
        return super.performClick();
    }

    public void resetButton() {
        transitionToPauseState();
        refreshDrawableState();
    }

    public void setListener(PauseResumeButtonListener pauseResumeButtonListener) {
        this.listener = pauseResumeButtonListener;
    }

    protected void transitionToPauseState() {
        setImageDrawable(this.resumePauseAnimatable);
        ((Animatable) this.resumePauseAnimatable).start();
        this.isPaused = false;
        setContentDescription(getResources().getString(C0042R.string.pause_video_recording));
        refreshDrawableState();
    }

    protected void transitionToResumeState() {
        setImageDrawable(this.pauseResumeAnimatable);
        ((Animatable) this.pauseResumeAnimatable).start();
        this.isPaused = true;
        setContentDescription(getResources().getString(C0042R.string.resume_video_recording));
        refreshDrawableState();
    }
}
