package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kby */
final class kby extends kfq {
    /* renamed from: a */
    public final transient Map f19158a;
    /* renamed from: b */
    public final /* synthetic */ kbv f19159b;

    kby(kbv kbv, Map map) {
        this.f19159b = kbv;
        this.f19158a = map;
    }

    public final void clear() {
        Map map = this.f19158a;
        kbv kbv = this.f19159b;
        if (map == kbv.f22003a) {
            kbv.mo3200c();
        } else {
            khb.m4876a(new kca(this));
        }
    }

    public final boolean containsKey(Object obj) {
        return khb.m4879a(this.f19158a, obj);
    }

    /* renamed from: a */
    protected final Set mo2097a() {
        return new kbz(this);
    }

    public final boolean equals(Object obj) {
        return this == obj || this.f19158a.equals(obj);
    }

    public final /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) khb.m4884b(this.f19158a, obj);
        if (collection == null) {
            return null;
        }
        return this.f19159b.mo3505a(obj, collection);
    }

    public final int hashCode() {
        return this.f19158a.hashCode();
    }

    public final Set keySet() {
        return this.f19159b.mo2104n();
    }

    public final /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f19158a.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection a = this.f19159b.mo3504a();
        a.addAll(collection);
        kbv.m16440b(this.f19159b, collection.size());
        collection.clear();
        return a;
    }

    public final int size() {
        return this.f19158a.size();
    }

    public final String toString() {
        return this.f19158a.toString();
    }
}
