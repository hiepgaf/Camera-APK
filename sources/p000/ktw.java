package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: ktw */
final class ktw implements Iterator {
    /* renamed from: a */
    private int f8556a = this.f8558c.f8549a.size();
    /* renamed from: b */
    private Iterator f8557b;
    /* renamed from: c */
    private final /* synthetic */ ktu f8558c;

    ktw(ktu ktu) {
        this.f8558c = ktu;
    }

    /* renamed from: a */
    private final Iterator m5294a() {
        if (this.f8557b == null) {
            this.f8557b = this.f8558c.f8552d.entrySet().iterator();
        }
        return this.f8557b;
    }

    public final boolean hasNext() {
        int i = this.f8556a;
        return (i > 0 && i <= this.f8558c.f8549a.size()) || m5294a().hasNext();
    }

    public final /* synthetic */ Object next() {
        if (m5294a().hasNext()) {
            return (Entry) m5294a().next();
        }
        List list = this.f8558c.f8549a;
        int i = this.f8556a - 1;
        this.f8556a = i;
        return (Entry) list.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
