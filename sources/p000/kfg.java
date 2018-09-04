package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: kfg */
final class kfg implements ListIterator {
    /* renamed from: a */
    private boolean f8266a;
    /* renamed from: b */
    private final /* synthetic */ ListIterator f8267b;
    /* renamed from: c */
    private final /* synthetic */ kff f8268c;

    kfg(kff kff, ListIterator listIterator) {
        this.f8268c = kff;
        this.f8267b = listIterator;
    }

    public final void add(Object obj) {
        this.f8267b.add(obj);
        this.f8267b.previous();
        this.f8266a = false;
    }

    public final boolean hasNext() {
        return this.f8267b.hasPrevious();
    }

    public final boolean hasPrevious() {
        return this.f8267b.hasNext();
    }

    public final Object next() {
        if (hasNext()) {
            this.f8266a = true;
            return this.f8267b.previous();
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f8268c.m4819a(this.f8267b.nextIndex());
    }

    public final Object previous() {
        if (hasPrevious()) {
            this.f8266a = true;
            return this.f8267b.next();
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return nextIndex() - 1;
    }

    public final void remove() {
        jri.m13154b(this.f8266a, (Object) "no calls to next() since the last call to remove()");
        this.f8267b.remove();
        this.f8266a = false;
    }

    public final void set(Object obj) {
        jri.m13153b(this.f8266a);
        this.f8267b.set(obj);
    }
}
