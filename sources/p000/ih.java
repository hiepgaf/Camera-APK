package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ih */
public class ih extends iz implements Map {
    /* renamed from: c */
    private ip f18300c;

    public ih(int i) {
        super(i);
    }

    public ih(iz izVar) {
        super(izVar);
    }

    public Set entrySet() {
        ip a = m12214a();
        if (a.f7263a == null) {
            a.f7263a = new ir(a);
        }
        return a.f7263a;
    }

    /* renamed from: a */
    private final ip m12214a() {
        if (this.f18300c == null) {
            this.f18300c = new ii(this);
        }
        return this.f18300c;
    }

    public Set keySet() {
        return m12214a().m3986d();
    }

    public void putAll(Map map) {
        m4353a(this.b + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public Collection values() {
        ip a = m12214a();
        if (a.f7264b == null) {
            a.f7264b = new iu(a);
        }
        return a.f7264b;
    }
}
