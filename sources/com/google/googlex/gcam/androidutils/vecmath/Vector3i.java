package com.google.googlex.gcam.androidutils.vecmath;

import p000.khx;

/* compiled from: PG */
public class Vector3i {
    /* renamed from: x */
    public int f2492x;
    /* renamed from: y */
    public int f2493y;
    /* renamed from: z */
    public int f2494z;

    public Vector3i(int i, int i2, int i3) {
        this.f2492x = i;
        this.f2493y = i2;
        this.f2494z = i3;
    }

    public Vector3i(Vector3i vector3i) {
        this.f2492x = vector3i.f2492x;
        this.f2493y = vector3i.f2493y;
        this.f2494z = vector3i.f2494z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Vector3i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Vector3i vector3i = (Vector3i) obj;
        if (this.f2492x == vector3i.f2492x && this.f2493y == vector3i.f2493y && this.f2494z == vector3i.f2494z) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f2492x * 31) + this.f2493y) * 31) + this.f2494z;
    }

    public String toString() {
        int i = this.f2492x;
        int i2 = this.f2493y;
        int i3 = this.f2494z;
        StringBuilder stringBuilder = new StringBuilder(39);
        stringBuilder.append("(");
        stringBuilder.append(i);
        stringBuilder.append(", ");
        stringBuilder.append(i2);
        stringBuilder.append(", ");
        stringBuilder.append(i3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public String toStringUnsigned() {
        String a = khx.m4938a(this.f2492x);
        String a2 = khx.m4938a(this.f2493y);
        String a3 = khx.m4938a(this.f2494z);
        int length = String.valueOf(a).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 6) + String.valueOf(a2).length()) + String.valueOf(a3).length());
        stringBuilder.append("(");
        stringBuilder.append(a);
        stringBuilder.append(", ");
        stringBuilder.append(a2);
        stringBuilder.append(", ");
        stringBuilder.append(a3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
