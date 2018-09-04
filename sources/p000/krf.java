package p000;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: krf */
final class krf extends kre {
    /* renamed from: d */
    private final byte[] f19263d;
    /* renamed from: e */
    private int f19264e;
    /* renamed from: f */
    private int f19265f;
    /* renamed from: g */
    private int f19266g;
    /* renamed from: h */
    private int f19267h;
    /* renamed from: i */
    private int f19268i;
    /* renamed from: j */
    private int f19269j = LfuScheduler.MAX_PRIORITY;

    krf(byte[] bArr, int i, int i2, boolean z) {
        this.f19263d = bArr;
        this.f19264e = i2 + 0;
        this.f19266g = 0;
        this.f19267h = this.f19266g;
    }

    /* renamed from: a */
    public final void mo2260a(int i) {
        if (this.f19268i != i) {
            throw ksh.m5142a();
        }
    }

    /* renamed from: a */
    public final int mo2259a() {
        return this.f19266g - this.f19267h;
    }

    /* renamed from: b */
    public final boolean mo2261b() {
        return this.f19266g == this.f19264e;
    }

    /* renamed from: c */
    public final void mo2262c(int i) {
        this.f19269j = i;
        m13718A();
    }

    /* renamed from: d */
    public final int mo2264d(int i) {
        if (i < 0) {
            throw ksh.m5146e();
        }
        int a = mo2259a() + i;
        int i2 = this.f19269j;
        if (a > i2) {
            throw ksh.m5148g();
        }
        this.f19269j = a;
        m13718A();
        return i2;
    }

    /* renamed from: c */
    public final boolean mo2263c() {
        return m13724z() != 0;
    }

    /* renamed from: d */
    public final kqx mo2265d() {
        int i;
        int i2;
        int y = m13723y();
        if (y > 0) {
            i = this.f19264e;
            i2 = this.f19266g;
            if (y <= i - i2) {
                kqx a = kqx.m5056a(this.f19263d, i2, y);
                this.f19266g = y + this.f19266g;
                return a;
            }
        }
        if (y == 0) {
            return kqx.f8429a;
        }
        if (y > 0) {
            i = this.f19264e;
            i2 = this.f19266g;
            if (y <= i - i2) {
                this.f19266g = i2 + y;
                byte[] copyOfRange = Arrays.copyOfRange(this.f19263d, i2, this.f19266g);
                return kqx.m5055a(copyOfRange);
            }
        }
        if (y > 0) {
            throw ksh.m5148g();
        } else if (y == 0) {
            copyOfRange = ksd.f8516b;
            return kqx.m5055a(copyOfRange);
        } else {
            throw ksh.m5146e();
        }
    }

    /* renamed from: e */
    public final double mo2266e() {
        return Double.longBitsToDouble(m13722x());
    }

    /* renamed from: f */
    public final int mo2268f() {
        return m13723y();
    }

    /* renamed from: g */
    public final int mo2269g() {
        return m13721w();
    }

    /* renamed from: h */
    public final long mo2270h() {
        return m13722x();
    }

    /* renamed from: i */
    public final float mo2271i() {
        return Float.intBitsToFloat(m13721w());
    }

    /* renamed from: j */
    public final int mo2272j() {
        return m13723y();
    }

    /* renamed from: k */
    public final long mo2273k() {
        return m13724z();
    }

    /* renamed from: v */
    private final byte m13720v() {
        int i = this.f19266g;
        if (i == this.f19264e) {
            throw ksh.m5148g();
        }
        byte[] bArr = this.f19263d;
        this.f19266g = i + 1;
        return bArr[i];
    }

    /* renamed from: w */
    private final int m13721w() {
        int i = this.f19266g;
        if (this.f19264e - i < 4) {
            throw ksh.m5148g();
        }
        byte[] bArr = this.f19263d;
        this.f19266g = i + 4;
        return ((bArr[i + 3] & Illuminant.kOther) << 24) | (((bArr[i] & Illuminant.kOther) | ((bArr[i + 1] & Illuminant.kOther) << 8)) | ((bArr[i + 2] & Illuminant.kOther) << 16));
    }

