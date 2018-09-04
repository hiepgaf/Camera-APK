package p000;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kti */
final class kti implements ktr {
    /* renamed from: a */
    private final kte f19305a;
    /* renamed from: b */
    private final kug f19306b;
    /* renamed from: c */
    private final boolean f19307c;
    /* renamed from: d */
    private final krp f19308d;

    private kti(kug kug, krp krp, kte kte) {
        this.f19306b = kug;
        this.f19307c = kte instanceof ksb;
        this.f19308d = krp;
        this.f19305a = kte;
    }

    /* renamed from: a */
    public final boolean mo2297a(Object obj, Object obj2) {
        if (!((kry) obj).f23439e.equals(((kry) obj2).f23439e)) {
            return false;
        }
        if (this.f19307c) {
            return ((ksb) obj).f23582g.equals(((ksb) obj2).f23582g);
        }
        return true;
    }

    /* renamed from: a */
    public final int mo2293a(Object obj) {
        int i = 0;
        kuh kuh = ((kry) obj).f23439e;
        int i2 = kuh.f8576e;
        if (i2 == -1) {
            i2 = 0;
            int i3 = 0;
            while (i3 < kuh.f8573b) {
                int b = krh.m13821b(kuh.f8574c[i3] >>> 3, (kqx) kuh.f8575d[i3]) + i2;
                i3++;
                i2 = b;
            }
            kuh.f8576e = i2;
        }
        if (!this.f19307c) {
            return i2;
        }
        krr krr = ((ksb) obj).f23582g;
        int i4 = 0;
        while (i < krr.f8452a.m5290c()) {
            i4 += krr.m5114a(krr.f8452a.m5287a(i));
            i++;
        }
        b = i4;
        for (Entry a : krr.f8452a.m5292d()) {
            b = krr.m5114a(a) + b;
        }
        return i2 + b;
    }

    /* renamed from: b */
    public final int mo2298b(Object obj) {
        int hashCode = ((kry) obj).f23439e.hashCode();
        if (this.f19307c) {
            return (hashCode * 53) + ((ksb) obj).f23582g.hashCode();
        }
        return hashCode;
    }

    /* renamed from: c */
    public final boolean mo2300c(Object obj) {
        return ((ksb) obj).f23582g.m5124b();
    }

    /* renamed from: d */
    public final void mo2301d(Object obj) {
        kug.m5302b(obj);
        krp.m5111b(obj);
    }

    /* renamed from: a */
    public final void mo2295a(Object obj, ktq ktq, krn krn) {
        kug kug = this.f19306b;
        Object a = kug.m5297a(obj);
        krr a2 = krp.m5108a(obj);
        while (ktq.mo2213a() != LfuScheduler.MAX_PRIORITY) {
            boolean z;
            int b = ktq.mo2219b();
            Object obj2;
            if (b == 11) {
                kqx kqx = null;
                int i = 0;
                obj2 = null;
                while (ktq.mo2213a() != LfuScheduler.MAX_PRIORITY) {
                    int b2 = ktq.mo2219b();
                    if (b2 == 16) {
                        i = ktq.mo2254r();
                        obj2 = krp.m5107a(krn, this.f19305a, i);
                    } else if (b2 == 26) {
                        if (obj2 != null) {
                            krp.m5109a(ktq, obj2, krn, a2);
                        } else {
                            try {
                                kqx = ktq.mo2226d();
                            } finally {
                                kug.m5301a(obj, (kuh) a);
                            }
                        }
                    } else if (!ktq.mo2256t()) {
                        break;
                    }
                }
                if (ktq.mo2219b() != 12) {
                    throw ksh.m5142a();
                } else if (kqx == null) {
                    z = true;
                    continue;
                } else if (obj2 == null) {
                    ((kuh) a).m5308a((i << 3) | 2, (Object) kqx);
                    z = true;
                    continue;
                } else {
                    krl krl = (krl) obj2;
                    Object g = krl.f8441c.mo3538g().mo3544g();
                    ByteBuffer wrap = ByteBuffer.wrap(kqx.m5067c());
                    if (wrap.hasArray()) {
                        ktq kqt = new kqt(wrap);
                        kto.f8542a.m5175a(g).mo2295a(g, kqt, krn);
                        a2.m5123b(krl.f8442d, g);
                        if (kqt.mo2213a() != LfuScheduler.MAX_PRIORITY) {
                            throw ksh.m5142a();
                        }
                        z = true;
                        continue;
                    } else {
                        throw new IllegalArgumentException("Direct buffers not yet supported");
                    }
                }
            } else if ((b & 7) == 2) {
                obj2 = krp.m5107a(krn, this.f19305a, b >>> 3);
                if (obj2 != null) {
                    krp.m5109a(ktq, obj2, krn, a2);
                    z = true;
                    continue;
                } else {
                    z = kug.m5303a(a, ktq);
                    continue;
                }
            } else {
                z = ktq.mo2256t();
                continue;
            }
            if (!z) {
                return;
            }
        }
        kug.m5301a(obj, (kuh) a);
    }

    /* renamed from: b */
    public final void mo2299b(Object obj, Object obj2) {
        ktt.m5244a(this.f19306b, obj, obj2);
        if (this.f19307c) {
            ktt.m5243a(this.f19308d, obj, obj2);
        }
    }

    /* renamed from: a */
    public final Object mo2294a() {
        return this.f19305a.mo3538g().mo3544g();
    }

    /* renamed from: a */
    static kti m13952a(kug kug, krp krp, kte kte) {
        return new kti(kug, krp, kte);
    }

    /* renamed from: a */
    public final void mo2296a(Object obj, kvb kvb) {
        Iterator c = ((ksb) obj).f23582g.m5125c();
        while (c.hasNext()) {
            Entry entry = (Entry) c.next();
            krs krs = (krs) entry.getKey();
            if (krs.f8457c.f8614d != gcb.f5061k) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof ksl) {
                kvb.m5377a(krs.f8456b, ((ksk) ((ksl) entry).f8529a.getValue()).m5150b());
            } else {
                kvb.m5377a(krs.f8456b, entry.getValue());
            }
        }
        kuh kuh = ((kry) obj).f23439e;
        int i;
        if (go.cd == go.ce) {
            for (i = kuh.f8573b - 1; i >= 0; i--) {
                kvb.m5377a(kuh.f8574c[i] >>> 3, kuh.f8575d[i]);
            }
            return;
        }
        for (i = 0; i < kuh.f8573b; i++) {
            kvb.m5377a(kuh.f8574c[i] >>> 3, kuh.f8575d[i]);
        }
    }
}
