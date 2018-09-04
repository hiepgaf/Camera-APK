package com.google.googlex.gcam.androidutils.vecmath;

/* compiled from: PG */
public class Vector4s {
    /* renamed from: w */
    public short f2507w;
    /* renamed from: x */
    public short f2508x;
    /* renamed from: y */
    public short f2509y;
    /* renamed from: z */
    public short f2510z;

    public Vector4s(Vector4s vector4s) {
        this.f2508x = vector4s.f2508x;
        this.f2509y = vector4s.f2509y;
        this.f2510z = vector4s.f2510z;
        this.f2507w = vector4s.f2507w;
    }

    public Vector4s(short s, short s2, short s3, short s4) {
        this.f2508x = s;
        this.f2509y = s2;
        this.f2510z = s3;
        this.f2507w = s4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Vector4s)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Vector4s vector4s = (Vector4s) obj;
        if (this.f2508x == vector4s.f2508x && this.f2509y == vector4s.f2509y && this.f2510z == vector4s.f2510z && this.f2507w == vector4s.f2507w) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f2508x * 31) + this.f2509y) * 31) + this.f2510z) * 31) + this.f2507w;
    }

    public String toString() {
        short s = this.f2508x;
        short s2 = this.f2509y;
        short s3 = this.f2510z;
        short s4 = this.f2507w;
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append("(");
        stringBuilder.append(s);
        stringBuilder.append(", ");
        stringBuilder.append(s2);
        stringBuilder.append(", ");
        stringBuilder.append(s3);
        stringBuilder.append(", ");
        stringBuilder.append(s4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public String toStringUnsigned() {
        short s = this.f2508x;
        short s2 = this.f2509y;
        short s3 = this.f2510z;
        short s4 = this.f2507w;
        StringBuilder stringBuilder = new StringBuilder(52);
        stringBuilder.append("(");
        stringBuilder.append((char) s);
        stringBuilder.append(", ");
        stringBuilder.append((char) s2);
        stringBuilder.append(", ");
        stringBuilder.append((char) s3);
        stringBuilder.append(", ");
        stringBuilder.append((char) s4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
