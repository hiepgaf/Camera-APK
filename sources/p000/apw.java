package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: apw */
public final class apw {
    /* renamed from: a */
    private final List f844a = new ArrayList();
    /* renamed from: b */
    private final Map f845b = new HashMap();

    /* renamed from: a */
    public final synchronized void m557a(String str, adq adq, Class cls, Class cls2) {
        m555a(str).add(new apx(cls, cls2, adq));
    }

    /* renamed from: a */
    public final synchronized List m556a(Class cls, Class cls2) {
        List arrayList;
        arrayList = new ArrayList();
        for (String str : this.f844a) {
            List<apx> list = (List) this.f845b.get(str);
            if (list != null) {
                for (apx apx : list) {
                    if (apx.m560a(cls, cls2)) {
                        arrayList.add(apx.f847b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final synchronized List m555a(String str) {
        List list;
        if (!this.f844a.contains(str)) {
            this.f844a.add(str);
        }
        list = (List) this.f845b.get(str);
        if (list == null) {
            list = new ArrayList();
            this.f845b.put(str, list);
        }
        return list;
    }

    /* renamed from: b */
    public final synchronized List m559b(Class cls, Class cls2) {
        List arrayList;
        arrayList = new ArrayList();
        for (String str : this.f844a) {
            List<apx> list = (List) this.f845b.get(str);
            if (list != null) {
                for (apx apx : list) {
                    if (apx.m560a(cls, cls2) && !arrayList.contains(apx.f846a)) {
                        arrayList.add(apx.f846a);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized void m558a(List list) {
        ArrayList arrayList = new ArrayList(this.f844a);
        this.f844a.clear();
        this.f844a.addAll(list);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String str = (String) arrayList.get(i);
            if (list.contains(str)) {
                i = i2;
            } else {
                this.f844a.add(str);
                i = i2;
            }
        }
    }
}
