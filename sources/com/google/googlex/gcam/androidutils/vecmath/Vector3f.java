package com.google.googlex.gcam.androidutils.vecmath;

/* compiled from: PG */
public class Vector3f {
    /* renamed from: x */
    public float f2489x;
    /* renamed from: y */
    public float f2490y;
    /* renamed from: z */
    public float f2491z;

    public Vector3f(float f, float f2, float f3) {
        this.f2489x = f;
        this.f2490y = f2;
        this.f2491z = f3;
    }

    public Vector3f(Vector3f vector3f) {
        this.f2489x = vector3f.f2489x;
        this.f2490y = vector3f.f2490y;
        this.f2491z = vector3f.f2491z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Vector3f)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Vector3f vector3f = (Vector3f) obj;
        if (this.f2489x == vector3f.f2489x && this.f2490y == vector3f.f2490y && this.f2491z == vector3f.f2491z) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f2489x) * 31) + Float.floatToIntBits(this.f2490y)) * 31) + Float.floatToIntBits(this.f2491z);
    }

    public String toString() {
        float f = this.f2489x;
        float f2 = this.f2490y;
        float f3 = this.f2491z;
        StringBuilder stringBuilder = new StringBuilder(51);
        stringBuilder.append("(");
        stringBuilder.append(f);
        stringBuilder.append(", ");
        stringBuilder.append(f2);
        stringBuilder.append(", ");
        stringBuilder.append(f3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
