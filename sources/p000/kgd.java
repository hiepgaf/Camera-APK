package p000;

import java.util.Comparator;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kgd */
public abstract class kgd implements Comparator {
    protected kgd() {
    }

    public abstract int compare(Object obj, Object obj2);

    /* renamed from: a */
    public Object mo2157a(Iterable iterable) {
        return mo2159a(iterable.iterator());
    }

    /* renamed from: a */
    public Object mo2158a(Object obj, Object obj2) {
        return compare(obj, obj2) >= 0 ? obj : obj2;
    }

    /* renamed from: a */
    public Object mo2159a(Iterator it) {
        Object next = it.next();
        while (it.hasNext()) {
            next = mo2158a(next, it.next());
        }
        return next;
    }

    /* renamed from: b */
    public Object mo2160b(Iterable iterable) {
        return mo2162b(iterable.iterator());
    }

    /* renamed from: b */
    public Object mo2161b(Object obj, Object obj2) {
        return compare(obj, obj2) <= 0 ? obj : obj2;
    }

    /* renamed from: b */
    public Object mo2162b(Iterator it) {
        Object next = it.next();
        while (it.hasNext()) {
            next = mo2161b(next, it.next());
        }
        return next;
    }

    /* renamed from: a */
    public kgd mo2152a() {
        return new kgp(this);
    }
}
