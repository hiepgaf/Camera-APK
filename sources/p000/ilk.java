package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ilk */
final class ilk implements ilp {
    /* renamed from: a */
    public final List f21737a;

    ilk(Collection collection) {
        this.f21737a = ken.m13458a(collection);
    }

    /* renamed from: a */
    public final iqo mo2859a(iqt iqt, Executor executor) {
        if (this.f21737a.isEmpty()) {
            executor.execute(new ill(iqt));
            return new iql();
        }
        ilm ilm = new ilm(this, iqt, executor);
        ikb ikb = new ikb();
        Executor imk = new imk();
        for (int i = 0; i < this.f21737a.size(); i++) {
            ikb.mo1879a(((ilp) this.f21737a.get(i)).mo2859a(new iln(ilm, i), imk));
        }
        return ikb;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo2860b() {
        List arrayList = new ArrayList();
        for (ilp b : this.f21737a) {
            arrayList.add(b.mo2860b());
        }
        return arrayList;
    }
}
