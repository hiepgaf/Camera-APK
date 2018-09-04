package com.google.android.apps.refocus.processing;

import com.google.android.apps.refocus.image.RGBZ;

/* compiled from: PG */
public class DepthOfFieldOptions {
    public static final float DEFAULT_BLUR_INFINITY_PX = 5.0f;
    public float blurInfinity = 5.0f;
    public float depthOfField = 0.0f;
    public float focalDepth = 0.0f;
    public final RGBZ rgbz;

    public DepthOfFieldOptions(RGBZ rgbz) {
        this.rgbz = rgbz;
    }

    public DepthOfFieldOptions(RGBZ rgbz, int i) {
        this.rgbz = RGBZ.resizeIfLarger(rgbz, i);
    }
}
