package p000;

import android.database.Cursor;

/* compiled from: PG */
/* renamed from: cpt */
public final class cpt implements kwk {
    /* renamed from: a */
    private final kwk f12498a;

    public cpt(kwk kwk) {
        this.f12498a = kwk;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        long j;
        long j2 = -1;
        cro cro = (cro) this.f12498a.mo345a();
        Cursor query = cro.f2593b.query(cqk.f2564a, cqk.f2565b, "_data LIKE ?", new String[]{cro.f2592a}, "datetaken DESC");
        if (query == null) {
            j = -1;
        } else if (query.getCount() > 0) {
            query.moveToFirst();
            j = query.getLong(3);
        } else {
            j = -1;
        }
        if (query != null) {
            query.close();
        }
        Cursor query2 = cro.f2593b.query(cqr.f2568a, cqr.f2569b, "_data LIKE ?", new String[]{cro.f2592a}, "datetaken DESC");
        if (query2 != null && query2.getCount() > 0) {
            query2.moveToFirst();
            j2 = query2.getLong(3);
        }
        if (query2 != null) {
            query2.close();
        }
        return Long.valueOf(Math.max(j, j2));
    }
}
