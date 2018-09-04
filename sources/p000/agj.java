package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: agj */
public final class agj {
    /* renamed from: a */
    private final Map f438a = new HashMap();
    /* renamed from: b */
    private final Map f439b = new HashMap();

    agj() {
    }

    /* renamed from: a */
    public final Map m240a(boolean z) {
        return !z ? this.f438a : this.f439b;
    }

    /* renamed from: a */
    final void m241a(adl adl, afy afy) {
        Map a = m240a(afy.f9721j);
        if (afy.equals(a.get(adl))) {
            a.remove(adl);
        }
    }
}
