package p000;

import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: kob */
class kob extends knt {
    /* renamed from: e */
    public static final Logger f23607e = Logger.getLogger(kob.class.getName());
    /* renamed from: f */
    public koc f23608f;

    kob() {
    }

    /* renamed from: a */
    static boolean m18051a(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* renamed from: a */
    protected final void mo3613a() {
        super.mo3613a();
        koc koc = this.f23608f;
        if (koc != null) {
            int i;
            this.f23608f = null;
            keh keh = koc.f19240a;
            boolean c = m17783c();
            if (c) {
                koc.m13604c();
            }
            boolean isCancelled = isCancelled();
            if (keh != null) {
                i = 1;
            } else {
                i = 0;
            }
            if ((i & isCancelled) != 0) {
                Iterator c2 = keh.mo2144c();
                while (c2.hasNext()) {
                    ((kpk) c2.next()).cancel(c);
                }
            }
        }
    }

    /* renamed from: b */
    protected final String mo3614b() {
        koc koc = this.f23608f;
        if (koc == null) {
            return null;
        }
        keh keh = koc.f19240a;
        if (keh == null) {
            return null;
        }
        String valueOf = String.valueOf(keh);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 10);
        stringBuilder.append("futures=[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
