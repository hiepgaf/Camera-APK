package p000;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: fki */
final class fki implements iqt {
    /* renamed from: a */
    private final Object f16101a = new Object();
    /* renamed from: b */
    private final Map f16102b = new HashMap();
    /* renamed from: c */
    private final Comparator f16103c = fkj.f4599a;

    fki() {
    }

    /* renamed from: a */
    public final fhq m10458a(Long l) {
        synchronized (this.f16101a) {
            if (this.f16102b.containsKey(l)) {
                fhq fhq = (fhq) ((TreeSet) this.f16102b.get(l)).first();
                return fhq;
            }
            return null;
        }
    }

    /* renamed from: a */
    public final boolean m10460a(fhq fhq) {
        boolean d;
        synchronized (this.f16101a) {
            d = m10457d(fhq);
        }
        return d;
    }

    /* renamed from: b */
    final TreeSet m10461b(fhq fhq) {
        TreeSet treeSet = new TreeSet(this.f16103c);
        synchronized (this.f16101a) {
            for (TreeSet it : this.f16102b.values()) {
                Iterator it2 = it.iterator();
                while (it2.hasNext()) {
                    fhq fhq2 = (fhq) it2.next();
                    if (fhq2.f4563b < fhq.f4563b) {
                        treeSet.add(fhq2);
                    }
                }
            }
            Iterator it3 = treeSet.iterator();
            while (it3.hasNext()) {
                m10457d((fhq) it3.next());
            }
        }
        return treeSet;
    }

    /* renamed from: d */
    private final boolean m10457d(fhq fhq) {
        boolean z;
        long j = fhq.f4562a;
        Map map = this.f16102b;
        Long valueOf = Long.valueOf(j);
        TreeSet treeSet = (TreeSet) map.get(valueOf);
        if (treeSet != null) {
            boolean remove = treeSet.remove(fhq);
            if (!remove) {
                z = remove;
            } else if (treeSet.isEmpty()) {
                this.f16102b.remove(valueOf);
                return remove;
            } else {
                z = remove;
            }
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public final void m10462c(fhq fhq) {
        Long valueOf = Long.valueOf(fhq.f4562a);
        synchronized (this.f16101a) {
            if (this.f16102b.containsKey(valueOf)) {
                ((TreeSet) this.f16102b.get(valueOf)).add(fhq);
            } else {
                TreeSet treeSet = new TreeSet(this.f16103c);
                treeSet.add(fhq);
                this.f16102b.put(valueOf, treeSet);
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo348a(Object obj) {
        m10462c((fhq) obj);
    }
}
