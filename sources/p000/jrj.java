package p000;

import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jrj */
public class jrj {
    /* renamed from: a */
    private final Map f7940a = new HashMap();
    /* renamed from: b */
    private final Set f7941b = new HashSet();
    /* renamed from: c */
    private final Map f7942c = new HashMap();

    /* renamed from: a */
    public final void m4621a(long j, jaq jaq, int i, int i2, boolean z) {
        Map map = this.f7940a;
        Long valueOf = Long.valueOf(j);
        map.put(valueOf, jaq);
        this.f7942c.put(valueOf, jzp.m4713a(i, i2));
        if (z) {
            this.f7941b.add(valueOf);
        }
    }

    /* renamed from: a */
    public final void m4622a(long j, jqw jqw, boolean z) {
        m4623a(j, jqk.m13088a((AutoCloseable) jqw), z);
    }

    /* renamed from: a */
    public final void m4623a(long j, kah kah, boolean z) {
        m4621a(j, jli.m12948b((Object) kah), ((jqw) kah.mo3191e()).mo704b(), ((jqw) kah.mo3191e()).mo703a(), z);
    }

    /* renamed from: a */
    public final synchronized jrg m4620a() {
        jzp a;
        Map hashMap;
        if (this.f7940a.size() <= 0) {
            a = jzp.m4713a(0, 0);
        } else {
            Map hashMap2 = new HashMap();
            jzp a2 = jzp.m4713a(0, 0);
            a = a2;
            int i = 0;
            for (jzp a22 : this.f7942c.values()) {
                int intValue;
                Integer num = (Integer) hashMap2.get(a22);
                if (num != null) {
                    intValue = num.intValue() + 1;
                } else {
                    intValue = 1;
                }
                hashMap2.put(a22, Integer.valueOf(intValue));
                if (intValue <= i) {
                    a22 = a;
                }
                if (intValue > i) {
                    a = a22;
                    i = intValue;
                } else {
                    a = a22;
                }
            }
        }
        hashMap = new HashMap();
        for (Entry entry : this.f7940a.entrySet()) {
            jzp jzp = (jzp) this.f7942c.get(entry.getKey());
            if (jzp.equals(a)) {
                hashMap.put((Long) entry.getKey(), (jaq) entry.getValue());
            } else {
                String valueOf = String.valueOf(jzp);
                String valueOf2 = String.valueOf(a);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 86) + String.valueOf(valueOf2).length());
                stringBuilder.append("Bitmap has different dimensions ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" than stack mode ");
                stringBuilder.append(valueOf2);
                stringBuilder.append(", so skipping and closing this image.");
                Log.w("SummaryBuilder", stringBuilder.toString());
                ((jaq) entry.getValue()).mo1973a(jlk.f7915a, ion.m3944a()).mo1980a(izw.f18704a);
            }
        }
        return new jrg(hashMap, a.f8149a, a.f8150b, this.f7941b);
    }
}
