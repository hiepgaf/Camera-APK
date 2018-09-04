package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: fkv */
public final class fkv implements fjm {
    /* renamed from: a */
    public final fyt f16124a;
    /* renamed from: b */
    private final fjm f16125b;

    public fkv(fjm fjm, fyt fyt) {
        this.f16125b = fjm;
        this.f16124a = new fxy(ken.m13454a((Object) fyt, new fxr(fjm.mo1396a())));
    }

    /* renamed from: a */
    public final fjk mo1397a(fjm... fjmArr) {
        Collection arrayList = new ArrayList();
        for (fjm fjm : fjmArr) {
            jri.m13143a(fjm instanceof fkv);
            arrayList.add((fkv) fjm);
        }
        List arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            arrayList2.add(((fkv) arrayList.get(i)).f16125b);
            i = i2;
        }
        fjk a = this.f16125b.mo1397a((fjm[]) arrayList2.toArray(new fjm[arrayList2.size()]));
        arrayList.add(this);
        return new fkw(keu.m13477a(arrayList), a);
    }

    /* renamed from: a */
    public final int mo1396a() {
        return this.f16125b.mo1396a();
    }
}
