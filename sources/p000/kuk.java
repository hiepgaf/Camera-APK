package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kuk */
final class kuk implements Iterator {
    /* renamed from: a */
    private Iterator f8581a = this.f8582b.f19316a.iterator();
    /* renamed from: b */
    private final /* synthetic */ kui f8582b;

    kuk(kui kui) {
        this.f8582b = kui;
    }

    public final boolean hasNext() {
        return this.f8581a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f8581a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
