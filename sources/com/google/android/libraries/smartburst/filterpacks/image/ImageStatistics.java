package com.google.android.libraries.smartburst.filterpacks.image;

/* compiled from: PG */
public class ImageStatistics {
    public final float mMaxBlockMeanGray;
    public final float mMaxBlockPerceptualSharpness;
    public final float mMaxBlockVarianceGray;
    public final int mMaxGray;
    public final float mMeanGray;
    public final float mMinBlockMeanGray;
    public final float mMinBlockVarianceGray;
    public final int mMinGray;
    public final float mPerceptualSharpness;
    public final long mTimestampNs;
    public final float mVarianceGray;

    public ImageStatistics(float f, float f2, int i, int i2, float f3, float f4, float f5, float f6, float f7, float f8, long j) {
        this.mPerceptualSharpness = f;
        this.mMeanGray = f2;
        this.mMaxGray = i;
        this.mMinGray = i2;
        this.mVarianceGray = f3;
        this.mMaxBlockPerceptualSharpness = f4;
        this.mMaxBlockMeanGray = f5;
        this.mMinBlockMeanGray = f6;
        this.mMaxBlockVarianceGray = f7;
        this.mMinBlockVarianceGray = f8;
        this.mTimestampNs = j;
    }

    public float getMaxBlockMeanGray() {
        return this.mMaxBlockMeanGray;
    }

    public float getMaxBlockPerceptualSharpness() {
        return this.mMaxBlockPerceptualSharpness;
    }

    public float getMaxBlockVarianceGray() {
        return this.mMaxBlockVarianceGray;
    }

    public int getMaxGray() {
        return this.mMaxGray;
    }

    public float getMeanGray() {
        return this.mMeanGray;
    }

    public float getMinBlockMeanGray() {
        return this.mMinBlockMeanGray;
    }

    public float getMinBlockVarianceGray() {
        return this.mMinBlockVarianceGray;
    }

    public int getMinGray() {
        return this.mMinGray;
    }

    public float getPerceptualSharpness() {
        return this.mPerceptualSharpness;
    }

    public long getTimestampNs() {
        return this.mTimestampNs;
    }

    public float getVarianceGray() {
        return this.mVarianceGray;
    }
}
