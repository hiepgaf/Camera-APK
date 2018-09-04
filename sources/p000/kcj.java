package p000;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kcj */
final class kcj extends kcf implements Set {
    /* renamed from: e */
    private final /* synthetic */ kbv f19162e;

    kcj(kbv kbv, Object obj, Set set) {
        this.f19162e = kbv;
        super(kbv, obj, set, null);
    }

    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean a = khb.m4881a((Set) this.b, collection);
        if (!a) {
            return a;
        }
        kbv.m16438a(this.f19162e, this.b.size() - size);
        m4764c();
        return a;
    }
}
