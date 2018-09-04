package p000;

import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jul */
public abstract class jul implements juk {
    /* renamed from: a */
    public abstract Set mo3180a(juh juh);

    /* renamed from: a */
    public final List mo2054a(List list) {
        List b = khb.m4885b();
        for (juh juh : list) {
            b.add(new juh(juh.f7984a, juh.f7986c, juh.f7987d, mo3180a(juh)));
        }
        return b;
    }

    public String toString() {
        return "SegmentClassifier";
    }
}
