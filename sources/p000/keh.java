package p000;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: keh */
public abstract class keh extends AbstractCollection implements Serializable {
    /* renamed from: a */
    private static final Object[] f8253a = new Object[0];

    /* renamed from: b */
    abstract boolean mo3227b();

    /* renamed from: c */
    public abstract khy mo2144c();

    public abstract boolean contains(Object obj);

    keh() {
    }

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public ken mo2143a() {
        return !isEmpty() ? ken.m13459a(toArray()) : ken.m13464e();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    int mo2142a(Object[] objArr, int i) {
        Iterator c = mo2144c();
        while (c.hasNext()) {
            int i2 = i + 1;
            objArr[i] = c.next();
            i = i2;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return mo2144c();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        int size = size();
        if (size == 0) {
            return f8253a;
        }
        Object[] objArr = new Object[size];
        mo2142a(objArr, 0);
        return objArr;
    }

    public final Object[] toArray(Object[] objArr) {
        jri.m13152b((Object) objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo2142a(objArr, 0);
        return objArr;
    }

    Object writeReplace() {
        return new keq(toArray());
    }
}
