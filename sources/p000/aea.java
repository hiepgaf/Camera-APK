package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: aea */
public final class aea {
    /* renamed from: b */
    private static final adz f344b = new aeb();
    /* renamed from: a */
    private final Map f345a = new HashMap();

    /* renamed from: a */
    public final synchronized ady m187a(Object obj) {
        adz adz;
        aqe.m585a(obj, "Argument must not be null");
        adz = (adz) this.f345a.get(obj.getClass());
        if (adz == null) {
            for (adz adz2 : this.f345a.values()) {
                if (adz2.mo30a().isAssignableFrom(obj.getClass())) {
                    adz = adz2;
                    break;
                }
            }
        }
        if (adz == null) {
            adz = f344b;
        }
        return adz.mo29a(obj);
    }

    /* renamed from: a */
    public final synchronized void m188a(adz adz) {
        this.f345a.put(adz.mo30a(), adz);
    }
}
