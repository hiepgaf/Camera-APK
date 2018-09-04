package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: wx */
final class wx implements Iterator {
    /* renamed from: a */
    private final /* synthetic */ Iterator f9490a;

    wx(Iterator it) {
        this.f9490a = it;
    }

    public final boolean hasNext() {
        return this.f9490a.hasNext();
    }

    public final Object next() {
        return this.f9490a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("remove() is not allowed due to the internal contraints");
    }
}
