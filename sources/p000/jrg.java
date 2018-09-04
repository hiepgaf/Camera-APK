package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jrg */
public class jrg implements AutoCloseable, jqw {
    /* renamed from: a */
    public final int f18971a;
    /* renamed from: b */
    public final int f18972b;
    /* renamed from: c */
    public Set f18973c;
    /* renamed from: d */
    private final Map f18974d;
    /* renamed from: e */
    private final Executor f18975e;
    /* renamed from: f */
    private final List f18976f;

    public jrg(Map map, int i, int i2, Set set) {
        this(map, i, i2, khx.m4940a(), set);
    }

    private jrg(Map map, int i, int i2, Executor executor, Set set) {
        this.f18976f = new ArrayList();
        this.f18974d = map;
        this.f18971a = i;
        this.f18972b = i2;
        this.f18975e = executor;
        this.f18973c = set;
    }

    public synchronized void close() {
        izi a = ion.m3944a();
        izi a2 = ion.m3941a(this.f18974d.values());
        jli.m12937a(this.f18976f).mo1974a(this.f18975e, a2, a2).mo1975a(this.f18975e, new jbd(a)).mo1980a(izw.f18704a);
    }

    /* renamed from: a */
    public final int mo703a() {
        return this.f18972b;
    }

    /* renamed from: a */
    public final jaq m13127a(long j) {
        jaq jaq = (jaq) this.f18974d.get(Long.valueOf(j));
        if (jaq != null) {
            return jaq;
        }
        StringBuilder stringBuilder = new StringBuilder(33);
        stringBuilder.append("No image at ");
        stringBuilder.append(j);
        stringBuilder.append("!");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: b */
    public final jaq m13130b(long j) {
        return m13127a(j).mo1973a(this.f18975e, jrh.f18977a);
    }

    /* renamed from: c */
    public final List m13133c() {
        List d = m13134d();
        d.removeAll(this.f18973c);
        return d;
    }

    /* renamed from: d */
    public final List m13134d() {
        List arrayList = new ArrayList(this.f18974d.keySet());
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: e */
    public final Set m13135e() {
        return this.f18974d.keySet();
    }

    /* renamed from: b */
    public final int mo704b() {
        return this.f18971a;
    }

    /* renamed from: a */
    public final void m13128a(Set set) {
        this.f18973c = new HashSet(m13135e());
        this.f18973c.retainAll(set);
    }

    /* renamed from: c */
    public final synchronized jaq m13132c(long j) {
        jaq a;
        a = m13127a(j).mo1973a(this.f18975e, new jri());
        this.f18976f.add(a);
        return a;
    }

    /* renamed from: b */
    public final synchronized jrg m13131b(Set set) {
        jrj jrj;
        jrj = new jrj();
        for (Long longValue : m13135e()) {
            long longValue2 = longValue.longValue();
            Long longValue3 = Long.valueOf(longValue2);
            if (set.contains(longValue3)) {
                jrj.m4621a(longValue2, m13132c(longValue2), this.f18971a, this.f18972b, this.f18973c.contains(longValue3));
            }
        }
        return jrj.m4620a();
    }

    /* renamed from: f */
    public final int m13136f() {
        return this.f18974d.size();
    }
}
