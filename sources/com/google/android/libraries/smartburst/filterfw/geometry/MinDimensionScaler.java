package com.google.android.libraries.smartburst.filterfw.geometry;

/* compiled from: PG */
public class MinDimensionScaler implements Scaler {
    public final Scaler mAnotherScaler;
    public final int mMinimumDimension;

    public MinDimensionScaler(int i) {
        this(new IdentityScaler(), i);
    }

    public MinDimensionScaler(Scaler scaler, int i) {
        if (i < 0) {
            StringBuilder stringBuilder = new StringBuilder(42);
            stringBuilder.append("minimumDimension must be >= 0: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (scaler == null) {
            throw new IllegalArgumentException("anotherScaler must not be null.");
        } else {
            this.mMinimumDimension = i;
            this.mAnotherScaler = scaler;
        }
    }

    public int[] scale(int i, int i2) {
        if (i < 0 || i2 < 0) {
            StringBuilder stringBuilder = new StringBuilder(54);
            stringBuilder.append("width and height must be >= 0: ");
            stringBuilder.append(i);
            stringBuilder.append(" ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        int[] scale = this.mAnotherScaler.scale(i, i2);
        return scaleMinDimension(scale[0], scale[1], this.mMinimumDimension);
    }

    private int[] scaleMinDimension(int i, int i2, int i3) {
        if (i3 < 0) {
            StringBuilder stringBuilder = new StringBuilder(42);
            stringBuilder.append("minimumDimension must be >= 0: ");
            stringBuilder.append(i3);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i3 >= i || i3 >= i2) {
            return new int[]{i, i2};
        } else if (i < i2) {
            return new int[]{i3, Math.round((((float) i3) * ((float) i2)) / ((float) i))};
        } else {
            return new int[]{Math.round((((float) i3) * ((float) i)) / ((float) i2)), i3};
        }
    }
}
