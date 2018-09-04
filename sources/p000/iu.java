package p000;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: iu */
final class iu implements Collection {
    /* renamed from: a */
    private final /* synthetic */ ip f7466a;

    iu(ip ipVar) {
        this.f7466a = ipVar;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f7466a.mo1873a();
    }

    public final boolean contains(Object obj) {
        return this.f7466a.mo1876b(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.f7466a.mo1878c() == 0;
    }

    public final Iterator iterator() {
        return new iq(this.f7466a, 1);
    }

    public final boolean remove(Object obj) {
        int b = this.f7466a.mo1876b(obj);
        if (b < 0) {
            return false;
        }
        this.f7466a.mo1874a(b);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        int i = 0;
        int c = this.f7466a.mo1878c();
        boolean z = false;
        while (i < c) {
            if (collection.contains(this.f7466a.mo1871a(i, 1))) {
                this.f7466a.mo1874a(i);
                i--;
                c--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        int i = 0;
        int c = this.f7466a.mo1878c();
        boolean z = false;
        while (i < c) {
            if (!collection.contains(this.f7466a.mo1871a(i, 1))) {
                this.f7466a.mo1874a(i);
                i--;
                c--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public final int size() {
        return this.f7466a.mo1878c();
    }

    public final Object[] toArray() {
        return this.f7466a.m3984b(1);
    }

    public final Object[] toArray(Object[] objArr) {
        return this.f7466a.m3981a(objArr, 1);
    }
}
