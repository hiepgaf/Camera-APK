package p000;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: fuc */
public final class fuc {
    /* renamed from: a */
    public final fts f4723a;
    /* renamed from: b */
    public final fts f4724b;
    /* renamed from: c */
    public final fue f4725c;
    /* renamed from: d */
    public final Object f4726d = new Object();
    /* renamed from: e */
    public final Map f4727e = new HashMap();

    public fuc(fts fts, fts fts2, fue fue) {
        this.f4723a = fts;
        this.f4724b = fts2;
        this.f4725c = fue;
    }

    /* renamed from: a */
    public final fub m2392a(long j) {
        fub fub;
        synchronized (this.f4726d) {
            Map map = this.f4727e;
            Long valueOf = Long.valueOf(j);
            if (map.containsKey(valueOf)) {
                fub = (fub) jri.m13152b((fub) this.f4727e.get(valueOf));
            } else {
                fub = new fub("");
            }
        }
        return fub;
    }
}
