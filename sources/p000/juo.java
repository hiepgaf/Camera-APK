package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: juo */
public abstract class juo implements juk {
    /* renamed from: a */
    public abstract List mo3182a(juh juh);

    /* renamed from: a */
    public final List mo2054a(List list) {
        List b = khb.m4885b();
        for (juh a : list) {
            b.addAll(mo3182a(a));
        }
        return b;
    }

    public String toString() {
        return "Segmenter";
    }
}
