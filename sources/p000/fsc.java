package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: fsc */
public final class fsc implements fsa {
    /* renamed from: a */
    public final fuc f16488a;
    /* renamed from: b */
    private final fsa f16489b;

    public fsc(fuc fuc, fsa fsa) {
        this.f16488a = fuc;
        this.f16489b = fsa;
    }

    /* renamed from: a */
    public final kpk mo1421a(List list, iqm iqm) {
        List arrayList = new ArrayList();
        for (iwz f : list) {
            arrayList.add(Long.valueOf(f.mo2719f()));
        }
        return kny.m18045a(this.f16489b.mo1421a(list, iqm), new fsd(this, arrayList), kpq.f8410a);
    }
}
