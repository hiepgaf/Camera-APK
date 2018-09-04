package p000;

/* compiled from: PG */
/* renamed from: bwr */
public final class bwr {
    /* renamed from: a */
    public int f1657a;
    /* renamed from: b */
    public int f1658b;
    /* renamed from: c */
    public int f1659c;
    /* renamed from: d */
    public long f1660d;
    /* renamed from: e */
    public long f1661e;
    /* renamed from: f */
    public float f1662f;
    /* renamed from: g */
    public float f1663g;
    /* renamed from: h */
    public float f1664h;

    public bwr() {
        this(0, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f);
    }

    public bwr(int i, int i2, int i3, long j, long j2, float f, float f2, float f3) {
        this.f1657a = i;
        this.f1658b = i2;
        this.f1659c = i3;
        this.f1660d = j;
        this.f1661e = j2;
        this.f1662f = f;
        this.f1663g = f2;
        this.f1664h = f3;
    }

    public final /* synthetic */ Object clone() {
        return new bwr(this.f1657a, this.f1658b, this.f1659c, this.f1660d, this.f1661e, this.f1662f, this.f1663g, this.f1664h);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        bwr bwr = (bwr) obj;
        if (this.f1657a == bwr.f1657a && this.f1658b == bwr.f1658b && this.f1659c == bwr.f1659c && this.f1660d == bwr.f1660d && this.f1661e == bwr.f1661e && this.f1662f == bwr.f1662f && this.f1663g == bwr.f1663g && this.f1664h == bwr.f1664h) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void m1022a(bwr bwr) {
        this.f1657a = bwr.f1657a;
        this.f1658b = bwr.f1658b;
        this.f1659c = bwr.f1659c;
        this.f1660d = bwr.f1660d;
        this.f1661e = bwr.f1661e;
        this.f1662f = bwr.f1662f;
        this.f1663g = bwr.f1663g;
        this.f1664h = bwr.f1664h;
    }
}
