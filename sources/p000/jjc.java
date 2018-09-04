package p000;

import java.util.Comparator;

/* compiled from: PG */
/* renamed from: jjc */
final class jjc implements Comparator {
    jjc() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        jja jja = (jja) obj;
        jja jja2 = (jja) obj2;
        long b = jja.mo2009b();
        long b2 = jja2.mo2009b();
        int i = (b > b2 ? 1 : (b == b2 ? 0 : -1));
        if (b == b2) {
            return Integer.compare(jja.hashCode(), jja2.hashCode());
        }
        return i;
    }
}
