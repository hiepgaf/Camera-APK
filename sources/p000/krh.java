package p000;

import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: krh */
public abstract class krh extends kqw {
    /* renamed from: a */
    public static final Logger f19274a = Logger.getLogger(krh.class.getName());
    /* renamed from: b */
    public static final boolean f19275b = kul.f8584b;
    /* renamed from: c */
    public kvb f19276c = this;

    /* renamed from: a */
    public abstract void mo3271a(byte b);

    /* renamed from: a */
    public abstract void mo3272a(int i, boolean z);

    /* renamed from: a */
    abstract void mo3273a(byte[] bArr, int i);

    /* renamed from: a */
    public abstract void mo2284a(byte[] bArr, int i, int i2);

    /* renamed from: b */
    public abstract void mo3274b(int i, String str);

    /* renamed from: b */
    public abstract void mo3275b(int i, kte kte);

    /* renamed from: b */
    public abstract void mo3276b(String str);

    /* renamed from: b */
    public abstract void mo3277b(kqx kqx);

    /* renamed from: c */
    public abstract void mo3278c(int i, kqx kqx);

    /* renamed from: c */
    abstract void mo3279c(int i, kte kte, ktr ktr);

    /* renamed from: c */
    public abstract void mo3280c(kte kte);

    /* renamed from: d */
    public abstract void mo3281d(int i, long j);

    /* renamed from: d */
    public abstract void mo3282d(int i, kqx kqx);

    /* renamed from: d */
    public abstract void mo3283d(long j);

    /* renamed from: e */
    public abstract void mo3284e(int i, int i2);

    /* renamed from: f */
    public abstract void mo3285f(int i, int i2);

    /* renamed from: f */
    public abstract void mo3286f(int i, long j);

    /* renamed from: f */
    public abstract void mo3287f(long j);

    /* renamed from: h */
    public abstract void mo3288h(int i, int i2);

    /* renamed from: i */
    public abstract int mo3289i();

    /* renamed from: i */
    public abstract void mo3290i(int i, int i2);

    /* renamed from: m */
    public abstract void mo3291m(int i);

    /* renamed from: n */
    public abstract void mo3292n(int i);

    /* renamed from: p */
    public abstract void mo3293p(int i);

    krh() {
    }

