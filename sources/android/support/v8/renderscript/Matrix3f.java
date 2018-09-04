package android.support.v8.renderscript;

/* compiled from: PG */
public class Matrix3f {
    public final float[] mMat;

    public Matrix3f() {
        this.mMat = new float[9];
        loadIdentity();
    }

    public Matrix3f(float[] fArr) {
        this.mMat = new float[9];
        Object obj = this.mMat;
        System.arraycopy(fArr, 0, obj, 0, obj.length);
    }

    public float get(int i, int i2) {
        return this.mMat[(i * 3) + i2];
    }

    public float[] getArray() {
        return this.mMat;
    }

    public void load(Matrix3f matrix3f) {
        Object array = matrix3f.getArray();
        Object obj = this.mMat;
        System.arraycopy(array, 0, obj, 0, obj.length);
    }

    public void loadIdentity() {
        float[] fArr = this.mMat;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 1.0f;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public void loadMultiply(Matrix3f matrix3f, Matrix3f matrix3f2) {
        for (int i = 0; i < 3; i++) {
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i2 = 0; i2 < 3; i2++) {
                float f4 = matrix3f2.get(i, i2);
                f3 += matrix3f.get(i2, 0) * f4;
                f2 += matrix3f.get(i2, 1) * f4;
                f += f4 * matrix3f.get(i2, 2);
            }
            set(i, 0, f3);
            set(i, 1, f2);
            set(i, 2, f);
        }
    }

    public void loadRotate(float f) {
        loadIdentity();
        double d = (double) (0.017453292f * f);
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float[] fArr = this.mMat;
        fArr[0] = cos;
        fArr[1] = -sin;
        fArr[3] = sin;
        fArr[4] = cos;
    }

    public void loadRotate(float f, float f2, float f3, float f4) {
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
        float[] fArr = this.mMat;
        fArr[0] = ((f2 * f2) * sqrt) + cos;
        float f7 = (f2 * f3) * sqrt;
        fArr[3] = f7 - sin;
        float f8 = (f4 * f2) * sqrt;
        fArr[6] = f8 + f6;
        fArr[1] = sin + f7;
        fArr[4] = ((f3 * f3) * sqrt) + cos;
        sin = (f3 * f4) * sqrt;
        fArr[7] = sin - f5;
        fArr[2] = f8 - f6;
        fArr[5] = sin + f5;
        fArr[8] = (sqrt * (f4 * f4)) + cos;
    }

    public void loadScale(float f, float f2) {
        loadIdentity();
        float[] fArr = this.mMat;
        fArr[0] = f;
        fArr[4] = f2;
    }

    public void loadScale(float f, float f2, float f3) {
        loadIdentity();
        float[] fArr = this.mMat;
        fArr[0] = f;
        fArr[4] = f2;
        fArr[8] = f3;
    }

    public void loadTranslate(float f, float f2) {
        loadIdentity();
        float[] fArr = this.mMat;
        fArr[6] = f;
        fArr[7] = f2;
    }

    public void multiply(Matrix3f matrix3f) {
        Matrix3f matrix3f2 = new Matrix3f();
        matrix3f2.loadMultiply(this, matrix3f);
        load(matrix3f2);
    }

    public void rotate(float f) {
        Matrix3f matrix3f = new Matrix3f();
        matrix3f.loadRotate(f);
        multiply(matrix3f);
    }

    public void rotate(float f, float f2, float f3, float f4) {
        Matrix3f matrix3f = new Matrix3f();
        matrix3f.loadRotate(f, f2, f3, f4);
        multiply(matrix3f);
    }

    public void scale(float f, float f2) {
        Matrix3f matrix3f = new Matrix3f();
        matrix3f.loadScale(f, f2);
        multiply(matrix3f);
    }

    public void scale(float f, float f2, float f3) {
        Matrix3f matrix3f = new Matrix3f();
        matrix3f.loadScale(f, f2, f3);
        multiply(matrix3f);
    }

    public void set(int i, int i2, float f) {
        this.mMat[(i * 3) + i2] = f;
    }

    public void translate(float f, float f2) {
        Matrix3f matrix3f = new Matrix3f();
        matrix3f.loadTranslate(f, f2);
        multiply(matrix3f);
    }

    public void transpose() {
        for (int i = 0; i < 2; i++) {
            for (int i2 = i + 1; i2 < 3; i2++) {
                float[] fArr = this.mMat;
                int i3 = (i * 3) + i2;
                float f = fArr[i3];
                int i4 = (i2 * 3) + i;
                fArr[i3] = fArr[i4];
                fArr[i4] = f;
            }
        }
    }
}
