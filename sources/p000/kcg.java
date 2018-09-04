package p000;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: kcg */
class kcg implements Iterator {
    /* renamed from: a */
    public final Iterator f8204a;
    /* renamed from: b */
    private final Collection f8205b = this.f8206c.f8200b;
    /* renamed from: c */
    private final /* synthetic */ kcf f8206c;

    kcg(kcf kcf) {
        Iterator listIterator;
        this.f8206c = kcf;
        Collection collection = kcf.f8200b;
        if (collection instanceof List) {
            listIterator = ((List) collection).listIterator();
        } else {
            listIterator = collection.iterator();
        }
        this.f8204a = listIterator;
    }

    kcg(kcf kcf, Iterator it) {
        this.f8206c = kcf;
        this.f8204a = it;
    }

    public boolean hasNext() {
        m4765a();
        return this.f8204a.hasNext();
    }

    public Object next() {
        m4765a();
        return this.f8204a.next();
    }

    public void remove() {
        this.f8204a.remove();
        this.f8206c.f8202d.f22004b = this.f8206c.f8202d.f22004b - 1;
        this.f8206c.m4764c();
    }

    /* renamed from: a */
    final void m4765a() {
        this.f8206c.m4763b();
        if (this.f8206c.f8200b != this.f8205b) {
            throw new ConcurrentModificationException();
        }
    }
}
