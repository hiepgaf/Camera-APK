package p000;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kfs */
class kfs extends AbstractCollection {
    /* renamed from: a */
    private final /* synthetic */ kcm f8277a;

    kfs() {
    }

    kfs(kcm kcm) {
        this.f8277a = kcm;
        this();
    }

    public void clear() {
        this.f8277a.mo3200c();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return this.f8277a.mo2101b(entry.getKey(), entry.getValue());
    }

    public Iterator iterator() {
        return this.f8277a.mo3205h();
    }

    public boolean remove(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return this.f8277a.mo2102c(entry.getKey(), entry.getValue());
    }

    public int size() {
        return this.f8277a.mo3206i();
    }
}
