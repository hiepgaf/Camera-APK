package p000;

/* compiled from: PG */
/* renamed from: elc */
public final class elc {
    /* renamed from: A */
    private eji f3862A = new eji();
    /* renamed from: B */
    private eji f3863B = new eji();
    /* renamed from: C */
    private eji f3864C = new eji();
    /* renamed from: D */
    private eji f3865D = new eji();
    /* renamed from: E */
    private eji f3866E = new eji();
    /* renamed from: F */
    private eji f3867F = new eji();
    /* renamed from: G */
    private ejl f3868G = new ejl();
    /* renamed from: H */
    private ejl f3869H = new ejl();
    /* renamed from: I */
    private ejl f3870I = new ejl();
    /* renamed from: J */
    private eji f3871J;
    /* renamed from: K */
    private eji f3872K;
    /* renamed from: L */
    private eji f3873L;
    /* renamed from: a */
    public double[] f3874a = new double[16];
    /* renamed from: b */
    public eji f3875b = new eji();
    /* renamed from: c */
    public long f3876c;
    /* renamed from: d */
    private eji f3877d = new eji();
    /* renamed from: e */
    private eji f3878e = new eji();
    /* renamed from: f */
    private eji f3879f = new eji();
    /* renamed from: g */
    private eji f3880g = new eji();
    /* renamed from: h */
    private eji f3881h = new eji();
    /* renamed from: i */
    private eji f3882i = new eji();
    /* renamed from: j */
    private eji f3883j = new eji();
    /* renamed from: k */
    private eji f3884k = new eji();
    /* renamed from: l */
    private ejl f3885l = new ejl();
    /* renamed from: m */
    private ejl f3886m = new ejl();
    /* renamed from: n */
    private ejl f3887n = new ejl();
    /* renamed from: o */
    private ejl f3888o = new ejl();
    /* renamed from: p */
    private ejl f3889p = new ejl();
    /* renamed from: q */
    private ejl f3890q = new ejl();
    /* renamed from: r */
    private ejl f3891r = new ejl();
    /* renamed from: s */
    private final elg f3892s = new elg();
    /* renamed from: t */
    private long f3893t;
    /* renamed from: u */
    private float f3894u;
    /* renamed from: v */
    private boolean f3895v = false;
    /* renamed from: w */
    private int f3896w;
    /* renamed from: x */
    private boolean f3897x = true;
    /* renamed from: y */
    private eji f3898y = new eji();
    /* renamed from: z */
    private eji f3899z = new eji();

    public elc() {
        ejl ejl = new ejl();
        ejl = new ejl();
        ejl = new ejl();
        ejl = new ejl();
        ejl = new ejl();
        eji eji = new eji();
        eji = new eji();
        eji = new eji();
        eji = new eji();
        eji = new eji();
        this.f3871J = new eji();
        this.f3872K = new eji();
        this.f3873L = new eji();
        eji = new eji();
        m1853b();
    }

