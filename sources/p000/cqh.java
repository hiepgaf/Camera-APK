package p000;

import java.util.Comparator;
import java.util.Date;

/* compiled from: PG */
/* renamed from: cqh */
public final class cqh implements Comparator {
    /* renamed from: a */
    private final Date f2562a;

    public cqh(Date date) {
        jri.m13152b((Object) date);
        this.f2562a = new Date(date.getTime() + 86400000);
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Date date;
        Date date2;
        err err = (err) obj2;
        eru g = ((err) obj).mo1033g();
        eru g2 = err.mo1033g();
        if (m1407a(g.f4152e)) {
            date = g.f4153f;
        } else {
            date = g.f4152e;
        }
        if (m1407a(g2.f4152e)) {
            date2 = g2.f4153f;
        } else {
            date2 = g2.f4152e;
        }
        int i = -date.compareTo(date2);
        if (i == 0) {
            i = -g.f4153f.compareTo(g2.f4153f);
        }
        if (i != 0) {
            return i;
        }
        return g.f4150c.compareTo(g2.f4150c);
    }

    /* renamed from: a */
    private final boolean m1407a(Date date) {
        return this.f2562a.compareTo(date) < 0;
    }
}
