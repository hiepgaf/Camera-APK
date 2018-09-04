package p000;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: kdg */
abstract class kdg implements Iterator {
    /* renamed from: a */
    private int f8226a;
    /* renamed from: b */
    private int f8227b;
    /* renamed from: c */
    private int f8228c;
    /* renamed from: d */
    private final /* synthetic */ kdb f8229d;

    private kdg(kdb kdb) {
        int i;
        this.f8229d = kdb;
        kdb kdb2 = this.f8229d;
        this.f8226a = kdb2.f8217d;
        if (kdb2.isEmpty()) {
            i = -1;
        } else {
            i = 0;
        }
        this.f8227b = i;
        this.f8228c = -1;
    }

    /* renamed from: a */
    abstract Object mo2118a(int i);

    /* renamed from: a */
    private final void m4779a() {
        if (this.f8229d.f8217d != this.f8226a) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        return this.f8227b >= 0;
    }

    public Object next() {
        m4779a();
        if (hasNext()) {
            int i = this.f8227b;
            this.f8228c = i;
            Object a = mo2118a(i);
            i = this.f8227b + 1;
            if (i >= this.f8229d.f8218e) {
                i = -1;
            }
            this.f8227b = i;
            return a;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        boolean z;
        m4779a();
        if (this.f8228c >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13154b(z, (Object) "no calls to next() since the last call to remove()");
        this.f8226a++;
        kdb kdb = this.f8229d;
        int i = this.f8228c;
        kdb.m4778a(kdb.f8215b[i], (int) (kdb.f8214a[i] >>> 32));
        this.f8227b--;
        this.f8228c = -1;
    }
}
