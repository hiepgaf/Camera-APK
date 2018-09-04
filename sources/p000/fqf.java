package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: fqf */
final class fqf implements fux {
    /* renamed from: a */
    private final frg f21391a;
    /* renamed from: b */
    private final Map f21392b = new HashMap();
    /* renamed from: c */
    private final Map f21393c = new HashMap();

    fqf(frg frg) {
        this.f21391a = frg;
    }

    /* renamed from: a */
    public final void mo2642a(iwz iwz, kpk kpk) {
        kbg kbg;
        this.f21393c.put(Long.valueOf(iwz.mo2719f()), fkp.m17314a(iwz).m17316a(fkr.f4601a, kpk));
        if (this.f21393c.isEmpty()) {
            kbg = kau.f19138a;
        } else {
            Object obj = null;
            long j = 0;
            for (iwz f : this.f21393c.values()) {
                long j2;
                Object obj2;
                long f2 = f.mo2719f();
                if (obj == null) {
                    j2 = f2;
                    int i = 1;
                } else if (f2 > j) {
                    j2 = f2;
                    obj2 = 1;
                } else {
                    long j3 = j;
                    obj2 = obj;
                    j2 = j3;
                }
                obj = obj2;
                j = j2;
            }
            if (obj != null) {
                kbg = kbg.m4745c(Long.valueOf(j));
            } else {
                kbg = kau.f19138a;
            }
        }
        if (kbg.mo2084b()) {
            fqf.m15713a(((Long) kbg.mo2081a()).longValue(), this.f21393c);
            fqf.m15713a(((Long) kbg.mo2081a()).longValue(), this.f21392b);
        }
    }

    public final void close() {
        try {
            fkp fkp;
            Object obj;
            kpk a = kow.m13618a(new isr());
            if (this.f21393c.isEmpty()) {
                fkp = null;
            } else {
                fkp = null;
                for (fkp fkp2 : this.f21393c.values()) {
                    if (fkp == null) {
                        fkp = fkp2;
                    } else if (fkp2.mo2719f() > fkp.mo2719f()) {
                        fkp = fkp2;
                    }
                }
            }
            if (fkp != null) {
                this.f21393c.remove(Long.valueOf(fkp.mo2719f()));
                a = (kpk) jri.m13152b(fkp.m17318h());
            }
            if (fkp != null) {
                obj = (iwz) this.f21392b.get(Long.valueOf(fkp.mo2719f()));
                if (obj != null) {
                    this.f21392b.remove(Long.valueOf(obj.mo2719f()));
                }
            } else {
                obj = null;
            }
            this.f21391a.mo1414a(kbg.m4744b(fkp), kbg.m4744b(obj), a);
        } finally {
            m15712a();
        }
    }

    /* renamed from: a */
    private final void m15712a() {
        for (iwz close : this.f21392b.values()) {
            close.close();
        }
        for (iwz close2 : this.f21393c.values()) {
            close2.close();
        }
    }

    /* renamed from: a */
    private static void m15713a(long j, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Long longValue : map.keySet()) {
            long longValue2 = longValue.longValue();
            if (longValue2 < j) {
                Long valueOf = Long.valueOf(longValue2);
                ((iwz) map.get(valueOf)).close();
                arrayList.add(valueOf);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            map.remove((Long) arrayList.get(i));
            i = i2;
        }
    }
}
