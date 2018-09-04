package p000;

import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: krr */
public final class krr {
    /* renamed from: d */
    public static final krr f8451d = new krr((byte) 0);
    /* renamed from: a */
    public final ktu f8452a = ktu.m5284b(16);
    /* renamed from: b */
    public boolean f8453b;
    /* renamed from: c */
    public boolean f8454c = false;

    private krr() {
    }

    private krr(byte b) {
        m5126d();
    }

    /* renamed from: a */
    public final krr m5121a() {
        krr krr = new krr();
        for (int i = 0; i < this.f8452a.m5290c(); i++) {
            Entry a = this.f8452a.m5287a(i);
            krr.m5123b((krs) a.getKey(), a.getValue());
        }
        for (Entry entry : this.f8452a.m5292d()) {
            krr.m5123b((krs) entry.getKey(), entry.getValue());
        }
        krr.f8454c = this.f8454c;
        return krr;
    }

    public final /* synthetic */ Object clone() {
        return m5121a();
    }

    /* renamed from: a */
    private static Object m5117a(Object obj) {
        if (obj instanceof ktj) {
            return ((ktj) obj).m16693a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Object obj2 = new byte[length];
        System.arraycopy(bArr, 0, obj2, 0, length);
        return obj2;
    }

    /* renamed from: a */
    static int m5116a(kuw kuw, int i, Object obj) {
        int c;
        int k = krh.m13846k(i);
        if (kuw == kuw.GROUP) {
            k += k;
            ksd.m5134a();
        }
        switch (kuw.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                c = krh.m13827c();
                break;
            case 1:
                ((Float) obj).floatValue();
                c = krh.m13837f();
                break;
            case 2:
                c = krh.m13810a(((Long) obj).longValue());
                break;
            case 3:
                c = krh.m13831c(((Long) obj).longValue());
                break;
            case 4:
                c = krh.m13840g(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).longValue();
                c = krh.m13835e();
                break;
            case 6:
                ((Integer) obj).intValue();
                c = krh.m13832d();
                break;
            case 7:
                ((Boolean) obj).booleanValue();
                c = krh.m13817b();
                break;
            case 8:
                if (!(obj instanceof kqx)) {
                    c = krh.m13811a((String) obj);
                    break;
                }
                c = krh.m13812a((kqx) obj);
                break;
            case 9:
                c = krh.m13814a((kte) obj);
                break;
            case 10:
                if (!(obj instanceof ksk)) {
                    c = krh.m13825b((kte) obj);
                    break;
                }
                c = krh.m13813a((ksk) obj);
                break;
            case 11:
                if (!(obj instanceof kqx)) {
                    c = krh.m13816a((byte[]) obj);
                    break;
                }
                c = krh.m13812a((kqx) obj);
                break;
            case 12:
                c = krh.m13847l(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof kse)) {
                    c = krh.m13828c(((Integer) obj).intValue());
                    break;
                }
                c = krh.m13828c(((kse) obj).mo1771a());
                break;
            case 14:
                ((Integer) obj).intValue();
                c = krh.m13839g();
                break;
            case 15:
                ((Long) obj).longValue();
                c = krh.m13842h();
                break;
            case 16:
                c = krh.m13845j(((Integer) obj).intValue());
                break;
            case 17:
                c = krh.m13824b(((Long) obj).longValue());
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return k + c;
    }

    /* renamed from: a */
    public static int m5115a(krs krs, Object obj) {
        return krr.m5116a(krs.f8457c, krs.f8456b, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krr)) {
            return false;
        }
        return this.f8452a.equals(((krr) obj).f8452a);
    }

    /* renamed from: a */
    public final Object m5120a(krs krs) {
        Object obj = this.f8452a.get(krs);
        if (obj instanceof ksk) {
            return ksk.m13884a();
        }
        return obj;
    }

    /* renamed from: a */
    static int m5114a(Entry entry) {
        krs krs = (krs) entry.getKey();
        Object value = entry.getValue();
        if (krs.f8457c.f8614d != gcb.f5061k) {
            return krr.m5115a(krs, value);
        }
        if (value instanceof ksk) {
            return krh.m13807a(((krs) entry.getKey()).f8456b, (ksk) value);
        }
        return krh.m13808a(((krs) entry.getKey()).f8456b, (kte) value);
    }

    public final int hashCode() {
        return this.f8452a.hashCode();
    }

