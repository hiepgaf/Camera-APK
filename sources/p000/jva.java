package p000;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jva */
public final class jva extends jum {
    /* renamed from: a */
    private final jwq f21939a;
    /* renamed from: b */
    private final jvs f21940b;

    public jva(jwq jwq, jvs jvs) {
        jri.m13152b((Object) jwq);
        jri.m13152b((Object) jvs);
        this.f21939a = jwq;
        this.f21940b = jvs;
    }

    /* renamed from: a */
    public final juh mo3176a(juh juh) {
        jri.m13152b((Object) juh);
        Collection b = khb.m4885b();
        Iterator it = juh.iterator();
        long j = -1;
        while (it.hasNext()) {
            float a;
            long longValue = ((Long) it.next()).longValue();
            if (j != -1) {
                a = this.f21939a.m4658a(j, longValue);
            } else {
                a = 0.0f;
            }
            if (a < this.f21940b.mo2055a(juh, longValue)) {
                b.add(Long.valueOf(longValue));
                j = longValue;
            } else {
                j = longValue;
            }
        }
        return new juh(b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21939a);
        String valueOf2 = String.valueOf(this.f21940b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 74) + String.valueOf(valueOf2).length());
        stringBuilder.append("MaxSequentialDistanceSegmentFilter[distance metric=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", threshold generator=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
