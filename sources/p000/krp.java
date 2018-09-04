package p000;

import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: krp */
final class krp {
    krp() {
    }

    krp(byte b) {
        this();
    }

    /* renamed from: a */
    static int m5106a(Entry entry) {
        return ((krs) entry.getKey()).f8456b;
    }

    /* renamed from: a */
    static Object m5107a(krn krn, kte kte, int i) {
        return (krl) krn.f8446b.get(new kro(kte, i));
    }

    /* renamed from: a */
    static krr m5108a(Object obj) {
        ksb ksb = (ksb) obj;
        krr krr = ksb.f23582g;
        if (!krr.f8453b) {
            return krr;
        }
        krr = krr.m5121a();
        ksb.f23582g = krr;
        return krr;
    }

    /* renamed from: b */
    static void m5111b(Object obj) {
        ((ksb) obj).f23582g.m5126d();
    }

    /* renamed from: a */
    static void m5109a(ktq ktq, Object obj, krn krn, krr krr) {
        krl krl = (krl) obj;
        krr.m5123b(krl.f8442d, ktq.mo2220b(krl.f8441c.getClass(), krn));
    }

    /* renamed from: a */
    static void m5110a(kvb kvb, Entry entry) {
        krs krs = (krs) entry.getKey();
        switch (krs.f8457c.ordinal()) {
            case 0:
                kvb.m5373a(krs.f8456b, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                kvb.m5374a(krs.f8456b, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                kvb.m5384b(krs.f8456b, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                kvb.m5391e(krs.f8456b, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                kvb.m5386c(krs.f8456b, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                kvb.m5376a(krs.f8456b, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                kvb.m5383b(krs.f8456b, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                kvb.m5381a(krs.f8456b, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                kvb.m5379a(krs.f8456b, (String) entry.getValue());
                return;
            case 9:
                kvb.m5378a(krs.f8456b, entry.getValue(), kto.f8542a.m5174a(entry.getValue().getClass()));
                return;
            case 10:
                kvb.m5385b(krs.f8456b, entry.getValue(), kto.f8542a.m5174a(entry.getValue().getClass()));
                return;
            case 11:
                kvb.m5380a(krs.f8456b, (kqx) entry.getValue());
                return;
            case 12:
                kvb.m5392f(krs.f8456b, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                kvb.m5386c(krs.f8456b, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                kvb.m5388d(krs.f8456b, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                kvb.m5387c(krs.f8456b, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                kvb.m5390e(krs.f8456b, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                kvb.m5389d(krs.f8456b, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }
}
