package com.google.googlex.gcam.androidutils.vecmath;

import p000.khx;

/* compiled from: PG */
public class Vector4b {
    /* renamed from: w */
    public byte f2495w;
    /* renamed from: x */
    public byte f2496x;
    /* renamed from: y */
    public byte f2497y;
    /* renamed from: z */
    public byte f2498z;

    public Vector4b(byte b, byte b2, byte b3, byte b4) {
        this.f2496x = b;
        this.f2497y = b2;
        this.f2498z = b3;
        this.f2495w = b4;
    }

    public Vector4b(int i, int i2, int i3, int i4) {
        this.f2496x = (byte) i;
        this.f2497y = (byte) i2;
        this.f2498z = (byte) i3;
        this.f2495w = (byte) i4;
    }

    public Vector4b(Vector4b vector4b) {
        this.f2496x = vector4b.f2496x;
        this.f2497y = vector4b.f2497y;
        this.f2498z = vector4b.f2498z;
        this.f2495w = vector4b.f2495w;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Vector4b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Vector4b vector4b = (Vector4b) obj;
        if (this.f2496x == vector4b.f2496x && this.f2497y == vector4b.f2497y && this.f2498z == vector4b.f2498z && this.f2495w == vector4b.f2495w) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f2496x * 31) + this.f2497y) * 31) + this.f2498z) * 31) + this.f2495w;
    }

    public String toString() {
        byte b = this.f2496x;
        byte b2 = this.f2497y;
        byte b3 = this.f2498z;
        byte b4 = this.f2495w;
        StringBuilder stringBuilder = new StringBuilder(24);
        stringBuilder.append("(");
        stringBuilder.append(b);
        stringBuilder.append(", ");
        stringBuilder.append(b2);
        stringBuilder.append(", ");
        stringBuilder.append(b3);
        stringBuilder.append(", ");
        stringBuilder.append(b4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public String toStringUnsigned() {
        String a = khx.m4937a(this.f2496x);
        String a2 = khx.m4937a(this.f2497y);
        String a3 = khx.m4937a(this.f2498z);
        String a4 = khx.m4937a(this.f2495w);
        int length = String.valueOf(a).length();
        int length2 = String.valueOf(a2).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 8) + length2) + String.valueOf(a3).length()) + String.valueOf(a4).length());
        stringBuilder.append("(");
        stringBuilder.append(a);
        stringBuilder.append(", ");
        stringBuilder.append(a2);
        stringBuilder.append(", ");
        stringBuilder.append(a3);
        stringBuilder.append(", ");
        stringBuilder.append(a4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
