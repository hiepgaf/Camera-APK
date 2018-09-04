package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: jtw */
public final class jtw implements jtv {
    /* renamed from: a */
    private final Map f19047a;
    /* renamed from: b */
    private final float f19048b = 0.0f;

    public jtw(Map map) {
        this.f19047a = Collections.unmodifiableMap(new HashMap(map));
    }

    /* renamed from: a */
    public final jzf mo2049a(long j) {
        float f = 0.0f;
        for (Entry entry : this.f19047a.entrySet()) {
            f = (((Float) entry.getValue()).floatValue() * ((jtv) entry.getKey()).mo2049a(j).mo2076a()) + f;
        }
        return new jzc(f);
    }

    /* renamed from: b */
    public static jtx m13212b() {
        return new jtx();
    }

    /* renamed from: b */
    public final void mo2051b(long j) {
        for (jtv b : this.f19047a.keySet()) {
            b.mo2051b(j);
        }
    }

    /* renamed from: c */
    public final void mo2052c(long j) {
        for (jtv c : this.f19047a.keySet()) {
            c.mo2052c(j);
        }
    }

    /* renamed from: a */
    public final void mo2050a() {
        for (jtv a : this.f19047a.keySet()) {
            a.mo2050a();
        }
    }

    public final String toString() {
        String valueOf;
        Iterable b = khb.m4885b();
        b.add("0.0");
        for (Entry entry : this.f19047a.entrySet()) {
            String valueOf2 = String.valueOf(entry.getValue());
            valueOf = String.valueOf(entry.getKey());
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf2).length() + 3) + String.valueOf(valueOf).length());
            stringBuilder.append(valueOf2);
            stringBuilder.append(" * ");
            stringBuilder.append(valueOf);
            b.add(stringBuilder.toString());
        }
        valueOf = kaz.m4732a(" + ").m4735a(b);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 27);
        stringBuilder2.append("LinearWeightedFrameScorer[");
        stringBuilder2.append(valueOf);
        stringBuilder2.append("]");
        return stringBuilder2.toString();
    }
}
