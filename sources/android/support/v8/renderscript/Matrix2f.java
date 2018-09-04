package android.support.v8.renderscript;

/* compiled from: PG */
public class Matrix2f {
    public final float[] mMat;

    public Matrix2f() {
        this.mMat = new float[4];
        loadIdentity();
    }

    public Matrix2f(float[] fArr) {
        this.mMat = new float[4];
        Object obj = this.mMat;
        System.arraycopy(fArr, 0, obj, 0, obj.length);
    }

    public float get(int i, int i2) {
        return this.mMat[(i + i) + i2];
    }

    public float[] getArray() {
        return this.mMat;
    }

    public void load(Matrix2f matrix2f) {
        Object array = matrix2f.getArray();
        Object obj = this.mMat;
        System.arraycopy(array, 0, obj, 0, obj.length);
    }

    public void loadIdentity() {
        float[] fArr = this.mMat;
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 1.0f;
    }

    public void loadMultiply(Matrix2f matrix2f, Matrix2f matrix2f2) {
        for (int i = 0; i < 2; i++) {
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i2 = 0; i2 < 2; i2++) {
                float f3 = matrix2f2.get(i, i2);
                f2 += matrix2f.get(i2, 0) * f3;
                f += f3 * matrix2f.get(i2, 1);
            }
            set(i, 0, f2);
            set(i, 1, f);
        }
    }

    public void loadRotate(float f) {
        double d = (double) (0.017453292f * f);
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float[] fArr = this.mMat;
        fArr[0] = cos;
        fArr[1] = -sin;
        fArr[2] = sin;
        fArr[3] = cos;
    }

    public void loadScale(float f, float f2) {
        loadIdentity();
        float[] fArr = this.mMat;
        fArr[0] = f;
        fArr[3] = f2;
    }

    public void multiply(Matrix2f matrix2f) {
        Matrix2f matrix2f2 = new Matrix2f();
        matrix2f2.loadMultiply(this, matrix2f);
        load(matrix2f2);
    }

    public void rotate(float f) {
        Matrix2f matrix2f = new Matrix2f();
        matrix2f.loadRotate(f);
        multiply(matrix2f);
    }

    public void scale(float f, float f2) {
        Matrix2f matrix2f = new Matrix2f();
        matrix2f.loadScale(f, f2);
        multiply(matrix2f);
    }

    public void set(int i, int i2, float f) {
        this.mMat[(i + i) + i2] = f;
    }

    public void transpose() {
        float[] fArr = this.mMat;
        float f = fArr[1];
        fArr[1] = fArr[2];
        fArr[2] = f;
    }
}
