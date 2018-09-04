package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: fxz */
final class fxz implements kaw {
    /* renamed from: a */
    private final /* synthetic */ int f16629a;

    fxz(int i) {
        this.f16629a = i;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo370a(Object obj) {
        bbo bbo = (bbo) obj;
        bbo bbo2 = new bbo();
        for (int i = 0; i < this.f16629a; i++) {
            List arrayList = new ArrayList();
            Iterator it = bbo.iterator();
            while (it.hasNext()) {
                arrayList.add((fyr) ((List) it.next()).get(i));
            }
            bbo2.add(new fya(arrayList));
        }
        return bbo2;
    }
}
