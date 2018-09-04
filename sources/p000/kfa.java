package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kfa */
final class kfa extends kbt {
    /* renamed from: a */
    private final /* synthetic */ Iterator f22020a;
    /* renamed from: b */
    private final /* synthetic */ kbj f22021b;

    kfa(Iterator it, kbj kbj) {
        this.f22020a = it;
        this.f22021b = kbj;
    }

    /* renamed from: a */
    protected final Object mo3238a() {
        while (this.f22020a.hasNext()) {
            Object next = this.f22020a.next();
            if (this.f22021b.mo2094a(next)) {
                return next;
            }
        }
        return m13387b();
    }
}
