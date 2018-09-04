package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: jue */
public final class jue implements juk {
    /* renamed from: a */
    private final jtv f19064a;

    public jue(jtv jtv) {
        jri.m13152b((Object) jtv);
        this.f19064a = jtv;
    }

    /* renamed from: a */
    public final List mo2054a(List list) {
        if (list.isEmpty() || list.size() == 1) {
            return list;
        }
        juh juh = (juh) list.get(0);
        juh juh2 = juh;
        float f = Float.NEGATIVE_INFINITY;
        for (juh juh3 : list) {
            Iterator it = juh3.iterator();
            float f2 = 0.0f;
            while (it.hasNext()) {
                f2 = this.f19064a.mo2049a(((Long) it.next()).longValue()).mo2076a() + f2;
            }
            float d = (((float) juh3.m4648d()) * 3.0f) + f2;
            if (d <= f) {
                juh3 = juh2;
            }
            if (d > f) {
                juh2 = juh3;
                f = d;
            } else {
                juh2 = juh3;
            }
        }
        return Collections.singletonList(juh2);
    }

    public final String toString() {
        return "BestSegmentSelector[scorer=BestSegmentSelector][segment size = 3.0]";
    }
}
