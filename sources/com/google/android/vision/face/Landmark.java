package com.google.android.vision.face;

import android.graphics.PointF;

/* compiled from: PG */
public class Landmark {
    public static final int BOTTOM_MOUTH = 0;
    public static final int LEFT_CHEEK = 1;
    public static final int LEFT_EAR = 3;
    public static final int LEFT_EAR_TIP = 2;
    public static final int LEFT_EYE = 4;
    public static final int LEFT_MOUTH = 5;
    public static final int NOSE_BASE = 6;
    public static final int RIGHT_CHEEK = 7;
    public static final int RIGHT_EAR = 9;
    public static final int RIGHT_EAR_TIP = 8;
    public static final int RIGHT_EYE = 10;
    public static final int RIGHT_MOUTH = 11;
    public int mCategory;
    public PointF mPosition;

    public Landmark(PointF pointF, int i) {
        this.mPosition = pointF;
        this.mCategory = i;
    }

    public int getCategory() {
        return this.mCategory;
    }

    public PointF getPosition() {
        return this.mPosition;
    }
}
