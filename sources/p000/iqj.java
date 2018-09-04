package p000;

import java.util.Map;
import java.util.NavigableMap;

/* compiled from: PG */
/* renamed from: iqj */
public final class iqj extends iqk {
    /* renamed from: a */
    private final /* synthetic */ int f18511a;
    /* renamed from: b */
    private final /* synthetic */ iqc f18512b;

    public iqj(NavigableMap navigableMap, int i, iqc iqc) {
        this.f18511a = i;
        this.f18512b = iqc;
        super(navigableMap);
    }

    /* renamed from: a */
    private final Object m12387a() {
        return size() > this.f18511a ? super.remove(this.f18512b.mo1899a(super.navigableKeySet())) : null;
    }

    public final Object put(Object obj, Object obj2) {
        Object put = super.put(obj, obj2);
        return put != null ? put : m12387a();
    }

    public final void putAll(Map map) {
        super.putAll(map);
        do {
        } while (m12387a() != null);
    }
}
