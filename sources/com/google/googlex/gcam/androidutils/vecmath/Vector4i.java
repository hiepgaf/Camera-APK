package com.google.googlex.gcam.androidutils.vecmath;

import p000.khx;

/* compiled from: PG */
public class Vector4i {
    /* renamed from: w */
    public int f2503w;
    /* renamed from: x */
    public int f2504x;
    /* renamed from: y */
    public int f2505y;
    /* renamed from: z */
    public int f2506z;

    public Vector4i(int i, int i2, int i3, int i4) {
        this.f2504x = i;
        this.f2505y = i2;
        this.f2506z = i3;
        this.f2503w = i4;
    }

    public Vector4i(Vector4i vector4i) {
        this.f2504x = vector4i.f2504x;
        this.f2505y = vector4i.f2505y;
        this.f2506z = vector4i.f2506z;
        this.f2503w = vector4i.f2503w;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Vector4i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Vector4i vector4i = (Vector4i) obj;
        if (this.f2504x == vector4i.f2504x && this.f2505y == vector4i.f2505y && this.f2506z == vector4i.f2506z && this.f2503w == vector4i.f2503w) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f2504x * 31) + this.f2505y) * 31) + this.f2506z) * 31) + this.f2503w;
    }

    public String toString() {
        int i = this.f2504x;
        int i2 = this.f2505y;
        int i3 = this.f2506z;
        int i4 = this.f2503w;
        StringBuilder stringBuilder = new StringBuilder(52);
        stringBuilder.append("(");
        stringBuilder.append(i);
        stringBuilder.append(", ");
        stringBuilder.append(i2);
        stringBuilder.append(", ");
        stringBuilder.append(i3);
        stringBuilder.append(", ");
        stringBuilder.append(i4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public String toStringUnsigned() {
        String a = khx.m4938a(this.f2504x);
        String a2 = khx.m4938a(this.f2505y);
        String a3 = khx.m4938a(this.f2506z);
        String a4 = khx.m4938a(this.f2503w);
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
