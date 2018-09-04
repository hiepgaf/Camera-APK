package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: kfh */
public final class kfh extends AbstractList implements Serializable, RandomAccess {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    public final kaw f8269a;
    /* renamed from: b */
    private final List f8270b;

    public kfh(List list, kaw kaw) {
        this.f8270b = (List) jri.m13152b((Object) list);
        this.f8269a = (kaw) jri.m13152b((Object) kaw);
    }

    public final void clear() {
        this.f8270b.clear();
    }

    public final Object get(int i) {
        return this.f8269a.mo370a(this.f8270b.get(i));
    }

    public final boolean isEmpty() {
        return this.f8270b.isEmpty();
    }

    public final Iterator iterator() {
        return listIterator();
    }

    public final ListIterator listIterator(int i) {
        return new kfi(this, this.f8270b.listIterator(i));
    }

    public final Object remove(int i) {
        return this.f8269a.mo370a(this.f8270b.remove(i));
    }

    public final int size() {
        return this.f8270b.size();
    }
}
