package p000;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: hwv */
public final class hwv extends AbstractSet {
    /* renamed from: a */
    private final ih f6789a = new ih();

    public final boolean add(Object obj) {
        if (this.f6789a.containsKey(obj)) {
            return false;
        }
        this.f6789a.put(obj, obj);
        return true;
    }

    public final boolean addAll(Collection collection) {
        if (!(collection instanceof hwv)) {
            return super.addAll(collection);
        }
        hwv hwv = (hwv) collection;
        int size = size();
        this.f6789a.mo2634a(hwv.f6789a);
        return size() > size;
    }

    public final void clear() {
        this.f6789a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f6789a.containsKey(obj);
    }

    public final Iterator iterator() {
        return this.f6789a.keySet().iterator();
    }

    public final boolean remove(Object obj) {
        if (!this.f6789a.containsKey(obj)) {
            return false;
        }
        this.f6789a.remove(obj);
        return true;
    }

    public final int size() {
        return this.f6789a.size();
    }
}
