package p000;

/* compiled from: PG */
/* renamed from: epj */
public final class epj {
    /* renamed from: a */
    public boolean f4026a = false;
    /* renamed from: b */
    private final Runnable f4027b;
    /* renamed from: c */
    private eph f4028c = eph.f4009c;

    public epj(Runnable runnable) {
        this.f4027b = runnable;
    }

    /* renamed from: a */
    public final synchronized boolean m1945a(eph eph) {
        boolean z = false;
        synchronized (this) {
            boolean z2 = !eph.f4016b.contains(this.f4028c.f4015a) ? eph.f4016b.contains(epi.ANY) : true;
            if (z2) {
                if (this.f4028c == eph.f4009c || this.f4028c == eph.f4014h) {
                    if (eph == eph.f4010d) {
                        this.f4026a = true;
                        this.f4027b.run();
                    } else if (eph == eph.f4011e) {
                        this.f4026a = false;
                        this.f4027b.run();
                    }
                }
                this.f4028c = eph;
                z = true;
            }
        }
        return z;
    }
}
