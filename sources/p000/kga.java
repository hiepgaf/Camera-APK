package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: kga */
final class kga implements Iterator {
    /* renamed from: a */
    private final kft f8278a;
    /* renamed from: b */
    private final Iterator f8279b;
    /* renamed from: c */
    private kfu f8280c;
    /* renamed from: d */
    private int f8281d;
    /* renamed from: e */
    private int f8282e;
    /* renamed from: f */
    private boolean f8283f;

    kga(kft kft, Iterator it) {
        this.f8278a = kft;
        this.f8279b = it;
    }

    public final boolean hasNext() {
        return this.f8281d > 0 || this.f8279b.hasNext();
    }

    public final Object next() {
        if (hasNext()) {
            if (this.f8281d == 0) {
                this.f8280c = (kfu) this.f8279b.next();
                int a = this.f8280c.mo3239a();
                this.f8281d = a;
                this.f8282e = a;
            }
            this.f8281d--;
            this.f8283f = true;
            return this.f8280c.mo3240b();
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        jri.m13154b(this.f8283f, (Object) "no calls to next() since the last call to remove()");
        if (this.f8282e == 1) {
            this.f8279b.remove();
        } else {
            this.f8278a.remove(this.f8280c.mo3240b());
        }
        this.f8282e--;
        this.f8283f = false;
    }
}
