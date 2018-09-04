package com.google.android.apps.refocus.image;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
public class RangeInverseDepthTransform implements DepthTransform {
    public static final String FORMAT = "RangeInverse";
    public final float far;
    public final float near;

    public RangeInverseDepthTransform(float f, float f2) {
        this.near = f;
        this.far = f2;
    }

    public float getFar() {
        return this.far;
    }

    public String getFormat() {
        return FORMAT;
    }

    public float getNear() {
        return this.near;
    }

    public int quantize(float f) {
        float f2 = this.far;
        float f3 = this.near;
        return Math.max(0, Math.min(Illuminant.kOther, (int) (((f2 - ((f3 * f2) / f)) / (f2 - f3)) * 255.0f)));
    }

    public float reconstruct(int i) {
        float f = this.far;
        float f2 = this.near;
        return (f * f2) / (f - (((f - f2) * ((float) Math.max(0, Math.min(Illuminant.kOther, i)))) / 255.0f));
    }
}