    /* renamed from: a */
    public final void m13849a() {
        if (mo3289i() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: a */
    public static int m13802a(int i) {
        return krh.m13847l(i << 3) + 1;
    }

    /* renamed from: b */
    public static int m13817b() {
        return 1;
    }

    /* renamed from: a */
    public static int m13816a(byte[] bArr) {
        int length = bArr.length;
        return length + krh.m13847l(length);
    }

    /* renamed from: a */
    public static int m13806a(int i, kqx kqx) {
        int l = krh.m13847l(i << 3);
        int b = kqx.mo3268b();
        return l + (b + krh.m13847l(b));
    }

    /* renamed from: a */
    public static int m13812a(kqx kqx) {
        int b = kqx.mo3268b();
        return b + krh.m13847l(b);
    }

    /* renamed from: b */
    public static int m13818b(int i) {
        return krh.m13847l(i << 3) + 8;
    }

    /* renamed from: c */
    public static int m13827c() {
        return 8;
    }

    /* renamed from: a */
    public static int m13803a(int i, int i2) {
        return krh.m13847l(i << 3) + krh.m13840g(i2);
    }

    /* renamed from: c */
    public static int m13828c(int i) {
        return krh.m13840g(i);
    }

    /* renamed from: d */
    public static int m13833d(int i) {
        return krh.m13847l(i << 3) + 4;
    }

    /* renamed from: d */
    public static int m13832d() {
        return 4;
    }

    /* renamed from: e */
    public static int m13836e(int i) {
        return krh.m13847l(i << 3) + 8;
    }

    /* renamed from: e */
    public static int m13835e() {
        return 8;
    }

    /* renamed from: f */
    public static int m13838f(int i) {
        return krh.m13847l(i << 3) + 4;
    }

    /* renamed from: f */
    public static int m13837f() {
        return 4;
    }

    @Deprecated
    /* renamed from: a */
    static int m13809a(int i, kte kte, ktr ktr) {
        int l = krh.m13847l(i << 3);
        int i2 = l + l;
        kqo kqo = (kqo) kte;
        l = kqo.mo3532a();
        if (l == -1) {
            l = ktr.mo2293a(kqo);
            kqo.mo3533a(l);
        }
        return l + i2;
    }

    @Deprecated
    /* renamed from: a */
    public static int m13814a(kte kte) {
        return kte.mo3536e();
    }

    /* renamed from: b */
    public static int m13819b(int i, int i2) {
        return krh.m13847l(i << 3) + krh.m13840g(i2);
    }

    /* renamed from: g */
    public static int m13840g(int i) {
        return i >= 0 ? krh.m13847l(i) : 10;
    }

    /* renamed from: a */
    public static int m13804a(int i, long j) {
        return krh.m13847l(i << 3) + krh.m13831c(j);
    }

    /* renamed from: a */
    public static int m13810a(long j) {
        return krh.m13831c(j);
    }

    /* renamed from: a */
    public static int m13807a(int i, ksn ksn) {
        int l = krh.m13847l(8);
        return ((l + l) + krh.m13834d(2, i)) + krh.m13822b(3, ksn);
    }

    /* renamed from: b */
    public static int m13822b(int i, ksn ksn) {
        int b;
        int l = krh.m13847l(i << 3);
        if (ksn.f8533c != null) {
            b = ksn.f8533c.mo3268b();
        } else if (ksn.f8532b != null) {
            b = ksn.f8532b.mo3536e();
        } else {
            b = 0;
        }
        return (b + krh.m13847l(b)) + l;
    }

    /* renamed from: a */
    public static int m13813a(ksn ksn) {
        int b;
        if (ksn.f8533c != null) {
            b = ksn.f8533c.mo3268b();
        } else if (ksn.f8532b != null) {
            b = ksn.f8532b.mo3536e();
        } else {
            b = 0;
        }
        return b + krh.m13847l(b);
    }

    /* renamed from: a */
    public static int m13808a(int i, kte kte) {
        int l = krh.m13847l(8);
        return ((l + l) + krh.m13834d(2, i)) + (krh.m13847l(24) + krh.m13825b(kte));
    }

    /* renamed from: b */
    static int m13823b(int i, kte kte, ktr ktr) {
        return krh.m13847l(i << 3) + krh.m13815a(kte, ktr);
    }

    /* renamed from: b */
    public static int m13825b(kte kte) {
        int e = kte.mo3536e();
        return e + krh.m13847l(e);
    }

    /* renamed from: a */
    static int m13815a(kte kte, ktr ktr) {
        kqo kqo = (kqo) kte;
        int a = kqo.mo3532a();
        if (a == -1) {
            a = ktr.mo2293a(kqo);
            kqo.mo3533a(a);
        }
        return a + krh.m13847l(a);
    }

    /* renamed from: b */
    public static int m13821b(int i, kqx kqx) {
        int l = krh.m13847l(8);
        return ((l + l) + krh.m13834d(2, i)) + krh.m13806a(3, kqx);
    }

    /* renamed from: h */
    public static int m13843h(int i) {
        return krh.m13847l(i << 3) + 4;
    }

    /* renamed from: g */
    public static int m13839g() {
        return 4;
    }

    /* renamed from: i */
    public static int m13844i(int i) {
        return krh.m13847l(i << 3) + 8;
    }

    /* renamed from: h */
    public static int m13842h() {
        return 8;
    }

    /* renamed from: c */
    public static int m13829c(int i, int i2) {
        return krh.m13847l(i << 3) + krh.m13847l(krh.m13848q(i2));
    }

    /* renamed from: j */
    public static int m13845j(int i) {
        return krh.m13847l(krh.m13848q(i));
    }

    /* renamed from: b */
    public static int m13820b(int i, long j) {
        return krh.m13847l(i << 3) + krh.m13831c(krh.m13841g(j));
    }

    /* renamed from: b */
    public static int m13824b(long j) {
        return krh.m13831c(krh.m13841g(j));
    }

    /* renamed from: a */
    public static int m13805a(int i, String str) {
        return krh.m13847l(i << 3) + krh.m13811a(str);
    }

    /* renamed from: a */
    public static int m13811a(String str) {
        int a;
        try {
            a = kur.m5356a((CharSequence) str);
        } catch (kuu e) {
            a = str.getBytes(ksd.f8515a).length;
        }
        return a + krh.m13847l(a);
    }

    /* renamed from: k */
    public static int m13846k(int i) {
        return krh.m13847l(i << 3);
    }

    /* renamed from: d */
    public static int m13834d(int i, int i2) {
        return krh.m13847l(i << 3) + krh.m13847l(i2);
    }

    /* renamed from: l */
    public static int m13847l(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        if ((-268435456 & i) == 0) {
            return 4;
        }
        return 5;
    }

    /* renamed from: c */
    public static int m13830c(int i, long j) {
        return krh.m13847l(i << 3) + krh.m13831c(j);
    }

    /* renamed from: c */
    public static int m13831c(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        long j2;
        int i;
        int i2;
        long j3;
        if ((-34359738368L & j) != 0) {
            j2 = j >>> 28;
            i = 6;
        } else {
            i = 2;
            j2 = j;
        }
        long j4;
        if ((-2097152 & j2) != 0) {
            j4 = j2 >>> 14;
            i2 = i + 2;
            j3 = j4;
        } else {
            j4 = j2;
            i2 = i;
            j3 = j4;
        }
        if ((j3 & -16384) != 0) {
            return i2 + 1;
        }
        return i2;
    }

    /* renamed from: q */
    private static int m13848q(int i) {
        return (i + i) ^ (i >> 31);
    }

    /* renamed from: g */
    private static long m13841g(long j) {
        return (j + j) ^ (j >> 63);
    }

    /* renamed from: b */
    public static krh m13826b(byte[] bArr) {
        return new kri(bArr, bArr.length);
    }

    /* renamed from: a */
    public final void m13853a(int i, double d) {
        mo3281d(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void m13851a(double d) {
        mo3283d(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void m13854a(int i, float f) {
        mo3284e(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public final void m13852a(float f) {
        mo3291m(Float.floatToRawIntBits(f));
    }

    /* renamed from: g */
    public final void m13874g(int i, int i2) {
        mo3290i(i, krh.m13848q(i2));
    }

    /* renamed from: o */
    public final void m13880o(int i) {
        mo3293p(krh.m13848q(i));
    }

    /* renamed from: e */
    public final void m13869e(int i, long j) {
        mo3286f(i, krh.m13841g(j));
    }

    /* renamed from: e */
    public final void m13870e(long j) {
        mo3287f(krh.m13841g(j));
    }
}
