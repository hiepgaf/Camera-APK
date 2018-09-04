package p000;

import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: kss */
final class kss extends ksq {
    kss() {
    }

    /* renamed from: c */
    private static ksg m13890c(Object obj, long j) {
        return (ksg) kul.m5340j(obj, j);
    }

    /* renamed from: a */
    final void mo2289a(Object obj, long j) {
        kss.m13890c(obj, j).mo2212c();
    }

    /* renamed from: a */
    final void mo2290a(Object obj, Object obj2, long j) {
        Object c = kss.m13890c(obj, j);
        Collection c2 = kss.m13890c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.mo2211b()) {
                c = c.mo3254a(size2 + size);
            }
            c.addAll(c2);
        }
        if (size <= 0) {
            c = c2;
        }
        kul.m5320a(obj, j, c);
    }

    /* renamed from: b */
    final List mo2291b(Object obj, long j) {
        ksg c = kss.m13890c(obj, j);
        if (c.mo2211b()) {
            return c;
        }
        int size = c.size();
        if (size != 0) {
            size += size;
        } else {
            size = 10;
        }
        Object a = c.mo3254a(size);
        kul.m5320a(obj, j, a);
        return a;
    }
}
