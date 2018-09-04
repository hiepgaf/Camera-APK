package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jvd */
public final class jvd extends jum {
    /* renamed from: a */
    private final jtv f21944a;
    /* renamed from: b */
    private final float f21945b;

    public jvd(jtv jtv, float f) {
        jri.m13152b((Object) jtv);
        this.f21944a = jtv;
        this.f21945b = f;
    }

    /* renamed from: a */
    public final juh mo3176a(juh juh) {
        this.f21944a.mo2050a();
        Iterator it = juh.iterator();
        while (it.hasNext()) {
            this.f21944a.mo2052c(((Long) it.next()).longValue());
        }
        Iterable d = khb.m4900d((Iterable) juh);
        while (d.size() > 0) {
            Iterator it2 = d.iterator();
            long j = -1;
            float f = Float.MAX_VALUE;
            while (it2.hasNext()) {
                float f2;
                long longValue = ((Long) it2.next()).longValue();
                float a = this.f21944a.mo2049a(longValue).mo2076a();
                if (a >= f) {
                    longValue = j;
                }
                if (a < f) {
                    f2 = a;
                } else {
                    f2 = f;
                }
                f = f2;
                j = longValue;
            }
            if (f >= this.f21945b) {
                break;
            } else if (j != -1) {
                d.remove(Long.valueOf(j));
                this.f21944a.mo2051b(j);
            }
        }
        return new juh(khb.m4895c(d));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21944a);
        float f = this.f21945b;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 80);
        stringBuilder.append("ScoreThresholdSegmentFilter[scorer=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", threshold=");
        stringBuilder.append(f);
        stringBuilder.append(", min=");
        stringBuilder.append(0);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
