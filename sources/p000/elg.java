package p000;

/* compiled from: PG */
/* renamed from: elg */
public final class elg {
    /* renamed from: a */
    public final ejl f3926a = new ejl();
    /* renamed from: b */
    private final ejl f3927b = new ejl();
    /* renamed from: c */
    private final ejl f3928c = new ejl();
    /* renamed from: d */
    private final ejl f3929d = new ejl();
    /* renamed from: e */
    private final ejl f3930e = new ejl();
    /* renamed from: f */
    private final eji f3931f = new eji();
    /* renamed from: g */
    private final eji f3932g = new eji();

    /* renamed from: a */
    public static void m1861a(ejl ejl, eji eji) {
        double d;
        double a = ejl.m1785a(ejl, ejl);
        double sqrt = Math.sqrt(a);
        if (a < 1.0E-8d) {
            a = 1.0d - (a * 0.1666666716337204d);
            sqrt = 0.5d;
        } else if (a < 1.0E-6d) {
            sqrt = 0.5d - (0.0416666679084301d * a);
            a *= 0.1666666716337204d;
            a = 1.0d - (a * (1.0d - a));
        } else {
            d = 1.0d / sqrt;
            a = Math.sin(sqrt) * d;
            sqrt = (1.0d - Math.cos(sqrt)) * (d * d);
        }
        d = ejl.f3678a;
        d *= d;
        double d2 = ejl.f3679b;
        d2 *= d2;
        double d3 = ejl.f3680c;
        d3 *= d3;
        eji.m1778a(0, 0, 1.0d - ((d2 + d3) * sqrt));
        eji.m1778a(1, 1, 1.0d - ((d3 + d) * sqrt));
        eji.m1778a(2, 2, 1.0d - ((d + d2) * sqrt));
        d = ejl.f3680c * a;
        d2 = (ejl.f3678a * ejl.f3679b) * sqrt;
        eji.m1778a(0, 1, d2 - d);
        eji.m1778a(1, 0, d + d2);
        d = ejl.f3679b * a;
        d2 = (ejl.f3678a * ejl.f3680c) * sqrt;
        eji.m1778a(0, 2, d2 + d);
        eji.m1778a(2, 0, d2 - d);
        a *= ejl.f3678a;
        sqrt *= ejl.f3679b * ejl.f3680c;
        eji.m1778a(1, 2, sqrt - a);
        eji.m1778a(2, 1, sqrt + a);
    }

    /* renamed from: a */
    public final void m1862a(ejl ejl, ejl ejl2, eji eji) {
        eji.m1775a();
        ejl.m1786a(ejl, ejl2, this.f3928c);
        if (this.f3928c.m1787a() != 0.0d) {
            this.f3929d.m1790a(ejl);
            this.f3930e.m1790a(ejl2);
            this.f3928c.m1791b();
            this.f3929d.m1791b();
            this.f3930e.m1791b();
            eji eji2 = this.f3931f;
            eji2.m1779a(0, this.f3929d);
            eji2.m1779a(1, this.f3928c);
            ejl.m1786a(this.f3928c, this.f3929d, this.f3927b);
            eji2.m1779a(2, this.f3927b);
            eji eji3 = this.f3932g;
            eji3.m1779a(0, this.f3930e);
            eji3.m1779a(1, this.f3928c);
            ejl.m1786a(this.f3928c, this.f3930e, this.f3927b);
            eji3.m1779a(2, this.f3927b);
            double[] dArr = eji2.f3670a;
            double d = dArr[1];
            dArr[1] = dArr[3];
            dArr[3] = d;
            d = dArr[2];
            dArr[2] = dArr[6];
            dArr[6] = d;
            d = dArr[5];
            dArr[5] = dArr[7];
            dArr[7] = d;
            eji.m1772a(eji3, eji2, eji);
        }
    }
}
