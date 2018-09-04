package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: ksr */
final class ksr extends ksq {
    /* renamed from: c */
    private static final Class f19279c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    ksr() {
    }

    /* renamed from: c */
    private static List m13886c(Object obj, long j) {
        return (List) kul.m5340j(obj, j);
    }

    /* renamed from: a */
    final void mo2289a(Object obj, long j) {
        Object e;
        List list = (List) kul.m5340j(obj, j);
        if (list instanceof ksp) {
            e = ((ksp) list).mo2310e();
        } else if (!f19279c.isAssignableFrom(list.getClass())) {
            e = Collections.unmodifiableList(list);
        } else {
            return;
        }
        kul.m5320a(obj, j, e);
    }

    /* renamed from: a */
    final void mo2290a(Object obj, Object obj2, long j) {
        Collection c = ksr.m13886c(obj2, j);
        Object a = ksr.m13885a(obj, j, c.size());
        int size = a.size();
        int size2 = c.size();
        if (size > 0 && size2 > 0) {
            a.addAll(c);
        }
        if (size <= 0) {
            Collection collection = c;
        }
        kul.m5320a(obj, j, a);
    }

    /* renamed from: b */
    final List mo2291b(Object obj, long j) {
        return ksr.m13885a(obj, j, 10);
    }

    /* renamed from: a */
    private static List m13885a(Object obj, long j, int i) {
        List c = ksr.m13886c(obj, j);
        if (c.isEmpty()) {
            Object kso;
            if (c instanceof ksp) {
                kso = new kso(i);
            } else {
                kso = new ArrayList(i);
            }
            kul.m5320a(obj, j, kso);
            return kso;
        } else if (f19279c.isAssignableFrom(c.getClass())) {
            r1 = new ArrayList(c.size() + i);
            r1.addAll(c);
            kul.m5320a(obj, j, (Object) r1);
            return r1;
        } else if (!(c instanceof kui)) {
            return c;
        } else {
            r1 = new kso(c.size() + i);
            r1.addAll((kui) c);
            kul.m5320a(obj, j, (Object) r1);
            return r1;
        }
    }
}
