package p000;

import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: kci */
final class kci extends kcg implements ListIterator {
    /* renamed from: b */
    private final /* synthetic */ kch f19161b;

    kci(kch kch) {
        this.f19161b = kch;
        super(kch);
    }

    public kci(kch kch, int i) {
        this.f19161b = kch;
        super(kch, ((List) kch.f8200b).listIterator(i));
    }

    public final void add(Object obj) {
        boolean isEmpty = this.f19161b.isEmpty();
        m4765a();
        ((ListIterator) this.f8204a).add(obj);
        this.f19161b.f19160d.f22004b = this.f19161b.f19160d.f22004b + 1;
        if (isEmpty) {
            this.f19161b.m4762a();
        }
    }

    /* renamed from: b */
    private final ListIterator m13391b() {
        m4765a();
        return (ListIterator) this.f8204a;
    }

    public final boolean hasPrevious() {
        return m13391b().hasPrevious();
    }

    public final int nextIndex() {
        return m13391b().nextIndex();
    }

    public final Object previous() {
        return m13391b().previous();
    }

    public final int previousIndex() {
        return m13391b().previousIndex();
    }

    public final void set(Object obj) {
        m13391b().set(obj);
    }
}
