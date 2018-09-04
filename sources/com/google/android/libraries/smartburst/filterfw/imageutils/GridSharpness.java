package com.google.android.libraries.smartburst.filterfw.imageutils;

/* compiled from: PG */
public final class GridSharpness {
    public final float maxGridPerceptualSharpness;
    public final float perceptualSharpness;

    public GridSharpness(float f, float f2) {
        this.perceptualSharpness = f;
        this.maxGridPerceptualSharpness = f2;
    }

    public final float getMaxGridPerceptualSharpness() {
        return this.maxGridPerceptualSharpness;
    }

    public final float getPerceptualSharpness() {
        return this.perceptualSharpness;
    }
}
