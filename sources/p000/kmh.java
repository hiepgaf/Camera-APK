package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: kmh */
public final class kmh extends AbstractList implements Serializable, RandomAccess {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final boolean[] f8333a;
    /* renamed from: b */
    private final int f8334b;
    /* renamed from: c */
    private final int f8335c;

    public kmh(boolean[] zArr) {
        this(zArr, 0, zArr.length);
    }

    private kmh(boolean[] zArr, int i, int i2) {
        this.f8333a = zArr;
        this.f8334b = i;
        this.f8335c = i2;
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Boolean) {
            boolean[] zArr = this.f8333a;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i = this.f8334b;
            int i2 = this.f8335c;
            while (i < i2) {
                if (zArr[i] == booleanValue) {
                    break;
                }
                i++;
            }
            i = -1;
            if (i != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kmh)) {
            return super.equals(obj);
        }
        kmh kmh = (kmh) obj;
        int size = size();
        if (kmh.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f8333a[this.f8334b + i] != kmh.f8333a[kmh.f8334b + i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        jri.m13138a(i, size());
        return Boolean.valueOf(this.f8333a[this.f8334b + i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f8334b; i2 < this.f8335c; i2++) {
            int i3 = i * 31;
            if (this.f8333a[i2]) {
                i = 1231;
            } else {
                i = 1237;
            }
            i += i3;
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean[] zArr = this.f8333a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f8334b;
        int i2 = this.f8335c;
        while (i < i2) {
            if (zArr[i] == booleanValue) {
                break;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return i - this.f8334b;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean[] zArr = this.f8333a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f8334b;
        int i2 = this.f8335c - 1;
        while (i2 >= i) {
            if (zArr[i2] == booleanValue) {
                break;
            }
            i2--;
        }
        i2 = -1;
        if (i2 >= 0) {
            return i2 - this.f8334b;
        }
        return -1;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        obj = (Boolean) obj;
        jri.m13138a(i, size());
        boolean[] zArr = this.f8333a;
        int i2 = this.f8334b + i;
        boolean z = zArr[i2];
        zArr[i2] = ((Boolean) jri.m13152b(obj)).booleanValue();
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f8335c - this.f8334b;
    }

    public final List subList(int i, int i2) {
        jri.m13142a(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        boolean[] zArr = this.f8333a;
        int i3 = this.f8334b;
        return new kmh(zArr, i3 + i, i3 + i2);
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder(size() * 7);
        if (this.f8333a[this.f8334b]) {
            str = "[true";
        } else {
            str = "[false";
        }
        stringBuilder.append(str);
        for (int i = this.f8334b + 1; i < this.f8335c; i++) {
            String str2;
            if (this.f8333a[i]) {
                str2 = ", true";
            } else {
                str2 = ", false";
            }
            stringBuilder.append(str2);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
