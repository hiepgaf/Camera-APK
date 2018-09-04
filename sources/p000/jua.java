package p000;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jua */
public final class jua implements jtv {
    /* renamed from: a */
    private final jwq f19053a;
    /* renamed from: b */
    private final HashSet f19054b = khb.m4903e();

    public jua(jwq jwq) {
        this.f19053a = jwq;
    }

    /* renamed from: a */
    public final jzf mo2049a(long j) {
        Iterator it = this.f19054b.iterator();
        float f = Float.MAX_VALUE;
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            if (longValue != j) {
                float a = this.f19053a.m4658a(j, longValue);
                if (a < f) {
                    f = a;
                }
            }
        }
        return new jzc(f);
    }

    /* renamed from: b */
    public final void mo2051b(long j) {
        this.f19054b.remove(Long.valueOf(j));
    }

    /* renamed from: c */
    public final void mo2052c(long j) {
        this.f19054b.add(Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo2050a() {
        this.f19054b.clear();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19053a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
        stringBuilder.append("MinDistanceScorer[distanceMetric=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
