package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: khz */
public final class khz extends khy implements ListIterator {
    /* renamed from: a */
    private final int f19211a;
    /* renamed from: b */
    private int f19212b;
    /* renamed from: c */
    private final ken f19213c;

    protected khz() {
    }

    private khz(int i, int i2) {
        this();
        jri.m13151b(i2, i);
        this.f19211a = i;
        this.f19212b = i2;
    }

    khz(ken ken, int i) {
        this(ken.size(), i);
        this.f19213c = ken;
    }

    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private final Object m13548a(int i) {
        return this.f19213c.get(i);
    }

    public final boolean hasNext() {
        return this.f19212b < this.f19211a;
    }

    public final boolean hasPrevious() {
        return this.f19212b > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f19212b;
            this.f19212b = i + 1;
            return m13548a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f19212b;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f19212b - 1;
            this.f19212b = i;
            return m13548a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f19212b - 1;
    }

    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
