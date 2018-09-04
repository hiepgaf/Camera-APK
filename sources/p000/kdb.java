package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kdb */
final class kdb extends AbstractMap implements Serializable {
    /* renamed from: a */
    public transient long[] f8214a;
    /* renamed from: b */
    public transient Object[] f8215b;
    /* renamed from: c */
    public transient Object[] f8216c;
    /* renamed from: d */
    public transient int f8217d;
    /* renamed from: e */
    public transient int f8218e;
    /* renamed from: f */
    private transient int[] f8219f;
    /* renamed from: g */
    private transient float f8220g;
    /* renamed from: h */
    private transient int f8221h;
    /* renamed from: i */
    private transient Set f8222i;
    /* renamed from: j */
    private transient Set f8223j;
    /* renamed from: k */
    private transient Collection f8224k;

    kdb() {
        m4775a(3);
    }

    kdb(int i) {
        this(12, (byte) 0);
    }

    private kdb(int i, byte b) {
        m4775a(i);
    }

    public final void clear() {
        this.f8217d++;
        Arrays.fill(this.f8215b, 0, this.f8218e, null);
        Arrays.fill(this.f8216c, 0, this.f8218e, null);
        Arrays.fill(this.f8219f, -1);
        Arrays.fill(this.f8214a, -1);
        this.f8218e = 0;
    }

    public final boolean containsKey(Object obj) {
        return m4777a(obj) != -1;
    }

    public final boolean containsValue(Object obj) {
        for (int i = 0; i < this.f8218e; i++) {
            if (kbf.m16436b(obj, this.f8216c[i])) {
                return true;
            }
        }
        return false;
    }

    public final Set entrySet() {
        Set set = this.f8223j;
        if (set != null) {
            return set;
        }
        set = new kdf(this);
        this.f8223j = set;
        return set;
    }

    public final Object get(Object obj) {
        int a = m4777a(obj);
        return a != -1 ? this.f8216c[a] : null;
    }

