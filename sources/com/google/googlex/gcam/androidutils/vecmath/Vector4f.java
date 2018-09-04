package com.google.googlex.gcam.androidutils.vecmath;

/* compiled from: PG */
public class Vector4f {
    /* renamed from: w */
    public float f2499w;
    /* renamed from: x */
    public float f2500x;
    /* renamed from: y */
    public float f2501y;
    /* renamed from: z */
    public float f2502z;

    public Vector4f(float f, float f2, float f3, float f4) {
        this.f2500x = f;
        this.f2501y = f2;
        this.f2502z = f3;
        this.f2499w = f4;
    }

    public Vector4f(Vector4f vector4f) {
        this.f2500x = vector4f.f2500x;
        this.f2501y = vector4f.f2501y;
        this.f2502z = vector4f.f2502z;
        this.f2499w = vector4f.f2499w;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Vector4f)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Vector4f vector4f = (Vector4f) obj;
        if (this.f2500x == vector4f.f2500x && this.f2501y == vector4f.f2501y && this.f2502z == vector4f.f2502z && this.f2499w == vector4f.f2499w) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f2500x) * 31) + Float.floatToIntBits(this.f2501y)) * 31) + Float.floatToIntBits(this.f2502z)) * 31) + Float.floatToIntBits(this.f2499w);
    }

    public String toString() {
        float f = this.f2500x;
        float f2 = this.f2501y;
        float f3 = this.f2502z;
        float f4 = this.f2499w;
        StringBuilder stringBuilder = new StringBuilder(68);
        stringBuilder.append("(");
        stringBuilder.append(f);
        stringBuilder.append(", ");
        stringBuilder.append(f2);
        stringBuilder.append(", ");
        stringBuilder.append(f3);
        stringBuilder.append(", ");
        stringBuilder.append(f4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
