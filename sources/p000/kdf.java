package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kdf */
final class kdf extends AbstractSet {
    /* renamed from: a */
    private final /* synthetic */ kdb f8225a;

    kdf(kdb kdb) {
        this.f8225a = kdb;
    }

    public final void clear() {
        this.f8225a.clear();
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        int a = this.f8225a.m4777a(entry.getKey());
        if (a == -1 || !kbf.m16436b(this.f8225a.f8216c[a], entry.getValue())) {
            return false;
        }
        return true;
    }

    public final Iterator iterator() {
        return new kdd(this.f8225a);
    }

    public final boolean remove(Object obj) {
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            int a = this.f8225a.m4777a(entry.getKey());
            if (a != -1 && kbf.m16436b(this.f8225a.f8216c[a], entry.getValue())) {
                kdb kdb = this.f8225a;
                kdb.m4778a(kdb.f8215b[a], (int) (kdb.f8214a[a] >>> 32));
                return true;
            }
        }
        return false;
    }

    public final int size() {
        return this.f8225a.f8218e;
    }
}
