package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kuh */
public final class kuh {
    /* renamed from: a */
    public static final kuh f8572a = new kuh(0, new int[0], new Object[0], false);
    /* renamed from: b */
    public int f8573b;
    /* renamed from: c */
    public int[] f8574c;
    /* renamed from: d */
    public Object[] f8575d;
    /* renamed from: e */
    public int f8576e;
    /* renamed from: f */
    public boolean f8577f;

    private kuh() {
        this(0, new int[8], new Object[8], true);
    }

    private kuh(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f8576e = -1;
        this.f8573b = i;
        this.f8574c = iArr;
        this.f8575d = objArr;
        this.f8577f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof kuh)) {
            return false;
        }
        kuh kuh = (kuh) obj;
        int i = this.f8573b;
        if (i == kuh.f8573b) {
            int i2;
            boolean z;
            int[] iArr = this.f8574c;
            int[] iArr2 = kuh.f8574c;
            for (i2 = 0; i2 < i; i2++) {
                if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                }
            }
            z = true;
            if (z) {
                Object[] objArr = this.f8575d;
                Object[] objArr2 = kuh.f8575d;
                int i3 = this.f8573b;
                for (i2 = 0; i2 < i3; i2++) {
                    if (!objArr[i2].equals(objArr2[i2])) {
                        z = false;
                        break;
                    }
                }
                z = true;
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final int m5307a() {
        int i = this.f8576e;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < this.f8573b; i2++) {
                int i3 = this.f8574c[i2];
                int i4 = i3 >>> 3;
                switch (i3 & 7) {
                    case 0:
                        i += krh.m13830c(i4, ((Long) this.f8575d[i2]).longValue());
                        break;
                    case 1:
                        ((Long) this.f8575d[i2]).longValue();
                        i += krh.m13836e(i4);
                        break;
                    case 2:
                        i += krh.m13806a(i4, (kqx) this.f8575d[i2]);
                        break;
                    case 3:
                        i3 = krh.m13846k(i4);
                        i += ((kuh) this.f8575d[i2]).m5307a() + (i3 + i3);
                        break;
                    case 5:
                        ((Integer) this.f8575d[i2]).intValue();
                        i += krh.m13833d(i4);
                        break;
                    default:
                        throw new IllegalStateException(ksh.m5144c());
                }
            }
            this.f8576e = i;
        }
        return i;
    }

    public final int hashCode() {
        int i;
        int i2 = 17;
        int i3 = 0;
        int i4 = this.f8573b;
        int i5 = (i4 + 527) * 31;
        int[] iArr = this.f8574c;
        int i6 = 17;
        for (i = 0; i < i4; i++) {
            i6 = (i6 * 31) + iArr[i];
        }
        i = (i5 + i6) * 31;
        Object[] objArr = this.f8575d;
        while (i3 < this.f8573b) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
            i3++;
        }
        return i + i2;
    }

    /* renamed from: a */
    static kuh m5304a(kuh kuh, kuh kuh2) {
        int i = kuh.f8573b + kuh2.f8573b;
        Object copyOf = Arrays.copyOf(kuh.f8574c, i);
        System.arraycopy(kuh2.f8574c, 0, copyOf, kuh.f8573b, kuh2.f8573b);
        Object copyOf2 = Arrays.copyOf(kuh.f8575d, i);
        System.arraycopy(kuh2.f8575d, 0, copyOf2, kuh.f8573b, kuh2.f8573b);
        return new kuh(i, copyOf, copyOf2, true);
    }

    /* renamed from: b */
    static kuh m5306b() {
        return new kuh();
    }

    /* renamed from: a */
    final void m5308a(int i, Object obj) {
        if (this.f8577f) {
            int i2 = this.f8573b;
            int[] iArr = this.f8574c;
            if (i2 == iArr.length) {
                int i3;
                if (i2 >= 4) {
                    i3 = i2 >> 1;
                } else {
                    i3 = 8;
                }
                i3 += i2;
                this.f8574c = Arrays.copyOf(iArr, i3);
                this.f8575d = Arrays.copyOf(this.f8575d, i3);
            }
            int[] iArr2 = this.f8574c;
            i2 = this.f8573b;
            iArr2[i2] = i;
            this.f8575d[i2] = obj;
            this.f8573b = i2 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    private static void m5305a(int i, Object obj, kvb kvb) {
        int i2 = i >>> 3;
        switch (i & 7) {
            case 0:
                kvb.m5384b(i2, ((Long) obj).longValue());
                return;
            case 1:
                kvb.m5376a(i2, ((Long) obj).longValue());
                return;
            case 2:
                kvb.m5380a(i2, (kqx) obj);
                return;
            case 3:
                if (go.cd == go.cd) {
                    kvb.m5382b(i2);
                    ((kuh) obj).m5309a(kvb);
                    kvb.m5372a(i2);
                    return;
                }
                kvb.m5372a(i2);
                ((kuh) obj).m5309a(kvb);
                kvb.m5382b(i2);
                return;
            case 5:
                kvb.m5383b(i2, ((Integer) obj).intValue());
                return;
            default:
                throw new RuntimeException(ksh.m5144c());
        }
    }

    /* renamed from: a */
    public final void m5309a(kvb kvb) {
        if (this.f8573b != 0) {
            int i;
            if (go.cd == go.cd) {
                for (i = 0; i < this.f8573b; i++) {
                    kuh.m5305a(this.f8574c[i], this.f8575d[i], kvb);
                }
                return;
            }
            for (i = this.f8573b - 1; i >= 0; i--) {
                kuh.m5305a(this.f8574c[i], this.f8575d[i], kvb);
            }
        }
    }
}
