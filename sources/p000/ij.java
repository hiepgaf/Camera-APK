package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ij */
public final class ij implements Collection, Set {
    /* renamed from: c */
    private static final int[] f7012c = new int[0];
    /* renamed from: d */
    private static final Object[] f7013d = new Object[0];
    /* renamed from: e */
    private static Object[] f7014e;
    /* renamed from: f */
    private static int f7015f;
    /* renamed from: g */
    private static Object[] f7016g;
    /* renamed from: h */
    private static int f7017h;
    /* renamed from: a */
    public Object[] f7018a;
    /* renamed from: b */
    public int f7019b;
    /* renamed from: i */
    private int[] f7020i;
    /* renamed from: j */
    private ip f7021j;

    public ij() {
        this((byte) 0);
    }

    private ij(byte b) {
        this.f7020i = f7012c;
        this.f7018a = f7013d;
        this.f7019b = 0;
    }

    public final boolean add(Object obj) {
        int a;
        int i;
        int i2 = 8;
        if (obj == null) {
            a = m3765a();
            i = 0;
        } else {
            i = obj.hashCode();
            a = m3766a(obj, i);
        }
        if (a >= 0) {
            return false;
        }
        Object obj2;
        Object obj3;
        a ^= -1;
        int i3 = this.f7019b;
        Object obj4 = this.f7020i;
        int length = obj4.length;
        if (i3 >= length) {
            if (i3 >= 8) {
                i2 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i2 = 4;
            }
            obj2 = this.f7018a;
            m3768b(i2);
            obj3 = this.f7020i;
            if (obj3.length > 0) {
                System.arraycopy(obj4, 0, obj3, 0, length);
                System.arraycopy(obj2, 0, this.f7018a, 0, obj2.length);
            }
            ij.m3767a(obj4, obj2, this.f7019b);
        }
        i2 = this.f7019b;
        if (a < i2) {
            obj2 = this.f7020i;
            int i4 = a + 1;
            System.arraycopy(obj2, a, obj2, i4, i2 - a);
            obj3 = this.f7018a;
            System.arraycopy(obj3, a, obj3, i4, this.f7019b - a);
        }
        this.f7020i[a] = i;
        this.f7018a[a] = obj;
        this.f7019b++;
        return true;
    }

    public final boolean addAll(Collection collection) {
        boolean z = false;
        int size = this.f7019b + collection.size();
        Object obj = this.f7020i;
        if (obj.length < size) {
            Object obj2 = this.f7018a;
            m3768b(size);
            size = this.f7019b;
            if (size > 0) {
                System.arraycopy(obj, 0, this.f7020i, 0, size);
                System.arraycopy(obj2, 0, this.f7018a, 0, this.f7019b);
            }
            ij.m3767a(obj, obj2, this.f7019b);
        }
        for (Object obj3 : collection) {
            z |= add(obj3);
        }
        return z;
    }

