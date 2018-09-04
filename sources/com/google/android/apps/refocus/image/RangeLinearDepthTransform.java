package com.google.android.apps.refocus.image;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
public class RangeLinearDepthTransform implements DepthTransform {
    public static final String FORMAT = "RangeLinear";
    public final float far;
    public final float near;

    public RangeLinearDepthTransform(float f, float f2) {
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
        float f2 = this.near;
        return Math.max(0, Math.min(Illuminant.kOther, (int) (((f - f2) / (this.far - f2)) * 255.0f)));
    }

    public float reconstruct(int i) {
        float f = this.near;
        return f + (((this.far - f) * ((float) Math.max(0, Math.min(Illuminant.kOther, i)))) / 255.0f);
    }
}
