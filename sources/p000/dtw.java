package p000;

import android.hardware.camera2.CaptureResult.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: dtw */
public final class dtw implements dty {
    /* renamed from: a */
    private final Map f14528a;

    public dtw(Map map) {
        this.f14528a = kes.m4806a(map);
    }

    /* renamed from: a */
    public final List mo1173a(List list) {
        List arrayList = new ArrayList(list.size());
        for (iwp iwp : list) {
            boolean z;
            for (Entry entry : this.f14528a.entrySet()) {
                if (!kbf.m16436b(iwp.mo3143a((Key) entry.getKey()), entry.getValue())) {
                    z = false;
                    break;
                }
            }
            z = true;
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }
}
