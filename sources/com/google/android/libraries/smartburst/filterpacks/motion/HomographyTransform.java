package com.google.android.libraries.smartburst.filterpacks.motion;

import java.util.Arrays;
import p000.jri;

/* compiled from: PG */
public final class HomographyTransform {
    public static final int TRANSFORM_COLUMNS = 3;
    public static final int TRANSFORM_DIMENSION = 9;
    public static final int TRANSFORM_ROWS = 3;
    public final boolean isPanAndZoom;
    public final float[] mTransform;

    private HomographyTransform(float f, float f2, float f3) {
        boolean z;
        if (f3 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        this.mTransform = new float[9];
        float[] fArr = this.mTransform;
        fArr[0] = f3;
        fArr[1] = 0.0f;
        fArr[2] = -2.0f * f;
        fArr[3] = 0.0f;
        fArr[4] = f3;
        fArr[5] = f2 + f2;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
        this.isPanAndZoom = true;
    }

    private HomographyTransform(float[] fArr) {
        boolean z;
        if (fArr.length == 9) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "Transform length must be of length 9");
        this.mTransform = fArr;
        this.isPanAndZoom = false;
    }

    public final boolean closeTo(HomographyTransform homographyTransform, float f) {
        float f2 = 0.0f;
        for (int i = 0; i < 9; i++) {
            f2 += Math.abs(this.mTransform[i] - homographyTransform.mTransform[i]);
        }
        if (f2 < f) {
            return true;
        }
        return false;
    }

    public static HomographyTransform createBlend(HomographyTransform homographyTransform, float f, HomographyTransform homographyTransform2, float f2) {
        float[] toArray = homographyTransform.toArray();
        float[] toArray2 = homographyTransform2.toArray();
        float[] fArr = new float[9];
        for (int i = 0; i < 9; i++) {
            fArr[i] = (toArray[i] * f) + (toArray2[i] * f2);
        }
        return createHomographyTransform(fArr);
    }

    public static HomographyTransform createHomographyTransform(float[] fArr) {
        return new HomographyTransform(Arrays.copyOf(fArr, fArr.length));
    }

    public static float[] createIdentityArray() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static HomographyTransform createIdentityHomographyTransform() {
        return createHomographyTransform(createIdentityArray());
    }

    public static HomographyTransform createIdentityPanAndZoom() {
        return createPanAndZoom(0.0f, 0.0f, 1.0f);
    }

    public static HomographyTransform createPanAndZoom(float f, float f2, float f3) {
        return new HomographyTransform(f, f2, f3);
    }

    public static HomographyTransform createRotation(float f) {
        return createRotationAndZoom(f, 1.0f);
    }

    public static HomographyTransform createRotationAndZoom(float f, float f2) {
        r0 = new float[9];
        double d = (double) f;
        r0[0] = ((float) Math.cos(d)) * f2;
        r0[1] = (-((float) Math.sin(d))) * f2;
        r0[2] = 0.0f;
        r0[3] = ((float) Math.sin(d)) * f2;
        r0[4] = ((float) Math.cos(d)) * f2;
        r0[5] = 0.0f;
        r0[6] = 0.0f;
        r0[7] = 0.0f;
        r0[8] = 1.0f;
        return new HomographyTransform(r0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HomographyTransform)) {
            return false;
        }
        return Arrays.equals(this.mTransform, ((HomographyTransform) obj).mTransform);
    }

    public final float getDisplacementX() {
        return (-this.mTransform[2]) / 2.0f;
    }

    public final float getDisplacementY() {
        return this.mTransform[5] / 2.0f;
    }

    public final float getValue(int i) {
        boolean z;
        if (i < 9) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "Exceeds transform dimensions.");
        return this.mTransform[i];
    }

    public final float getValue(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i < 3) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "Exceeds row limit.");
        if (i2 >= 3) {
            z2 = false;
        }
        jri.m13144a(z2, (Object) "Exceeds column limit.");
        return this.mTransform[(i * 3) + i2];
    }

    public final float getZoom() {
        float[] fArr = this.mTransform;
        return (fArr[4] + fArr[0]) / 2.0f;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.mTransform);
    }

    public final boolean isDegenerateHomography() {
        float[] fArr = this.mTransform;
        return fArr[6] == 0.0f && fArr[7] == 0.0f;
    }

    public final boolean isIdentity() {
        return equals(createIdentityHomographyTransform());
    }

    public final boolean isPanAndZoomOnly() {
        return this.isPanAndZoom;
    }

    public final boolean isTranslationOnly() {
        float[] fArr = this.mTransform;
        return fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[3] == 0.0f && fArr[4] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 1.0f;
    }

    public final void normalize() {
        if (this.mTransform[8] > 0.0f) {
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.mTransform;
                fArr[i] = fArr[i] / fArr[8];
            }
        }
    }

    public final void quadInOpenGL4DCoordinate(float[] fArr) {
        float[] fArr2 = this.mTransform;
        fArr[0] = ((-fArr2[0]) - fArr2[1]) + fArr2[2];
        fArr[1] = ((-fArr2[3]) - fArr2[4]) + fArr2[5];
        fArr[2] = 0.0f;
        fArr[3] = ((-fArr2[6]) - fArr2[7]) + fArr2[8];
        fArr[4] = (fArr2[0] - fArr2[1]) + fArr2[2];
        fArr[5] = (fArr2[3] - fArr2[4]) + fArr2[5];
        fArr[6] = 0.0f;
        fArr[7] = (fArr2[6] - fArr2[7]) + fArr2[8];
        fArr[8] = ((-fArr2[0]) + fArr2[1]) + fArr2[2];
        fArr[9] = ((-fArr2[3]) + fArr2[4]) + fArr2[5];
        fArr[10] = 0.0f;
        fArr[11] = ((-fArr2[6]) + fArr2[7]) + fArr2[8];
        fArr[12] = (fArr2[0] + fArr2[1]) + fArr2[2];
        fArr[13] = (fArr2[3] + fArr2[4]) + fArr2[5];
        fArr[14] = 0.0f;
        fArr[15] = fArr2[8] + (fArr2[6] + fArr2[7]);
    }

    public final void setValue(int i, float f) {
        boolean z;
        if (i < 9) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "Exceeds transform dimensions.");
        this.mTransform[i] = f;
    }

    public final void setValue(int i, int i2, float f) {
        boolean z;
        boolean z2 = true;
        if (i < 3) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "Exceeds row limit.");
        if (i2 >= 3) {
            z2 = false;
        }
        jri.m13144a(z2, (Object) "Exceeds column limit.");
        this.mTransform[(i * 3) + i2] = f;
    }

    public final float[] toArray() {
        float[] fArr = this.mTransform;
        return Arrays.copyOf(fArr, fArr.length);
    }

    public final String toString() {
        float[] fArr = this.mTransform;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        StringBuilder stringBuilder = new StringBuilder(153);
        stringBuilder.append("[");
        stringBuilder.append(f);
        stringBuilder.append(", ");
        stringBuilder.append(f2);
        stringBuilder.append(", ");
        stringBuilder.append(f3);
        stringBuilder.append("; ");
        stringBuilder.append(f4);
        stringBuilder.append(", ");
        stringBuilder.append(f5);
        stringBuilder.append(", ");
        stringBuilder.append(f6);
        stringBuilder.append("; ");
        stringBuilder.append(f7);
        stringBuilder.append(", ");
        stringBuilder.append(f8);
        stringBuilder.append(", ");
        stringBuilder.append(f9);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
