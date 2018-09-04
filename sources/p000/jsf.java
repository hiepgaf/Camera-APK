package p000;

import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* renamed from: jsf */
final class jsf implements izi {
    /* renamed from: a */
    private final /* synthetic */ jsb f19008a;

    jsf(jsb jsb) {
        this.f19008a = jsb;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo711a(Object obj) {
        Object<jsp> obj2 = (List) obj;
        jri.m13152b((Object) obj2);
        Object hashMap = new HashMap();
        for (jsp jsp : obj2) {
            int intValue;
            String b = jsp.f7946a.mo2012b();
            if (hashMap.containsKey(b)) {
                intValue = ((Integer) hashMap.get(b)).intValue();
            } else {
                intValue = 0;
            }
            hashMap.put(b, Integer.valueOf(intValue + 1));
        }
        this.f19008a.f19002d.m12763a(hashMap);
        return obj2;
    }
}
