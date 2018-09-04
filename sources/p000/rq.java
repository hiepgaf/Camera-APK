package p000;

/* compiled from: PG */
/* renamed from: rq */
public final class rq {
    /* renamed from: a */
    public long f9142a = 0;
    /* renamed from: b */
    public rq f9143b;

    rq() {
    }

    /* renamed from: a */
    final void m5771a(int i) {
        while (i >= 64) {
            this = this.f9143b;
            if (this != null) {
                i -= 64;
            } else {
                return;
            }
        }
        this.f9142a &= (1 << i) ^ -1;
    }

    /* renamed from: b */
    final int m5773b(int i) {
        rq rqVar = this.f9143b;
        if (rqVar == null) {
            if (i >= 64) {
                return Long.bitCount(this.f9142a);
            }
            return Long.bitCount(this.f9142a & ((1 << i) - 1));
        } else if (i < 64) {
            return Long.bitCount(this.f9142a & ((1 << i) - 1));
        } else {
            return rqVar.m5773b(i - 64) + Long.bitCount(this.f9142a);
        }
    }

    /* renamed from: a */
    private final void m5770a() {
        if (this.f9143b == null) {
            this.f9143b = new rq();
        }
    }

    /* renamed from: c */
    final boolean m5774c(int i) {
        while (i >= 64) {
            m5770a();
            this = this.f9143b;
            i -= 64;
        }
        return (this.f9142a & (1 << i)) != 0;
    }

    /* renamed from: a */
    final void m5772a(int i, boolean z) {
        while (true) {
            if (i >= 64) {
                m5770a();
                this = this.f9143b;
                i -= 64;
            } else {
                boolean z2;
                long j = this.f9142a;
                if ((Long.MIN_VALUE & j) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                long j2 = (1 << i) - 1;
                long j3 = (j2 ^ -1) & j;
                this.f9142a = (j & j2) | (j3 + j3);
                if (z) {
                    m5776e(i);
                } else {
                    m5771a(i);
                }
                if (z2 || this.f9143b != null) {
                    m5770a();
                    this = this.f9143b;
                    z = z2;
                    i = 0;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public final boolean m5775d(int i) {
        boolean z;
        while (i >= 64) {
            m5770a();
            this = this.f9143b;
            i -= 64;
        }
        long j = 1 << i;
        long j2 = this.f9142a;
        if ((j2 & j) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f9142a = j2 & (j ^ -1);
        j--;
        j2 = this.f9142a;
        this.f9142a = Long.rotateRight((j ^ -1) & j2, 1) | (j2 & j);
        rq rqVar = this.f9143b;
        if (rqVar != null) {
            if (rqVar.m5774c(0)) {
                m5776e(63);
            }
            this.f9143b.m5775d(0);
        }
        return z;
    }

    /* renamed from: e */
    public final void m5776e(int i) {
        while (i >= 64) {
            m5770a();
            this = this.f9143b;
            i -= 64;
        }
        this.f9142a |= 1 << i;
    }

    public final String toString() {
        if (this.f9143b == null) {
            return Long.toBinaryString(this.f9142a);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f9143b.toString());
        stringBuilder.append("xx");
        stringBuilder.append(Long.toBinaryString(this.f9142a));
        return stringBuilder.toString();
    }
}
