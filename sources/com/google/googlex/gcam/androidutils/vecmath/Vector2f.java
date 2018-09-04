package com.google.googlex.gcam.androidutils.vecmath;

/* compiled from: PG */
public class Vector2f {
    /* renamed from: x */
    public float f2485x;
    /* renamed from: y */
    public float f2486y;

    public Vector2f(float f, float f2) {
        this.f2485x = f;
        this.f2486y = f2;
    }

    public Vector2f(Vector2f vector2f) {
        this.f2485x = vector2f.f2485x;
        this.f2486y = vector2f.f2486y;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Vector2f)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Vector2f vector2f = (Vector2f) obj;
        if (this.f2485x == vector2f.f2485x && this.f2486y == vector2f.f2486y) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f2485x) * 31) + Float.floatToIntBits(this.f2486y);
    }

    public String toString() {
        float f = this.f2485x;
        float f2 = this.f2486y;
        StringBuilder stringBuilder = new StringBuilder(34);
        stringBuilder.append("(");
        stringBuilder.append(f);
        stringBuilder.append(", ");
        stringBuilder.append(f2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
