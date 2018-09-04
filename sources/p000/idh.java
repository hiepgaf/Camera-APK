package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: idh */
final class idh extends idl {
    /* renamed from: a */
    private final ArrayList f18255a;
    /* renamed from: b */
    private final /* synthetic */ idb f18256b;

    public idh(idb idb, ArrayList arrayList) {
        this.f18256b = idb;
        super(idb);
        this.f18255a = arrayList;
    }

    /* renamed from: a */
    public final void mo1844a() {
        Set set;
        idb idb = this.f18256b;
        idn idn = idb.f18226a.f21714m;
        hvx hvx = idb.f18235j;
        if (hvx != null) {
            Set hashSet = new HashSet(hvx.f6746b);
            Map map = idb.f18235j.f6748d;
            for (huh huh : map.keySet()) {
                if (!idb.f18226a.f21708g.containsKey(huh.m3471b())) {
                    map.get(huh);
                    hashSet.addAll(null);
                }
            }
            set = hashSet;
        } else {
            set = Collections.emptySet();
        }
        idn.f18265f = set;
        ArrayList arrayList = this.f18255a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            huo huo = (huo) obj;
            idb idb2 = this.f18256b;
            huo.m11992a(idb2.f18232g, idb2.f18226a.f21714m.f18265f);
        }
    }
}
