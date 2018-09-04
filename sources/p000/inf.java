package p000;

import java.util.Comparator;

/* compiled from: PG */
/* renamed from: inf */
final class inf implements Comparator {
    inf() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        ine ine = (ine) obj2;
        long b = ((ine) obj).m3880b();
        long b2 = ine.m3880b();
        if (b < b2) {
            return 1;
        }
        if (b > b2) {
            return -1;
        }
        return 0;
    }
}
