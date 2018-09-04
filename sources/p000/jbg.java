package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: jbg */
public final class jbg {
    /* renamed from: a */
    public final jbj f7632a = jbj.m12751d();
    /* renamed from: b */
    public final Object[] f7633b;
    /* renamed from: c */
    public final jar[] f7634c;
    /* renamed from: d */
    public final AtomicInteger f7635d;
    /* renamed from: e */
    public volatile boolean f7636e = false;

    public jbg(Iterable iterable) {
        int size;
        int i = 0;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            long j = 0;
            while (it.hasNext()) {
                it.next();
                j++;
            }
            size = khx.m4934a(j);
        }
        this.f7633b = new Object[size];
        this.f7634c = new jar[size];
        this.f7635d = new AtomicInteger(size);
        for (jaq a : iterable) {
            a.mo1974a(kpq.f8410a, new jbh(this, i), new jbi(this, i)).mo1980a(izw.f18704a);
            i++;
        }
    }
}
