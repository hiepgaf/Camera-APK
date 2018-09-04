package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: cld */
final class cld implements izi {
    cld() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo711a(Object obj) {
        jis jis = (jis) obj;
        Map hashMap = new HashMap();
        for (jip jip : jis.m4522b()) {
            jiy a = jiy.m4515a(jip.f18840a);
            if (!hashMap.containsKey(a)) {
                hashMap.put(a, jip);
            }
        }
        return hashMap;
    }
}
