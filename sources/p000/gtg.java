package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: gtg */
public final class gtg {
    /* renamed from: a */
    private final Map f5685a = new HashMap();

    gtg() {
    }

    /* renamed from: a */
    public final gtf m2815a(gsx gsx) {
        gtf gtf;
        synchronized (this.f5685a) {
            String b = gsx.mo1624b();
            if (this.f5685a.containsKey(b)) {
                gtf = (gtf) this.f5685a.get(b);
            } else {
                gtf = new gtf(gsx);
                this.f5685a.put(b, gtf);
            }
        }
        return gtf;
    }
}
