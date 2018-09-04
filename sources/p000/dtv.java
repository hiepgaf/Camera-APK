package p000;

import android.hardware.camera2.CaptureResult.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: dtv */
public final class dtv implements dty {
    /* renamed from: a */
    private final int f14525a = 1;
    /* renamed from: b */
    private final keu f14526b;
    /* renamed from: c */
    private final dty f14527c;

    public dtv(dty dty, Collection collection) {
        jri.m13143a(true);
        this.f14527c = dty;
        this.f14526b = keu.m13477a(collection);
    }

    /* renamed from: a */
    public final List mo1173a(List list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        boolean z;
        List a = this.f14527c.mo1173a(list);
        if (a.size() == list.size()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13153b(z);
        List arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            if (((Boolean) a.get(i)).booleanValue()) {
                if (i > 0) {
                    int i2 = i - 1;
                    iwp iwp = (iwp) list.get(i);
                    iwp iwp2 = (iwp) list.get(i2);
                    Iterator c = this.f14526b.mo2144c();
                    while (c.hasNext()) {
                        Key key = (Key) c.next();
                        if (!kbf.m16436b(iwp.mo3143a(key), iwp2.mo3143a(key))) {
                            z = false;
                            break;
                        }
                    }
                    z = true;
                    if (z) {
                        arrayList.add(Integer.valueOf(((Integer) arrayList.get(i2)).intValue() + 1));
                    }
                }
                arrayList.add(Integer.valueOf(1));
            } else {
                arrayList.add(Integer.valueOf(0));
            }
        }
        int size = arrayList.size() - 1;
        while (size >= 0) {
            if (((Integer) arrayList.get(size)).intValue() >= this.f14525a) {
                break;
            }
            size--;
        }
        size = -1;
        if (size == -1) {
            List arrayList2 = new ArrayList(list.size());
            for (int i3 = 0; i3 < list.size(); i3++) {
                arrayList2.add(Boolean.valueOf(false));
            }
            return arrayList2;
        }
        List emptyList;
        int intValue = ((Integer) arrayList.get(size)).intValue();
        boolean[] zArr = new boolean[list.size()];
        if (zArr.length == 0) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = new kmh(zArr);
        }
        intValue = (size - intValue) + 1;
        while (size >= intValue) {
            emptyList.set(size, Boolean.valueOf(true));
            size--;
        }
        return emptyList;
    }
}
