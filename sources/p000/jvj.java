package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: jvj */
public final class jvj extends juo {
    /* renamed from: a */
    private final jum f21952a;

    public jvj(jum jum) {
        jri.m13152b((Object) jum);
        this.f21952a = jum;
    }

    /* renamed from: a */
    public final List mo3182a(juh juh) {
        List b = khb.m4885b();
        if (juh.m4646b()) {
            return b;
        }
        juh a = this.f21952a.mo3176a(juh);
        Collection b2 = khb.m4885b();
        Iterator it = juh.iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            List a2 = ken.m13458a(a.f7984a);
            Long valueOf = Long.valueOf(longValue);
            if (!(a2.contains(valueOf) || b2.isEmpty())) {
                b.add(new juh(b2, juh.f7985b));
                b2.clear();
            }
            b2.add(valueOf);
        }
        if (!b2.isEmpty()) {
            b.add(new juh(b2, juh.f7985b));
        }
        return b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21952a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
        stringBuilder.append("FilteredSegmenter [filter=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
