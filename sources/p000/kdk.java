package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kdk */
final class kdk extends AbstractSet implements Serializable {
    /* renamed from: a */
    public transient long[] f8232a;
    /* renamed from: b */
    public transient Object[] f8233b;
    /* renamed from: c */
    public transient int f8234c;
    /* renamed from: d */
    public transient int f8235d;
    /* renamed from: e */
    private transient int[] f8236e;
    /* renamed from: f */
    private transient float f8237f;
    /* renamed from: g */
    private transient int f8238g;

    kdk() {
        m4782a(3);
    }

    kdk(int i) {
        m4782a(i);
    }

    public final boolean add(Object obj) {
        int i;
        long[] jArr = this.f8232a;
        Object[] objArr = this.f8233b;
        int b = khb.m4883b(obj);
        int[] iArr = this.f8236e;
        int length = b & (iArr.length - 1);
        int i2 = this.f8235d;
        int i3 = iArr[length];
        if (i3 == -1) {
            iArr[length] = i2;
        } else {
            long j;
            while (true) {
                j = jArr[i3];
                if (((int) (j >>> 32)) == b && kbf.m16436b(obj, objArr[i3])) {
                    return false;
                }
                i = (int) j;
                if (i == -1) {
                    break;
                }
                i3 = i;
            }
            jArr[i3] = kdk.m4781a(j, i2);
        }
        if (i2 == LfuScheduler.MAX_PRIORITY) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        i = i2 + 1;
        int length2 = this.f8232a.length;
        if (i > length2) {
            i3 = Math.max(1, length2 >>> 1) + length2;
            if (i3 < 0) {
                i3 = LfuScheduler.MAX_PRIORITY;
            }
            if (i3 != length2) {
                this.f8233b = Arrays.copyOf(this.f8233b, i3);
                jArr = this.f8232a;
                int length3 = jArr.length;
                jArr = Arrays.copyOf(jArr, i3);
                if (i3 > length3) {
                    Arrays.fill(jArr, length3, i3, -1);
                }
                this.f8232a = jArr;
            }
        }
        this.f8232a[i2] = (((long) b) << 32) | 4294967295L;
        this.f8233b[i2] = obj;
        this.f8235d = i;
        if (i2 >= this.f8238g) {
            i3 = this.f8236e.length;
            i = i3 + i3;
            if (i3 >= 1073741824) {
                this.f8238g = LfuScheduler.MAX_PRIORITY;
            } else {
                length2 = ((int) (((float) i) * this.f8237f)) + 1;
                iArr = kdk.m4783b(i);
                long[] jArr2 = this.f8232a;
                b = iArr.length - 1;
                for (i3 = 0; i3 < this.f8235d; i3++) {
                    length = (int) (jArr2[i3] >>> 32);
                    i2 = length & b;
                    int i4 = iArr[i2];
                    iArr[i2] = i3;
                    jArr2[i3] = (((long) i4) & 4294967295L) | (((long) length) << 32);
                }
                this.f8238g = length2;
                this.f8236e = iArr;
            }
        }
        this.f8234c++;
        return true;
    }

    public final void clear() {
        this.f8234c++;
        Arrays.fill(this.f8233b, 0, this.f8235d, null);
        Arrays.fill(this.f8236e, -1);
        Arrays.fill(this.f8232a, -1);
        this.f8235d = 0;
    }

    public final boolean contains(Object obj) {
        int b = khb.m4883b(obj);
        int[] iArr = this.f8236e;
        int i = iArr[(iArr.length - 1) & b];
        while (i != -1) {
            long j = this.f8232a[i];
            if (((int) (j >>> 32)) == b && kbf.m16436b(obj, this.f8233b[i])) {
                return true;
            }
            i = (int) j;
        }
        return false;
    }

    /* renamed from: a */
    private final void m4782a(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "Initial capacity must be non-negative");
        jri.m13144a(true, (Object) "Illegal load factor");
        int a = khb.m4858a(i, 1.0d);
        this.f8236e = kdk.m4783b(a);
        this.f8237f = 1.0f;
        this.f8233b = new Object[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        this.f8232a = jArr;
        this.f8238g = Math.max(1, (int) ((float) a));
    }

    public final boolean isEmpty() {
        return this.f8235d == 0;
    }

    public final Iterator iterator() {
        return new kdl(this);
    }

    /* renamed from: b */
    private static int[] m4783b(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        m4782a(3);
        int readInt = objectInputStream.readInt();
        while (true) {
            readInt--;
            if (readInt >= 0) {
                add(objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    public final boolean remove(Object obj) {
        return m4784a(obj, khb.m4883b(obj));
    }

    /* renamed from: a */
    final boolean m4784a(Object obj, int i) {
        int[] iArr = this.f8236e;
        int length = i & (iArr.length - 1);
        int i2 = iArr[length];
        if (i2 == -1) {
            return false;
        }
        int i3 = -1;
        while (true) {
            if (((int) (this.f8232a[i2] >>> 32)) == i && kbf.m16436b(obj, this.f8233b[i2])) {
                break;
            }
            i3 = (int) this.f8232a[i2];
            if (i3 == -1) {
                return false;
            }
            int i4 = i2;
            i2 = i3;
            i3 = i4;
        }
        if (i3 == -1) {
            this.f8236e[length] = (int) this.f8232a[i2];
        } else {
            long[] jArr = this.f8232a;
            jArr[i3] = kdk.m4781a(jArr[i3], (int) jArr[i2]);
        }
        int size = size() - 1;
        if (i2 < size) {
            Object[] objArr = this.f8233b;
            objArr[i2] = objArr[size];
            objArr[size] = null;
            long[] jArr2 = this.f8232a;
            long j = jArr2[size];
            jArr2[i2] = j;
            jArr2[size] = -1;
            int[] iArr2 = this.f8236e;
            length = (iArr2.length - 1) & ((int) (j >>> 32));
            i3 = iArr2[length];
            if (i3 == size) {
                iArr2[length] = i2;
            } else {
                long[] jArr3;
                long j2;
                while (true) {
                    jArr3 = this.f8232a;
                    j2 = jArr3[i3];
                    int i5 = (int) j2;
                    if (i5 == size) {
                        break;
                    }
                    i3 = i5;
                }
                jArr3[i3] = kdk.m4781a(j2, i2);
            }
        } else {
            this.f8233b[i2] = null;
            this.f8232a[i2] = -1;
        }
        this.f8235d--;
        this.f8234c++;
        return true;
    }

    public final int size() {
        return this.f8235d;
    }

    /* renamed from: a */
    private static long m4781a(long j, int i) {
        return (-4294967296L & j) | (((long) i) & 4294967295L);
    }

    public final Object[] toArray() {
        return Arrays.copyOf(this.f8233b, this.f8235d);
    }

    public final Object[] toArray(Object[] objArr) {
        Object obj = this.f8233b;
        int i = this.f8235d;
        jri.m13142a(0, i, obj.length);
        int length = objArr.length;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (length > i) {
            objArr[i] = null;
        }
        System.arraycopy(obj, 0, objArr, 0, i);
        return objArr;
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f8235d);
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }
}
