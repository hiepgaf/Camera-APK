package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kcd */
final class kcd implements Iterator {
    /* renamed from: a */
    private Entry f8196a;
    /* renamed from: b */
    private final /* synthetic */ Iterator f8197b;
    /* renamed from: c */
    private final /* synthetic */ kcc f8198c;

    kcd(kcc kcc, Iterator it) {
        this.f8198c = kcc;
        this.f8197b = it;
    }

    public final boolean hasNext() {
        return this.f8197b.hasNext();
    }

    public final Object next() {
        this.f8196a = (Entry) this.f8197b.next();
        return this.f8196a.getKey();
    }

    public final void remove() {
        boolean z;
        if (this.f8196a != null) {
            z = true;
        } else {
            z = false;
        }
        jri.m13154b(z, (Object) "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f8196a.getValue();
        this.f8197b.remove();
        kbv.m16440b(this.f8198c.f22006a, collection.size());
        collection.clear();
        this.f8196a = null;
    }
}
