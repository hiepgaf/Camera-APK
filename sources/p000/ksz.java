package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ksz */
public final class ksz extends LinkedHashMap {
    /* renamed from: b */
    public static final ksz f8536b;
    /* renamed from: a */
    public boolean f8537a = true;

    static {
        ksz ksz = new ksz();
        f8536b = ksz;
        ksz.f8537a = false;
    }

    private ksz() {
    }

    private ksz(Map map) {
        super(map);
    }

    /* renamed from: a */
    private static int m5158a(Object obj) {
        if (obj instanceof byte[]) {
            return ksd.m5130a((byte[]) obj);
        }
        if (!(obj instanceof kse)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        m5159a();
        super.clear();
    }

    /* renamed from: a */
    final void m5159a() {
        if (!this.f8537a) {
            throw new UnsupportedOperationException();
        }
    }

    public final Set entrySet() {
        return !isEmpty() ? super.entrySet() : Collections.emptySet();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            Object obj2;
            obj = (Map) obj;
            int i;
            if (this == obj) {
                i = 1;
            } else if (size() == obj.size()) {
                for (Entry entry : entrySet()) {
                    if (!obj.containsKey(entry.getKey())) {
                        obj2 = null;
                        break;
                    }
                    boolean equals;
                    obj2 = entry.getValue();
                    Object obj3 = obj.get(entry.getKey());
                    if ((obj2 instanceof byte[]) && (obj3 instanceof byte[])) {
                        equals = Arrays.equals((byte[]) obj2, (byte[]) obj3);
                        continue;
                    } else {
                        equals = obj2.equals(obj3);
                        continue;
                    }
                    if (!equals) {
                        obj2 = null;
                        break;
                    }
                }
                i = 1;
            } else {
                obj2 = null;
            }
            if (obj2 != null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        for (Entry entry : entrySet()) {
            i = (ksz.m5158a(entry.getValue()) ^ ksz.m5158a(entry.getKey())) + i;
        }
        return i;
    }

    /* renamed from: b */
    public final ksz m5160b() {
        return !isEmpty() ? new ksz(this) : new ksz();
    }

    public final Object put(Object obj, Object obj2) {
        m5159a();
        ksd.m5131a(obj);
        ksd.m5131a(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        m5159a();
        for (Object next : map.keySet()) {
            ksd.m5131a(next);
            ksd.m5131a(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        m5159a();
        return super.remove(obj);
    }
}