    /* renamed from: b */
    public final boolean m5124b() {
        for (int i = 0; i < this.f8452a.m5290c(); i++) {
            if (!krr.m5119c(this.f8452a.m5287a(i))) {
                return false;
            }
        }
        for (Entry c : this.f8452a.m5292d()) {
            if (!krr.m5119c(c)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m5119c(Entry entry) {
        if (((krs) entry.getKey()).f8457c.f8614d == gcb.f5061k) {
            Object value = entry.getValue();
            if (value instanceof kte) {
                if (!((kte) value).mo3537f()) {
                    return false;
                }
            } else if (value instanceof ksk) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* renamed from: c */
    public final Iterator m5125c() {
        if (this.f8454c) {
            return new ksm(this.f8452a.entrySet().iterator());
        }
        return this.f8452a.entrySet().iterator();
    }

    /* renamed from: d */
    public final void m5126d() {
        if (!this.f8453b) {
            this.f8452a.mo2305e();
            this.f8453b = true;
        }
    }

    /* renamed from: b */
    final void m5122b(Entry entry) {
        krs krs = (krs) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof ksk) {
            value = ksk.m13884a();
        }
        if (krs.f8457c.f8614d == gcb.f5061k) {
            Object a = m5120a(krs);
            if (a == null) {
                this.f8452a.m5286a(krs, krr.m5117a(value));
                return;
            } else if (a instanceof ktj) {
                throw new UnsupportedOperationException();
            } else {
                this.f8452a.m5286a(krs, ((krz) ((kte) a).mo3539h()).m17812a((kry) ((kte) value)).mo3542c());
                return;
            }
        }
        this.f8452a.m5286a(krs, krr.m5117a(value));
    }

    /* renamed from: b */
    public final void m5123b(krs krs, Object obj) {
        boolean z = false;
        kuw kuw = krs.f8457c;
        ksd.m5131a(obj);
        switch (kuw.f8614d - 1) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if (!(obj instanceof kqx)) {
                    if (obj instanceof byte[]) {
                        z = true;
                        break;
                    }
                }
                z = true;
                break;
                break;
            case 7:
                if (!(obj instanceof Integer)) {
                    if (obj instanceof kse) {
                        z = true;
                        break;
                    }
                }
                z = true;
                break;
                break;
            case 8:
                if (!(obj instanceof kte)) {
                    if (obj instanceof ksk) {
                        z = true;
                        break;
                    }
                }
                z = true;
                break;
                break;
        }
        if (z) {
            if (obj instanceof ksk) {
                this.f8454c = true;
            }
            this.f8452a.m5286a(krs, obj);
            return;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* renamed from: a */
    static void m5118a(krh krh, kuw kuw, int i, Object obj) {
        kuw kuw2 = null;
        if (kuw.GROUP == null) {
            kte kte = (kte) obj;
            ksd.m5134a();
            krh.mo3288h(i, 3);
            kte.mo3534a(krh);
            krh.mo3288h(i, 4);
            return;
        }
        krh.mo3288h(i, kuw2.f8615e);
        switch (kuw2.ordinal()) {
            case 0:
                krh.m13851a(((Double) obj).doubleValue());
                return;
            case 1:
                krh.m13852a(((Float) obj).floatValue());
                return;
            case 2:
                krh.mo3287f(((Long) obj).longValue());
                return;
            case 3:
                krh.mo3287f(((Long) obj).longValue());
                return;
            case 4:
                krh.mo3292n(((Integer) obj).intValue());
                return;
            case 5:
                krh.mo3283d(((Long) obj).longValue());
                return;
            case 6:
                krh.mo3291m(((Integer) obj).intValue());
                return;
            case 7:
                krh.mo3271a(((Boolean) obj).booleanValue());
                return;
            case 8:
                if (obj instanceof kqx) {
                    krh.mo3277b((kqx) obj);
                    return;
                } else {
                    krh.mo3276b((String) obj);
                    return;
                }
            case 9:
                ((kte) obj).mo3534a(krh);
                return;
            case 10:
                krh.mo3280c((kte) obj);
                return;
            case 11:
                if (obj instanceof kqx) {
                    krh.mo3277b((kqx) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                krh.mo3273a(bArr, bArr.length);
                return;
            case 12:
                krh.mo3293p(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof kse) {
                    krh.mo3292n(((kse) obj).mo1771a());
                    return;
                } else {
                    krh.mo3292n(((Integer) obj).intValue());
                    return;
                }
            case 14:
                krh.mo3291m(((Integer) obj).intValue());
                return;
            case 15:
                krh.mo3283d(((Long) obj).longValue());
                return;
            case 16:
                krh.m13880o(((Integer) obj).intValue());
                return;
            case 17:
                krh.m13870e(((Long) obj).longValue());
                return;
            default:
                return;
        }
    }
}
