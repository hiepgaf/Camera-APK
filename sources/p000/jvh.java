package p000;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jvh */
public final class jvh implements juk {
    /* renamed from: a */
    public final List mo2054a(List list) {
        juh juh;
        Collection b = khb.m4885b();
        for (juh juh2 : list) {
            juh juh22;
            if (juh22.m4645a(jui.ACTION)) {
                juh = juh22;
                break;
            }
            b.add(juh22);
        }
        juh = null;
        Object b2 = khb.m4885b();
        List b3 = khb.m4885b();
        Object obj = null;
        for (juh juh222 : khb.m4867a(list)) {
            if (juh222.m4645a(jui.ACTION)) {
                obj = 1;
            }
            if (obj != null) {
                b2.add(juh222);
                if (juh222 == juh) {
                    break;
                }
            } else {
                b3.add(juh222);
            }
        }
        List b4 = khb.m4885b();
        b4.addAll(b);
        if (!b2.isEmpty()) {
            boolean z;
            jri.m13152b(b2);
            if (b2.size() > 0) {
                z = true;
            } else {
                z = false;
            }
            jri.m13143a(z);
            Collection b5 = khb.m4885b();
            Set e = khb.m4903e();
            int size = b2.size();
            long j = Long.MAX_VALUE;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                juh222 = (juh) b2.get(i);
                if (juh222 != null) {
                    b5.addAll(juh222.f7984a);
                    long j3 = juh222.f7986c;
                    long j4 = juh222.f7987d;
                    if (j3 < j) {
                        j = j3;
                    }
                    if (j4 > j2) {
                        j2 = j4;
                    }
                    for (jui add : juh222.f7985b) {
                        e.add(add);
                    }
                }
                i = i2;
            }
            if (b5.isEmpty()) {
                throw new IllegalArgumentException("No segments found to merge!");
            }
            b4.add(new juh(b5, j, j2, e));
            b4.addAll(khb.m4867a(b3));
        }
        return b4;
    }

    public final String toString() {
        return "ToSingleActionMerger";
    }
}
