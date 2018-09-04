package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: csx */
public final class csx {
    /* renamed from: a */
    private static final String f2672a = bli.m862a("FSViewNodeUpdater");
    /* renamed from: b */
    private static int f2673b = -1;

    /* renamed from: a */
    public static csy m1490a(List list, cre cre) {
        boolean z;
        cre cre2;
        int i = 0;
        if (list.size() % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "Input list must be odd in size!");
        int size = (list.size() - 1) / 2;
        int size2 = list.size();
        cre cre3 = (cre) list.get(size);
        if (cre3.mo1062a()) {
            while (cre3.mo1062a() && cre3.mo1063b() != cre.f2587c) {
                cre3 = cre3.mo1063b();
            }
            if (cre3.mo1062a()) {
                while (cre3.mo1062a() && cre3.mo1064c() != cre.f2587c) {
                    cre3 = cre3.mo1064c();
                }
                cre2 = cre3.mo1062a() ? null : cre3;
            } else {
                cre2 = cre3;
            }
        } else {
            cre2 = cre3;
        }
        List arrayList;
        if (cre2 == null) {
            bli.m869c(f2672a, "There are no remaining valid nodes. Returning empty response.");
            List nCopies = Collections.nCopies(size2, cre.f2587c);
            List nCopies2 = Collections.nCopies(size2, Integer.valueOf(-1));
            arrayList = new ArrayList();
            for (cre cre32 : list) {
                if (cre32 != cre.f2587c) {
                    arrayList.add(cre32);
                }
            }
            return new csy(nCopies, nCopies2);
        }
        cre32 = cre2.mo1064c();
        cre b = cre2.mo1063b();
        if (cre == null || cre32 == cre.f2587c || cre32.mo1066e() != cre.mo1066e()) {
            cre32 = cre != null ? b != cre.f2587c ? b.mo1066e() == cre.mo1066e() ? b : cre2 : cre2 : cre2;
        }
        nCopies2 = cre32.mo1060a(size);
        arrayList = new ArrayList(Collections.nCopies(size2, Integer.valueOf(f2673b)));
        while (i < size2) {
            cre32 = (cre) nCopies2.get(i);
            if (cre32 != cre.f2587c && list.contains(cre32)) {
                arrayList.set(i, Integer.valueOf(list.indexOf(cre32)));
            }
            i++;
        }
        nCopies = new ArrayList();
        for (cre cre322 : list) {
            if (cre322 != cre.f2587c && cre322.mo1062a()) {
                nCopies.add(cre322);
            }
        }
        return new csy(nCopies2, arrayList);
    }
}
