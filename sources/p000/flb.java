package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* renamed from: flb */
public final class flb extends fld {
    flb(long j, kpk kpk, List list) {
        super(j, kpk, list);
    }

    /* renamed from: g */
    public final boolean m17326g() {
        boolean z;
        synchronized (this.f21374b) {
            Iterator it = mo3042b().iterator();
            z = true;
            while (it.hasNext()) {
                int i;
                if (((iuz) ((iwz) it.next())).m17594i() <= 1) {
                    i = 1;
                } else {
                    i = 0;
                }
                z = i & z;
            }
        }
        return z;
    }

    public final synchronized void close() {
        m17328i();
    }

    /* renamed from: h */
    public final fjj m17327h() {
        fjj fld;
        synchronized (this.f21374b) {
            List arrayList = new ArrayList();
            Iterator it = mo3042b().iterator();
            while (it.hasNext()) {
                iwz h = ((iuz) ((iwz) it.next())).m17593h();
                if (h != null) {
                    arrayList.add(h);
                }
            }
            fld = new fld(mo3044e(), this.f21373a, arrayList);
        }
        return fld;
    }

    /* renamed from: i */
    public final boolean m17328i() {
        boolean z;
        synchronized (this.f21374b) {
            LinkedList b = mo3042b();
            Iterator it = mo3042b().iterator();
            z = true;
            while (it.hasNext()) {
                z = ((iuz) ((iwz) it.next())).m17595j() & z;
            }
            b.clear();
        }
        if (z) {
            super.close();
        }
        return z;
    }
}
