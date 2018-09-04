package p000;

import java.util.AbstractSet;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kdh */
final class kdh extends AbstractSet {
    /* renamed from: a */
    private final /* synthetic */ kdb f8230a;

    kdh(kdb kdb) {
        this.f8230a = kdb;
    }

    public final void clear() {
        this.f8230a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f8230a.containsKey(obj);
    }

    public final Iterator iterator() {
        return new kdc(this.f8230a);
    }

    public final boolean remove(Object obj) {
        int a = this.f8230a.m4777a(obj);
        if (a == -1) {
            return false;
        }
        kdb kdb = this.f8230a;
        kdb.m4778a(kdb.f8215b[a], (int) (kdb.f8214a[a] >>> 32));
        return true;
    }

    public final int size() {
        return this.f8230a.f8218e;
    }
}
