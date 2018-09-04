package p000;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: kfo */
class kfo extends kgt {
    /* renamed from: b */
    public final Map f19195b;

    kfo(Map map) {
        this.f19195b = (Map) jri.m13152b((Object) map);
    }

    public void clear() {
        this.f19195b.clear();
    }

    public boolean contains(Object obj) {
        return this.f19195b.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.f19195b.isEmpty();
    }

    public Iterator iterator() {
        return new kfl(this.f19195b.entrySet().iterator());
    }

    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.f19195b.remove(obj);
        return true;
    }

    public int size() {
        return this.f19195b.size();
    }
}
