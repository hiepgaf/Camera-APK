package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: kmk */
public final class kmk extends AbstractList implements Serializable, RandomAccess {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    public final long[] f8342a;
    /* renamed from: b */
    public final int f8343b;
    /* renamed from: c */
    public final int f8344c;

    private kmk(long[] jArr, int i, int i2) {
        this.f8342a = jArr;
        this.f8343b = i;
        this.f8344c = i2;
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Long) && khx.m4944b(this.f8342a, ((Long) obj).longValue(), this.f8343b, this.f8344c) != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kmk)) {
            return super.equals(obj);
        }
        kmk kmk = (kmk) obj;
        int size = size();
        if (kmk.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f8342a[this.f8343b + i] != kmk.f8342a[kmk.f8343b + i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        jri.m13138a(i, size());
        return Long.valueOf(this.f8342a[this.f8343b + i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f8343b; i2 < this.f8344c; i2++) {
            long j = this.f8342a[i2];
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            int a = khx.m4944b(this.f8342a, ((Long) obj).longValue(), this.f8343b, this.f8344c);
            if (a >= 0) {
                return a - this.f8343b;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long[] jArr = this.f8342a;
        long longValue = ((Long) obj).longValue();
        int i = this.f8343b;
        int i2 = this.f8344c - 1;
        while (i2 >= i) {
            if (jArr[i2] == longValue) {
                break;
            }
            i2--;
        }
        i2 = -1;
        if (i2 >= 0) {
            return i2 - this.f8343b;
        }
        return -1;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        obj = (Long) obj;
        jri.m13138a(i, size());
        long[] jArr = this.f8342a;
        int i2 = this.f8343b + i;
        long j = jArr[i2];
        jArr[i2] = ((Long) jri.m13152b(obj)).longValue();
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f8344c - this.f8343b;
    }

    public final List subList(int i, int i2) {
        jri.m13142a(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        long[] jArr = this.f8342a;
        int i3 = this.f8343b;
        return new kmk(jArr, i3 + i, i3 + i2);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(size() * 10);
        stringBuilder.append('[');
        stringBuilder.append(this.f8342a[this.f8343b]);
        for (int i = this.f8343b + 1; i < this.f8344c; i++) {
            stringBuilder.append(", ");
            stringBuilder.append(this.f8342a[i]);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
