package p000;

/* compiled from: PG */
/* renamed from: ezz */
public final class ezz extends faa {
    /* renamed from: a */
    private final int f15816a;
    /* renamed from: b */
    private final int f15817b;
    /* renamed from: c */
    private final int f15818c;
    /* renamed from: d */
    private final int f15819d;
    /* renamed from: e */
    private final int f15820e;

    public ezz(int i, int i2, int i3, int i4, int i5) {
        this.f15816a = i;
        this.f15817b = i2;
        this.f15818c = i3;
        this.f15819d = i4;
        this.f15820e = i5;
    }

    /* renamed from: a */
    public final int mo1326a() {
        return this.f15816a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof faa)) {
            return false;
        }
        faa faa = (faa) obj;
        if (this.f15816a == faa.mo1326a() && this.f15817b == faa.mo1327b() && this.f15818c == faa.mo1330e() && this.f15819d == faa.mo1329d() && this.f15820e == faa.mo1328c()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f15816a ^ 1000003) * 1000003) ^ this.f15817b) * 1000003) ^ this.f15818c) * 1000003) ^ this.f15819d) * 1000003) ^ this.f15820e;
    }

    /* renamed from: b */
    public final int mo1327b() {
        return this.f15817b;
    }

    /* renamed from: c */
    public final int mo1328c() {
        return this.f15820e;
    }

    /* renamed from: d */
    public final int mo1329d() {
        return this.f15819d;
    }

    /* renamed from: e */
    public final int mo1330e() {
        return this.f15818c;
    }
}
