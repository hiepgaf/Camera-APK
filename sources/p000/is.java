package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: is */
final class is implements Set {
    /* renamed from: a */
    private final /* synthetic */ ip f7382a;

    is(ip ipVar) {
        this.f7382a = ipVar;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f7382a.mo1873a();
    }

    public final boolean contains(Object obj) {
        return this.f7382a.mo1870a(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        Map b = this.f7382a.mo1877b();
        for (Object containsKey : collection) {
            if (!b.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return ip.m3974a((Set) this, obj);
    }

    public final int hashCode() {
        int i = 0;
        for (int c = this.f7382a.mo1878c() - 1; c >= 0; c--) {
            int hashCode;
            Object a = this.f7382a.mo1871a(c, 0);
            if (a != null) {
                hashCode = a.hashCode();
            } else {
                hashCode = 0;
            }
            i += hashCode;
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.f7382a.mo1878c() == 0;
    }

    public final Iterator iterator() {
        return new iq(this.f7382a, 0);
    }

    public final boolean remove(Object obj) {
        int a = this.f7382a.mo1870a(obj);
        if (a < 0) {
            return false;
        }
        this.f7382a.mo1874a(a);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        Map b = this.f7382a.mo1877b();
        int size = b.size();
        for (Object remove : collection) {
            b.remove(remove);
        }
        return size != b.size();
    }

    public final boolean retainAll(Collection collection) {
        return ip.m3973a(this.f7382a.mo1877b(), collection);
    }

    public final int size() {
        return this.f7382a.mo1878c();
    }

    public final Object[] toArray() {
        return this.f7382a.m3984b(0);
    }

    public final Object[] toArray(Object[] objArr) {
        return this.f7382a.m3981a(objArr, 0);
    }
}
