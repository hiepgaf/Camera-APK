package p000;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;

/* compiled from: PG */
/* renamed from: eal */
public final class eal {
    /* renamed from: a */
    private static final String f3458a = bli.m862a("SettingsUtil");
    /* renamed from: b */
    private static EnumMap f3459b = new EnumMap(iut.class);

    static {
        SparseArray sparseArray = new SparseArray(2);
    }

    /* renamed from: a */
    private static int m1739a(List list, int i) {
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        int i4 = 0;
        while (i4 < list.size()) {
            iqp iqp = (iqp) list.get(i4);
            int abs = Math.abs((iqp.f7330b * iqp.f7329a) - i);
            int i5 = abs < i2 ? abs : i2;
            i2 = abs < i2 ? i4 : i3;
            i4++;
            i3 = i2;
            i2 = i5;
        }
        return i3;
    }

    /* renamed from: a */
    public static iqp m1740a(String str, List list, iut iut) {
        if ("1836x3264".equals(str)) {
            return eag.f3449a;
        }
        ean ean;
        ArrayList arrayList = new ArrayList(list);
        if (f3459b.get(iut) != null) {
            ean = (ean) f3459b.get(iut);
        } else {
            int i;
            ean ean2 = new ean();
            Collections.sort(arrayList, new eam());
            ean2.f3460a = (iqp) arrayList.remove(0);
            iqp iqp = ean2.f3460a;
            float f = ((float) iqp.f7329a) / ((float) iqp.f7330b);
            List arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                i = i2 + 1;
                iqp = (iqp) arrayList.get(i2);
                if (((double) Math.abs((((float) iqp.f7329a) / ((float) iqp.f7330b)) - f)) < 0.01d) {
                    arrayList2.add(iqp);
                    i2 = i;
                } else {
                    i2 = i;
                }
            }
            if (arrayList2.size() < 2) {
                Object obj = arrayList;
            }
            if (arrayList2.isEmpty()) {
                bli.m873e(f3458a, "Only one supported resolution.");
                iqp = ean2.f3460a;
                ean2.f3461b = iqp;
                ean2.f3462c = iqp;
            } else if (arrayList2.size() == 1) {
                bli.m873e(f3458a, "Only two supported resolutions.");
                ean2.f3461b = (iqp) arrayList2.get(0);
                ean2.f3462c = (iqp) arrayList2.get(0);
            } else if (arrayList2.size() == 2) {
                bli.m873e(f3458a, "Exactly three supported resolutions.");
                ean2.f3461b = (iqp) arrayList2.get(0);
                ean2.f3462c = (iqp) arrayList2.get(1);
            } else {
                iqp = ean2.f3460a;
                float f2 = (float) (iqp.f7330b * iqp.f7329a);
                int a = eal.m1739a(arrayList2, (int) (0.5f * f2));
                i = eal.m1739a(arrayList2, (int) (f2 * 0.25f));
                if (!((iqp) arrayList2.get(a)).equals(arrayList2.get(i))) {
                    i2 = a;
                    a = i;
                } else if (i < arrayList2.size() - 1) {
                    int i3 = a;
                    a = i + 1;
                    i2 = i3;
                } else {
                    i2 = a - 1;
                    a = i;
                }
                ean2.f3461b = (iqp) arrayList2.get(i2);
                ean2.f3462c = (iqp) arrayList2.get(a);
            }
            f3459b.put(iut, ean2);
            ean = ean2;
        }
        if (!"large".equals(str)) {
            if ("medium".equals(str)) {
                return ean.f3461b;
            }
            if ("small".equals(str)) {
                return ean.f3462c;
            }
            if (str != null && str.split("x").length == 2) {
                iqp b = ion.m3958b(str);
                if (list.contains(b)) {
                    return b;
                }
            }
        }
        return ean.f3460a;
    }
}
