package p000;

import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: jvf */
public final class jvf extends jum {
    /* renamed from: a */
    private final jtv f21950a;
    /* renamed from: b */
    private final int f21951b = 5;

    public jvf(jtv jtv) {
        this.f21950a = jtv;
    }

    /* renamed from: a */
    public final juh mo3176a(juh juh) {
        if (juh.m4646b()) {
            return juh;
        }
        List c = khb.m4895c((Iterable) juh);
        Collection b = khb.m4885b();
        while (b.size() < this.f21951b && !c.isEmpty()) {
            int size = c.size();
            float f = Float.NEGATIVE_INFINITY;
            int i = 0;
            long j = -1;
            while (i < size) {
                float f2;
                int i2 = i + 1;
                long longValue = ((Long) c.get(i)).longValue();
                float a = this.f21950a.mo2049a(longValue).mo2076a();
                if (a > f) {
                    f2 = a;
                } else {
                    f2 = f;
                }
                if (a <= f) {
                    longValue = j;
                }
                j = longValue;
                f = f2;
                i = i2;
            }
            if (j == -1) {
                break;
            }
            Long valueOf = Long.valueOf(j);
            b.add(valueOf);
            c.remove(valueOf);
        }
        return new juh(b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21950a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
        stringBuilder.append("TopNScoreSegmentFilter[scorer=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
