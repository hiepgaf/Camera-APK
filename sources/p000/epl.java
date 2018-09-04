package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: epl */
public final class epl {
    /* renamed from: a */
    public final Object f4032a = new Object();
    /* renamed from: b */
    public final List f4033b = new ArrayList();
    /* renamed from: c */
    public final List f4034c = new ArrayList();
    /* renamed from: d */
    public long f4035d = 0;
    /* renamed from: e */
    public long f4036e = 0;
    /* renamed from: f */
    public List f4037f;

    public epl(iya iya) {
    }

    /* renamed from: a */
    public final kla m1946a() {
        kla kla;
        synchronized (this.f4032a) {
            kla = new kla();
            if (this.f4033b.size() <= 0 || this.f4034c.get(0) == null) {
                kla.f22313a = epm.UNKNOWN.f4042c;
            } else {
                kla.f22313a = ((epm) this.f4034c.get(0)).f4042c;
            }
            List list = this.f4033b;
            kla.f22314b = (kkz[]) list.toArray(new kkz[list.size()]);
        }
        return kla;
    }

    /* renamed from: b */
    public final klb[] m1947b() {
        synchronized (this.f4032a) {
            List list = this.f4037f;
            if (list != null) {
                klb[] klbArr = (klb[]) list.toArray(new klb[list.size()]);
                return klbArr;
            }
            return null;
        }
    }
}
