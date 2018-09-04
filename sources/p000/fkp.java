package p000;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* renamed from: fkp */
public class fkp extends iww {
    /* renamed from: b */
    public final Map f23184b;

    public fkp(fkp fkp) {
        this((iwz) fkp);
        this.f23184b.putAll(fkp.f23184b);
    }

    private fkp(iwz iwz) {
        super(iwz);
        this.f23184b = new ConcurrentHashMap();
    }

    public fkp(iwz iwz, kpk kpk) {
        this(iwz);
        if (kpk != null) {
            this.f23184b.put(fkr.f4601a, kpk);
        }
    }

    public fkp(iwz iwz, Map map) {
        super(iwz);
        this.f23184b = new ConcurrentHashMap(map);
    }

    /* renamed from: a */
    public final fkp m17316a(fkq fkq, Object obj) {
        jri.m13152b((Object) fkq);
        jri.m13152b(obj);
        this.f23184b.put(fkq, obj);
        return this;
    }

    /* renamed from: a */
    public static fkp m17314a(iwz iwz) {
        return new fkp(iwz);
    }

    /* renamed from: a */
    public final Object m17317a(fkq fkq) {
        Object b = m17315b(fkq);
        String valueOf = String.valueOf(fkq);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
        stringBuilder.append("No value found for key: ");
        stringBuilder.append(valueOf);
        return jri.m13139a(b, stringBuilder.toString());
    }

    /* renamed from: h */
    public final kpk m17318h() {
        return (kpk) m17315b(fkr.f4601a);
    }

    /* renamed from: b */
    private final Object m17315b(fkq fkq) {
        return this.f23184b.containsKey(fkq) ? this.f23184b.get(fkq) : null;
    }

    /* renamed from: i */
    public final boolean m17319i() {
        return mo2716c() != -1;
    }
}
