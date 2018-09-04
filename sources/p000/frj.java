package p000;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: frj */
public final class frj {
    /* renamed from: a */
    public iqm f4666a = iqm.CLOCKWISE_0;
    /* renamed from: b */
    private final iwz f4667b;
    /* renamed from: c */
    private final kpk f4668c;
    /* renamed from: d */
    private final Map f4669d;

    frj(iwz iwz, kpk kpk) {
        this.f4667b = iwz;
        this.f4668c = kpk;
        this.f4669d = new HashMap();
    }

    /* renamed from: a */
    public final fri m2363a() {
        return new fri(this.f4667b, this.f4668c, this.f4666a, this.f4669d.values());
    }

    /* renamed from: a */
    public final frj m2364a(Collection collection) {
        for (fin fin : collection) {
            this.f4669d.put(fin.f4571a, fin);
        }
        return this;
    }
}
