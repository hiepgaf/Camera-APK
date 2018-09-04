package p000;

import android.util.SparseArray;

/* compiled from: PG */
/* renamed from: un */
public final class un {
    /* renamed from: a */
    public SparseArray f9328a = new SparseArray();
    /* renamed from: b */
    public int f9329b = 0;

    /* renamed from: a */
    final uo m5995a(int i) {
        uo uoVar = (uo) this.f9328a.get(i);
        if (uoVar != null) {
            return uoVar;
        }
        uoVar = new uo();
        this.f9328a.put(i, uoVar);
        return uoVar;
    }

    /* renamed from: a */
    static long m5994a(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }
}
