package com.google.android.apps.camera.bottombar;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p000.hdy;
import p000.hil;

/* compiled from: PG */
public class SmoothRotateSwitchButton extends FrameLayout {
    public int currentRotation = -1;
    public boolean isLandscape;
    public boolean isPhotoButton;
    public hil smoothRotator;

    public SmoothRotateSwitchButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private float getLastTranslation() {
        if (getTranslationX() == 0.0f) {
            return getTranslationY();
        }
        return getTranslationX();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.currentRotation = hdy.m3084b(getContext());
        resetSwitchButton();
        this.smoothRotator = new hil(this);
        this.smoothRotator.m3179a();
    }

    protected void onConfigurationChanged(Configuration configuration) {
        this.currentRotation = hdy.m3084b(getContext());
        resetSwitchButton();
        super.onConfigurationChanged(configuration);
        this.smoothRotator.m3180b();
    }

    private void resetSwitchButton() {
        int i = this.currentRotation;
        if (i == 1) {
            if (this.isPhotoButton) {
                setTranslationY(-Math.abs(getLastTranslation()));
            } else {
                setTranslationY(Math.abs(getLastTranslation()));
            }
            setTranslationX(0.0f);
            this.isLandscape = true;
        } else if (i == 3) {
            if (this.isPhotoButton) {
                setTranslationY(Math.abs(getLastTranslation()));
            } else {
                setTranslationY(-Math.abs(getLastTranslation()));
            }
            setTranslationX(0.0f);
            this.isLandscape = true;
        } else {
            if (this.isPhotoButton) {
                setTranslationX(Math.abs(getLastTranslation()));
            } else {
                setTranslationX(-Math.abs(getLastTranslation()));
            }
            setTranslationY(0.0f);
            this.isLandscape = false;
        }
    }

    public void setIsPhotoButton(boolean z) {
        this.isPhotoButton = z;
    }

    public void setTranslation(float f) {
        if (!this.isLandscape) {
            setTranslationX(f);
        } else if (this.currentRotation == 1) {
            setTranslationY(-f);
        } else {
            setTranslationY(f);
        }
    }
}
