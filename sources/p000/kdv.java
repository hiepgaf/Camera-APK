package p000;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kdv */
public abstract class kdv extends kdy implements Collection {
    protected kdv() {
    }

    /* renamed from: b */
    public abstract Collection mo3225b();

    public boolean add(Object obj) {
        return mo3225b().add(obj);
    }

    public boolean addAll(Collection collection) {
        return mo3225b().addAll(collection);
    }

    public void clear() {
        mo3225b().clear();
    }

    public boolean contains(Object obj) {
        return mo3225b().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return mo3225b().containsAll(collection);
    }

    public /* synthetic */ Object F_() {
        return mo3225b();
    }

    public boolean isEmpty() {
        return mo3225b().isEmpty();
    }

    public Iterator iterator() {
        return mo3225b().iterator();
    }

    public boolean remove(Object obj) {
        return mo3225b().remove(obj);
    }

    public boolean removeAll(Collection collection) {
        return mo3225b().removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        return mo3225b().retainAll(collection);
    }

    public int size() {
        return mo3225b().size();
    }

    public Object[] toArray() {
        return mo3225b().toArray();
    }

    public Object[] toArray(Object[] objArr) {
        return mo3225b().toArray(objArr);
    }
}
