package p000;

/* compiled from: PG */
/* renamed from: eji */
public final class eji {
    /* renamed from: a */
    public double[] f3670a = new double[9];

    /* renamed from: a */
    public final double m1774a(int i, int i2) {
        return this.f3670a[(i * 3) + i2];
    }

    /* renamed from: a */
    public static void m1772a(eji eji, eji eji2, eji eji3) {
        double[] dArr = eji.f3670a;
        double d = dArr[0];
        double[] dArr2 = eji2.f3670a;
        double d2 = dArr2[0];
        double d3 = dArr[1];
        double d4 = dArr2[3];
        double d5 = dArr[2];
        double d6 = dArr2[6];
        double d7 = dArr2[1];
        double d8 = dArr2[4];
        double d9 = dArr2[7];
        double d10 = dArr2[2];
        double d11 = dArr2[5];
        double d12 = dArr2[8];
        double d13 = dArr[3];
        double d14 = dArr[4];
        double d15 = dArr[5];
        double d16 = dArr[6];
        double d17 = dArr[7];
        double d18 = dArr[8];
        eji3.m1777a(((d * d2) + (d3 * d4)) + (d5 * d6), ((d * d7) + (d3 * d8)) + (d5 * d9), ((d * d10) + (d3 * d11)) + (d5 * d12), ((d13 * d2) + (d14 * d4)) + (d15 * d6), ((d13 * d7) + (d14 * d8)) + (d15 * d9), ((d13 * d10) + (d14 * d11)) + (d15 * d12), ((d2 * d16) + (d4 * d17)) + (d18 * d6), ((d16 * d7) + (d17 * d8)) + (d18 * d9), ((d16 * d10) + (d17 * d11)) + (d18 * d12));
    }

    /* renamed from: a */
    public static void m1773a(eji eji, ejl ejl, ejl ejl2) {
        double[] dArr = eji.f3670a;
        double d = dArr[0];
        double d2 = ejl.f3678a;
        double d3 = dArr[1];
        double d4 = ejl.f3679b;
        double d5 = dArr[2];
        double d6 = ejl.f3680c;
        double d7 = dArr[3];
        double d8 = dArr[4];
        double d9 = dArr[5];
        double d10 = dArr[6];
        double d11 = dArr[7];
        double d12 = dArr[8];
        ejl2.f3678a = ((d * d2) + (d3 * d4)) + (d5 * d6);
        ejl2.f3679b = ((d7 * d2) + (d8 * d4)) + (d9 * d6);
        ejl2.f3680c = (d12 * d6) + ((d10 * d2) + (d11 * d4));
    }

    /* renamed from: a */
    public final void m1777a(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double[] dArr = this.f3670a;
        dArr[0] = d;
        dArr[1] = d2;
        dArr[2] = d3;
        dArr[3] = d4;
        dArr[4] = d5;
        dArr[5] = d6;
        dArr[6] = d7;
        dArr[7] = d8;
        dArr[8] = d9;
    }

    /* renamed from: a */
    public final void m1778a(int i, int i2, double d) {
        this.f3670a[(i * 3) + i2] = d;
    }

    /* renamed from: a */
    public final void m1780a(eji eji) {
        double[] dArr = this.f3670a;
        double[] dArr2 = eji.f3670a;
        dArr[0] = dArr2[0];
        dArr[1] = dArr2[1];
        dArr[2] = dArr2[2];
        dArr[3] = dArr2[3];
        dArr[4] = dArr2[4];
        dArr[5] = dArr2[5];
        dArr[6] = dArr2[6];
        dArr[7] = dArr2[7];
        dArr[8] = dArr2[8];
    }

    /* renamed from: a */
    public final void m1779a(int i, ejl ejl) {
        double[] dArr = this.f3670a;
        dArr[i] = ejl.f3678a;
        dArr[i + 3] = ejl.f3679b;
        dArr[i + 6] = ejl.f3680c;
    }

    /* renamed from: a */
    public final void m1775a() {
        double[] dArr = this.f3670a;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[5] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[8] = 1.0d;
        dArr[4] = 1.0d;
        dArr[0] = 1.0d;
    }

    /* renamed from: a */
    public final void m1776a(double d) {
        double[] dArr = this.f3670a;
        dArr[8] = d;
        dArr[4] = d;
        dArr[0] = d;
    }

    /* renamed from: b */
    public final void m1781b() {
        double[] dArr = this.f3670a;
        dArr[8] = 0.0d;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[5] = 0.0d;
        dArr[4] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[0] = 0.0d;
    }

    /* renamed from: b */
    public final void m1782b(eji eji) {
        double[] dArr = this.f3670a;
        double d = dArr[1];
        double d2 = dArr[2];
        double d3 = dArr[5];
        double[] dArr2 = eji.f3670a;
        dArr2[0] = dArr[0];
        dArr2[1] = dArr[3];
        dArr2[2] = dArr[6];
        dArr2[3] = d;
        dArr2[4] = dArr[4];
        dArr2[5] = dArr[7];
        dArr2[6] = d2;
        dArr2[7] = d3;
        dArr2[8] = dArr[8];
    }
}
