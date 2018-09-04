package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: ken */
public abstract class ken extends keh implements List, RandomAccess {
    /* renamed from: a */
    private static final khz f19185a = new khz(kgh.f22032a, 0);

    ken() {
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    static ken m13459a(Object[] objArr) {
        return ken.m13461b(objArr, objArr.length);
    }

    /* renamed from: b */
    static ken m13461b(Object[] objArr, int i) {
        if (i != 0) {
            return new kgh(objArr, i);
        }
        return kgh.f22032a;
    }

    /* renamed from: a */
    public final ken mo2143a() {
        return this;
    }

    /* renamed from: d */
    public static keo m13463d() {
        return new keo();
    }

    /* renamed from: c */
    private static ken m13462c(Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            khb.m4862a(objArr[i], i);
        }
        return ken.m13461b(objArr, objArr.length);
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: a */
    int mo2142a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    /* renamed from: a */
    public static ken m13452a(Iterable iterable) {
        jri.m13152b((Object) iterable);
        if (iterable instanceof Collection) {
            return ken.m13458a((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return kgh.f22032a;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return new keo().m16494c(next).m16493b(it).m16491a();
        }
        return ken.m13453a(next);
    }

    /* renamed from: a */
    public static ken m13458a(Collection collection) {
        if (!(collection instanceof keh)) {
            return ken.m13462c(collection.toArray());
        }
        ken a = ((keh) collection).mo2143a();
        if (!a.mo3227b()) {
            return a;
        }
        Object[] toArray = a.toArray();
        return ken.m13461b(toArray, toArray.length);
    }

    /* renamed from: b */
    public static ken m13460b(Object[] objArr) {
        if (objArr.length != 0) {
            return ken.m13462c((Object[]) objArr.clone());
        }
        return kgh.f22032a;
    }

    public boolean equals(Object obj) {
        if (obj == jri.m13152b((Object) this)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        int i;
        if ((this instanceof RandomAccess) && (list instanceof RandomAccess)) {
            for (i = 0; i < size; i++) {
                if (!kbf.m16436b(get(i), list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        this = this;
        i = size();
        Iterator it = list.iterator();
        int i2 = 0;
        while (i2 < i) {
            if (!it.hasNext()) {
                return false;
            }
            Object obj2 = get(i2);
            i2++;
            if (!kbf.m16436b(obj2, it.next())) {
                return false;
            }
        }
        return it.hasNext() ^ 1;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ -1) ^ -1;
        }
        return i;
    }

    public int indexOf(Object obj) {
        int i = 0;
        if (obj == null) {
            return -1;
        }
        if (this instanceof RandomAccess) {
            int size = size();
            if (obj == null) {
                while (i < size) {
                    if (get(i) == null) {
                        return i;
                    }
                    i++;
                }
                return -1;
            }
            while (i < size) {
                if (obj.equals(get(i))) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        ListIterator listIterator = listIterator();
        while (listIterator.hasNext()) {
            if (kbf.m16436b(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final khy mo2144c() {
        return m13468a(0);
    }

    public /* synthetic */ Iterator iterator() {
        return m13468a(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        if (!(this instanceof RandomAccess)) {
            ListIterator listIterator = listIterator(size());
            while (listIterator.hasPrevious()) {
                if (kbf.m16436b(obj, listIterator.previous())) {
                    return listIterator.nextIndex();
                }
            }
            return -1;
        } else if (obj == null) {
            for (r1 = size() - 1; r1 >= 0; r1--) {
                if (get(r1) == null) {
                    return r1;
                }
            }
            return -1;
        } else {
            for (r1 = size() - 1; r1 >= 0; r1--) {
                if (obj.equals(get(r1))) {
                    return r1;
                }
            }
            return -1;
        }
    }

    public /* synthetic */ ListIterator listIterator() {
        return m13468a(0);
    }

    /* renamed from: a */
    public final khz m13468a(int i) {
        jri.m13151b(i, size());
        if (isEmpty()) {
            return f19185a;
        }
        return new khz(this, i);
    }

    public /* synthetic */ ListIterator listIterator(int i) {
        return m13468a(i);
    }

    /* renamed from: e */
    public static ken m13464e() {
        return kgh.f22032a;
    }

    /* renamed from: a */
    public static ken m13453a(Object obj) {
        return ken.m13462c(obj);
    }

    /* renamed from: a */
    public static ken m13454a(Object obj, Object obj2) {
        return ken.m13462c(obj, obj2);
    }

    /* renamed from: a */
    public static ken m13455a(Object obj, Object obj2, Object obj3) {
        return ken.m13462c(obj, obj2, obj3);
    }

    /* renamed from: a */
    public static ken m13456a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return ken.m13462c(obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    /* renamed from: a */
    public static ken m13457a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        boolean z;
        int length = objArr.length;
        if (length <= 2147483635) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "the total number of elements must fit in an int");
        Object obj13 = new Object[(length + 12)];
        obj13[0] = obj;
        obj13[1] = obj2;
        obj13[2] = obj3;
        obj13[3] = obj4;
        obj13[4] = obj5;
        obj13[5] = obj6;
        obj13[6] = obj7;
        obj13[7] = obj8;
        obj13[8] = obj9;
        obj13[9] = obj10;
        obj13[10] = obj11;
        obj13[11] = obj12;
        System.arraycopy(objArr, 0, obj13, 12, length);
        return ken.m13462c(obj13);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public ken mo3234f() {
        return size() > 1 ? new kep(this) : this;
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public ken mo3233a(int i, int i2) {
        jri.m13142a(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 != 0) {
            return new ker(this, i, i3);
        }
        return kgh.f22032a;
    }

    public /* synthetic */ List subList(int i, int i2) {
        return mo3233a(i, i2);
    }

    Object writeReplace() {
        return new keq(toArray());
    }
}
