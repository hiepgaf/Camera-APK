package p000;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: khd */
class khd extends khi implements Collection {
    public static final long serialVersionUID = 0;

    khd(Collection collection, Object obj) {
        super(collection, obj);
    }

    public boolean add(Object obj) {
        boolean add;
        synchronized (this.a) {
            add = mo3243b().add(obj);
        }
        return add;
    }

    public boolean addAll(Collection collection) {
        boolean addAll;
        synchronized (this.a) {
            addAll = mo3243b().addAll(collection);
        }
        return addAll;
    }

    public void clear() {
        synchronized (this.a) {
            mo3243b().clear();
        }
    }

    public boolean contains(Object obj) {
        boolean contains;
        synchronized (this.a) {
            contains = mo3243b().contains(obj);
        }
        return contains;
    }

    public boolean containsAll(Collection collection) {
        boolean containsAll;
        synchronized (this.a) {
            containsAll = mo3243b().containsAll(collection);
        }
        return containsAll;
    }

    /* renamed from: a */
    /* synthetic */ Object mo2169a() {
        return mo3243b();
    }

    /* renamed from: b */
    Collection mo3243b() {
        return (Collection) super.mo2169a();
    }

    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.a) {
            isEmpty = mo3243b().isEmpty();
        }
        return isEmpty;
    }

    public Iterator iterator() {
        return mo3243b().iterator();
    }

    public boolean remove(Object obj) {
        boolean remove;
        synchronized (this.a) {
            remove = mo3243b().remove(obj);
        }
        return remove;
    }

    public boolean removeAll(Collection collection) {
        boolean removeAll;
        synchronized (this.a) {
            removeAll = mo3243b().removeAll(collection);
        }
        return removeAll;
    }

    public boolean retainAll(Collection collection) {
        boolean retainAll;
        synchronized (this.a) {
            retainAll = mo3243b().retainAll(collection);
        }
        return retainAll;
    }

    public int size() {
        int size;
        synchronized (this.a) {
            size = mo3243b().size();
        }
        return size;
    }

    public Object[] toArray() {
        Object[] toArray;
        synchronized (this.a) {
            toArray = mo3243b().toArray();
        }
        return toArray;
    }

    public Object[] toArray(Object[] objArr) {
        Object[] toArray;
        synchronized (this.a) {
            toArray = mo3243b().toArray(objArr);
        }
        return toArray;
    }
}
