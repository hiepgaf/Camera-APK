package p000;

import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: khn */
abstract class khn extends khm implements ListIterator {
    khn(ListIterator listIterator) {
        super(listIterator);
    }

    public void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious() {
        return ((ListIterator) this.a).hasPrevious();
    }

    public final int nextIndex() {
        return ((ListIterator) this.a).nextIndex();
    }

    public final Object previous() {
        return mo2148a(((ListIterator) this.a).previous());
    }

    public final int previousIndex() {
        return ((ListIterator) this.a).previousIndex();
    }

    public void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
