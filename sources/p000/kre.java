package p000;

/* compiled from: PG */
/* renamed from: kre */
public abstract class kre {
    /* renamed from: d */
    private static volatile boolean f8435d = false;
    /* renamed from: a */
    public int f8436a;
    /* renamed from: b */
    public int f8437b = 100;
    /* renamed from: c */
    public krg f8438c;

    /* renamed from: a */
    public abstract int mo2259a();

    /* renamed from: a */
    public abstract void mo2260a(int i);

    /* renamed from: b */
    public abstract boolean mo2261b();

    /* renamed from: c */
    public abstract void mo2262c(int i);

    /* renamed from: c */
    public abstract boolean mo2263c();

    /* renamed from: d */
    public abstract int mo2264d(int i);

    /* renamed from: d */
    public abstract kqx mo2265d();

    /* renamed from: e */
    public abstract double mo2266e();

    /* renamed from: e */
    public abstract boolean mo2267e(int i);

    /* renamed from: f */
    public abstract int mo2268f();

    /* renamed from: g */
    public abstract int mo2269g();

    /* renamed from: h */
    public abstract long mo2270h();

    /* renamed from: i */
    public abstract float mo2271i();

    /* renamed from: j */
    public abstract int mo2272j();

    /* renamed from: k */
    public abstract long mo2273k();

    /* renamed from: l */
    abstract long mo2274l();

    /* renamed from: m */
    public abstract int mo2275m();

    /* renamed from: n */
    public abstract long mo2276n();

    /* renamed from: o */
    public abstract int mo2277o();

    /* renamed from: p */
    public abstract long mo2278p();

    /* renamed from: q */
    public abstract String mo2279q();

    /* renamed from: r */
    public abstract String mo2280r();

    /* renamed from: s */
    public abstract int mo2281s();

    /* renamed from: t */
    public abstract int mo2282t();

    /* renamed from: u */
    public abstract long mo2283u();

    kre() {
    }

    /* renamed from: b */
    public static int m5073b(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    /* renamed from: a */
    public static long m5071a(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    /* renamed from: a */
    static kre m5072a(byte[] bArr, int i) {
        kre krf = new krf(bArr, 0, i, false);
        try {
            krf.mo2264d(i);
            return krf;
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }
}
