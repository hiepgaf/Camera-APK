package p000;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: ky */
public final class ky {
    /* renamed from: a */
    public final iw f8739a = new ix(10);
    /* renamed from: b */
    public final iz f8740b = new iz();
    /* renamed from: c */
    public final ArrayList f8741c = new ArrayList();
    /* renamed from: d */
    public final HashSet f8742d = new HashSet();

    /* renamed from: a */
    public final void m5480a(Object obj) {
        if (!this.f8740b.containsKey(obj)) {
            this.f8740b.put(obj, null);
        }
    }

    /* renamed from: a */
    public final void m5481a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (hashSet.contains(obj)) {
                throw new RuntimeException("This graph contains cyclic dependencies");
            }
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) this.f8740b.get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    m5481a(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
        }
    }
}
