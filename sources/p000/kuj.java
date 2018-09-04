package p000;

import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: kuj */
final class kuj implements ListIterator {
    /* renamed from: a */
    private ListIterator f8578a = this.f8580c.f19316a.listIterator(this.f8579b);
    /* renamed from: b */
    private final /* synthetic */ int f8579b;
    /* renamed from: c */
    private final /* synthetic */ kui f8580c;

    kuj(kui kui, int i) {
        this.f8580c = kui;
        this.f8579b = i;
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f8578a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f8578a.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f8578a.next();
    }

    public final int nextIndex() {
        return this.f8578a.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return (String) this.f8578a.previous();
    }

    public final int previousIndex() {
        return this.f8578a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
