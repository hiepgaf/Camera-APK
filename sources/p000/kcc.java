package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* renamed from: kcc */
final class kcc extends kfo {
    /* renamed from: a */
    public final /* synthetic */ kbv f22006a;

    kcc(kbv kbv, Map map) {
        this.f22006a = kbv;
        super(map);
    }

    public final void clear() {
        khb.m4876a(iterator());
    }

    public final boolean containsAll(Collection collection) {
        return this.f19195b.keySet().containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this == obj || this.f19195b.keySet().equals(obj);
    }

    public final int hashCode() {
        return this.f19195b.keySet().hashCode();
    }

    public final Iterator iterator() {
        return new kcd(this, this.f19195b.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        int i;
        Collection collection = (Collection) this.f19195b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            kbv.m16440b(this.f22006a, size);
            i = size;
        } else {
            i = 0;
        }
        return i > 0;
    }
}
