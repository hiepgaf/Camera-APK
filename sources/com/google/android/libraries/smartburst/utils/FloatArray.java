package com.google.android.libraries.smartburst.utils;

import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p000.jri;
import p000.jzb;

/* compiled from: PG */
public final class FloatArray implements Iterable {
    /* renamed from: a */
    public float[] f2476a;
    /* renamed from: b */
    public int f2477b;
    /* renamed from: c */
    private int f2478c;

    public FloatArray() {
        this(4);
    }

    public FloatArray(int i) {
        boolean z = false;
        this.f2477b = 0;
        if (i > 0) {
            z = true;
        }
        jri.m13143a(z);
        this.f2478c = i;
        this.f2476a = new float[i];
    }

    public final void add(float f) {
        this.f2477b++;
        int i = this.f2477b;
        int i2 = this.f2478c;
        if (i > i2) {
            this.f2478c = i2 + i2;
            Object obj = new float[this.f2478c];
            Object obj2 = this.f2476a;
            System.arraycopy(obj2, 0, obj, 0, obj2.length);
            this.f2476a = obj;
        }
        this.f2476a[this.f2477b - 1] = f;
    }

    public static FloatArray copyOf(FloatArray floatArray) {
        return copyOf(floatArray.f2476a, 0, floatArray.size());
    }

    public static FloatArray copyOf(Collection collection) {
        jri.m13152b((Object) collection);
        FloatArray floatArray = new FloatArray(collection.size());
        for (Float floatValue : collection) {
            floatArray.add(floatValue.floatValue());
        }
        return floatArray;
    }

    public static FloatArray copyOf(float[] fArr) {
        int length = fArr.length;
        return length == 0 ? new FloatArray() : copyOf(fArr, 0, length);
    }

    public static FloatArray copyOf(float[] fArr, int i, int i2) {
        boolean z;
        int i3;
        boolean z2 = true;
        jri.m13152b((Object) fArr);
        if (i < 0) {
            z = false;
        } else if (i < fArr.length) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (i2 < 0) {
            z = false;
        } else if (i2 <= fArr.length) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (i2 == 0) {
            i3 = 1;
        } else {
            i3 = i2;
        }
        FloatArray floatArray = new FloatArray(i3);
        if (i2 > floatArray.f2478c) {
            z2 = false;
        }
        jri.m13143a(z2);
        floatArray.f2477b = i2;
        System.arraycopy(fArr, i, floatArray.f2476a, 0, i2);
        return floatArray;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FloatArray)) {
            return false;
        }
        return Arrays.equals(toArray(), ((FloatArray) obj).toArray());
    }

    public final float get(int i) {
        return this.f2476a[m1358a(i)];
    }

    public final int hashCode() {
        return Arrays.hashCode(toArray());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Iterator iterator() {
        return new jzb(this);
    }

    public final void set(int i, float f) {
        this.f2476a[m1358a(i)] = f;
    }

    public final int size() {
        return this.f2477b;
    }

    public final void sortInPlace() {
        Arrays.sort(this.f2476a, 0, this.f2477b);
    }

    public final FloatArray subArray(int i, int i2) {
        boolean z;
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        m1358a(i2 - 1);
        return copyOf(this.f2476a, m1358a(i), i2 - i);
    }

    public final float[] toArray() {
        int i = this.f2477b;
        if (i == this.f2478c) {
            return this.f2476a;
        }
        float[] fArr = new float[i];
        System.arraycopy(this.f2476a, 0, fArr, 0, i);
        return fArr;
    }

    public final String toString() {
        StringWriter stringWriter = new StringWriter();
        stringWriter.append("[");
        for (int i = 0; i < this.f2477b; i++) {
            stringWriter.append(String.valueOf(this.f2476a[i]));
            if (i < this.f2477b - 1) {
                stringWriter.append(", ");
            }
        }
        stringWriter.append("]");
        return stringWriter.toString();
    }

    /* renamed from: a */
    private final int m1358a(int i) {
        int i2 = this.f2477b;
        if (i < i2) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(60);
        stringBuilder.append("Illegal index ");
        stringBuilder.append(i);
        stringBuilder.append(" in FloatArray of size ");
        stringBuilder.append(i2);
        stringBuilder.append(".");
        throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
    }

    public static FloatArray withValues(float... fArr) {
        return copyOf(fArr);
    }
}
