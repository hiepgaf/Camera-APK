package p000;

/* compiled from: PG */
/* renamed from: ktp */
public final class ktp implements ktc {
    /* renamed from: a */
    public final kte f19309a;
    /* renamed from: b */
    public final String f19310b;
    /* renamed from: c */
    public final Object[] f19311c;
    /* renamed from: d */
    private final int f19312d;

    public ktp(kte kte, String str, Object[] objArr) {
        this.f19309a = kte;
        this.f19310b = str;
        this.f19311c = objArr;
        char charAt = str.charAt(0);
        if (charAt < '?') {
            this.f19312d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= '?') {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            } else {
                this.f19312d = (charAt2 << i3) | i;
                return;
            }
        }
    }

    /* renamed from: a */
    public final kte mo2302a() {
        return this.f19309a;
    }

    /* renamed from: b */
    public final int mo2303b() {
        return (this.f19312d & 1) != 1 ? go.cc : go.cb;
    }

    /* renamed from: c */
    public final boolean mo2304c() {
        return (this.f19312d & 2) == 2;
    }
}
