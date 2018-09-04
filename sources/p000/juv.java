package p000;

import com.google.android.vision.face.Face;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: juv */
public final class juv extends jum {
    /* renamed from: a */
    private final jxm f21930a;
    /* renamed from: b */
    private final float f21931b = 0.5f;

    public juv(jxm jxm) {
        jri.m13152b((Object) jxm);
        jri.m13143a(true);
        this.f21930a = jxm;
    }

    /* renamed from: a */
    public final juh mo3176a(juh juh) {
        if (juh.m4648d() <= 1) {
            return juh;
        }
        Set hashSet = new HashSet();
        List arrayList = new ArrayList();
        Iterator it = juh.iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            Collection hashSet2 = new HashSet();
            for (Face trackId : (List) this.f21930a.m4672a(longValue).m4665a(jxa.f8046c)) {
                hashSet2.add(Integer.valueOf(trackId.getTrackId()));
            }
            arrayList.add(hashSet2);
            hashSet.addAll(hashSet2);
        }
        if (hashSet.isEmpty()) {
            return juh;
        }
        List a = ken.m13458a(juh.f7984a);
        Collection b = khb.m4885b();
        for (int i = 0; i < a.size(); i++) {
            int i2 = 0;
            for (int i3 = 0; i3 < a.size(); i3++) {
                if (i3 != i) {
                    Set hashSet3 = new HashSet((Collection) arrayList.get(i3));
                    hashSet3.retainAll((Collection) arrayList.get(i));
                    i2 += hashSet3.size();
                }
            }
            if ((((float) i2) / ((float) (a.size() - 1))) / ((float) hashSet.size()) >= this.f21931b) {
                b.add((Long) a.get(i));
            }
        }
        return new juh(b);
    }

    public final String toString() {
        float f = this.f21931b;
        StringBuilder stringBuilder = new StringBuilder(62);
        stringBuilder.append("FaceIdOverlapSegmentFilter[minOverlapFraction=");
        stringBuilder.append(f);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
