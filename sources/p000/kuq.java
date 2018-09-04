package p000;

import sun.misc.Unsafe;

/* compiled from: PG */
/* renamed from: kuq */
abstract class kuq {
    /* renamed from: a */
    public Unsafe f8593a;

    kuq(Unsafe unsafe) {
        this.f8593a = unsafe;
    }

    /* renamed from: a */
    public abstract void mo2311a(Object obj, long j, byte b);

    /* renamed from: a */
    public abstract void mo2312a(Object obj, long j, double d);

    /* renamed from: a */
    public abstract void mo2313a(Object obj, long j, float f);

    /* renamed from: a */
    public abstract void mo2314a(Object obj, long j, boolean z);

    /* renamed from: a */
    public abstract boolean mo2315a(Object obj, long j);

    /* renamed from: b */
    public abstract byte mo2316b(Object obj, long j);

    /* renamed from: c */
    public abstract double mo2317c(Object obj, long j);

    /* renamed from: d */
    public abstract float mo2318d(Object obj, long j);

    /* renamed from: e */
    public final int m5351e(Object obj, long j) {
        return this.f8593a.getInt(obj, j);
    }

    /* renamed from: f */
    public final long m5352f(Object obj, long j) {
        return this.f8593a.getLong(obj, j);
    }

    /* renamed from: a */
    public final void m5344a(Object obj, long j, int i) {
        this.f8593a.putInt(obj, j, i);
    }

    /* renamed from: a */
    public final void m5345a(Object obj, long j, long j2) {
        this.f8593a.putLong(obj, j, j2);
    }
}
