package p000;

/* compiled from: PG */
/* renamed from: kug */
final class kug {
    kug() {
    }

    kug(byte b) {
        this();
    }

    /* renamed from: a */
    static /* synthetic */ Object m5297a(Object obj) {
        kuh kuh = ((kry) obj).f23439e;
        if (kuh != kuh.f8572a) {
            return kuh;
        }
        kuh = kuh.m5306b();
        kug.m5301a(obj, kuh);
        return kuh;
    }

    /* renamed from: b */
    static void m5302b(Object obj) {
        ((kry) obj).f23439e.f8577f = false;
    }

    /* renamed from: a */
    final boolean m5303a(Object obj, ktq ktq) {
        int b = ktq.mo2219b();
        int i = b >>> 3;
        switch (b & 7) {
            case 0:
                ((kuh) obj).m5308a(i << 3, Long.valueOf(ktq.mo2240k()));
                return true;
            case 1:
                ((kuh) obj).m5308a((i << 3) | 1, Long.valueOf(ktq.mo2234h()));
                return true;
            case 2:
                ((kuh) obj).m5308a((i << 3) | 2, (Object) ktq.mo2226d());
                return true;
            case 3:
                kuh kuh;
                Object b2 = kuh.m5306b();
                int i2 = (i << 3) | 4;
                while (ktq.mo2213a() != LfuScheduler.MAX_PRIORITY) {
                    if (!m5303a(b2, ktq)) {
                        if (i2 == ktq.mo2219b()) {
                            throw ksh.m5142a();
                        }
                        kuh = (kuh) b2;
                        kuh.f8577f = false;
                        ((kuh) obj).m5308a((i << 3) | 3, (Object) kuh);
                        return true;
                    }
                }
                if (i2 == ktq.mo2219b()) {
                    kuh = (kuh) b2;
                    kuh.f8577f = false;
                    ((kuh) obj).m5308a((i << 3) | 3, (Object) kuh);
                    return true;
                }
                throw ksh.m5142a();
            case 4:
                return false;
            case 5:
                ((kuh) obj).m5308a((i << 3) | 5, Integer.valueOf(ktq.mo2232g()));
                return true;
            default:
                throw ksh.m5144c();
        }
    }

    /* renamed from: a */
    static void m5301a(Object obj, kuh kuh) {
        ((kry) obj).f23439e = kuh;
    }
}
