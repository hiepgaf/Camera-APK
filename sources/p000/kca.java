package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kca */
final class kca implements Iterator {
    /* renamed from: a */
    private final Iterator f8188a = this.f8190c.f19158a.entrySet().iterator();
    /* renamed from: b */
    private Collection f8189b;
    /* renamed from: c */
    private final /* synthetic */ kby f8190c;

    kca(kby kby) {
        this.f8190c = kby;
    }

    public final boolean hasNext() {
        return this.f8188a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.f8188a.next();
        this.f8189b = (Collection) entry.getValue();
        kby kby = this.f8190c;
        Object key = entry.getKey();
        return khb.m4897c(key, kby.f19159b.mo3505a(key, (Collection) entry.getValue()));
    }

    public final void remove() {
        boolean z;
        if (this.f8189b != null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13154b(z, (Object) "no calls to next() since the last call to remove()");
        this.f8188a.remove();
        kbv.m16440b(this.f8190c.f19159b, this.f8189b.size());
        this.f8189b.clear();
        this.f8189b = null;
    }
}
