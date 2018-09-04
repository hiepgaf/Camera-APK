package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: flj */
final class flj {
    /* renamed from: a */
    public final int f4610a;
    /* renamed from: b */
    public final fhq f4611b;
    /* renamed from: c */
    public final Map f4612c;
    /* renamed from: d */
    public fyr f4613d = null;
    /* renamed from: e */
    public kpw f4614e;

    flj(int i, fhq fhq) {
        this.f4610a = i;
        this.f4611b = fhq;
        this.f4612c = new HashMap();
        this.f4614e = kpw.m18056d();
    }

    /* renamed from: a */
    final void m2333a() {
        for (iwz close : this.f4612c.values()) {
            close.close();
        }
        fyr fyr = this.f4613d;
        if (fyr != null) {
            fyr.close();
        }
        this.f4614e.mo3557a(Boolean.FALSE);
    }

    /* renamed from: a */
    final void m2334a(int i, fkp fkp) {
        Map map = this.f4612c;
        Integer valueOf = Integer.valueOf(i);
        jri.m13153b(map.containsKey(valueOf) ^ 1);
        this.f4612c.put(valueOf, fkp);
    }
}