    /* renamed from: x */
    private final long m13722x() {
        int i = this.f19266g;
        if (this.f19264e - i < 8) {
            throw ksh.m5148g();
        }
        byte[] bArr = this.f19263d;
        this.f19266g = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: y */
    private final int m13723y() {
        /*
        r5 = this;
        r0 = r5.f19266g;
        r1 = r5.f19264e;
        if (r1 == r0) goto L_0x0071;
    L_0x0006:
        r3 = r5.f19263d;
        r2 = r0 + 1;
        r0 = r3[r0];
        if (r0 < 0) goto L_0x0011;
    L_0x000e:
        r5.f19266g = r2;
    L_0x0010:
        return r0;
    L_0x0011:
        r1 = r1 - r2;
        r4 = 9;
        if (r1 < r4) goto L_0x0071;
    L_0x0016:
        r1 = r2 + 1;
        r2 = r3[r2];
        r2 = r2 << 7;
        r0 = r0 ^ r2;
        if (r0 < 0) goto L_0x006e;
    L_0x001f:
        r2 = r1 + 1;
        r1 = r3[r1];
        r1 = r1 << 14;
        r0 = r0 ^ r1;
        if (r0 >= 0) goto L_0x006a;
    L_0x0028:
        r1 = r2 + 1;
        r2 = r3[r2];
        r2 = r2 << 21;
        r0 = r0 ^ r2;
        if (r0 < 0) goto L_0x0065;
    L_0x0031:
        r2 = r1 + 1;
        r1 = r3[r1];
        r4 = r1 << 28;
        r0 = r0 ^ r4;
        r4 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
        r0 = r0 ^ r4;
        if (r1 >= 0) goto L_0x0063;
    L_0x003e:
        r1 = r2 + 1;
        r2 = r3[r2];
        if (r2 >= 0) goto L_0x005c;
    L_0x0044:
        r2 = r1 + 1;
        r1 = r3[r1];
        if (r1 >= 0) goto L_0x0061;
    L_0x004a:
        r1 = r2 + 1;
        r2 = r3[r2];
        if (r2 >= 0) goto L_0x005c;
    L_0x0050:
        r2 = r1 + 1;
        r1 = r3[r1];
        if (r1 >= 0) goto L_0x005f;
    L_0x0056:
        r1 = r2 + 1;
        r2 = r3[r2];
        if (r2 < 0) goto L_0x0071;
    L_0x005c:
        r5.f19266g = r1;
        goto L_0x0010;
    L_0x005f:
        r1 = r2;
        goto L_0x005c;
    L_0x0061:
        r1 = r2;
        goto L_0x005c;
    L_0x0063:
        r1 = r2;
        goto L_0x005c;
    L_0x0065:
        r2 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r0 = r0 ^ r2;
        goto L_0x005c;
    L_0x006a:
        r0 = r0 ^ 16256;
        r1 = r2;
        goto L_0x005c;
    L_0x006e:
        r0 = r0 ^ -128;
        goto L_0x005c;
    L_0x0071:
        r0 = r5.mo2274l();
        r0 = (int) r0;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: krf.y():int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: z */
    private final long m13724z() {
        /*
        r10 = this;
        r8 = 0;
        r0 = r10.f19266g;
        r1 = r10.f19264e;
        if (r1 == r0) goto L_0x008d;
    L_0x0008:
        r4 = r10.f19263d;
        r3 = r0 + 1;
        r0 = r4[r0];
        if (r0 < 0) goto L_0x0014;
    L_0x0010:
        r10.f19266g = r3;
        r0 = (long) r0;
    L_0x0013:
        return r0;
    L_0x0014:
        r1 = r1 - r3;
        r2 = 9;
        if (r1 < r2) goto L_0x008d;
    L_0x0019:
        r2 = r3 + 1;
        r1 = r4[r3];
        r1 = r1 << 7;
        r0 = r0 ^ r1;
        if (r0 < 0) goto L_0x00b5;
    L_0x0022:
        r3 = r2 + 1;
        r1 = r4[r2];
        r1 = r1 << 14;
        r0 = r0 ^ r1;
        if (r0 >= 0) goto L_0x00b0;
    L_0x002b:
        r2 = r3 + 1;
        r1 = r4[r3];
        r1 = r1 << 21;
        r0 = r0 ^ r1;
        if (r0 >= 0) goto L_0x003c;
    L_0x0034:
        r1 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r0 = r0 ^ r1;
        r0 = (long) r0;
    L_0x0039:
        r10.f19266g = r2;
        goto L_0x0013;
    L_0x003c:
        r3 = r2 + 1;
        r0 = (long) r0;
        r2 = r4[r2];
        r6 = (long) r2;
        r2 = 28;
        r6 = r6 << r2;
        r0 = r0 ^ r6;
        r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r2 >= 0) goto L_0x00aa;
    L_0x004a:
        r2 = r3 + 1;
        r3 = r4[r3];
        r6 = (long) r3;
        r3 = 35;
        r6 = r6 << r3;
        r0 = r0 ^ r6;
        r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r3 < 0) goto L_0x00a3;
    L_0x0057:
        r3 = r2 + 1;
        r2 = r4[r2];
        r6 = (long) r2;
        r2 = 42;
        r6 = r6 << r2;
        r0 = r0 ^ r6;
        r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r2 >= 0) goto L_0x009b;
    L_0x0064:
        r2 = r3 + 1;
        r3 = r4[r3];
        r6 = (long) r3;
        r3 = 49;
        r6 = r6 << r3;
        r0 = r0 ^ r6;
        r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r3 < 0) goto L_0x0094;
    L_0x0071:
        r3 = r2 + 1;
        r2 = r4[r2];
        r6 = (long) r2;
        r2 = 56;
        r6 = r6 << r2;
        r0 = r0 ^ r6;
        r6 = 71499008037633920; // 0xfe03f80fe03f80 float:2.2112565E-29 double:6.838959413692434E-304;
        r0 = r0 ^ r6;
        r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r2 >= 0) goto L_0x0092;
    L_0x0084:
        r2 = r3 + 1;
        r3 = r4[r3];
        r4 = (long) r3;
        r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r3 >= 0) goto L_0x0039;
    L_0x008d:
        r0 = r10.mo2274l();
        goto L_0x0013;
    L_0x0092:
        r2 = r3;
        goto L_0x0039;
    L_0x0094:
        r4 = -558586000294016; // 0xfffe03f80fe03f80 float:2.2112565E-29 double:NaN;
        r0 = r0 ^ r4;
        goto L_0x0039;
    L_0x009b:
        r4 = 4363953127296; // 0x3f80fe03f80 float:2.2112565E-29 double:2.1560793202584E-311;
        r0 = r0 ^ r4;
        r2 = r3;
        goto L_0x0039;
    L_0x00a3:
        r4 = -34093383808; // 0xfffffff80fe03f80 float:2.2112565E-29 double:NaN;
        r0 = r0 ^ r4;
        goto L_0x0039;
    L_0x00aa:
        r4 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
        r0 = r0 ^ r4;
        r2 = r3;
        goto L_0x0039;
    L_0x00b0:
        r0 = r0 ^ 16256;
        r0 = (long) r0;
        r2 = r3;
        goto L_0x0039;
    L_0x00b5:
        r0 = r0 ^ -128;
        r0 = (long) r0;
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: krf.z():long");
    }

    /* renamed from: l */
    final long mo2274l() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte v = m13720v();
            j |= ((long) (v & ScriptIntrinsicBLAS.RsBlas_csyrk)) << i;
            if ((v & 128) == 0) {
                return j;
            }
        }
        throw ksh.m5145d();
    }

    /* renamed from: m */
    public final int mo2275m() {
        return m13721w();
    }

    /* renamed from: n */
    public final long mo2276n() {
        return m13722x();
    }

    /* renamed from: o */
    public final int mo2277o() {
        return kre.m5073b(m13723y());
    }

    /* renamed from: p */
    public final long mo2278p() {
        return kre.m5071a(m13724z());
    }

    /* renamed from: q */
    public final String mo2279q() {
        int y = m13723y();
        if (y > 0) {
            int i = this.f19264e;
            int i2 = this.f19266g;
            if (y <= i - i2) {
                String str = new String(this.f19263d, i2, y, ksd.f8515a);
                this.f19266g = y + this.f19266g;
                return str;
            }
        }
        if (y == 0) {
            return "";
        }
        if (y < 0) {
            throw ksh.m5146e();
        }
        throw ksh.m5148g();
    }

    /* renamed from: r */
    public final String mo2280r() {
        int y = m13723y();
        if (y > 0) {
            int i = this.f19264e;
            int i2 = this.f19266g;
            if (y <= i - i2) {
                if (kur.m5359b(this.f19263d, i2, i2 + y)) {
                    i2 = this.f19266g;
                    this.f19266g = i2 + y;
                    return new String(this.f19263d, i2, y, ksd.f8515a);
                }
                throw ksh.m5143b();
            }
        }
        if (y == 0) {
            return "";
        }
        if (y <= 0) {
            throw ksh.m5146e();
        }
        throw ksh.m5148g();
    }

    /* renamed from: s */
    public final int mo2281s() {
        int i = 0;
        if (mo2261b()) {
            this.f19268i = 0;
        } else {
            this.f19268i = m13723y();
            i = this.f19268i;
            if ((i >>> 3) == 0) {
                throw new ksh("Protocol message contained an invalid tag (zero).");
            }
        }
        return i;
    }

    /* renamed from: t */
    public final int mo2282t() {
        return m13723y();
    }

    /* renamed from: u */
    public final long mo2283u() {
        return m13724z();
    }

    /* renamed from: A */
    private final void m13718A() {
        this.f19264e += this.f19265f;
        int i = this.f19264e;
        int i2 = i - this.f19267h;
        int i3 = this.f19269j;
        if (i2 > i3) {
            this.f19265f = i2 - i3;
            this.f19264e = i - this.f19265f;
            return;
        }
        this.f19265f = 0;
    }

    /* renamed from: e */
    public final boolean mo2267e(int i) {
        int i2 = 0;
        switch (i & 7) {
            case 0:
                if (this.f19264e - this.f19266g >= 10) {
                    while (i2 < 10) {
                        byte[] bArr = this.f19263d;
                        int i3 = this.f19266g;
                        this.f19266g = i3 + 1;
                        if (bArr[i3] >= (byte) 0) {
                            return true;
                        }
                        i2++;
                    }
                    throw ksh.m5145d();
                }
                while (i2 < 10) {
                    if (m13720v() >= (byte) 0) {
                        return true;
                    }
                    i2++;
                }
                throw ksh.m5145d();
            case 1:
                m13719f(8);
                return true;
            case 2:
                m13719f(m13723y());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                m13719f(4);
                return true;
            default:
                throw ksh.m5144c();
        }
        do {
            i2 = mo2281s();
            if (i2 != 0) {
            }
            mo2260a(((i >>> 3) << 3) | 4);
            return true;
        } while (mo2267e(i2));
        mo2260a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: f */
    private final void m13719f(int i) {
        if (i >= 0) {
            int i2 = this.f19264e;
            int i3 = this.f19266g;
            if (i <= i2 - i3) {
                this.f19266g = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw ksh.m5146e();
        }
        throw ksh.m5148g();
    }
}
