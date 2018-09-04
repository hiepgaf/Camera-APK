package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: ktz */
final class ktz implements Iterator {
    ktz() {
    }

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
