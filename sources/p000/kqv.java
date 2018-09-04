package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: kqv */
final class kqv extends kqr implements RandomAccess, ksg {
    /* renamed from: b */
    private boolean[] f22462b;
    /* renamed from: c */
    private int f22463c;

    static {
        new kqv().f19255a = false;
    }

    kqv() {
        this(new boolean[10], 0);
    }

    private kqv(boolean[] zArr, int i) {
        this.f22462b = zArr;
        this.f22463c = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m16625a(i, ((Boolean) obj).booleanValue());
    }

    public final boolean addAll(Collection collection) {
        m13650a();
        ksd.m5131a((Object) collection);
        if (!(collection instanceof kqv)) {
            return super.addAll(collection);
        }
        kqv kqv = (kqv) collection;
        int i = kqv.f22463c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f22463c;
        if (LfuScheduler.MAX_PRIORITY - i2 < i) {
            throw new OutOfMemoryError();
        }
        i += i2;
        boolean[] zArr = this.f22462b;
        if (i > zArr.length) {
            this.f22462b = Arrays.copyOf(zArr, i);
        }
        System.arraycopy(kqv.f22462b, 0, this.f22462b, this.f22463c, kqv.f22463c);
        this.f22463c = i;
        this.modCount++;
        return true;
    }

    /* renamed from: a */
    private final void m16625a(int i, boolean z) {
        m13650a();
        if (i >= 0) {
            int i2 = this.f22463c;
            if (i <= i2) {
                Object obj = this.f22462b;
                if (i2 < obj.length) {
                    System.arraycopy(obj, i, obj, i + 1, i2 - i);
                } else {
                    Object obj2 = new boolean[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(obj, 0, obj2, 0, i);
                    System.arraycopy(this.f22462b, i, obj2, i + 1, this.f22463c - i);
                    this.f22462b = obj2;
                }
                this.f22462b[i] = z;
                this.f22463c++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m16627c(i));
    }

    /* renamed from: a */
    public final void m16629a(boolean z) {
        m16625a(this.f22463c, z);
    }

    /* renamed from: b */
    private final void m16626b(int i) {
        if (i < 0 || i >= this.f22463c) {
            throw new IndexOutOfBoundsException(m16627c(i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqv)) {
            return super.equals(obj);
        }
        kqv kqv = (kqv) obj;
        if (this.f22463c != kqv.f22463c) {
            return false;
        }
        boolean[] zArr = kqv.f22462b;
        for (int i = 0; i < this.f22463c; i++) {
            if (this.f22462b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m16626b(i);
        return Boolean.valueOf(this.f22462b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f22463c; i2++) {
            i = (i * 31) + ksd.m5129a(this.f22462b[i2]);
        }
        return i;
    }

    /* renamed from: c */
    private final String m16627c(int i) {
        int i2 = this.f22463c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ ksg mo3254a(int i) {
        if (i >= this.f22463c) {
            return new kqv(Arrays.copyOf(this.f22462b, i), this.f22463c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i) {
        m13650a();
        m16626b(i);
        Object obj = this.f22462b;
        boolean z = obj[i];
        int i2 = this.f22463c;
        if (i < i2 - 1) {
            System.arraycopy(obj, i + 1, obj, i, i2 - i);
        }
        this.f22463c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final boolean remove(Object obj) {
        m13650a();
        for (int i = 0; i < this.f22463c; i++) {
            if (obj.equals(Boolean.valueOf(this.f22462b[i]))) {
                Object obj2 = this.f22462b;
                System.arraycopy(obj2, i + 1, obj2, i, this.f22463c - i);
                this.f22463c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    protected final void removeRange(int i, int i2) {
        m13650a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        Object obj = this.f22462b;
        System.arraycopy(obj, i2, obj, i, this.f22463c - i2);
        this.f22463c -= i2 - i;
        this.modCount++;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m13650a();
        m16626b(i);
        boolean[] zArr = this.f22462b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f22463c;
    }
}
