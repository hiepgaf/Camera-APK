package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: jun */
public abstract class jun implements juk {
    /* renamed from: a */
    public abstract boolean mo3184a(juh juh);

    /* renamed from: a */
    public final List mo2054a(List list) {
        List b = khb.m4885b();
        for (juh juh : list) {
            if (mo3184a(juh)) {
                b.add(juh);
            }
        }
        return b;
    }

    public String toString() {
        return "SegmentSelector";
    }
}
