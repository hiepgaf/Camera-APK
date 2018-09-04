package p000;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: icx */
public final class icx {
    /* renamed from: a */
    public final Map f6937a = Collections.synchronizedMap(new WeakHashMap());
    /* renamed from: b */
    public final Map f6938b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: a */
    final void m3671a(boolean z, Status status) {
        synchronized (this.f6937a) {
            Map hashMap = new HashMap(this.f6937a);
        }
        synchronized (this.f6938b) {
            Map hashMap2 = new HashMap(this.f6938b);
        }
        for (Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((ick) entry.getKey()).m12069c(status);
            }
        }
        for (Entry entry2 : hashMap2.entrySet()) {
            if (!z) {
                if (((Boolean) entry2.getValue()).booleanValue()) {
                }
            }
            ((ifw) entry2.getKey()).m3736a(new bpm(status));
        }
    }
}
