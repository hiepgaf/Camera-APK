package p000;

import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: wc */
public final class wc implements Iterator {
    /* renamed from: a */
    public xg f9444a = new xg();
    /* renamed from: b */
    public String f9445b = null;
    /* renamed from: c */
    private Iterator f9446c = null;

    public wc(wt wtVar) {
        ww wwVar = wtVar.f19668a;
        if (wwVar == null) {
            this.f9446c = Collections.EMPTY_LIST.iterator();
        } else if (this.f9444a.m6239b(256)) {
            this.f9446c = new ws(this, wwVar, null);
        } else {
            this.f9446c = new wr(this, wwVar, null, 1);
        }
    }

    public final boolean hasNext() {
        return this.f9446c.hasNext();
    }

    public final Object next() {
        return this.f9446c.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("The XMPIterator does not support remove().");
    }
}
