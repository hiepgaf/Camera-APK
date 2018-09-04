package p000;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jhv */
public final class jhv implements Iterable {
    /* renamed from: a */
    public final int[] f7844a;

    private jhv(int[] iArr) {
        int i = 0;
        int length = iArr.length;
        if (length == 0) {
            this.f7844a = new int[0];
            return;
        }
        int i2;
        Arrays.sort(iArr);
        int i3 = iArr[0] + 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            i2 = iArr[i4];
            if (i3 == i2) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            i5 += i3;
            i4++;
            i3 = i2;
        }
        this.f7844a = new int[i5];
        int[] iArr2 = this.f7844a;
        i3 = iArr[0] + 1;
        length = iArr.length;
        i2 = 0;
        while (i2 < length) {
            int i6;
            i4 = iArr[i2];
            if (i3 != i4) {
                i3 = i + 1;
                iArr2[i] = i4;
                i = i4;
            } else {
                i6 = i;
                i = i3;
                i3 = i6;
            }
            i2++;
            i6 = i3;
            i3 = i;
            i = i6;
        }
    }

    /* renamed from: a */
    public final boolean m4496a(int i) {
        return Arrays.binarySearch(this.f7844a, i) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhv)) {
            return false;
        }
        return Arrays.equals(this.f7844a, ((jhv) obj).f7844a);
    }

    /* renamed from: a */
    public static jhv m4495a(int... iArr) {
        return new jhv(Arrays.copyOf(iArr, iArr.length));
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7844a);
    }

    public final Iterator iterator() {
        return new jhw(this);
    }

    public final String toString() {
        int length = this.f7844a.length;
        StringBuilder stringBuilder = new StringBuilder(19);
        stringBuilder.append("IntSet[");
        stringBuilder.append(length);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
