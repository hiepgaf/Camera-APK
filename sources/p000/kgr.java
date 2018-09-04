package p000;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kgr */
final class kgr extends kgu {
    /* renamed from: a */
    public final /* synthetic */ Set f19206a;
    /* renamed from: b */
    public final /* synthetic */ Set f19207b;

    kgr(Set set, Set set2) {
        this.f19206a = set;
        this.f19207b = set2;
    }

    public final boolean contains(Object obj) {
        return this.f19206a.contains(obj) && !this.f19207b.contains(obj);
    }

    public final boolean isEmpty() {
        return this.f19207b.containsAll(this.f19206a);
    }

    /* renamed from: a */
    public final khy mo2163a() {
        return new kgs(this);
    }

    public final /* synthetic */ Iterator iterator() {
        return mo2163a();
    }

    public final int size() {
        int i = 0;
        for (Object contains : this.f19206a) {
            if (!this.f19207b.contains(contains)) {
                i++;
            }
        }
        return i;
    }
}
