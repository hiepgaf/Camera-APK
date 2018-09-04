package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: wi */
public final class wi {
    /* renamed from: a */
    private static byte[] f9453a = new byte[]{(byte) 65, (byte) 66, (byte) 67, (byte) 68, (byte) 69, (byte) 70, (byte) 71, (byte) 72, (byte) 73, (byte) 74, (byte) 75, (byte) 76, (byte) 77, (byte) 78, (byte) 79, (byte) 80, (byte) 81, (byte) 82, (byte) 83, (byte) 84, (byte) 85, (byte) 86, (byte) 87, (byte) 88, (byte) 89, (byte) 90, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102, (byte) 103, (byte) 104, (byte) 105, (byte) 106, (byte) 107, (byte) 108, (byte) 109, (byte) 110, (byte) 111, (byte) 112, (byte) 113, (byte) 114, (byte) 115, (byte) 116, (byte) 117, (byte) 118, (byte) 119, (byte) 120, (byte) 121, (byte) 122, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 43, (byte) 47};
    /* renamed from: b */
    private static byte[] f9454b = new byte[Illuminant.kOther];

    static {
        int i = 0;
        for (int i2 = 0; i2 < Illuminant.kOther; i2++) {
            f9454b[i2] = (byte) -1;
        }
        while (i < f9453a.length) {
            f9454b[f9453a[i]] = (byte) i;
            i++;
        }
        f9454b[9] = (byte) -2;
        f9454b[10] = (byte) -2;
        f9454b[13] = (byte) -2;
        f9454b[32] = (byte) -2;
        f9454b[61] = (byte) -3;
    }

    /* renamed from: a */
    public static final byte[] m6129a(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (byte b : bArr) {
            byte b2 = f9454b[b2];
            if (b2 >= (byte) 0) {
                int i3 = i2 + 1;
                bArr[i2] = b2;
                i2 = i3;
            } else if (b2 == (byte) -1) {
                throw new IllegalArgumentException("Invalid base 64 string");
            }
        }
        while (i2 > 0 && bArr[i2 - 1] == (byte) -3) {
            i2--;
        }
        byte[] bArr2 = new byte[((i2 * 3) / 4)];
        i2 = 0;
        while (true) {
            i3 = bArr2.length;
            if (i >= i3 - 2) {
                break;
            }
            i3 = i2 + 1;
            bArr2[i] = (byte) (((bArr[i2] << 2) & Illuminant.kOther) | ((bArr[i3] >>> 4) & 3));
            int i4 = i2 + 2;
            bArr2[i + 1] = (byte) (((bArr[i3] << 4) & Illuminant.kOther) | ((bArr[i4] >>> 2) & 15));
            bArr2[i + 2] = (byte) (((bArr[i4] << 6) & Illuminant.kOther) | (bArr[i2 + 3] & 63));
            i2 += 4;
            i += 3;
        }
        if (i < i3) {
            bArr2[i] = (byte) (((bArr[i2] << 2) & Illuminant.kOther) | ((bArr[i2 + 1] >>> 4) & 3));
        }
        i++;
        if (i < i3) {
            bArr2[i] = (byte) (((bArr[i2 + 2] >>> 2) & 15) | ((bArr[i2 + 1] << 4) & Illuminant.kOther));
        }
        return bArr2;
    }

    /* renamed from: b */
    public static final byte[] m6130b(byte[] bArr) {
        int length;
        int i = 0;
        int length2 = ((bArr.length + 2) / 3) << 2;
        byte[] bArr2 = new byte[length2];
        int i2 = 0;
        while (true) {
            length = bArr.length;
            if (i + 3 > length) {
                break;
            }
            int i3 = i + 1;
            int i4 = i3 + 1;
            length = i4 + 1;
            i3 = (bArr[i4] & Illuminant.kOther) | (((bArr[i] & Illuminant.kOther) << 16) | ((bArr[i3] & Illuminant.kOther) << 8));
            i = i2 + 1;
            bArr2[i2] = f9453a[(i3 & 16515072) >> 18];
            i2 = i + 1;
            bArr2[i] = f9453a[(i3 & 258048) >> 12];
            i4 = i2 + 1;
            bArr2[i2] = f9453a[(i3 & 4032) >> 6];
            i = i4 + 1;
            bArr2[i4] = f9453a[i3 & 63];
            if (i < length2) {
                i2 = i;
                i = length;
            } else {
                i2 = i;
                i = length;
            }
        }
        length -= i;
        if (length == 2) {
            i = ((bArr[i + 1] & Illuminant.kOther) << 8) | ((bArr[i] & Illuminant.kOther) << 16);
            length = i2 + 1;
            bArr2[i2] = f9453a[(i & 16515072) >> 18];
            i2 = length + 1;
            bArr2[length] = f9453a[(i & 258048) >> 12];
            bArr2[i2] = f9453a[(i & 4032) >> 6];
            bArr2[i2 + 1] = (byte) 61;
        } else if (length == 1) {
            i = (bArr[i] & Illuminant.kOther) << 16;
            length = i2 + 1;
            bArr2[i2] = f9453a[(i & 16515072) >> 18];
            i2 = length + 1;
            bArr2[length] = f9453a[(i & 258048) >> 12];
            bArr2[i2] = (byte) 61;
            bArr2[i2 + 1] = (byte) 61;
        }
        return bArr2;
    }
}
