package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: kfd */
enum kfd implements Iterator {
    ;

    private kfd(String str) {
    }

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        jri.m13154b(false, (Object) "no calls to next() since the last call to remove()");
    }
}
