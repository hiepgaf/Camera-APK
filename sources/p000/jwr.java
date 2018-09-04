package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: jwr */
public final class jwr implements jwp {
    /* renamed from: a */
    private final Map f19088a;

    public jwr(Map map) {
        this.f19088a = Collections.unmodifiableMap(new HashMap(map));
    }

    /* renamed from: a */
    public final float mo2059a(jky jky, jky jky2) {
        float f = 0.0f;
        for (Entry entry : this.f19088a.entrySet()) {
            f = (((jwp) entry.getKey()).mo2059a(jky, jky2) * ((Float) entry.getValue()).floatValue()) + f;
        }
        return f;
    }
}
