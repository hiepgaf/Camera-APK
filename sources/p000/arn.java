package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: arn */
public class arn {
    /* renamed from: a */
    private final Map f916a = new LinkedHashMap(100, 0.75f, true);
    /* renamed from: b */
    private final long f917b;
    /* renamed from: c */
    private long f918c;
    /* renamed from: d */
    private long f919d;

    public arn(long j) {
        this.f917b = j;
        this.f918c = j;
    }

    /* renamed from: a */
    public final void m633a() {
        m635a(0);
    }

    /* renamed from: c */
    private final void m631c() {
        m635a(this.f918c);
    }

    /* renamed from: b */
    public final synchronized Object m638b(Object obj) {
        return this.f916a.get(obj);
    }

    /* renamed from: b */
    public final synchronized long m637b() {
        return this.f918c;
    }

    /* renamed from: a */
    public int mo81a(Object obj) {
        return 1;
    }

    /* renamed from: a */
    public void mo86a(Object obj, Object obj2) {
    }

    /* renamed from: b */
    public final synchronized Object m639b(Object obj, Object obj2) {
        Object obj3;
        long a = (long) mo81a(obj2);
        if (a >= this.f918c) {
            mo86a(obj, obj2);
            obj3 = null;
        } else {
            if (obj2 != null) {
                this.f919d = a + this.f919d;
            }
            obj3 = this.f916a.put(obj, obj2);
            if (obj3 != null) {
                this.f919d -= (long) mo81a(obj3);
                if (!obj3.equals(obj2)) {
                    mo86a(obj, obj3);
                }
            }
            m631c();
        }
        return obj3;
    }

    /* renamed from: c */
    public final synchronized Object m640c(Object obj) {
        Object remove;
        remove = this.f916a.remove(obj);
        if (remove != null) {
            this.f919d -= (long) mo81a(remove);
        }
        return remove;
    }

    /* renamed from: a */
    public final synchronized void m634a(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
        this.f918c = (long) Math.round(((float) this.f917b) * f);
        m631c();
    }

    /* renamed from: a */
    public final synchronized void m635a(long j) {
        while (this.f919d > j) {
            Iterator it = this.f916a.entrySet().iterator();
            Entry entry = (Entry) it.next();
            Object value = entry.getValue();
            this.f919d -= (long) mo81a(value);
            Object key = entry.getKey();
            it.remove();
            mo86a(key, value);
        }
    }
}
