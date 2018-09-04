package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: ksc */
final class ksc extends kqr implements RandomAccess, ksg {
    /* renamed from: b */
    private int[] f22472b;
    /* renamed from: c */
    private int f22473c;

    static {
        new ksc().f19255a = false;
    }

    ksc() {
        this(new int[10], 0);
    }

    private ksc(int[] iArr, int i) {
        this.f22472b = iArr;
        this.f22473c = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m16674a(i, ((Integer) obj).intValue());
    }

    public final boolean addAll(Collection collection) {
        m13650a();
        ksd.m5131a((Object) collection);
        if (!(collection instanceof ksc)) {
            return super.addAll(collection);
        }
        ksc ksc = (ksc) collection;
        int i = ksc.f22473c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f22473c;
        if (LfuScheduler.MAX_PRIORITY - i2 < i) {
            throw new OutOfMemoryError();
        }
        i += i2;
        int[] iArr = this.f22472b;
        if (i > iArr.length) {
            this.f22472b = Arrays.copyOf(iArr, i);
        }
        System.arraycopy(ksc.f22472b, 0, this.f22472b, this.f22473c, ksc.f22473c);
        this.f22473c = i;
        this.modCount++;
        return true;
    }

    /* renamed from: b */
    public final void m16678b(int i) {
        m16674a(this.f22473c, i);
    }

    /* renamed from: a */
    private final void m16674a(int i, int i2) {
        m13650a();
        if (i >= 0) {
            int i3 = this.f22473c;
            if (i <= i3) {
                Object obj = this.f22472b;
                if (i3 < obj.length) {
                    System.arraycopy(obj, i, obj, i + 1, i3 - i);
                } else {
                    Object obj2 = new int[(((i3 * 3) / 2) + 1)];
                    System.arraycopy(obj, 0, obj2, 0, i);
                    System.arraycopy(this.f22472b, i, obj2, i + 1, this.f22473c - i);
                    this.f22472b = obj2;
                }
                this.f22472b[i] = i2;
                this.f22473c++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m16676e(i));
    }

    /* renamed from: d */
    private final void m16675d(int i) {
        if (i < 0 || i >= this.f22473c) {
            throw new IndexOutOfBoundsException(m16676e(i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksc)) {
            return super.equals(obj);
        }
        ksc ksc = (ksc) obj;
        if (this.f22473c != ksc.f22473c) {
            return false;
        }
        int[] iArr = ksc.f22472b;
        for (int i = 0; i < this.f22473c; i++) {
            if (this.f22472b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(m16679c(i));
    }

    /* renamed from: c */
    public final int m16679c(int i) {
        m16675d(i);
        return this.f22472b[i];
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f22473c; i2++) {
            i = (i * 31) + this.f22472b[i2];
        }
        return i;
    }

    /* renamed from: e */
    private final String m16676e(int i) {
        int i2 = this.f22473c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ ksg mo3254a(int i) {
        if (i >= this.f22473c) {
            return new ksc(Arrays.copyOf(this.f22472b, i), this.f22473c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i) {
        m13650a();
        m16675d(i);
        Object obj = this.f22472b;
        int i2 = obj[i];
        int i3 = this.f22473c;
        if (i < i3 - 1) {
            System.arraycopy(obj, i + 1, obj, i, i3 - i);
        }
        this.f22473c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final boolean remove(Object obj) {
        m13650a();
        for (int i = 0; i < this.f22473c; i++) {
            if (obj.equals(Integer.valueOf(this.f22472b[i]))) {
                Object obj2 = this.f22472b;
                System.arraycopy(obj2, i + 1, obj2, i, this.f22473c - i);
                this.f22473c--;
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
        Object obj = this.f22472b;
        System.arraycopy(obj, i2, obj, i, this.f22473c - i2);
        this.f22473c -= i2 - i;
        this.modCount++;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m13650a();
        m16675d(i);
        int[] iArr = this.f22472b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f22473c;
    }
}
