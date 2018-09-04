package p000;

/* compiled from: PG */
/* renamed from: jzs */
public final class jzs {
    /* renamed from: a */
    private double f8157a = Double.MAX_VALUE;
    /* renamed from: b */
    private double f8158b = Double.MIN_VALUE;
    /* renamed from: c */
    private double f8159c = 0.0d;
    /* renamed from: d */
    private double f8160d = 0.0d;
    /* renamed from: e */
    private int f8161e = 0;

    /* renamed from: a */
    public final jzs m4716a(double d) {
        if (d > this.f8158b) {
            this.f8158b = d;
        }
        if (d < this.f8157a) {
            this.f8157a = d;
        }
        this.f8161e++;
        double d2 = this.f8159c;
        double d3 = d - d2;
        this.f8159c = d2 + (d3 / ((double) this.f8161e));
        this.f8160d += d3 * (d - this.f8159c);
        return this;
    }

    /* renamed from: a */
    public final jzr m4715a() {
        double d;
        int i = this.f8161e;
        if (i != 0) {
            d = this.f8160d / ((double) i);
        } else {
            d = Double.NaN;
        }
        return new jzr(i, this.f8157a, this.f8158b, this.f8159c, d);
    }
}
