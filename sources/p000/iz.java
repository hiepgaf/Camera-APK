package p000;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: PG */
/* renamed from: iz */
public class iz {
    /* renamed from: c */
    private static Object[] f7573c;
    /* renamed from: d */
    private static int f7574d;
    /* renamed from: e */
    private static Object[] f7575e;
    /* renamed from: f */
    private static int f7576f;
    /* renamed from: a */
    public Object[] f7577a;
    /* renamed from: b */
    public int f7578b;
    /* renamed from: g */
    private int[] f7579g;

    public iz() {
        this.f7579g = il.f7072a;
        this.f7577a = il.f7073b;
        this.f7578b = 0;
    }

    public iz(int i) {
        if (i == 0) {
            this.f7579g = il.f7072a;
            this.f7577a = il.f7073b;
        } else {
            m4350e(i);
        }
        this.f7578b = 0;
    }

    public iz(iz izVar) {
        this();
        if (izVar != null) {
            mo2634a(izVar);
        }
    }

    /* renamed from: e */
    private final void m4350e(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (ih.class) {
                if (f7575e != null) {
                    objArr = f7575e;
                    this.f7577a = objArr;
                    f7575e = (Object[]) objArr[0];
                    this.f7579g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f7576f--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (ih.class) {
                if (f7573c != null) {
                    objArr = f7573c;
                    this.f7577a = objArr;
                    f7573c = (Object[]) objArr[0];
                    this.f7579g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f7574d--;
                    return;
                }
            }
        }
        this.f7579g = new int[i];
        this.f7577a = new Object[(i + i)];
    }

    /* renamed from: a */
    private static int m4348a(int[] iArr, int i, int i2) {
        try {
            return il.m3809a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f7578b;
        if (i > 0) {
            int[] iArr = this.f7579g;
            Object[] objArr = this.f7577a;
            this.f7579g = il.f7072a;
            this.f7577a = il.f7073b;
            this.f7578b = 0;
            iz.m4349a(iArr, objArr, i);
        }
        if (this.f7578b > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m4351a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m4355b(obj) >= 0;
    }

    /* renamed from: a */
    public final void m4353a(int i) {
        int i2 = this.f7578b;
        int[] iArr = this.f7579g;
        if (iArr.length < i) {
            Object[] objArr = this.f7577a;
            m4350e(i);
            if (this.f7578b > 0) {
                System.arraycopy(iArr, 0, this.f7579g, 0, i2);
                System.arraycopy(objArr, 0, this.f7577a, 0, i2 + i2);
            }
            iz.m4349a(iArr, objArr, i2);
        }
        if (this.f7578b != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        int i;
        Object b;
        Object d;
        Object obj2;
        if (obj instanceof iz) {
            iz izVar = (iz) obj;
            if (size() != izVar.size()) {
                return false;
            }
            i = 0;
            while (i < this.f7578b) {
                try {
                    b = m4356b(i);
                    d = m4358d(i);
                    obj2 = izVar.get(b);
                    if (d == null) {
                        if (obj2 != null || !izVar.containsKey(b)) {
                            return false;
                        }
                    } else if (!d.equals(obj2)) {
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
        } else if (!(obj instanceof Map)) {
            return false;
        } else {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            i = 0;
            while (i < this.f7578b) {
                try {
                    b = m4356b(i);
                    d = m4358d(i);
                    obj2 = map.get(b);
                    if (d == null) {
                        if (obj2 != null || !map.containsKey(b)) {
                            return false;
                        }
                    } else if (!d.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (NullPointerException e3) {
                    return false;
                } catch (ClassCastException e4) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    private static void m4349a(int[] iArr, Object[] objArr, int i) {
        int length = iArr.length;
        if (length == 8) {
            synchronized (ih.class) {
                if (f7576f < 10) {
                    objArr[0] = f7575e;
                    objArr[1] = iArr;
                    for (length = (i + i) - 1; length >= 2; length--) {
                        objArr[length] = null;
                    }
                    f7575e = objArr;
                    f7576f++;
                }
            }
        } else if (length == 4) {
            synchronized (ih.class) {
                if (f7574d < 10) {
                    objArr[0] = f7573c;
                    objArr[1] = iArr;
                    for (length = (i + i) - 1; length >= 2; length--) {
                        objArr[length] = null;
                    }
                    f7573c = objArr;
                    f7574d++;
                }
            }
        }
    }

    public Object get(Object obj) {
        int a = m4351a(obj);
        return a >= 0 ? this.f7577a[(a + a) + 1] : null;
    }

    public int hashCode() {
        int[] iArr = this.f7579g;
        Object[] objArr = this.f7577a;
        int i = this.f7578b;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int hashCode;
            Object obj = objArr[i2];
            int i5 = iArr[i3];
            if (obj != null) {
                hashCode = obj.hashCode();
            } else {
                hashCode = 0;
            }
            i4 += hashCode ^ i5;
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: a */
    private final int m4347a(Object obj, int i) {
        int i2 = this.f7578b;
        if (i2 == 0) {
            return -1;
        }
        int a = iz.m4348a(this.f7579g, i2, i);
        if (a < 0 || obj.equals(this.f7577a[a + a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f7579g[i3] == i) {
            if (obj.equals(this.f7577a[i3 + i3])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f7579g[a] == i) {
            if (obj.equals(this.f7577a[a + a])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    public final int m4351a(Object obj) {
        return obj != null ? m4347a(obj, obj.hashCode()) : m4346a();
    }

    /* renamed from: a */
    private final int m4346a() {
        int i = this.f7578b;
        if (i == 0) {
            return -1;
        }
        int a = iz.m4348a(this.f7579g, i, 0);
        if (a < 0 || this.f7577a[a + a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f7579g[i2] == 0) {
            if (this.f7577a[i2 + i2] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f7579g[a] == 0) {
            if (this.f7577a[a + a] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    /* renamed from: b */
    final int m4355b(Object obj) {
        int i = 1;
        int i2 = this.f7578b;
        i2 += i2;
        Object[] objArr = this.f7577a;
        if (obj == null) {
            while (i < i2) {
                if (objArr[i] == null) {
                    return i >> 1;
                }
                i += 2;
            }
        } else {
            while (i < i2) {
                if (obj.equals(objArr[i])) {
                    return i >> 1;
                }
                i += 2;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f7578b <= 0;
    }

    /* renamed from: b */
    public final Object m4356b(int i) {
        return this.f7577a[i + i];
    }

    public Object put(Object obj, Object obj2) {
        int a;
        int i;
        int i2 = 8;
        int i3 = this.f7578b;
        if (obj == null) {
            a = m4346a();
            i = 0;
        } else {
            i = obj.hashCode();
            a = m4347a(obj, i);
        }
        if (a >= 0) {
            int i4 = (a + a) + 1;
            Object[] objArr = this.f7577a;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        Object[] objArr2;
        a ^= -1;
        int[] iArr = this.f7579g;
        int length = iArr.length;
        if (i3 >= length) {
            if (i3 >= 8) {
                i2 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i2 = 4;
            }
            objArr2 = this.f7577a;
            m4350e(i2);
            if (i3 != this.f7578b) {
                throw new ConcurrentModificationException();
            }
            obj3 = this.f7579g;
            if (obj3.length > 0) {
                System.arraycopy(iArr, 0, obj3, 0, length);
                System.arraycopy(objArr2, 0, this.f7577a, 0, objArr2.length);
            }
            iz.m4349a(iArr, objArr2, i3);
        }
        if (a < i3) {
            obj3 = this.f7579g;
            i4 = a + 1;
            System.arraycopy(obj3, a, obj3, i4, i3 - a);
            obj3 = this.f7577a;
            int i5 = this.f7578b - a;
            System.arraycopy(obj3, a + a, obj3, i4 + i4, i5 + i5);
        }
        i2 = this.f7578b;
        if (i3 == i2) {
            int[] iArr2 = this.f7579g;
            if (a < iArr2.length) {
                iArr2[a] = i;
                objArr2 = this.f7577a;
                a += a;
                objArr2[a] = obj;
                objArr2[a + 1] = obj2;
                this.f7578b = i2 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: a */
    public void mo2634a(iz izVar) {
        int i = 0;
        int i2 = izVar.f7578b;
        m4353a(this.f7578b + i2);
        if (this.f7578b != 0) {
            while (i < i2) {
                put(izVar.m4356b(i), izVar.m4358d(i));
                i++;
            }
        } else if (i2 > 0) {
            System.arraycopy(izVar.f7579g, 0, this.f7579g, 0, i2);
            System.arraycopy(izVar.f7577a, 0, this.f7577a, 0, i2 + i2);
            this.f7578b = i2;
        }
    }

    public Object remove(Object obj) {
        int a = m4351a(obj);
        return a >= 0 ? mo2635c(a) : null;
    }

    /* renamed from: c */
    public Object mo2635c(int i) {
        int i2 = 8;
        Object[] objArr = this.f7577a;
        int i3 = i + i;
        Object obj = objArr[i3 + 1];
        int i4 = this.f7578b;
        if (i4 <= 1) {
            iz.m4349a(this.f7579g, objArr, i4);
            this.f7579g = il.f7072a;
            this.f7577a = il.f7073b;
            i2 = 0;
        } else {
            int i5 = i4 - 1;
            Object obj2 = this.f7579g;
            int length = obj2.length;
            int i6;
            if (length <= 8 || i4 >= length / 3) {
                if (i < i5) {
                    i2 = i + 1;
                    i6 = i5 - i;
                    System.arraycopy(obj2, i2, obj2, i, i6);
                    Object obj3 = this.f7577a;
                    System.arraycopy(obj3, i2 + i2, obj3, i3, i6 + i6);
                }
                Object[] objArr2 = this.f7577a;
                i6 = i5 + i5;
                objArr2[i6] = null;
                objArr2[i6 + 1] = null;
                i2 = i5;
            } else {
                if (i4 > 8) {
                    i2 = (i4 >> 1) + i4;
                }
                m4350e(i2);
                if (i4 != this.f7578b) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(obj2, 0, this.f7579g, 0, i);
                    System.arraycopy(objArr, 0, this.f7577a, 0, i3);
                }
                if (i < i5) {
                    i2 = i + 1;
                    i6 = i5 - i;
                    System.arraycopy(obj2, i2, this.f7579g, i, i6);
                    System.arraycopy(objArr, i2 + i2, this.f7577a, i3, i6 + i6);
                    i2 = i5;
                } else {
                    i2 = i5;
                }
            }
        }
        if (i4 != this.f7578b) {
            throw new ConcurrentModificationException();
        }
        this.f7578b = i2;
        return obj;
    }

    /* renamed from: a */
    public Object mo2633a(int i, Object obj) {
        int i2 = (i + i) + 1;
        Object[] objArr = this.f7577a;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public int size() {
        return this.f7578b;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f7578b * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f7578b; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            iz b = m4356b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            b = m4358d(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: d */
    public final Object m4358d(int i) {
        return this.f7577a[(i + i) + 1];
    }
}
