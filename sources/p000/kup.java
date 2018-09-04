package p000;

import sun.misc.Unsafe;

/* compiled from: PG */
/* renamed from: kup */
final class kup extends kuq {
    kup(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final boolean mo2315a(Object obj, long j) {
        return this.a.getBoolean(obj, j);
    }

    /* renamed from: b */
    public final byte mo2316b(Object obj, long j) {
        return this.a.getByte(obj, j);
    }

    /* renamed from: c */
    public final double mo2317c(Object obj, long j) {
        return this.a.getDouble(obj, j);
    }

    /* renamed from: d */
    public final float mo2318d(Object obj, long j) {
        return this.a.getFloat(obj, j);
    }

    /* renamed from: a */
    public final void mo2314a(Object obj, long j, boolean z) {
        this.a.putBoolean(obj, j, z);
    }

    /* renamed from: a */
    public final void mo2311a(Object obj, long j, byte b) {
        this.a.putByte(obj, j, b);
    }

    /* renamed from: a */
    public final void mo2312a(Object obj, long j, double d) {
        this.a.putDouble(obj, j, d);
    }

    /* renamed from: a */
    public final void mo2313a(Object obj, long j, float f) {
        this.a.putFloat(obj, j, f);
    }
}
