package android.support.v8.renderscript;

/* compiled from: PG */
public class Matrix4f {
    public final float[] mMat;

    public Matrix4f() {
        this.mMat = new float[16];
        loadIdentity();
    }

    public Matrix4f(float[] fArr) {
        this.mMat = new float[16];
        Object obj = this.mMat;
        System.arraycopy(fArr, 0, obj, 0, obj.length);
    }

    private float computeCofactor(int i, int i2) {
        int i3 = (i + 1) % 4;
        int i4 = (i + 2) % 4;
        int i5 = (i + 3) % 4;
        float[] fArr = this.mMat;
        int i6 = ((i2 + 1) % 4) << 2;
        float f = fArr[i3 + i6];
        int i7 = ((i2 + 2) % 4) << 2;
        float f2 = fArr[i4 + i7];
        int i8 = ((i2 + 3) % 4) << 2;
        float f3 = fArr[i5 + i8];
        float f4 = fArr[i4 + i8];
        float f5 = fArr[i5 + i7];
        float f6 = fArr[i7 + i3];
        float f7 = fArr[i4 + i6];
        float f8 = fArr[i5 + i6];
        float f9 = (fArr[i3 + i8] * ((f7 * f5) - (f8 * f2))) + ((((f2 * f3) - (f4 * f5)) * f) - (((f7 * f3) - (f4 * f8)) * f6));
        if (((i + i2) & 1) != 0) {
            return -f9;
        }
        return f9;
    }

    public float get(int i, int i2) {
        return this.mMat[(i << 2) + i2];
    }

    public float[] getArray() {
        return this.mMat;
    }

    public boolean inverse() {
        int i = 0;
        Matrix4f matrix4f = new Matrix4f();
        for (int i2 = 0; i2 < 4; i2++) {
            for (int i3 = 0; i3 < 4; i3++) {
                matrix4f.mMat[(i2 << 2) + i3] = computeCofactor(i2, i3);
            }
        }
        float[] fArr = this.mMat;
        float f = fArr[0];
        float[] fArr2 = matrix4f.mMat;
        float f2 = (fArr[12] * fArr2[3]) + (((f * fArr2[0]) + (fArr[4] * fArr2[1])) + (fArr[8] * fArr2[2]));
        if (((double) Math.abs(f2)) < 1.0E-6d) {
            return false;
        }
        f2 = 1.0f / f2;
        while (i < 16) {
            this.mMat[i] = matrix4f.mMat[i] * f2;
            i++;
        }
        return true;
    }

    public boolean inverseTranspose() {
        int i = 0;
        Matrix4f matrix4f = new Matrix4f();
        for (int i2 = 0; i2 < 4; i2++) {
            for (int i3 = 0; i3 < 4; i3++) {
                matrix4f.mMat[(i3 << 2) + i2] = computeCofactor(i2, i3);
            }
        }
        float[] fArr = this.mMat;
        float f = fArr[0];
        float[] fArr2 = matrix4f.mMat;
        float f2 = (fArr[12] * fArr2[12]) + (((f * fArr2[0]) + (fArr[4] * fArr2[4])) + (fArr[8] * fArr2[8]));
        if (((double) Math.abs(f2)) < 1.0E-6d) {
            return false;
        }
        f2 = 1.0f / f2;
        while (i < 16) {
            this.mMat[i] = matrix4f.mMat[i] * f2;
            i++;
        }
        return true;
    }

