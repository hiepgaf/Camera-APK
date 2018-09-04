package com.google.android.apps.camera.optionsbar.view;

import android.view.View;

/* compiled from: PG */
public class ViewMagnet {
    public View ironView = null;
    public boolean isPositioned = false;
    public final View magnetView;

    public ViewMagnet(View view) {
        this.magnetView = view;
    }

    public View getIronView() {
        return this.ironView;
    }

    public View getMagnetView() {
        return this.magnetView;
    }

    private int[] getOnScreenViewCenter(View view) {
        r0 = new int[2];
        view.getLocationOnScreen(r0);
        r0[0] = r0[0] + (view.getWidth() / 2);
        r0[1] = r0[1] + (view.getHeight() / 2);
        return r0;
    }

    public boolean isPositioned() {
        return this.isPositioned;
    }

    public void setIronView(View view) {
        this.ironView = view;
    }

    public void setPositioned() {
        this.isPositioned = true;
        update();
    }

    public void setRotation(float f) {
        this.magnetView.setRotation(f);
        updateRotation();
    }

    public void setTranslationX(float f) {
        this.magnetView.setTranslationX(f);
        updateX();
    }

    public void setVisibility(int i) {
        this.magnetView.setVisibility(i);
        View view = this.ironView;
        if (view != null && this.isPositioned) {
            view.setVisibility(i);
        }
    }

    public void update() {
        updateX();
        updateY();
        updateRotation();
        updateVisibility();
    }

    private void updateRotation() {
        View view = this.ironView;
        if (view != null) {
            view.setRotation(this.magnetView.getRotation());
        }
    }

    private void updateVisibility() {
        View view = this.ironView;
        if (view != null) {
            view.setVisibility(this.magnetView.getVisibility());
        }
    }

    private void updateX() {
        View view = this.ironView;
        if (view != null && view.getWidth() != 0) {
            int[] onScreenViewCenter = getOnScreenViewCenter(this.magnetView);
            view.setTranslationX(view.getTranslationX() - ((float) (getOnScreenViewCenter(view)[0] - onScreenViewCenter[0])));
        }
    }

    private void updateY() {
        View view = this.ironView;
        if (view != null && view.getHeight() != 0) {
            int[] onScreenViewCenter = getOnScreenViewCenter(this.magnetView);
            view.setTranslationY(view.getTranslationY() - ((float) (getOnScreenViewCenter(view)[1] - onScreenViewCenter[1])));
        }
    }
}