    /* renamed from: a */
    private final void m1848a(eji eji, ejl ejl) {
        eji.m1773a(eji, this.f3890q, this.f3887n);
        this.f3892s.m1862a(this.f3887n, this.f3886m, this.f3873L);
        elg elg = this.f3892s;
        eji eji2 = this.f3873L;
        double a = (((eji2.m1774a(0, 0) + eji2.m1774a(1, 1)) + eji2.m1774a(2, 2)) - 4.0d) * 0.5d;
        ejl.m1789a((eji2.m1774a(2, 1) - eji2.m1774a(1, 2)) / 2.0d, (eji2.m1774a(0, 2) - eji2.m1774a(2, 0)) / 2.0d, (eji2.m1774a(1, 0) - eji2.m1774a(0, 1)) / 2.0d);
        double a2 = ejl.m1787a();
        if (a > 0.7071067811865476d) {
            if (a2 > 0.0d) {
                ejl.m1788a(Math.asin(a2) / a2);
            }
        } else if (a > -0.7071067811865476d) {
            ejl.m1788a(Math.acos(a) / a2);
        } else {
            double asin = 3.141592653589793d - Math.asin(a2);
            a2 = eji2.m1774a(0, 0) - a;
            double a3 = eji2.m1774a(1, 1) - a;
            double a4 = eji2.m1774a(2, 2) - a;
            ejl ejl2 = elg.f3926a;
            a = a2 * a2;
            double d = a3 * a3;
            if (a > d && a > a4 * a4) {
                ejl2.m1789a(a2, (eji2.m1774a(1, 0) + eji2.m1774a(0, 1)) / 2.0d, (eji2.m1774a(0, 2) + eji2.m1774a(2, 0)) / 2.0d);
            } else if (d > a4 * a4) {
                ejl2.m1789a((eji2.m1774a(1, 0) + eji2.m1774a(0, 1)) / 2.0d, a3, (eji2.m1774a(2, 1) + eji2.m1774a(1, 2)) / 2.0d);
            } else {
                ejl2.m1789a((eji2.m1774a(0, 2) + eji2.m1774a(2, 0)) / 2.0d, (eji2.m1774a(2, 1) + eji2.m1774a(1, 2)) / 2.0d, a4);
            }
            if (ejl.m1785a(ejl2, ejl) < 0.0d) {
                ejl2.m1788a(-1.0d);
            }
            ejl2.m1791b();
            ejl2.m1788a(asin);
            ejl.m1790a(ejl2);
        }
    }

    /* renamed from: a */
    public final double m1850a() {
        double a = this.f3875b.m1774a(2, 0);
        double a2 = this.f3875b.m1774a(2, 1);
        if (Math.sqrt((a * a) + (a2 * a2)) < 0.1d) {
            return 0.0d;
        }
        double d;
        a = -90.0d - ((Math.atan2(a2, a) / 3.141592653589793d) * 180.0d);
        if (a < 0.0d) {
            d = a + 360.0d;
        } else {
            d = a;
        }
        if (d >= 360.0d) {
            return d - 0.012451171875d;
        }
        return d;
    }

