package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kcb */
abstract class kcb implements Iterator {
    /* renamed from: a */
    private final Iterator f8191a;
    /* renamed from: b */
    private Object f8192b = null;
    /* renamed from: c */
    private Collection f8193c = null;
    /* renamed from: d */
    private Iterator f8194d = kfd.f8263a;
    /* renamed from: e */
    private final /* synthetic */ kbv f8195e;

    kcb(kbv kbv) {
        this.f8195e = kbv;
        this.f8191a = kbv.f22003a.entrySet().iterator();
    }

    /* renamed from: a */
    abstract Object mo2096a(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f8191a.hasNext() || this.f8194d.hasNext();
    }

    public Object next() {
        if (!this.f8194d.hasNext()) {
            Entry entry = (Entry) this.f8191a.next();
            this.f8192b = entry.getKey();
            this.f8193c = (Collection) entry.getValue();
            this.f8194d = this.f8193c.iterator();
        }
        return mo2096a(this.f8192b, this.f8194d.next());
    }

    public void remove() {
        this.f8194d.remove();
        if (this.f8193c.isEmpty()) {
            this.f8191a.remove();
        }
        this.f8195e.f22004b = this.f8195e.f22004b - 1;
    }
}