    public void load(Matrix3f matrix3f) {
        float[] fArr = this.mMat;
        float[] fArr2 = matrix3f.mMat;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[3] = 0.0f;
        fArr[4] = fArr2[3];
        fArr[5] = fArr2[4];
        fArr[6] = fArr2[5];
        fArr[7] = 0.0f;
        fArr[8] = fArr2[6];
        fArr[9] = fArr2[7];
        fArr[10] = fArr2[8];
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public void load(Matrix4f matrix4f) {
        Object array = matrix4f.getArray();
        Object obj = this.mMat;
        System.arraycopy(array, 0, obj, 0, obj.length);
    }

    public void loadFrustum(float f, float f2, float f3, float f4, float f5, float f6) {
        loadIdentity();
        float[] fArr = this.mMat;
        float f7 = f5 + f5;
        float f8 = f2 - f;
        fArr[0] = f7 / f8;
        float f9 = f4 - f3;
        fArr[5] = f7 / f9;
        fArr[8] = (f2 + f) / f8;
        fArr[9] = (f4 + f3) / f9;
        f7 = f6 - f5;
        fArr[10] = (-(f6 + f5)) / f7;
        fArr[11] = -1.0f;
        fArr[14] = ((-2.0f * f6) * f5) / f7;
        fArr[15] = 0.0f;
    }

    public void loadIdentity() {
        float[] fArr = this.mMat;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public void loadMultiply(Matrix4f matrix4f, Matrix4f matrix4f2) {
        for (int i = 0; i < 4; i++) {
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            for (int i2 = 0; i2 < 4; i2++) {
                float f5 = matrix4f2.get(i, i2);
                f4 += matrix4f.get(i2, 0) * f5;
                f3 += matrix4f.get(i2, 1) * f5;
                f2 += matrix4f.get(i2, 2) * f5;
                f += f5 * matrix4f.get(i2, 3);
            }
            set(i, 0, f4);
            set(i, 1, f3);
            set(i, 2, f2);
            set(i, 3, f);
        }
    }

    public void loadOrtho(float f, float f2, float f3, float f4, float f5, float f6) {
        loadIdentity();
        float[] fArr = this.mMat;
        float f7 = f2 - f;
        fArr[0] = 2.0f / f7;
        float f8 = f4 - f3;
        fArr[5] = 2.0f / f8;
        float f9 = f6 - f5;
        fArr[10] = -2.0f / f9;
        fArr[12] = (-(f2 + f)) / f7;
        fArr[13] = (-(f4 + f3)) / f8;
        fArr[14] = (-(f6 + f5)) / f9;
    }

    public void loadOrthoWindow(int i, int i2) {
        loadOrtho(0.0f, (float) i, (float) i2, 0.0f, -1.0f, 1.0f);
    }

    public void loadPerspective(float f, float f2, float f3, float f4) {
        float tan = f3 * ((float) Math.tan((double) ((float) ((((double) f) * 3.141592653589793d) / 360.0d))));
        float f5 = -tan;
        loadFrustum(f5 * f2, tan * f2, f5, tan, f3, f4);
    }

    public void loadProjectionNormalized(int i, int i2) {
        Matrix4f matrix4f = new Matrix4f();
        Matrix4f matrix4f2 = new Matrix4f();
        if (i > i2) {
            float f = ((float) i) / ((float) i2);
            matrix4f.loadFrustum(-f, f, -1.0f, 1.0f, 1.0f, 100.0f);
        } else {
            float f2 = ((float) i2) / ((float) i);
            matrix4f.loadFrustum(-1.0f, 1.0f, -f2, f2, 1.0f, 100.0f);
        }
        matrix4f2.loadRotate(180.0f, 0.0f, 1.0f, 0.0f);
        matrix4f.loadMultiply(matrix4f, matrix4f2);
        matrix4f2.loadScale(-2.0f, 2.0f, 1.0f);
        matrix4f.loadMultiply(matrix4f, matrix4f2);
        matrix4f2.loadTranslate(0.0f, 0.0f, 2.0f);
        matrix4f.loadMultiply(matrix4f, matrix4f2);
        load(matrix4f);
    }

    public void loadRotate(float f, float f2, float f3, float f4) {
        float[] fArr = this.mMat;
        fArr[3] = 0.0f;
        fArr[7] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
        double d = (double) (0.017453292f * f);
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float sqrt = (float) Math.sqrt((double) (((f2 * f2) + (f3 * f3)) + (f4 * f4)));
        if (sqrt == 1.0f) {
            sqrt = 1.0f / sqrt;
            f2 *= sqrt;
            f3 *= sqrt;
            f4 *= sqrt;
        }
        sqrt = 1.0f - cos;
        float f5 = f2 * sin;
        float f6 = f3 * sin;
        sin *= f4;
        float[] fArr2 = this.mMat;
        fArr2[0] = ((f2 * f2) * sqrt) + cos;
        float f7 = (f2 * f3) * sqrt;
        fArr2[4] = f7 - sin;
        float f8 = (f4 * f2) * sqrt;
        fArr2[8] = f8 + f6;
        fArr2[1] = sin + f7;
        fArr2[5] = ((f3 * f3) * sqrt) + cos;
        sin = (f3 * f4) * sqrt;
        fArr2[9] = sin - f5;
        fArr2[2] = f8 - f6;
        fArr2[6] = sin + f5;
        fArr2[10] = (sqrt * (f4 * f4)) + cos;
    }

    public void loadScale(float f, float f2, float f3) {
        loadIdentity();
        float[] fArr = this.mMat;
        fArr[0] = f;
        fArr[5] = f2;
        fArr[10] = f3;
    }

    public void loadTranslate(float f, float f2, float f3) {
        loadIdentity();
        float[] fArr = this.mMat;
        fArr[12] = f;
        fArr[13] = f2;
        fArr[14] = f3;
    }

    public void multiply(Matrix4f matrix4f) {
        Matrix4f matrix4f2 = new Matrix4f();
        matrix4f2.loadMultiply(this, matrix4f);
        load(matrix4f2);
    }

    public void rotate(float f, float f2, float f3, float f4) {
        Matrix4f matrix4f = new Matrix4f();
        matrix4f.loadRotate(f, f2, f3, f4);
        multiply(matrix4f);
    }

    public void scale(float f, float f2, float f3) {
        Matrix4f matrix4f = new Matrix4f();
        matrix4f.loadScale(f, f2, f3);
        multiply(matrix4f);
    }

    public void set(int i, int i2, float f) {
        this.mMat[(i << 2) + i2] = f;
    }

    public void translate(float f, float f2, float f3) {
        Matrix4f matrix4f = new Matrix4f();
        matrix4f.loadTranslate(f, f2, f3);
        multiply(matrix4f);
    }

    public void transpose() {
        for (int i = 0; i < 3; i++) {
            for (int i2 = i + 1; i2 < 4; i2++) {
                float[] fArr = this.mMat;
                int i3 = (i << 2) + i2;
                float f = fArr[i3];
                int i4 = (i2 << 2) + i;
                fArr[i3] = fArr[i4];
                fArr[i4] = f;
            }
        }
    }
}
