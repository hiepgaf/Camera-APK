package p000;

import java.util.Set;

/* compiled from: PG */
/* renamed from: ixw */
public final class ixw implements iqc {
    /* renamed from: a */
    private final /* synthetic */ ixv f18661a;
    /* renamed from: b */
    private final /* synthetic */ iqc f18662b;

    public ixw(ixv ixv, iqc iqc) {
        this.f18661a = ixv;
        this.f18662b = iqc;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1899a(Set set) {
        Long l = null;
        float f = Float.MAX_VALUE;
        for (Long l2 : set) {
            float f2;
            Long l3;
            Float a = this.f18661a.m4330a(l2.longValue());
            if (a == null) {
                f2 = f;
                l3 = l;
            } else if (a.floatValue() < f) {
                l3 = l2;
                f2 = a.floatValue();
            } else {
                f2 = f;
                l3 = l;
            }
            l = l3;
            f = f2;
        }
        if (l != null) {
            return l;
        }
        return (Long) this.f18662b.mo1899a(set);
    }
}
