package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kgs */
final class kgs extends kbt {
    /* renamed from: a */
    private final Iterator f22051a = this.f22052b.f19206a.iterator();
    /* renamed from: b */
    private final /* synthetic */ kgr f22052b;

    kgs(kgr kgr) {
        this.f22052b = kgr;
    }

    /* renamed from: a */
    protected final Object mo3238a() {
        while (this.f22051a.hasNext()) {
            Object next = this.f22051a.next();
            if (!this.f22052b.f19207b.contains(next)) {
                return next;
            }
        }
        return m13387b();
    }
}
