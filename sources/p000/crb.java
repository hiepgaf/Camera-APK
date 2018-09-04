package p000;

import android.net.Uri;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* renamed from: crb */
public final class crb {
    /* renamed from: a */
    public static int f2579a = -1;
    /* renamed from: g */
    private static final String f2580g = bli.m862a("FSItemDBblyLnkdList");
    /* renamed from: b */
    public crd f2581b;
    /* renamed from: c */
    public final HashMap f2582c = new HashMap();
    /* renamed from: d */
    public final cqy f2583d = new cqy();
    /* renamed from: e */
    public final Lock f2584e = this.f2586h.readLock();
    /* renamed from: f */
    public final Lock f2585f = this.f2586h.writeLock();
    /* renamed from: h */
    private final ReentrantReadWriteLock f2586h = new ReentrantReadWriteLock();

    /* renamed from: a */
    private final crc m1423a(cra cra, err err) {
        jri.m13152b((Object) err);
        Object crc = new crc(this, err);
        crc.f12552a = this.f2583d.m1412a(cra, crc);
        this.f2582c.put(err.mo1033g().f4155h, crc);
        return crc;
    }

    /* renamed from: a */
    public final cre m1426a(err err) {
        boolean z = false;
        jri.m13152b((Object) err);
        this.f2585f.lock();
        try {
            cre a;
            if (this.f2583d.f2576c != 0) {
                Comparator cqh = new cqh(new Date());
                cra a2 = this.f2583d.m1411a(0);
                Object obj = ((crc) a2.mo1059h()).f12553b;
                cqy cqy = this.f2583d;
                if (cqy.f2576c == 0) {
                    throw new NoSuchElementException("Cannot get last from empty list.");
                }
                cra cra = cqy.f2575b;
                if (cqh.compare(err, ((crc) cra.mo1059h()).f12553b) > 0) {
                    a = m1423a(cra, err);
                    return a;
                }
                cra cra2 = a2;
                while (cra2.mo1052a() && cqh.compare(err, obj) > 0) {
                    cra e = cra2.mo1056e();
                    cra2 = e;
                    err err2 = ((crc) e.mo1059h()).f12553b;
                }
                if (cqh.compare(err, obj) > 0) {
                    a = m1423a(cra2, err);
                } else {
                    jri.m13152b((Object) err);
                    obj = new crc(this, err);
                    cqy cqy2 = this.f2583d;
                    if (cra2 == null) {
                        cra2 = cqy2.m1412a(cqy2.f2575b, obj);
                    } else if (cra2 == cqy2.f2574a) {
                        cra2 = cqy2.m1412a(null, obj);
                    } else {
                        if (cra2.mo1055d() == cqy2) {
                            z = true;
                        }
                        jri.m13144a(z, (Object) "Node is not part of this list.");
                        cra2 = cqy2.m1412a(((cqz) cra2).f12548b, obj);
                    }
                    obj.f12552a = cra2;
                    this.f2582c.put(err.mo1033g().f4155h, obj);
                    a = obj;
                }
            } else {
                jri.m13152b((Object) err);
                Object crc = new crc(this, err);
                cqy cqy3 = this.f2583d;
                crc.f12552a = cqy3.m1412a(cqy3.f2575b, crc);
                this.f2582c.put(err.mo1033g().f4155h, crc);
            }
            this.f2585f.unlock();
            return a;
        } finally {
            this.f2585f.unlock();
        }
    }

    /* renamed from: a */
    public final cre m1424a(int i) {
        cre cre;
        this.f2584e.lock();
        if (i >= 0) {
            cqy cqy = this.f2583d;
            if (i < cqy.f2576c) {
                cre = (cre) cqy.m1411a(i).mo1059h();
                this.f2584e.unlock();
                crd crd = this.f2581b;
                if (!(crd == null || cre == null)) {
                    crd.mo1068a(cre);
                }
                return cre;
            }
        }
        try {
            String str = f2580g;
            int i2 = this.f2583d.f2576c;
            StringBuilder stringBuilder = new StringBuilder(86);
            stringBuilder.append("Index: ");
            stringBuilder.append(i);
            stringBuilder.append(" out of range for list of size: ");
            stringBuilder.append(i2);
            stringBuilder.append(". Returning INVALID node.");
            bli.m871d(str, stringBuilder.toString());
            cre = cre.f2587c;
            return cre;
        } finally {
            this.f2584e.unlock();
        }
    }

    /* renamed from: a */
    public final cre m1425a(Uri uri) {
        this.f2584e.lock();
        try {
            cre cre;
            if (this.f2582c.containsKey(uri)) {
                cre = (cre) this.f2582c.get(uri);
                crd crd = this.f2581b;
                if (!(crd == null || cre == null)) {
                    crd.mo1068a(cre);
                }
                return cre;
            }
            String str = f2580g;
            String valueOf = String.valueOf(uri);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 40);
            stringBuilder.append("URI: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" not found. Returning INVALID node.");
            bli.m871d(str, stringBuilder.toString());
            cre = cre.f2587c;
            this.f2584e.unlock();
            return cre;
        } finally {
            this.f2584e.unlock();
        }
    }

    /* renamed from: b */
    public final int m1427b(Uri uri) {
        int i = 0;
        this.f2584e.lock();
        try {
            if (this.f2582c.containsKey(uri)) {
                for (cra a = this.f2583d.m1411a(0); !((crc) a.mo1059h()).f12553b.mo1033g().f4155h.equals(uri); a = a.mo1056e()) {
                    i++;
                }
                this.f2584e.unlock();
                return i;
            }
            int i2 = f2579a;
            return i2;
        } finally {
            this.f2584e.unlock();
        }
    }
}
