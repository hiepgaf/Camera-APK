package com.google.android.libraries.smartburst.filterfw;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.Matrix;

@TargetApi(11)
/* compiled from: PG */
public class SurfaceTexTransform {
    public final float[] mMatrix;

    private SurfaceTexTransform(float[] fArr) {
        this.mMatrix = fArr;
    }

    public SurfaceTexTransform applyOn(SurfaceTexture surfaceTexture) {
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        return applyOn(fArr);
    }

    public SurfaceTexTransform applyOn(float[] fArr) {
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, this.mMatrix, 0);
        return new SurfaceTexTransform(fArr2);
    }

    public static SurfaceTexTransform create(int i, boolean z, boolean z2) {
        if (i % 90 != 0) {
            throw new IllegalArgumentException("Rotation must be a multiple of 90!");
        }
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, (float) i, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
        if (z) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        if (z2) {
            Matrix.translateM(fArr, 0, 0.0f, 1.0f, 0.0f);
            Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        }
        return new SurfaceTexTransform(fArr);
    }

    public static SurfaceTexTransform identity() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return new SurfaceTexTransform(fArr);
    }

    public float[] matrix() {
        return this.mMatrix;
    }

    public boolean requiresSwappingDimensions() {
        float[] fArr = this.mMatrix;
        float abs = Math.abs((fArr[12] + (fArr[0] + (fArr[4] * 0.5f))) - 8.0f);
        float[] fArr2 = this.mMatrix;
        if (abs < Math.abs((fArr2[13] + (fArr2[1] + (fArr2[5] * 0.5f))) - 8.0f)) {
            return true;
        }
        return false;
    }
}
