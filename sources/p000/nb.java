package p000;

/* compiled from: PG */
/* renamed from: nb */
final class nb {
    /* renamed from: a */
    public static nb f8863a;
    /* renamed from: b */
    public long f8864b;
    /* renamed from: c */
    public long f8865c;
    /* renamed from: d */
    public int f8866d;

    nb() {
    }

    /* renamed from: a */
    public final void m5616a(long j, double d, double d2) {
        float f = ((float) (-946728000000L + j)) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = (double) f2;
        double sin = (((((Math.sin(d3) * 0.03341960161924362d) + d3) + (Math.sin((double) (f2 + f2)) * 3.4906598739326E-4d)) + (Math.sin((double) (f2 * 3.0f)) * 5.236000106378924E-6d)) + 1.796593063d) + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double round = ((((double) (((float) Math.round(((double) (f - 4738.253f)) - d4)) + 9.0E-4f)) + d4) + (Math.sin(d3) * 0.0053d)) + (Math.sin(sin + sin) * -0.0069d);
        d3 = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        sin = 0.01745329238474369d * d;
        d3 = (Math.sin(-0.10471975803375244d) - (Math.sin(sin) * Math.sin(d3))) / (Math.cos(d3) * Math.cos(sin));
        if (d3 >= 1.0d) {
            this.f8866d = 1;
            this.f8864b = -1;
            this.f8865c = -1;
        } else if (d3 <= -1.0d) {
            this.f8866d = 0;
            this.f8864b = -1;
            this.f8865c = -1;
        } else {
            d3 = (double) ((float) (Math.acos(d3) / 6.283185307179586d));
            this.f8864b = Math.round((round + d3) * 8.64E7d) + 946728000000L;
            this.f8865c = Math.round((round - d3) * 8.64E7d) + 946728000000L;
            if (this.f8865c >= j || this.f8864b <= j) {
                this.f8866d = 1;
            } else {
                this.f8866d = 0;
            }
        }
    }
}
