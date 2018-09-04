package p000;

import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: ixs */
public final class ixs implements ixq {
    /* renamed from: a */
    private final Object f18656a = new Object();
    /* renamed from: b */
    private final Map f18657b;

    public ixs(Map map) {
        this.f18657b = map;
    }

    /* renamed from: a */
    public final float mo1961a(iwp iwp) {
        float f;
        synchronized (this.f18656a) {
            f = 0.0f;
            for (Entry entry : this.f18657b.entrySet()) {
                f = (((Float) entry.getValue()).floatValue() * ((ixq) entry.getKey()).mo1961a(iwp)) + f;
            }
        }
        return f;
    }
}
