package p000;

import java.util.Comparator;

/* compiled from: PG */
/* renamed from: iqq */
public final class iqq implements Comparator {
    /* renamed from: a */
    public static final iqq f7332a = new iqq();

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        iqp iqp = (iqp) obj;
        iqp iqp2 = (iqp) obj2;
        long a = iqp.m4046a();
        long a2 = iqp2.m4046a();
        int i = (a > a2 ? 1 : (a == a2 ? 0 : -1));
        if (a == a2) {
            i = Integer.compare(Math.min(iqp.f7329a, iqp.f7330b), Math.min(iqp2.f7329a, iqp2.f7330b));
        }
        if (i != 0) {
            return i;
        }
        return Integer.compare(iqp.f7329a, iqp2.f7329a);
    }
}
