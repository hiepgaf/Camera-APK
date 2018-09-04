package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: iq */
final class iq implements Iterator {
    /* renamed from: a */
    private final int f7307a;
    /* renamed from: b */
    private int f7308b;
    /* renamed from: c */
    private int f7309c;
    /* renamed from: d */
    private boolean f7310d = false;
    /* renamed from: e */
    private final /* synthetic */ ip f7311e;

    iq(ip ipVar, int i) {
        this.f7311e = ipVar;
        this.f7307a = i;
        this.f7308b = ipVar.mo1878c();
    }

    public final boolean hasNext() {
        return this.f7309c < this.f7308b;
    }

    public final Object next() {
        if (hasNext()) {
            Object a = this.f7311e.mo1871a(this.f7309c, this.f7307a);
            this.f7309c++;
            this.f7310d = true;
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f7310d) {
            this.f7309c--;
            this.f7308b--;
            this.f7310d = false;
            this.f7311e.mo1874a(this.f7309c);
            return;
        }
        throw new IllegalStateException();
    }
}
