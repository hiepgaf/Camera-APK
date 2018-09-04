package p000;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: kri */
final class kri extends krh {
    /* renamed from: d */
    private final byte[] f22465d;
    /* renamed from: e */
    private final int f22466e;
    /* renamed from: f */
    private int f22467f;

    kri(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(0), Integer.valueOf(i)}));
        }
        this.f22465d = bArr;
        this.f22467f = 0;
        this.f22466e = i;
    }

    /* renamed from: i */
    public final int mo3289i() {
        return this.f22466e - this.f22467f;
    }

    /* renamed from: a */
    public final void mo3271a(byte b) {
        try {
            byte[] bArr = this.f22465d;
            int i = this.f22467f;
            this.f22467f = i + 1;
            bArr[i] = b;
        } catch (Throwable e) {
            throw new krj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22467f), Integer.valueOf(this.f22466e), Integer.valueOf(1)}), e);
        }
    }

    /* renamed from: b */
    private final void m16639b(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.f22465d, this.f22467f, i2);
            this.f22467f += i2;
        } catch (Throwable e) {
            throw new krj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22467f), Integer.valueOf(this.f22466e), Integer.valueOf(i2)}), e);
        }
    }

    /* renamed from: a */
    public final void mo3272a(int i, boolean z) {
        mo3288h(i, 0);
        mo3271a(z);
    }

    /* renamed from: a */
    public final void mo3273a(byte[] bArr, int i) {
        mo3293p(i);
        m16639b(bArr, 0, i);
    }

    /* renamed from: c */
    public final void mo3278c(int i, kqx kqx) {
        mo3288h(i, 2);
        mo3277b(kqx);
    }

    /* renamed from: b */
    public final void mo3277b(kqx kqx) {
        mo3293p(kqx.mo3268b());
        kqx.mo3265a((kqw) this);
    }

    /* renamed from: e */
    public final void mo3284e(int i, int i2) {
        mo3288h(i, 5);
        mo3291m(i2);
    }

    /* renamed from: m */
    public final void mo3291m(int i) {
        try {
            byte[] bArr = this.f22465d;
            int i2 = this.f22467f;
            this.f22467f = i2 + 1;
            bArr[i2] = (byte) i;
            i2 = this.f22467f;
            this.f22467f = i2 + 1;
            bArr[i2] = (byte) (i >> 8);
            i2 = this.f22467f;
            this.f22467f = i2 + 1;
            bArr[i2] = (byte) (i >> 16);
            i2 = this.f22467f;
            this.f22467f = i2 + 1;
            bArr[i2] = i >> 24;
        } catch (Throwable e) {
            throw new krj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22467f), Integer.valueOf(this.f22466e), Integer.valueOf(1)}), e);
        }
    }

    /* renamed from: d */
    public final void mo3281d(int i, long j) {
        mo3288h(i, 1);
        mo3283d(j);
    }

    /* renamed from: d */
    public final void mo3283d(long j) {
        try {
            byte[] bArr = this.f22465d;
            int i = this.f22467f;
            this.f22467f = i + 1;
            bArr[i] = (byte) ((int) j);
            i = this.f22467f;
            this.f22467f = i + 1;
            bArr[i] = (byte) ((int) (j >> 8));
            i = this.f22467f;
            this.f22467f = i + 1;
            bArr[i] = (byte) ((int) (j >> 16));
            i = this.f22467f;
            this.f22467f = i + 1;
            bArr[i] = (byte) ((int) (j >> 24));
            i = this.f22467f;
            this.f22467f = i + 1;
            bArr[i] = (byte) ((int) (j >> 32));
            i = this.f22467f;
            this.f22467f = i + 1;
            bArr[i] = (byte) ((int) (j >> 40));
            i = this.f22467f;
            this.f22467f = i + 1;
            bArr[i] = (byte) ((int) (j >> 48));
            i = this.f22467f;
            this.f22467f = i + 1;
            bArr[i] = (byte) ((int) (j >> 56));
        } catch (Throwable e) {
            throw new krj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22467f), Integer.valueOf(this.f22466e), Integer.valueOf(1)}), e);
        }
    }

    /* renamed from: f */
    public final void mo3285f(int i, int i2) {
        mo3288h(i, 0);
        mo3292n(i2);
    }

    /* renamed from: n */
    public final void mo3292n(int i) {
        if (i >= 0) {
            mo3293p(i);
        } else {
            mo3287f((long) i);
        }
    }

    /* renamed from: a */
    public final void mo2284a(byte[] bArr, int i, int i2) {
        m16639b(bArr, i, i2);
    }

    /* renamed from: c */
    final void mo3279c(int i, kte kte, ktr ktr) {
        int i2;
        mo3288h(i, 2);
        kqo kqo = (kqo) kte;
        int a = kqo.mo3532a();
        if (a == -1) {
            a = ktr.mo2293a(kqo);
            kqo.mo3533a(a);
            i2 = a;
        } else {
            i2 = a;
        }
        mo3293p(i2);
        ktr.mo2296a((Object) kte, this.c);
    }

    /* renamed from: c */
    public final void mo3280c(kte kte) {
        mo3293p(kte.mo3536e());
        kte.mo3534a(this);
    }

    /* renamed from: b */
    public final void mo3275b(int i, kte kte) {
        mo3288h(1, 3);
        mo3290i(2, i);
        mo3288h(3, 2);
        mo3280c(kte);
        mo3288h(1, 4);
    }

    /* renamed from: d */
    public final void mo3282d(int i, kqx kqx) {
        mo3288h(1, 3);
        mo3290i(2, i);
        mo3278c(3, kqx);
        mo3288h(1, 4);
    }

    /* renamed from: b */
    public final void mo3274b(int i, String str) {
        mo3288h(i, 2);
        mo3276b(str);
    }

    /* renamed from: b */
    public final void mo3276b(String str) {
        int i = this.f22467f;
        int l;
        try {
            l = krh.m13847l(str.length() * 3);
            int l2 = krh.m13847l(str.length());
            if (l2 == l) {
                this.f22467f = i + l2;
                l = kur.m5357a(str, this.f22465d, this.f22467f, mo3289i());
                this.f22467f = i;
                mo3293p((l - i) - l2);
                this.f22467f = l;
                return;
            }
            mo3293p(kur.m5356a((CharSequence) str));
            this.f22467f = kur.m5357a(str, this.f22465d, this.f22467f, mo3289i());
        } catch (Throwable e) {
            this.f22467f = i;
            krh.f19274a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e);
            byte[] bytes = str.getBytes(ksd.f8515a);
            try {
                l = bytes.length;
                mo3293p(l);
                mo2284a(bytes, 0, l);
            } catch (Throwable e2) {
                throw new krj(e2);
            } catch (krj e3) {
                throw e3;
            }
        } catch (Throwable e22) {
            throw new krj(e22);
        }
    }

    /* renamed from: h */
    public final void mo3288h(int i, int i2) {
        mo3293p((i << 3) | i2);
    }

    /* renamed from: i */
    public final void mo3290i(int i, int i2) {
        mo3288h(i, 0);
        mo3293p(i2);
    }

    /* renamed from: p */
    public final void mo3293p(int i) {
        byte[] bArr;
        int i2;
        if (!krh.f19275b || mo3289i() < 10) {
            while ((i & -128) != 0) {
                try {
                    bArr = this.f22465d;
                    i2 = this.f22467f;
                    this.f22467f = i2 + 1;
                    bArr[i2] = (byte) ((i & ScriptIntrinsicBLAS.RsBlas_csyrk) | 128);
                    i >>>= 7;
                } catch (Throwable e) {
                    throw new krj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22467f), Integer.valueOf(this.f22466e), Integer.valueOf(1)}), e);
                }
            }
            bArr = this.f22465d;
            i2 = this.f22467f;
            this.f22467f = i2 + 1;
            bArr[i2] = (byte) i;
            return;
        }
        while ((i & -128) != 0) {
            bArr = this.f22465d;
            i2 = this.f22467f;
            this.f22467f = i2 + 1;
            kul.m5322a(bArr, (long) i2, (byte) ((i & ScriptIntrinsicBLAS.RsBlas_csyrk) | 128));
            i >>>= 7;
        }
        bArr = this.f22465d;
        i2 = this.f22467f;
        this.f22467f = i2 + 1;
        kul.m5322a(bArr, (long) i2, (byte) i);
    }

    /* renamed from: f */
    public final void mo3286f(int i, long j) {
        mo3288h(i, 0);
        mo3287f(j);
    }

    /* renamed from: f */
    public final void mo3287f(long j) {
        byte[] bArr;
        int i;
        if (!krh.f19275b || mo3289i() < 10) {
            while ((j & -128) != 0) {
                try {
                    bArr = this.f22465d;
                    i = this.f22467f;
                    this.f22467f = i + 1;
                    bArr[i] = (byte) ((((int) j) & ScriptIntrinsicBLAS.RsBlas_csyrk) | 128);
                    j >>>= 7;
                } catch (Throwable e) {
                    throw new krj(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f22467f), Integer.valueOf(this.f22466e), Integer.valueOf(1)}), e);
                }
            }
            bArr = this.f22465d;
            i = this.f22467f;
            this.f22467f = i + 1;
            bArr[i] = (byte) ((int) j);
            return;
        }
        while ((j & -128) != 0) {
            bArr = this.f22465d;
            i = this.f22467f;
            this.f22467f = i + 1;
            kul.m5322a(bArr, (long) i, (byte) ((((int) j) & ScriptIntrinsicBLAS.RsBlas_csyrk) | 128));
            j >>>= 7;
        }
        bArr = this.f22465d;
        i = this.f22467f;
        this.f22467f = i + 1;
        kul.m5322a(bArr, (long) i, (byte) ((int) j));
    }
}
