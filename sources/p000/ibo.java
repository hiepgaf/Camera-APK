package p000;

/* renamed from: ibo */
public final class ibo implements Cloneable {
    /* renamed from: a */
    public ibp[] f6905a;
    /* renamed from: b */
    public int f6906b;
    /* renamed from: c */
    private int[] f6907c;

    static {
        ibp ibp = new ibp();
    }

    ibo() {
        this(10);
    }

    private ibo(int i) {
        int i2;
        int i3 = i << 2;
        for (int i4 = 4; i4 < 32; i4++) {
            i2 = (1 << i4) - 12;
            if (i3 <= i2) {
                break;
            }
        }
        i2 = i3;
        i2 /= 4;
        this.f6907c = new int[i2];
        this.f6905a = new ibp[i2];
        this.f6906b = 0;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f6906b; i2++) {
            i = (((i * 31) + this.f6907c[i2]) * 31) + this.f6905a[i2].hashCode();
        }
        return i;
    }

    public final /* synthetic */ Object clone() {
        int i = this.f6906b;
        ibo ibo = new ibo(i);
        System.arraycopy(this.f6907c, 0, ibo.f6907c, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            ibp ibp = this.f6905a[i2];
            if (ibp != null) {
                ibo.f6905a[i2] = (ibp) ibp.clone();
            }
        }
        ibo.f6906b = i;
        return ibo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ibo)) {
            return false;
        }
        ibo ibo = (ibo) obj;
        int i = this.f6906b;
        if (i != ibo.f6906b) {
            return false;
        }
        int i2;
        boolean z;
        int[] iArr = this.f6907c;
        int[] iArr2 = ibo.f6907c;
        for (i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                z = false;
                break;
            }
        }
        z = true;
        if (z) {
            ibp[] ibpArr = this.f6905a;
            ibp[] ibpArr2 = ibo.f6905a;
            int i3 = this.f6906b;
            for (i2 = 0; i2 < i3; i2++) {
                if (!ibpArr[i2].equals(ibpArr2[i2])) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m3640a() {
        return this.f6906b == 0;
    }
}
