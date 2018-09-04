package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ip */
public abstract class ip {
    /* renamed from: a */
    public ir f7263a;
    /* renamed from: b */
    public iu f7264b;
    /* renamed from: c */
    private is f7265c;

    ip() {
    }

    /* renamed from: a */
    protected abstract int mo1870a(Object obj);

    /* renamed from: a */
    protected abstract Object mo1871a(int i, int i2);

    /* renamed from: a */
    protected abstract Object mo1872a(int i, Object obj);

    /* renamed from: a */
    protected abstract void mo1873a();

    /* renamed from: a */
    protected abstract void mo1874a(int i);

    /* renamed from: a */
    protected abstract void mo1875a(Object obj, Object obj2);

    /* renamed from: b */
    protected abstract int mo1876b(Object obj);

    /* renamed from: b */
    protected abstract Map mo1877b();

    /* renamed from: c */
    protected abstract int mo1878c();

    /* renamed from: a */
    public static boolean m3974a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size() && set.containsAll(set2)) {
                return true;
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        } catch (ClassCastException e2) {
            return false;
        }
    }

    /* renamed from: d */
    public final Set m3986d() {
        if (this.f7265c == null) {
            this.f7265c = new is(this);
        }
        return this.f7265c;
    }

    /* renamed from: a */
    public static boolean m3973a(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: b */
    public final Object[] m3984b(int i) {
        int c = mo1878c();
        Object[] objArr = new Object[c];
        for (int i2 = 0; i2 < c; i2++) {
            objArr[i2] = mo1871a(i2, i);
        }
        return objArr;
    }

    /* renamed from: a */
    public final Object[] m3981a(Object[] objArr, int i) {
        Object[] objArr2;
        int c = mo1878c();
        if (objArr.length < c) {
            objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), c);
        } else {
            objArr2 = objArr;
        }
        for (int i2 = 0; i2 < c; i2++) {
            objArr2[i2] = mo1871a(i2, i);
        }
        if (objArr2.length > c) {
            objArr2[c] = null;
        }
        return objArr2;
    }
}