    /* renamed from: a */
    public final synchronized void m1852a(float[] fArr, long j) {
        this.f3886m.m1789a((double) fArr[0], (double) fArr[1], (double) fArr[2]);
        if (this.f3876c != 0) {
            m1848a(this.f3875b, this.f3885l);
            for (int i = 0; i < 3; i++) {
                ejl ejl = this.f3870I;
                ejl.m1792c();
                if (i == 0) {
                    ejl.f3678a = 1.0E-7d;
                } else if (i == 1) {
                    ejl.f3679b = 1.0E-7d;
                } else {
                    ejl.f3680c = 1.0E-7d;
                }
                elg.m1861a(ejl, this.f3863B);
                eji.m1772a(this.f3863B, this.f3875b, this.f3864C);
                m1848a(this.f3864C, this.f3868G);
                ejl ejl2 = this.f3868G;
                ejl ejl3 = this.f3885l;
                this.f3869H.m1789a(ejl3.f3678a - ejl2.f3678a, ejl3.f3679b - ejl2.f3679b, ejl3.f3680c - ejl2.f3680c);
                this.f3869H.m1788a(1.0E7d);
                this.f3883j.m1779a(i, this.f3869H);
            }
            this.f3883j.m1782b(this.f3865D);
            eji.m1772a(this.f3878e, this.f3865D, this.f3866E);
            eji.m1772a(this.f3883j, this.f3866E, this.f3867F);
            eji eji = this.f3867F;
            eji eji2 = this.f3881h;
            eji eji3 = this.f3882i;
            double[] dArr = eji3.f3670a;
            double[] dArr2 = eji.f3670a;
            double d = dArr2[0];
            double[] dArr3 = eji2.f3670a;
            dArr[0] = d + dArr3[0];
            dArr[1] = dArr2[1] + dArr3[1];
            dArr[2] = dArr2[2] + dArr3[2];
            dArr[3] = dArr2[3] + dArr3[3];
            dArr[4] = dArr2[4] + dArr3[4];
            dArr[5] = dArr2[5] + dArr3[5];
            dArr[6] = dArr2[6] + dArr3[6];
            dArr[7] = dArr2[7] + dArr3[7];
            dArr[8] = dArr3[8] + dArr2[8];
            eji2 = this.f3865D;
            d = ((eji3.m1774a(0, 0) * ((eji3.m1774a(1, 1) * eji3.m1774a(2, 2)) - (eji3.m1774a(2, 1) * eji3.m1774a(1, 2)))) - (eji3.m1774a(0, 1) * ((eji3.m1774a(1, 0) * eji3.m1774a(2, 2)) - (eji3.m1774a(1, 2) * eji3.m1774a(2, 0))))) + (eji3.m1774a(0, 2) * ((eji3.m1774a(1, 0) * eji3.m1774a(2, 1)) - (eji3.m1774a(1, 1) * eji3.m1774a(2, 0))));
            if (d != 0.0d) {
                double d2 = 1.0d / d;
                dArr2 = eji3.f3670a;
                double d3 = dArr2[4];
                double d4 = dArr2[8];
                double d5 = dArr2[7];
                double d6 = dArr2[5];
                double d7 = dArr2[1];
                double d8 = dArr2[2];
                double d9 = dArr2[3];
                double d10 = dArr2[6];
                double d11 = dArr2[0];
                eji2.m1777a(((d3 * d4) - (d5 * d6)) * d2, (-((d7 * d4) - (d8 * d5))) * d2, ((d7 * d6) - (d8 * d3)) * d2, (-((d9 * d4) - (d6 * d10))) * d2, ((d4 * d11) - (d8 * d10)) * d2, (-((d6 * d11) - (d8 * d9))) * d2, ((d9 * d5) - (d10 * d3)) * d2, (-((d5 * d11) - (d10 * d7))) * d2, d2 * ((d3 * d11) - (d7 * d9)));
            }
            this.f3883j.m1782b(this.f3866E);
            eji.m1772a(this.f3866E, this.f3865D, this.f3867F);
            eji.m1772a(this.f3878e, this.f3867F, this.f3884k);
            eji.m1773a(this.f3884k, this.f3885l, this.f3889p);
            eji.m1772a(this.f3884k, this.f3883j, this.f3865D);
            this.f3866E.m1775a();
            eji = this.f3866E;
            eji2 = this.f3865D;
            double[] dArr4 = eji.f3670a;
            d = dArr4[0];
            dArr = eji2.f3670a;
            dArr4[0] = d - dArr[0];
            dArr4[1] = dArr4[1] - dArr[1];
            dArr4[2] = dArr4[2] - dArr[2];
            dArr4[3] = dArr4[3] - dArr[3];
            dArr4[4] = dArr4[4] - dArr[4];
            dArr4[5] = dArr4[5] - dArr[5];
            dArr4[6] = dArr4[6] - dArr[6];
            dArr4[7] = dArr4[7] - dArr[7];
            dArr4[8] = dArr4[8] - dArr[8];
            eji.m1772a(eji, this.f3878e, eji2);
            this.f3878e.m1780a(this.f3865D);
            elg.m1861a(this.f3889p, this.f3877d);
            eji = this.f3877d;
            eji2 = this.f3875b;
            eji.m1772a(eji, eji2, eji2);
            m1849c();
        } else {
            this.f3892s.m1862a(this.f3890q, this.f3886m, this.f3875b);
        }
        this.f3876c = j;
    }

