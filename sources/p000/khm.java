package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: khm */
abstract class khm implements Iterator {
    /* renamed from: a */
    public final Iterator f8289a;

    khm(Iterator it) {
        this.f8289a = (Iterator) jri.m13152b((Object) it);
    }

    /* renamed from: a */
    abstract Object mo2148a(Object obj);

    public final boolean hasNext() {
        return this.f8289a.hasNext();
    }

    public final Object next() {
        return mo2148a(this.f8289a.next());
    }

    public final void remove() {
        this.f8289a.remove();
    }
}
