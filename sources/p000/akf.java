package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: akf */
final class akf implements ajz {
    /* renamed from: a */
    private final List f9847a;
    /* renamed from: b */
    private final iw f9848b;

    akf(List list, iw iwVar) {
        this.f9847a = list;
        this.f9848b = iwVar;
    }

    /* renamed from: a */
    public final aka mo88a(Object obj, int i, int i2, adp adp) {
        int size = this.f9847a.size();
        List arrayList = new ArrayList(size);
        int i3 = 0;
        adl adl = null;
        while (i3 < size) {
            adl adl2;
            ajz ajz = (ajz) this.f9847a.get(i3);
            if (ajz.mo89a(obj)) {
                aka a = ajz.mo88a(obj, i, i2, adp);
                if (a != null) {
                    adl2 = a.f506a;
                    arrayList.add(a.f508c);
                } else {
                    adl2 = adl;
                }
            } else {
                adl2 = adl;
            }
            i3++;
            adl = adl2;
        }
        if (arrayList.isEmpty() || adl == null) {
            return null;
        }
        return new aka(adl, new akg(arrayList, this.f9848b));
    }

    /* renamed from: a */
    public final boolean mo89a(Object obj) {
        for (ajz a : this.f9847a) {
            if (a.mo89a(obj)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f9847a.toArray());
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arrays).length() + 31);
        stringBuilder.append("MultiModelLoader{modelLoaders=");
        stringBuilder.append(arrays);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