    /* renamed from: b */
    private final void m3768b(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (ij.class) {
                if (f7016g != null) {
                    objArr = f7016g;
                    this.f7018a = objArr;
                    f7016g = (Object[]) objArr[0];
                    this.f7020i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f7017h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (ij.class) {
                if (f7014e != null) {
                    objArr = f7014e;
                    this.f7018a = objArr;
                    f7014e = (Object[]) objArr[0];
                    this.f7020i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f7015f--;
                    return;
                }
            }
        }
        this.f7020i = new int[i];
        this.f7018a = new Object[i];
    }

    public final void clear() {
        int i = this.f7019b;
        if (i != 0) {
            ij.m3767a(this.f7020i, this.f7018a, i);
            this.f7020i = f7012c;
            this.f7018a = f7013d;
            this.f7019b = 0;
        }
    }

    public final boolean contains(Object obj) {
        return m3769a(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        int i = 0;
        while (i < this.f7019b) {
            try {
                if (!set.contains(this.f7018a[i])) {
                    return false;
                }
                i++;
            } catch (NullPointerException e) {
                return false;
            } catch (ClassCastException e2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m3767a(int[] iArr, Object[] objArr, int i) {
        int length = iArr.length;
        if (length == 8) {
            synchronized (ij.class) {
                if (f7017h < 10) {
                    objArr[0] = f7016g;
                    objArr[1] = iArr;
                    for (length = i - 1; length >= 2; length--) {
                        objArr[length] = null;
                    }
                    f7016g = objArr;
                    f7017h++;
                }
            }
        } else if (length == 4) {
            synchronized (ij.class) {
                if (f7015f < 10) {
                    objArr[0] = f7014e;
                    objArr[1] = iArr;
                    for (length = i - 1; length >= 2; length--) {
                        objArr[length] = null;
                    }
                    f7014e = objArr;
                    f7015f++;
                }
            }
        }
    }

    public final int hashCode() {
        int i = 0;
        int[] iArr = this.f7020i;
        int i2 = 0;
        while (i < this.f7019b) {
            i2 += iArr[i];
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public final int m3769a(Object obj) {
        return obj != null ? m3766a(obj, obj.hashCode()) : m3765a();
    }

    /* renamed from: a */
    private final int m3766a(Object obj, int i) {
        int i2 = this.f7019b;
        if (i2 == 0) {
            return -1;
        }
        int a = il.m3809a(this.f7020i, i2, i);
        if (a < 0 || obj.equals(this.f7018a[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f7020i[i3] == i) {
            if (obj.equals(this.f7018a[i3])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f7020i[a] == i) {
            if (obj.equals(this.f7018a[a])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    private final int m3765a() {
        int i = this.f7019b;
        if (i == 0) {
            return -1;
        }
        int a = il.m3809a(this.f7020i, i, 0);
        if (a < 0 || this.f7018a[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f7020i[i2] == 0) {
            if (this.f7018a[i2] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f7020i[a] == 0) {
            if (this.f7018a[a] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    public final boolean isEmpty() {
        return this.f7019b <= 0;
    }

    public final Iterator iterator() {
        if (this.f7021j == null) {
            this.f7021j = new ik(this);
        }
        return this.f7021j.m3986d().iterator();
    }

    public final boolean remove(Object obj) {
        int a = m3769a(obj);
        if (a < 0) {
            return false;
        }
        m3770a(a);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    /* renamed from: a */
    public final Object m3770a(int i) {
        int i2 = 8;
        Object obj = this.f7018a;
        Object obj2 = obj[i];
        int i3 = this.f7019b;
        if (i3 <= 1) {
            ij.m3767a(this.f7020i, obj, i3);
            this.f7020i = f7012c;
            this.f7018a = f7013d;
            this.f7019b = 0;
        } else {
            Object obj3 = this.f7020i;
            int length = obj3.length;
            if (length <= 8 || i3 >= length / 3) {
                this.f7019b = i3 - 1;
                i2 = this.f7019b;
                if (i < i2) {
                    int i4 = i + 1;
                    System.arraycopy(obj3, i4, obj3, i, i2 - i);
                    Object obj4 = this.f7018a;
                    System.arraycopy(obj4, i4, obj4, i, this.f7019b - i);
                }
                this.f7018a[this.f7019b] = null;
            } else {
                if (i3 > 8) {
                    i2 = (i3 >> 1) + i3;
                }
                m3768b(i2);
                this.f7019b--;
                if (i > 0) {
                    System.arraycopy(obj3, 0, this.f7020i, 0, i);
                    System.arraycopy(obj, 0, this.f7018a, 0, i);
                }
                i2 = this.f7019b;
                if (i < i2) {
                    i3 = i + 1;
                    System.arraycopy(obj3, i3, this.f7020i, i, i2 - i);
                    System.arraycopy(obj, i3, this.f7018a, i, this.f7019b - i);
                }
            }
        }
        return obj2;
    }

    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f7019b - 1; i >= 0; i--) {
            if (!collection.contains(this.f7018a[i])) {
                m3770a(i);
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        return this.f7019b;
    }

    public final Object[] toArray() {
        int i = this.f7019b;
        Object obj = new Object[i];
        System.arraycopy(this.f7018a, 0, obj, 0, i);
        return obj;
    }

    public final Object[] toArray(Object[] objArr) {
        Object obj;
        if (objArr.length < this.f7019b) {
            obj = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f7019b);
        } else {
            obj = objArr;
        }
        System.arraycopy(this.f7018a, 0, obj, 0, this.f7019b);
        int length = obj.length;
        int i = this.f7019b;
        if (length > i) {
            obj[i] = null;
        }
        return obj;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f7019b * 14);
        stringBuilder.append('{');
        for (int i = 0; i < this.f7019b; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            ij ijVar = this.f7018a[i];
            if (ijVar != this) {
                stringBuilder.append(ijVar);
            } else {
                stringBuilder.append("(this Set)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
