package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: kst */
final class kst extends kqr implements RandomAccess, ksg {
    /* renamed from: b */
    private long[] f22475b;
    /* renamed from: c */
    private int f22476c;

    static {
        new kst().f19255a = false;
    }

    kst() {
        this(new long[10], 0);
    }

    private kst(long[] jArr, int i) {
        this.f22475b = jArr;
        this.f22476c = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m16687a(i, ((Long) obj).longValue());
    }

    public final boolean addAll(Collection collection) {
        m13650a();
        ksd.m5131a((Object) collection);
        if (!(collection instanceof kst)) {
            return super.addAll(collection);
        }
        kst kst = (kst) collection;
        int i = kst.f22476c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f22476c;
        if (LfuScheduler.MAX_PRIORITY - i2 < i) {
            throw new OutOfMemoryError();
        }
        i += i2;
        long[] jArr = this.f22475b;
        if (i > jArr.length) {
            this.f22475b = Arrays.copyOf(jArr, i);
        }
        System.arraycopy(kst.f22475b, 0, this.f22475b, this.f22476c, kst.f22476c);
        this.f22476c = i;
        this.modCount++;
        return true;
    }

    /* renamed from: a */
    private final void m16687a(int i, long j) {
        m13650a();
        if (i >= 0) {
            int i2 = this.f22476c;
            if (i <= i2) {
                Object obj = this.f22475b;
                if (i2 < obj.length) {
                    System.arraycopy(obj, i, obj, i + 1, i2 - i);
                } else {
                    Object obj2 = new long[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(obj, 0, obj2, 0, i);
                    System.arraycopy(this.f22475b, i, obj2, i + 1, this.f22476c - i);
                    this.f22475b = obj2;
                }
                this.f22475b[i] = j;
                this.f22476c++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m16689d(i));
    }

    /* renamed from: a */
    public final void m16691a(long j) {
        m16687a(this.f22476c, j);
    }

    /* renamed from: c */
    private final void m16688c(int i) {
        if (i < 0 || i >= this.f22476c) {
            throw new IndexOutOfBoundsException(m16689d(i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kst)) {
            return super.equals(obj);
        }
        kst kst = (kst) obj;
        if (this.f22476c != kst.f22476c) {
            return false;
        }
        long[] jArr = kst.f22475b;
        for (int i = 0; i < this.f22476c; i++) {
            if (this.f22475b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(m16692b(i));
    }

    /* renamed from: b */
    public final long m16692b(int i) {
        m16688c(i);
        return this.f22475b[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f22476c; i2++) {
            i = (i * 31) + ksd.m5128a(this.f22475b[i2]);
        }
        return i;
    }

    /* renamed from: d */
    private final String m16689d(int i) {
        int i2 = this.f22476c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ ksg mo3254a(int i) {
        if (i >= this.f22476c) {
            return new kst(Arrays.copyOf(this.f22475b, i), this.f22476c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i) {
        m13650a();
        m16688c(i);
        Object obj = this.f22475b;
        long j = obj[i];
        int i2 = this.f22476c;
        if (i < i2 - 1) {
            System.arraycopy(obj, i + 1, obj, i, i2 - i);
        }
        this.f22476c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final boolean remove(Object obj) {
        m13650a();
        for (int i = 0; i < this.f22476c; i++) {
            if (obj.equals(Long.valueOf(this.f22475b[i]))) {
                Object obj2 = this.f22475b;
                System.arraycopy(obj2, i + 1, obj2, i, this.f22476c - i);
                this.f22476c--;
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
        Object obj = this.f22475b;
        System.arraycopy(obj, i2, obj, i, this.f22476c - i2);
        this.f22476c -= i2 - i;
        this.modCount++;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        m13650a();
        m16688c(i);
        long[] jArr = this.f22475b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f22476c;
    }
}
