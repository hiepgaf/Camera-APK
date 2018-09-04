package com.google.googlex.gcam.androidutils.vecmath;

/* compiled from: PG */
public class Matrix2f {
    public float m00;
    public float m01;
    public float m10;
    public float m11;

    public Matrix2f(float f) {
        this.m00 = f;
        this.m10 = f;
        this.m01 = f;
        this.m11 = f;
    }

    Matrix2f(float f, float f2, float f3, float f4) {
        this.m00 = f;
        this.m10 = f3;
        this.m01 = f2;
        this.m11 = f4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Matrix2f)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Matrix2f matrix2f = (Matrix2f) obj;
        if (this.m00 == matrix2f.m00 && this.m10 == matrix2f.m10 && this.m01 == matrix2f.m01 && this.m11 == matrix2f.m11) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.m00) * 31) + Float.floatToIntBits(this.m01)) * 31) + Float.floatToIntBits(this.m10)) * 31) + Float.floatToIntBits(this.m11);
    }

    public float[] toFloatArray() {
        return new float[]{this.m00, this.m10, this.m01, this.m11};
    }

    public String toString() {
        return String.format("[\t%f\t%f\t]\n[\t%f\t%f\t]", new Object[]{Float.valueOf(this.m00), Float.valueOf(this.m01), Float.valueOf(this.m10), Float.valueOf(this.m11)});
    }
}
