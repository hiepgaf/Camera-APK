package com.google.android.libraries.smartburst.filterfw.geometry;

/* compiled from: PG */
public class MultipleOfXScaler implements Scaler {
    public final Scaler mAnotherScaler;
    public final int mMultipleOfX;

    public MultipleOfXScaler(int i) {
        this(new IdentityScaler(), i);
    }

    public MultipleOfXScaler(Scaler scaler, int i) {
        if (i <= 0) {
            StringBuilder stringBuilder = new StringBuilder(36);
            stringBuilder.append("multipleOfX must be > 0: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (scaler == null) {
            throw new IllegalArgumentException("anotherScaler must not be null.");
        } else {
            this.mMultipleOfX = i;
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
        return scaleMaxDimension(scale[0], scale[1], this.mMultipleOfX);
    }

    private int[] scaleMaxDimension(int i, int i2, int i3) {
        if (i3 <= 0) {
            StringBuilder stringBuilder = new StringBuilder(36);
            stringBuilder.append("multipleOfX must be > 0: ");
            stringBuilder.append(i3);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i3 == 1 || i % i3 == 0) {
            return new int[]{i, i2};
        } else {
            int round = Math.round(((float) i) / ((float) i3));
            return new int[]{round * i3, Math.round(((r2 * ((float) round)) * ((float) i2)) / r1)};
        }
    }
}
