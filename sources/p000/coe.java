package p000;

import android.util.LongSparseArray;
import java.util.List;

/* compiled from: PG */
/* renamed from: coe */
final class coe {
    /* renamed from: a */
    public final LongSparseArray f2226a = new LongSparseArray();
    /* renamed from: b */
    public final long f2227b;
    /* renamed from: c */
    public final long f2228c;

    public coe(List list, long j) {
        jri.m13152b((Object) list);
        jri.m13144a(list.isEmpty() ^ 1, (Object) "Summary timestamps should not be empty");
        long longValue = ((Long) list.get(0)).longValue();
        for (Long longValue2 : list) {
            long longValue3 = longValue2.longValue();
            this.f2226a.put(longValue3, Long.valueOf(((longValue3 - longValue) / 1000000) + j));
        }
        this.f2227b = ((Long) this.f2226a.valueAt(list.size() - 1)).longValue() + 1000;
        this.f2228c = j;
    }
}
