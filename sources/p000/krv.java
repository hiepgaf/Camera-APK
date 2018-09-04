package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: krv */
final class krv extends kqr implements RandomAccess, ksg {
    /* renamed from: b */
    private float[] f22470b;
    /* renamed from: c */
    private int f22471c;

    static {
        new krv().f19255a = false;
    }

    krv() {
        this(new float[10], 0);
    }

    private krv(float[] fArr, int i) {
        this.f22470b = fArr;
        this.f22471c = i;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m16669a(i, ((Float) obj).floatValue());
    }

    public final boolean addAll(Collection collection) {
        m13650a();
        ksd.m5131a((Object) collection);
        if (!(collection instanceof krv)) {
            return super.addAll(collection);
        }
        krv krv = (krv) collection;
        int i = krv.f22471c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f22471c;
        if (LfuScheduler.MAX_PRIORITY - i2 < i) {
            throw new OutOfMemoryError();
        }
        i += i2;
        float[] fArr = this.f22470b;
        if (i > fArr.length) {
            this.f22470b = Arrays.copyOf(fArr, i);
        }
        System.arraycopy(krv.f22470b, 0, this.f22470b, this.f22471c, krv.f22471c);
        this.f22471c = i;
        this.modCount++;
        return true;
    }

    /* renamed from: a */
    public final void m16673a(float f) {
        m16669a(this.f22471c, f);
    }

    /* renamed from: a */
    private final void m16669a(int i, float f) {
        m13650a();
        if (i >= 0) {
            int i2 = this.f22471c;
            if (i <= i2) {
                Object obj = this.f22470b;
                if (i2 < obj.length) {
                    System.arraycopy(obj, i, obj, i + 1, i2 - i);
                } else {
                    Object obj2 = new float[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(obj, 0, obj2, 0, i);
                    System.arraycopy(this.f22470b, i, obj2, i + 1, this.f22471c - i);
                    this.f22470b = obj2;
                }
                this.f22470b[i] = f;
                this.f22471c++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(m16671c(i));
    }

    /* renamed from: b */
    private final void m16670b(int i) {
        if (i < 0 || i >= this.f22471c) {
            throw new IndexOutOfBoundsException(m16671c(i));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krv)) {
            return super.equals(obj);
        }
        krv krv = (krv) obj;
        if (this.f22471c != krv.f22471c) {
            return false;
        }
        float[] fArr = krv.f22470b;
        for (int i = 0; i < this.f22471c; i++) {
            if (this.f22470b[i] != fArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m16670b(i);
        return Float.valueOf(this.f22470b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f22471c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f22470b[i2]);
        }
        return i;
    }

    /* renamed from: c */
    private final String m16671c(int i) {
        int i2 = this.f22471c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final /* synthetic */ ksg mo3254a(int i) {
        if (i >= this.f22471c) {
            return new krv(Arrays.copyOf(this.f22470b, i), this.f22471c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object remove(int i) {
        m13650a();
        m16670b(i);
        Object obj = this.f22470b;
        float f = obj[i];
        int i2 = this.f22471c;
        if (i < i2 - 1) {
            System.arraycopy(obj, i + 1, obj, i, i2 - i);
        }
        this.f22471c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final boolean remove(Object obj) {
        m13650a();
        for (int i = 0; i < this.f22471c; i++) {
            if (obj.equals(Float.valueOf(this.f22470b[i]))) {
                Object obj2 = this.f22470b;
                System.arraycopy(obj2, i + 1, obj2, i, this.f22471c - i);
                this.f22471c--;
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
        Object obj = this.f22470b;
        System.arraycopy(obj, i2, obj, i, this.f22471c - i2);
        this.f22471c -= i2 - i;
        this.modCount++;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m13650a();
        m16670b(i);
        float[] fArr = this.f22470b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f22471c;
    }
}
