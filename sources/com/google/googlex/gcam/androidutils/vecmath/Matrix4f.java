package com.google.googlex.gcam.androidutils.vecmath;

/* compiled from: PG */
public class Matrix4f {
    public float m00;
    public float m01;
    public float m02;
    public float m03;
    public float m10;
    public float m11;
    public float m12;
    public float m13;
    public float m20;
    public float m21;
    public float m22;
    public float m23;
    public float m30;
    public float m31;
    public float m32;
    public float m33;

    public Matrix4f(float f) {
        this.m00 = f;
        this.m10 = f;
        this.m20 = f;
        this.m30 = f;
        this.m01 = f;
        this.m11 = f;
        this.m21 = f;
        this.m31 = f;
        this.m02 = f;
        this.m12 = f;
        this.m22 = f;
        this.m32 = f;
        this.m03 = f;
        this.m13 = f;
        this.m23 = f;
        this.m33 = f;
    }

    Matrix4f(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.m00 = f;
        this.m10 = f5;
        this.m20 = f9;
        this.m30 = f13;
        this.m01 = f2;
        this.m11 = f6;
        this.m21 = f10;
        this.m31 = f14;
        this.m02 = f3;
        this.m12 = f7;
        this.m22 = f11;
        this.m32 = f15;
        this.m03 = f4;
        this.m13 = f8;
        this.m23 = f12;
        this.m33 = f16;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Matrix4f)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Matrix4f matrix4f = (Matrix4f) obj;
        if (this.m00 == matrix4f.m00 && this.m10 == matrix4f.m10 && this.m20 == matrix4f.m20 && this.m30 == matrix4f.m30 && this.m01 == matrix4f.m01 && this.m11 == matrix4f.m11 && this.m21 == matrix4f.m21 && this.m31 == matrix4f.m31 && this.m02 == matrix4f.m02 && this.m12 == matrix4f.m12 && this.m22 == matrix4f.m22 && this.m32 == matrix4f.m32 && this.m03 == matrix4f.m03 && this.m13 == matrix4f.m13 && this.m23 == matrix4f.m23 && this.m33 == matrix4f.m33) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((Float.floatToIntBits(this.m00) * 31) + Float.floatToIntBits(this.m01)) * 31) + Float.floatToIntBits(this.m02)) * 31) + Float.floatToIntBits(this.m03)) * 31) + Float.floatToIntBits(this.m10)) * 31) + Float.floatToIntBits(this.m11)) * 31) + Float.floatToIntBits(this.m12)) * 31) + Float.floatToIntBits(this.m13)) * 31) + Float.floatToIntBits(this.m20)) * 31) + Float.floatToIntBits(this.m21)) * 31) + Float.floatToIntBits(this.m22)) * 31) + Float.floatToIntBits(this.m23)) * 31) + Float.floatToIntBits(this.m30)) * 31) + Float.floatToIntBits(this.m31)) * 31) + Float.floatToIntBits(this.m32)) * 31) + Float.floatToIntBits(this.m33);
    }

    public static final Matrix4f makeIdentity() {
        return new Matrix4f(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    public static final Matrix4f makeZero() {
        return new Matrix4f();
    }

    public float[] toFloatArray() {
        return new float[]{this.m00, this.m10, this.m20, this.m30, this.m01, this.m11, this.m21, this.m31, this.m02, this.m12, this.m22, this.m32, this.m03, this.m13, this.m23, this.m33};
    }

    public String toString() {
        return String.format("[\t%f\t%f\t%f\t%f\t]\n[\t%f\t%f\t%f\t%f\t]\n[\t%f\t%f\t%f\t%f\t]\n[\t%f\t%f\t%f\t%f\t]", new Object[]{Float.valueOf(this.m00), Float.valueOf(this.m01), Float.valueOf(this.m02), Float.valueOf(this.m03), Float.valueOf(this.m10), Float.valueOf(this.m11), Float.valueOf(this.m12), Float.valueOf(this.m13), Float.valueOf(this.m20), Float.valueOf(this.m21), Float.valueOf(this.m22), Float.valueOf(this.m23), Float.valueOf(this.m30), Float.valueOf(this.m31), Float.valueOf(this.m32), Float.valueOf(this.m33)});
    }
}
