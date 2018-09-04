package p000;

import java.util.Comparator;

/* renamed from: gkm */
final /* synthetic */ class gkm implements Comparator {
    /* renamed from: a */
    private final gkk f5316a;

    gkm(gkk gkk) {
        this.f5316a = gkk;
    }

    public final int compare(Object obj, Object obj2) {
        int floatValue;
        int i = 0;
        gkk gkk = this.f5316a;
        bnl bnl = (bnl) obj2;
        Float a = gkk.f23258d.m4330a(((bnl) obj).mo541e());
        Float a2 = gkk.f23258d.m4330a(bnl.mo541e());
        if (a != null) {
            floatValue = (int) (a.floatValue() * 1000.0f);
        } else {
            floatValue = 0;
        }
        if (a2 != null) {
            i = (int) (a2.floatValue() * 1000.0f);
        }
        return i - floatValue;
    }
}
