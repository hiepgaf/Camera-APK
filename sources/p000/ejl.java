package p000;

/* compiled from: PG */
/* renamed from: ejl */
public final class ejl {
    /* renamed from: a */
    public double f3678a;
    /* renamed from: b */
    public double f3679b;
    /* renamed from: c */
    public double f3680c;

    /* renamed from: a */
    public static void m1786a(ejl ejl, ejl ejl2, ejl ejl3) {
        double d = ejl.f3679b;
        double d2 = ejl2.f3680c;
        double d3 = ejl.f3680c;
        double d4 = ejl2.f3679b;
        double d5 = ejl2.f3678a;
        double d6 = ejl.f3678a;
        ejl3.m1789a((d * d2) - (d3 * d4), (d3 * d5) - (d2 * d6), (d6 * d4) - (d * d5));
    }

    /* renamed from: a */
    public static double m1785a(ejl ejl, ejl ejl2) {
        return ((ejl.f3678a * ejl2.f3678a) + (ejl.f3679b * ejl2.f3679b)) + (ejl.f3680c * ejl2.f3680c);
    }

    /* renamed from: a */
    public final double m1787a() {
        double d = this.f3678a;
        double d2 = this.f3679b;
        double d3 = this.f3680c;
        return Math.sqrt(((d * d) + (d2 * d2)) + (d3 * d3));
    }

    /* renamed from: b */
    public final void m1791b() {
        double a = m1787a();
        if (a != 0.0d) {
            m1788a(1.0d / a);
        }
    }

    /* renamed from: a */
    public final void m1788a(double d) {
        this.f3678a *= d;
        this.f3679b *= d;
        this.f3680c *= d;
    }

    /* renamed from: a */
    public final void m1789a(double d, double d2, double d3) {
        this.f3678a = d;
        this.f3679b = d2;
        this.f3680c = d3;
    }

    /* renamed from: a */
    public final void m1790a(ejl ejl) {
        this.f3678a = ejl.f3678a;
        this.f3679b = ejl.f3679b;
        this.f3680c = ejl.f3680c;
    }

    /* renamed from: c */
    public final void m1792c() {
        this.f3680c = 0.0d;
        this.f3679b = 0.0d;
        this.f3678a = 0.0d;
    }
}
