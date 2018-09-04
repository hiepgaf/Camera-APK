package p000;

import java.util.AbstractCollection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kdj */
final class kdj extends AbstractCollection {
    /* renamed from: a */
    private final /* synthetic */ kdb f8231a;

    kdj(kdb kdb) {
        this.f8231a = kdb;
    }

    public final void clear() {
        this.f8231a.clear();
    }

    public final Iterator iterator() {
        return new kde(this.f8231a);
    }

    public final int size() {
        return this.f8231a.f8218e;
    }
}
