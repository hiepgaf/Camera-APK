package p000;

/* compiled from: PG */
/* renamed from: kur */
final class kur {
    /* renamed from: a */
    public static final kus f8594a;

    static {
        kus kut;
        Object obj = null;
        if (kul.f8584b && kul.f8583a) {
            obj = 1;
        }
        if (obj == null) {
            kut = new kut();
        } else {
            kut = new kuv();
        }
        f8594a = kut;
    }

    /* renamed from: a */
    static int m5357a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f8594a.mo2319a(charSequence, bArr, i, i2);
    }

    /* renamed from: a */
    static int m5356a(CharSequence charSequence) {
        int i;
        int i2 = 0;
        int length = charSequence.length();
        int i3 = 0;
        while (i3 < length) {
            if (charSequence.charAt(i3) >= '') {
                i = length;
                break;
            }
            i3++;
        }
        i = length;
        while (i3 < length) {
            char charAt = charSequence.charAt(i3);
            if (charAt < 'ࠀ') {
                i += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt2 = charSequence.charAt(i3);
                    if (charAt2 < 'ࠀ') {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (charAt2 >= '?' && charAt2 <= '?') {
                            if (Character.codePointAt(charSequence, i3) < 65536) {
                                throw new kuu(i3, length2);
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i2 += i;
                if (i2 < length) {
                    return i2;
                }
                StringBuilder stringBuilder = new StringBuilder(54);
                stringBuilder.append("UTF-8 length does not fit in int: ");
                stringBuilder.append(((long) i2) + 4294967296L);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        i2 = i;
        if (i2 < length) {
            return i2;
        }
        StringBuilder stringBuilder2 = new StringBuilder(54);
        stringBuilder2.append("UTF-8 length does not fit in int: ");
        stringBuilder2.append(((long) i2) + 4294967296L);
        throw new IllegalArgumentException(stringBuilder2.toString());
    }

    /* renamed from: a */
    static int m5353a(int i) {
        return i > -12 ? -1 : i;
    }

    /* renamed from: a */
    static int m5354a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return (i2 << 8) ^ i;
    }

    /* renamed from: a */
    static int m5355a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return ((i2 << 8) ^ i) ^ (i3 << 16);
    }

    /* renamed from: a */
    static int m5358a(byte[] bArr, int i, int i2) {
        int i3 = bArr[i - 1];
        switch (i2 - i) {
            case 0:
                return kur.m5353a(i3);
            case 1:
                return kur.m5354a(i3, bArr[i]);
            case 2:
                return kur.m5355a(i3, bArr[i], bArr[i + 1]);
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: b */
    public static boolean m5359b(byte[] bArr, int i, int i2) {
        return f8594a.m5361a(bArr, i, i2);
    }
}
