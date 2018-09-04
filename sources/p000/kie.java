package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kie */
final class kie extends kid implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final byte[] f19215a;

    kie(byte[] bArr) {
        this.f19215a = (byte[]) jri.m13152b((Object) bArr);
    }

    /* renamed from: a */
    public final byte[] mo2175a() {
        return (byte[]) this.f19215a.clone();
    }

    /* renamed from: b */
    public final int mo2176b() {
        boolean z;
        int length = this.f19215a.length;
        if (length >= 4) {
            z = true;
        } else {
            z = false;
        }
        jri.m13155b(z, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        byte[] bArr = this.f19215a;
        return ((bArr[3] & Illuminant.kOther) << 24) | ((((bArr[1] & Illuminant.kOther) << 8) | (bArr[0] & Illuminant.kOther)) | ((bArr[2] & Illuminant.kOther) << 16));
    }

    /* renamed from: c */
    public final long mo2177c() {
        boolean z;
        int length = this.f19215a.length;
        if (length >= 8) {
            z = true;
        } else {
            z = false;
        }
        jri.m13155b(z, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", length);
        long j = (long) (this.f19215a[0] & Illuminant.kOther);
        for (int i = 1; i < Math.min(this.f19215a.length, 8); i++) {
            j |= (((long) this.f19215a[i]) & 255) << (i << 3);
        }
        return j;
    }

    /* renamed from: d */
    public final int mo2178d() {
        return this.f19215a.length << 3;
    }

    /* renamed from: a */
    final boolean mo2174a(kid kid) {
        if (this.f19215a.length != kid.mo2179e().length) {
            return false;
        }
        int i = 0;
        boolean z = true;
        while (true) {
            byte[] bArr = this.f19215a;
            if (i >= bArr.length) {
                return z;
            }
            int i2;
            if (bArr[i] == kid.mo2179e()[i]) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            z &= i2;
            i++;
        }
    }

    /* renamed from: e */
    final byte[] mo2179e() {
        return this.f19215a;
    }
}