    /* renamed from: a */
    final int m4777a(Object obj) {
        int b = khb.m4883b(obj);
        int[] iArr = this.f8219f;
        int i = iArr[(iArr.length - 1) & b];
        while (i != -1) {
            long j = this.f8214a[i];
            if (((int) (j >>> 32)) == b && kbf.m16436b(obj, this.f8215b[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    /* renamed from: a */
    private final void m4775a(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "Initial capacity must be non-negative");
        jri.m13144a(true, (Object) "Illegal load factor");
        int a = khb.m4858a(i, 1.0d);
        this.f8219f = kdb.m4776b(a);
        this.f8220g = 1.0f;
        this.f8215b = new Object[i];
        this.f8216c = new Object[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        this.f8214a = jArr;
        this.f8221h = Math.max(1, (int) ((float) a));
    }

    public final boolean isEmpty() {
        return this.f8218e == 0;
    }

    public final Set keySet() {
        Set set = this.f8222i;
        if (set != null) {
            return set;
        }
        set = new kdh(this);
        this.f8222i = set;
        return set;
    }

    /* renamed from: b */
    private static int[] m4776b(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        long[] jArr = this.f8214a;
        Object[] objArr = this.f8215b;
        Object[] objArr2 = this.f8216c;
        int b = khb.m4883b(obj);
        int[] iArr = this.f8219f;
        int length = b & (iArr.length - 1);
        int i2 = this.f8218e;
        int i3 = iArr[length];
        if (i3 == -1) {
            iArr[length] = i2;
        } else {
            long j;
            while (true) {
                j = jArr[i3];
                if (((int) (j >>> 32)) == b && kbf.m16436b(obj, objArr[i3])) {
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = obj2;
                    return obj3;
                }
                i = (int) j;
                if (i == -1) {
                    break;
                }
                i3 = i;
            }
            jArr[i3] = kdb.m4774a(j, i2);
        }
        if (i2 == LfuScheduler.MAX_PRIORITY) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        i = i2 + 1;
        int length2 = this.f8214a.length;
        if (i > length2) {
            i3 = Math.max(1, length2 >>> 1) + length2;
            if (i3 < 0) {
                i3 = LfuScheduler.MAX_PRIORITY;
            }
            if (i3 != length2) {
                this.f8215b = Arrays.copyOf(this.f8215b, i3);
                this.f8216c = Arrays.copyOf(this.f8216c, i3);
                jArr = this.f8214a;
                int length3 = jArr.length;
                jArr = Arrays.copyOf(jArr, i3);
                if (i3 > length3) {
                    Arrays.fill(jArr, length3, i3, -1);
                }
                this.f8214a = jArr;
            }
        }
        this.f8214a[i2] = (((long) b) << 32) | 4294967295L;
        this.f8215b[i2] = obj;
        this.f8216c[i2] = obj2;
        this.f8218e = i;
        if (i2 >= this.f8221h) {
            i3 = this.f8219f.length;
            i = i3 + i3;
            if (i3 >= 1073741824) {
                this.f8221h = LfuScheduler.MAX_PRIORITY;
            } else {
                length2 = ((int) (((float) i) * this.f8220g)) + 1;
                iArr = kdb.m4776b(i);
                long[] jArr2 = this.f8214a;
                int length4 = iArr.length - 1;
                for (i3 = 0; i3 < this.f8218e; i3++) {
                    b = (int) (jArr2[i3] >>> 32);
                    length = b & length4;
                    i2 = iArr[length];
                    iArr[length] = i3;
                    jArr2[i3] = (((long) i2) & 4294967295L) | (((long) b) << 32);
                }
                this.f8221h = length2;
                this.f8219f = iArr;
            }
        }
        this.f8217d++;
        return null;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        m4775a(3);
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    public final Object remove(Object obj) {
        return m4778a(obj, khb.m4883b(obj));
    }

    /* renamed from: a */
    final Object m4778a(Object obj, int i) {
        int[] iArr = this.f8219f;
        int length = i & (iArr.length - 1);
        int i2 = iArr[length];
        if (i2 == -1) {
            return null;
        }
        int i3 = -1;
        while (true) {
            if (((int) (this.f8214a[i2] >>> 32)) == i && kbf.m16436b(obj, this.f8215b[i2])) {
                break;
            }
            i3 = (int) this.f8214a[i2];
            if (i3 == -1) {
                return null;
            }
            int i4 = i2;
            i2 = i3;
            i3 = i4;
        }
        Object obj2 = this.f8216c[i2];
        if (i3 == -1) {
            this.f8219f[length] = (int) this.f8214a[i2];
        } else {
            long[] jArr = this.f8214a;
            jArr[i3] = kdb.m4774a(jArr[i3], (int) jArr[i2]);
        }
        int size = size() - 1;
        if (i2 < size) {
            Object[] objArr = this.f8215b;
            objArr[i2] = objArr[size];
            Object[] objArr2 = this.f8216c;
            objArr2[i2] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr2 = this.f8214a;
            long j = jArr2[size];
            jArr2[i2] = j;
            jArr2[size] = -1;
            int[] iArr2 = this.f8219f;
            int length2 = (iArr2.length - 1) & ((int) (j >>> 32));
            i3 = iArr2[length2];
            if (i3 == size) {
                iArr2[length2] = i2;
            } else {
                long[] jArr3;
                while (true) {
                    jArr3 = this.f8214a;
                    j = jArr3[i3];
                    length = (int) j;
                    if (length == size) {
                        break;
                    }
                    i3 = length;
                }
                jArr3[i3] = kdb.m4774a(j, i2);
            }
        } else {
            this.f8215b[i2] = null;
            this.f8216c[i2] = null;
            this.f8214a[i2] = -1;
        }
        this.f8218e--;
        this.f8217d++;
        return obj2;
    }

    public final int size() {
        return this.f8218e;
    }

    /* renamed from: a */
    private static long m4774a(long j, int i) {
        return (-4294967296L & j) | (((long) i) & 4294967295L);
    }

    public final Collection values() {
        Collection collection = this.f8224k;
        if (collection != null) {
            return collection;
        }
        collection = new kdj(this);
        this.f8224k = collection;
        return collection;
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f8218e);
        for (int i = 0; i < this.f8218e; i++) {
            objectOutputStream.writeObject(this.f8215b[i]);
            objectOutputStream.writeObject(this.f8216c[i]);
        }
    }
}
