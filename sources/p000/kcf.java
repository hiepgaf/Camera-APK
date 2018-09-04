package p000;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kcf */
class kcf extends AbstractCollection {
    /* renamed from: a */
    public final Object f8199a;
    /* renamed from: b */
    public Collection f8200b;
    /* renamed from: c */
    public final kcf f8201c;
    /* renamed from: d */
    public final /* synthetic */ kbv f8202d;
    /* renamed from: e */
    private final Collection f8203e;

    kcf(kbv kbv, Object obj, Collection collection, kcf kcf) {
        Collection collection2;
        this.f8202d = kbv;
        this.f8199a = obj;
        this.f8200b = collection;
        this.f8201c = kcf;
        if (kcf != null) {
            collection2 = kcf.f8200b;
        } else {
            collection2 = null;
        }
        this.f8203e = collection2;
    }

    public boolean add(Object obj) {
        m4763b();
        boolean isEmpty = this.f8200b.isEmpty();
        boolean add = this.f8200b.add(obj);
        if (add) {
            this.f8202d.f22004b = this.f8202d.f22004b + 1;
            if (isEmpty) {
                m4762a();
            }
        }
        return add;
    }

    public boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f8200b.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        kbv.m16438a(this.f8202d, this.f8200b.size() - size);
        if (size != 0) {
            return addAll;
        }
        m4762a();
        return addAll;
    }

    /* renamed from: a */
    final void m4762a() {
        while (true) {
            kcf kcf = this.f8201c;
            if (kcf != null) {
                this = kcf;
            } else {
                this.f8202d.f22003a.put(this.f8199a, this.f8200b);
                return;
            }
        }
    }

    public void clear() {
        int size = size();
        if (size != 0) {
            this.f8200b.clear();
            kbv.m16440b(this.f8202d, size);
            m4764c();
        }
    }

    public boolean contains(Object obj) {
        m4763b();
        return this.f8200b.contains(obj);
    }

    public boolean containsAll(Collection collection) {
        m4763b();
        return this.f8200b.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        m4763b();
        return this.f8200b.equals(obj);
    }

    public int hashCode() {
        m4763b();
        return this.f8200b.hashCode();
    }

    public Iterator iterator() {
        m4763b();
        return new kcg(this);
    }

    /* renamed from: b */
    final void m4763b() {
        kcf kcf = this.f8201c;
        if (kcf != null) {
            kcf.m4763b();
            if (this.f8201c.f8200b != this.f8203e) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f8200b.isEmpty()) {
            Collection collection = (Collection) this.f8202d.f22003a.get(this.f8199a);
            if (collection != null) {
                this.f8200b = collection;
            }
        }
    }

    public boolean remove(Object obj) {
        m4763b();
        boolean remove = this.f8200b.remove(obj);
        if (remove) {
            this.f8202d.f22004b = this.f8202d.f22004b - 1;
            m4764c();
        }
        return remove;
    }

    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f8200b.removeAll(collection);
        if (!removeAll) {
            return removeAll;
        }
        kbv.m16438a(this.f8202d, this.f8200b.size() - size);
        m4764c();
        return removeAll;
    }

    /* renamed from: c */
    final void m4764c() {
        while (true) {
            kcf kcf = this.f8201c;
            if (kcf == null) {
                break;
            }
            this = kcf;
        }
        if (this.f8200b.isEmpty()) {
            this.f8202d.f22003a.remove(this.f8199a);
        }
    }

    public boolean retainAll(Collection collection) {
        jri.m13152b((Object) collection);
        int size = size();
        boolean retainAll = this.f8200b.retainAll(collection);
        if (retainAll) {
            kbv.m16438a(this.f8202d, this.f8200b.size() - size);
            m4764c();
        }
        return retainAll;
    }

    public int size() {
        m4763b();
        return this.f8200b.size();
    }

    public String toString() {
        m4763b();
        return this.f8200b.toString();
    }
}
