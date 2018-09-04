package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kol */
public final class kol extends kob {
    kol() {
    }

    public kol(keh keh, boolean z) {
        this();
        Runnable kom = new kom(this, keh, z, (byte) 0);
        this.f23608f = kom;
        if (kom.f19240a.isEmpty()) {
            kom.mo3249b();
        } else if (kom.f19241b) {
            Iterator c = kom.f19240a.mo2144c();
            int i = 0;
            while (c.hasNext()) {
                kpk kpk = (kpk) c.next();
                int i2 = i + 1;
                kpk.mo1985a(new kod(kom, i, kpk), kpq.f8410a);
                i = i2;
            }
        } else {
            Iterator c2 = kom.f19240a.mo2144c();
            while (c2.hasNext()) {
                ((kpk) c2.next()).mo1985a(kom, kpq.f8410a);
            }
        }
    }
}
