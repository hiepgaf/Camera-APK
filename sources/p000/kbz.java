package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kbz */
final class kbz extends kfn {
    /* renamed from: a */
    private final /* synthetic */ kby f22005a;

    kbz(kby kby) {
        this.f22005a = kby;
    }

    public final boolean contains(Object obj) {
        return khb.m4877a(this.f22005a.f19158a.entrySet(), obj);
    }

    public final Iterator iterator() {
        return new kca(this.f22005a);
    }

    /* renamed from: a */
    final Map mo3208a() {
        return this.f22005a;
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Entry entry = (Entry) obj;
        kbv kbv = this.f22005a.f19159b;
        Collection collection = (Collection) khb.m4894c(kbv.f22003a, entry.getKey());
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            kbv.f22004b -= size;
        }
        return true;
    }
}