    /* renamed from: b */
    public final synchronized void m1854b(float[] fArr, long j) {
        long j2 = this.f3893t;
        if (j2 != 0) {
            float f = ((float) (j - j2)) * 1.0E-9f;
            if (f > 0.04f) {
                f = this.f3897x ? this.f3894u : 0.01f;
            } else if (this.f3895v) {
                this.f3894u = (this.f3894u * 0.95f) + (0.050000012f * f);
                int i = this.f3896w + 1;
                this.f3896w = i;
                if (((float) i) > 10.0f) {
                    this.f3897x = true;
                }
            } else {
                this.f3894u = f;
                this.f3896w = 1;
                this.f3895v = true;
            }
            float f2 = -f;
            this.f3888o.m1789a((double) (fArr[0] * f2), (double) (fArr[1] * f2), (double) (f2 * fArr[2]));
            elg.m1861a(this.f3888o, this.f3877d);
            this.f3899z.m1780a(this.f3875b);
            eji.m1772a(this.f3877d, this.f3875b, this.f3899z);
            this.f3875b.m1780a(this.f3899z);
            m1849c();
            this.f3862A.m1780a(this.f3879f);
            double d = (double) (f * f);
            double[] dArr = this.f3862A.f3670a;
            dArr[0] = dArr[0] * d;
            dArr[1] = dArr[1] * d;
            dArr[2] = dArr[2] * d;
            dArr[3] = dArr[3] * d;
            dArr[4] = dArr[4] * d;
            dArr[5] = dArr[5] * d;
            dArr[6] = dArr[6] * d;
            dArr[7] = dArr[7] * d;
            dArr[8] = d * dArr[8];
            double[] dArr2 = this.f3878e.f3670a;
            dArr2[0] = dArr2[0] + dArr[0];
            dArr2[1] = dArr2[1] + dArr[1];
            dArr2[2] = dArr2[2] + dArr[2];
            dArr2[3] = dArr2[3] + dArr[3];
            dArr2[4] = dArr2[4] + dArr[4];
            dArr2[5] = dArr2[5] + dArr[5];
            dArr2[6] = dArr2[6] + dArr[6];
            dArr2[7] = dArr2[7] + dArr[7];
            dArr2[8] = dArr[8] + dArr2[8];
        }
        this.f3893t = j;
    }

    /* renamed from: b */
    public final void m1853b() {
        this.f3893t = 0;
        this.f3876c = 0;
        this.f3875b.m1775a();
        this.f3877d.m1775a();
        this.f3878e.m1781b();
        this.f3878e.m1776a(25.0d);
        this.f3879f.m1781b();
        this.f3879f.m1776a(1.0d);
        this.f3880g.m1781b();
        this.f3880g.m1776a(0.0625d);
        this.f3881h.m1781b();
        this.f3881h.m1776a(0.5625d);
        this.f3882i.m1781b();
        this.f3883j.m1781b();
        this.f3884k.m1781b();
        this.f3885l.m1792c();
        this.f3886m.m1792c();
        this.f3887n.m1792c();
        this.f3888o.m1792c();
        this.f3889p.m1792c();
        this.f3890q.m1789a(0.0d, 0.0d, 9.81d);
        this.f3891r.m1789a(0.0d, 1.0d, 0.0d);
    }

    /* renamed from: a */
    public final synchronized void m1851a(double d) {
        double a = ((d - m1850a()) / 180.0d) * 3.141592653589793d;
        double sin = Math.sin(a);
        a = Math.cos(a);
        r16 = new double[3][];
        r16[0] = new double[]{a, -sin, 0.0d};
        r16[1] = new double[]{sin, a, 0.0d};
        r16[2] = new double[]{0.0d, 0.0d, 1.0d};
        eji eji = this.f3898y;
        double[] dArr = r16[0];
        sin = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        dArr = r16[1];
        double d4 = dArr[0];
        double d5 = dArr[1];
        double d6 = dArr[2];
        dArr = r16[2];
        eji.m1777a(sin, d2, d3, d4, d5, d6, dArr[0], dArr[1], dArr[2]);
        eji eji2 = this.f3875b;
        eji.m1772a(eji2, this.f3898y, eji2);
    }

    /* renamed from: c */
    private final void m1849c() {
        this.f3877d.m1782b(this.f3871J);
        eji.m1772a(this.f3878e, this.f3871J, this.f3872K);
        eji.m1772a(this.f3877d, this.f3872K, this.f3878e);
        this.f3877d.m1775a();
    }
}
