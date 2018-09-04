package p000;

import java.util.AbstractCollection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kco */
final class kco extends AbstractCollection {
    /* renamed from: a */
    private final /* synthetic */ kcm f8207a;

    kco(kcm kcm) {
        this.f8207a = kcm;
    }

    public final void clear() {
        this.f8207a.mo3200c();
    }

    public final boolean contains(Object obj) {
        return this.f8207a.mo3605c(obj);
    }

    public final Iterator iterator() {
        return this.f8207a.mo3207j();
    }

    public final int size() {
        return this.f8207a.mo3206i();
    }
}
