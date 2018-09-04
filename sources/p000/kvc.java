package p000;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: kvc */
public final class kvc {
    /* renamed from: a */
    public final byte[] f8634a;
    /* renamed from: b */
    public int f8635b;
    /* renamed from: c */
    public int f8636c;
    /* renamed from: d */
    private final int f8637d;
    /* renamed from: e */
    private int f8638e;
    /* renamed from: f */
    private int f8639f;
    /* renamed from: g */
    private int f8640g = LfuScheduler.MAX_PRIORITY;
    /* renamed from: h */
    private int f8641h;
    /* renamed from: i */
    private int f8642i = 64;

    private kvc(byte[] bArr, int i, int i2) {
        this.f8634a = bArr;
        this.f8637d = i;
        this.f8635b = i + i2;
        this.f8636c = i;
    }

    /* renamed from: a */
    public final void m5398a(int i) {
        if (this.f8639f != i) {
            throw new kvk("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* renamed from: a */
    public final int m5397a() {
        int i = this.f8640g;
        if (i == LfuScheduler.MAX_PRIORITY) {
            return -1;
        }
        return i - this.f8636c;
    }

    /* renamed from: a */
    public final byte[] m5400a(int i, int i2) {
        if (i2 == 0) {
            return kvn.f8666i;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f8634a, this.f8637d + i, bArr, 0, i2);
        return bArr;
    }

    /* renamed from: b */
    public final int m5401b() {
        return this.f8636c - this.f8637d;
    }

    /* renamed from: a */
    public static kvc m5393a(byte[] bArr, int i, int i2) {
        return new kvc(bArr, i, i2);
    }

    /* renamed from: b */
    public final void m5402b(int i) {
        this.f8640g = i;
        m5396k();
    }

    /* renamed from: c */
    public final int m5404c(int i) {
        if (i < 0) {
            throw kvk.m5455b();
        }
        int i2 = this.f8636c + i;
        int i3 = this.f8640g;
        if (i2 > i3) {
            throw kvk.m5456c();
        }
        this.f8640g = i2;
        m5396k();
        return i3;
    }

    /* renamed from: c */
    public final boolean m5405c() {
        return m5410f() != 0;
    }

    /* renamed from: a */
    public final void m5399a(kvl kvl) {
        int f = m5410f();
        if (this.f8641h < this.f8642i) {
            f = m5404c(f);
            this.f8641h++;
            kvl.mergeFrom(this);
            m5398a(0);
            this.f8641h--;
            m5402b(f);
            return;
        }
        throw new kvk("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: j */
    private final byte m5395j() {
        int i = this.f8636c;
        if (i == this.f8635b) {
            throw kvk.m5456c();
        }
        byte[] bArr = this.f8634a;
        this.f8636c = i + 1;
        return bArr[i];
    }

    /* renamed from: d */
    public final int m5406d() {
        return (((m5395j() & Illuminant.kOther) | ((m5395j() & Illuminant.kOther) << 8)) | ((m5395j() & Illuminant.kOther) << 16)) | ((m5395j() & Illuminant.kOther) << 24);
    }

    /* renamed from: e */
    public final long m5408e() {
        return (((((((((long) m5395j()) & 255) | ((((long) m5395j()) & 255) << 8)) | ((((long) m5395j()) & 255) << 16)) | ((((long) m5395j()) & 255) << 24)) | ((((long) m5395j()) & 255) << 32)) | ((((long) m5395j()) & 255) << 40)) | ((((long) m5395j()) & 255) << 48)) | ((((long) m5395j()) & 255) << 56);
    }

    /* renamed from: f */
    public final int m5410f() {
        byte j = m5395j();
        if (j >= (byte) 0) {
            return j;
        }
        int i = j & ScriptIntrinsicBLAS.RsBlas_csyrk;
        byte j2 = m5395j();
        if (j2 >= (byte) 0) {
            return i | (j2 << 7);
        }
        i |= (j2 & ScriptIntrinsicBLAS.RsBlas_csyrk) << 7;
        j2 = m5395j();
        if (j2 >= (byte) 0) {
            return i | (j2 << 14);
        }
        i |= (j2 & ScriptIntrinsicBLAS.RsBlas_csyrk) << 14;
        j2 = m5395j();
        if (j2 >= (byte) 0) {
            return i | (j2 << 21);
        }
        byte j3 = m5395j();
        i = (i | ((j2 & ScriptIntrinsicBLAS.RsBlas_csyrk) << 21)) | (j3 << 28);
        if (j3 >= (byte) 0) {
            return i;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            if (m5395j() >= (byte) 0) {
                return i;
            }
        }
        throw kvk.m5454a();
    }

    /* renamed from: g */
    public final long m5411g() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte j2 = m5395j();
            j |= ((long) (j2 & ScriptIntrinsicBLAS.RsBlas_csyrk)) << i;
            if ((j2 & 128) == 0) {
                return j;
            }
        }
        throw kvk.m5454a();
    }

    /* renamed from: h */
    public final String m5412h() {
        int f = m5410f();
        if (f < 0) {
            throw kvk.m5455b();
        }
        int i = this.f8635b;
        int i2 = this.f8636c;
        if (f > i - i2) {
            throw kvk.m5456c();
        }
        String str = new String(this.f8634a, i2, f, kvj.f8654a);
        this.f8636c = f + this.f8636c;
        return str;
    }

    /* renamed from: i */
    public final int m5413i() {
        int i = 0;
        if (this.f8636c != this.f8635b) {
            this.f8639f = m5410f();
            i = this.f8639f;
            if (i == 0) {
                throw new kvk("Protocol message contained an invalid tag (zero).");
            }
        }
        this.f8639f = 0;
        return i;
    }

    /* renamed from: k */
    private final void m5396k() {
        this.f8635b += this.f8638e;
        int i = this.f8635b;
        int i2 = this.f8640g;
        if (i > i2) {
            this.f8638e = i - i2;
            this.f8635b = i - this.f8638e;
            return;
        }
        this.f8638e = 0;
    }

    /* renamed from: d */
    public final void m5407d(int i) {
        m5403b(i, this.f8639f);
    }

    /* renamed from: b */
    final void m5403b(int i, int i2) {
        int i3 = this.f8636c;
        int i4 = this.f8637d;
        i3 -= i4;
        if (i > i3) {
            StringBuilder stringBuilder = new StringBuilder(50);
            stringBuilder.append("Position ");
            stringBuilder.append(i);
            stringBuilder.append(" is beyond current ");
            stringBuilder.append(i3);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (i < 0) {
            StringBuilder stringBuilder2 = new StringBuilder(24);
            stringBuilder2.append("Bad position ");
            stringBuilder2.append(i);
            throw new IllegalArgumentException(stringBuilder2.toString());
        } else {
            this.f8636c = i4 + i;
            this.f8639f = i2;
        }
    }

    /* renamed from: e */
    public final boolean m5409e(int i) {
        switch (i & 7) {
            case 0:
                m5410f();
                return true;
            case 1:
                m5408e();
                return true;
            case 2:
                m5394f(m5410f());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                m5406d();
                return true;
            default:
                throw new kvk("Protocol message tag had invalid wire type.");
        }
        int i2;
        do {
            i2 = m5413i();
            if (i2 != 0) {
            }
            m5398a(((i >>> 3) << 3) | 4);
            return true;
        } while (m5409e(i2));
        m5398a(((i >>> 3) << 3) | 4);
        return true;
    }

    /* renamed from: f */
    private final void m5394f(int i) {
        if (i < 0) {
            throw kvk.m5455b();
        }
        int i2 = this.f8636c;
        int i3 = i2 + i;
        int i4 = this.f8640g;
        if (i3 > i4) {
            m5394f(i4 - i2);
            throw kvk.m5456c();
        } else if (i <= this.f8635b - i2) {
            this.f8636c = i3;
        } else {
            throw kvk.m5456c();
        }
    }
}
