package p000;

/* compiled from: PG */
/* renamed from: vu */
final class vu {
    /* renamed from: a */
    public int f9427a = 0;
    /* renamed from: b */
    private int f9428b;
    /* renamed from: c */
    private int f9429c;
    /* renamed from: d */
    private int f9430d;
    /* renamed from: e */
    private int f9431e;

    vu() {
    }

    /* renamed from: a */
    final void m6065a(int i) {
        this.f9427a |= i;
    }

    /* renamed from: a */
    final boolean m6067a() {
        int i = this.f9427a;
        if ((i & 7) != 0 && (i & vu.m6064a(this.f9430d, this.f9428b)) == 0) {
            return false;
        }
        i = this.f9427a;
        if ((i & 112) != 0 && (i & (vu.m6064a(this.f9430d, this.f9429c) << 4)) == 0) {
            return false;
        }
        i = this.f9427a;
        if ((i & 1792) != 0 && (i & (vu.m6064a(this.f9431e, this.f9428b) << 8)) == 0) {
            return false;
        }
        i = this.f9427a;
        if ((i & 28672) == 0 || (i & (vu.m6064a(this.f9431e, this.f9429c) << 12)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static int m6064a(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        if (i == i2) {
            return 2;
        }
        return 4;
    }

    /* renamed from: a */
    final void m6066a(int i, int i2, int i3, int i4) {
        this.f9428b = i;
        this.f9429c = i2;
        this.f9430d = i3;
        this.f9431e = i4;
    }
}
