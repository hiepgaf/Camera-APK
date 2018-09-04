package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: kid */
public abstract class kid {
    /* renamed from: a */
    private static final char[] f8310a = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    abstract boolean mo2174a(kid kid);

    /* renamed from: a */
    public abstract byte[] mo2175a();

    /* renamed from: b */
    public abstract int mo2176b();

    /* renamed from: c */
    public abstract long mo2177c();

    /* renamed from: d */
    public abstract int mo2178d();

    kid() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kid)) {
            return false;
        }
        kid kid = (kid) obj;
        if (mo2178d() == kid.mo2178d() && mo2174a(kid)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static kid m4945a(byte[] bArr) {
        return new kie(bArr);
    }

    /* renamed from: e */
    byte[] mo2179e() {
        return mo2175a();
    }

    public final int hashCode() {
        if (mo2178d() >= 32) {
            return mo2176b();
        }
        byte[] e = mo2179e();
        int i = e[0] & Illuminant.kOther;
        for (int i2 = 1; i2 < e.length; i2++) {
            i |= (e[i2] & Illuminant.kOther) << (i2 << 3);
        }
        return i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(r3 + r3);
        for (byte b : mo2179e()) {
            stringBuilder.append(f8310a[(b >> 4) & 15]);
            stringBuilder.append(f8310a[b & 15]);
        }
        return stringBuilder.toString();
    }
}
