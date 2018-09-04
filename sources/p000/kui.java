package p000;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: kui */
public final class kui extends AbstractList implements RandomAccess, ksp {
    /* renamed from: a */
    public final ksp f19316a;

    public kui(ksp ksp) {
        this.f19316a = ksp;
    }

    /* renamed from: a */
    public final void mo2307a(kqx kqx) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f19316a.get(i);
    }

    /* renamed from: b */
    public final Object mo2308b(int i) {
        return this.f19316a.mo2308b(i);
    }

    /* renamed from: d */
    public final List mo2309d() {
        return this.f19316a.mo2309d();
    }

    /* renamed from: e */
    public final ksp mo2310e() {
        return this;
    }

    public final Iterator iterator() {
        return new kuk(this);
    }

    public final ListIterator listIterator(int i) {
        return new kuj(this, i);
    }

    public final int size() {
        return this.f19316a.size();
    }
}
