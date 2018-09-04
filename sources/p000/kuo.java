package p000;

import sun.misc.Unsafe;

/* compiled from: PG */
/* renamed from: kuo */
final class kuo extends kuq {
    kuo(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final boolean mo2315a(Object obj, long j) {
        if (kul.f8585c) {
            return kul.m5328b(obj, j);
        }
        return kul.m5332c(obj, j);
    }

    /* renamed from: b */
    public final byte mo2316b(Object obj, long j) {
        if (kul.f8585c) {
            return kul.m5333d(obj, j);
        }
        return kul.m5335e(obj, j);
    }

    /* renamed from: c */
    public final double mo2317c(Object obj, long j) {
        return Double.longBitsToDouble(m5352f(obj, j));
    }

    /* renamed from: d */
    public final float mo2318d(Object obj, long j) {
        return Float.intBitsToFloat(m5351e(obj, j));
    }

    /* renamed from: a */
    public final void mo2314a(Object obj, long j, boolean z) {
        if (kul.f8585c) {
            kul.m5327b(obj, j, z);
        } else {
            kul.m5329c(obj, j, z);
        }
    }

    /* renamed from: a */
    public final void mo2311a(Object obj, long j, byte b) {
        if (kul.f8585c) {
            kul.m5315a(obj, j, b);
        } else {
            kul.m5326b(obj, j, b);
        }
    }

    /* renamed from: a */
    public final void mo2312a(Object obj, long j, double d) {
        m5345a(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: a */
    public final void mo2313a(Object obj, long j, float f) {
        m5344a(obj, j, Float.floatToIntBits(f));
    }
}
