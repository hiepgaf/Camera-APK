package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: krk */
final class krk extends kqr implements RandomAccess, ksg {
    /* renamed from: b */
    private double[] f22468b;
    /* renamed from: c */
    private int f22469c;

    static {
        new krk().f19255a = false;
    }

    krk() {
        this(new double[10], 0);
    }

    private krk(double[] dArr, int i) {
        this.f22468b = dArr;
        this.f22469c = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m16664a(i, ((Double) obj).doubleValue());
    }

    public final boolean addAll(Collection collection) {
        m13650a();
        ksd.m5131a((Object) collection);
        if (!(collection instanceof krk)) {
            return super.addAll(collection);
        }
        krk krk = (krk) collection;
        int i = krk.f22469c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f22469c;
        if (LfuScheduler.MAX_PRIORITY - i2 < i) {
            throw new OutOfMemoryError();
        }
        i += i2;
        double[] dArr = this.f22468b;
        if (i > dArr.length) {
            this.f22468b = Arrays.copyOf(dArr, i);
        }
        System.arraycopy(krk.f22468b, 0, this.f22468b, this.f22469c, krk.f22469c);
        this.f22469c = i;
        this.modCount++;
        return true;
    }

    /* renamed from: a */
    public final void m16668a(double d) {
        m16664a(this.f22469c, d);
    }

    /* renamed from: a */
    private final void m16664a(int i, double d) {
        m13650a();
        if (i >= 0) {
            int i2 = this.f22469c;
            if (i <= i2) {
                Object obj = this.f22468b;
                if (i2 < obj.length) {
                    System.arraycopy(obj, i, obj, i + 1, i2 - i);
                } else {
                    Object obj2 = new double[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(obj, 0, obj2, 0, i);
                    System.arraycopy(this.f22468b, i, obj2, i + 1, this.f22469c - i);
                    this.f22468b = obj2;
                }
                this.f22468b[i] = d;
                this.f22469c++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m16666c(i));
    }

    /* renamed from: b */
    private final void m16665b(int i) {
        if (i < 0 || i >= this.f22469c) {
            throw new IndexOutOfBoundsException(m16666c(i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krk)) {
            return super.equals(obj);
        }
        krk krk = (krk) obj;
        if (this.f22469c != krk.f22469c) {
            return false;
        }
        double[] dArr = krk.f22468b;
        for (int i = 0; i < this.f22469c; i++) {
            if (this.f22468b[i] != dArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m16665b(i);
        return Double.valueOf(this.f22468b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f22469c; i2++) {
            i = (i * 31) + ksd.m5128a(Double.doubleToLongBits(this.f22468b[i2]));
        }
        return i;
    }

    /* renamed from: c */
    private final String m16666c(int i) {
        int i2 = this.f22469c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ ksg mo3254a(int i) {
        if (i >= this.f22469c) {
            return new krk(Arrays.copyOf(this.f22468b, i), this.f22469c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i) {
        m13650a();
        m16665b(i);
        Object obj = this.f22468b;
        double d = obj[i];
        int i2 = this.f22469c;
        if (i < i2 - 1) {
            System.arraycopy(obj, i + 1, obj, i, i2 - i);
        }
        this.f22469c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final boolean remove(Object obj) {
        m13650a();
        for (int i = 0; i < this.f22469c; i++) {
            if (obj.equals(Double.valueOf(this.f22468b[i]))) {
                Object obj2 = this.f22468b;
                System.arraycopy(obj2, i + 1, obj2, i, this.f22469c - i);
                this.f22469c--;
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
        Object obj = this.f22468b;
        System.arraycopy(obj, i2, obj, i, this.f22469c - i2);
        this.f22469c -= i2 - i;
        this.modCount++;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m13650a();
        m16665b(i);
        double[] dArr = this.f22468b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f22469c;
    }
}
