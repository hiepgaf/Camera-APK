package com.google.android.libraries.smartburst.filterfw.geometry;

/* compiled from: PG */
public class IdentityScaler implements Scaler {
    public int[] scale(int i, int i2) {
        if (i < 0 || i2 < 0) {
            StringBuilder stringBuilder = new StringBuilder(54);
            stringBuilder.append("width and height must be >= 0: ");
            stringBuilder.append(i);
            stringBuilder.append(" ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return new int[]{i, i2};
    }
}
