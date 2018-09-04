package p000;

/* compiled from: PG */
/* renamed from: kut */
final class kut extends kus {
    kut() {
    }

    /* renamed from: a */
    final int mo2319a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int length = charSequence.length();
        int i3 = i + i2;
        int i4 = 0;
        while (i4 < length) {
            int i5 = i4 + i;
            if (i5 >= i3) {
                break;
            }
            char charAt = charSequence.charAt(i4);
            if (charAt >= '') {
                break;
            }
            bArr[i5] = (byte) charAt;
            i4++;
        }
        if (i4 == length) {
            return i + length;
        }
        int i6 = i + i4;
        while (i4 < length) {
            char charAt2 = charSequence.charAt(i4);
            if (charAt2 < '' && i6 < i3) {
                i5 = i6 + 1;
                bArr[i6] = (byte) charAt2;
            } else if (charAt2 >= 'ࠀ' || i6 > i3 - 2) {
                char charAt3;
                int i7;
                if (charAt2 >= '?') {
                    if (charAt2 > '?') {
                    }
                    if (i6 > i3 - 4) {
                        r2 = i4 + 1;
                        if (r2 == charSequence.length()) {
                            charAt3 = charSequence.charAt(r2);
                            if (!Character.isSurrogatePair(charAt2, charAt3)) {
                                i4 = Character.toCodePoint(charAt2, charAt3);
                                i5 = i6 + 1;
                                bArr[i6] = (byte) ((i4 >>> 18) | 240);
                                i6 = i5 + 1;
                                bArr[i5] = (byte) (((i4 >>> 12) & 63) | 128);
                                i7 = i6 + 1;
                                bArr[i6] = (byte) (((i4 >>> 6) & 63) | 128);
                                i5 = i7 + 1;
                                bArr[i7] = (byte) ((i4 & 63) | 128);
                                i4 = r2;
                            }
                        } else {
                            r2 = i4;
                        }
                        throw new kuu(r2 - 1, length);
                    }
                    if (charAt2 >= '?' && charAt2 <= '?') {
                        i5 = i4 + 1;
                        if (i5 == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i5))) {
                            throw new kuu(i4, length);
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder(37);
                    stringBuilder.append("Failed writing ");
                    stringBuilder.append(charAt2);
                    stringBuilder.append(" at index ");
                    stringBuilder.append(i6);
                    throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
                }
                if (i6 <= i3 - 3) {
                    i5 = i6 + 1;
                    bArr[i6] = (byte) ((charAt2 >>> 12) | 480);
                    r2 = i5 + 1;
                    bArr[i5] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i5 = r2 + 1;
                    bArr[r2] = (byte) ((charAt2 & 63) | 128);
                }
                if (i6 > i3 - 4) {
                    i5 = i4 + 1;
                    throw new kuu(i4, length);
                }
                r2 = i4 + 1;
                if (r2 == charSequence.length()) {
                    r2 = i4;
                } else {
                    charAt3 = charSequence.charAt(r2);
                    if (!Character.isSurrogatePair(charAt2, charAt3)) {
                        i4 = Character.toCodePoint(charAt2, charAt3);
                        i5 = i6 + 1;
                        bArr[i6] = (byte) ((i4 >>> 18) | 240);
                        i6 = i5 + 1;
                        bArr[i5] = (byte) (((i4 >>> 12) & 63) | 128);
                        i7 = i6 + 1;
                        bArr[i6] = (byte) (((i4 >>> 6) & 63) | 128);
                        i5 = i7 + 1;
                        bArr[i7] = (byte) ((i4 & 63) | 128);
                        i4 = r2;
                    }
                }
                throw new kuu(r2 - 1, length);
            } else {
                r2 = i6 + 1;
                bArr[i6] = (byte) ((charAt2 >>> 6) | 960);
                i5 = r2 + 1;
                bArr[r2] = (byte) ((charAt2 & 63) | 128);
            }
            i4++;
            i6 = i5;
        }
        return i6;
    }

    /* renamed from: b */
    final int mo2320b(byte[] bArr, int i, int i2) {
        int i3 = i;
        while (i3 < i2 && bArr[i3] >= (byte) 0) {
            i3++;
        }
        if (i3 >= i2) {
            return 0;
        }
        while (i3 < i2) {
            int i4 = i3 + 1;
            byte b = bArr[i3];
            if (b >= (byte) 0) {
                i3 = i4;
            } else {
                if (b < (byte) -32) {
                    if (i4 >= i2) {
                        return b;
                    }
                    if (b < (byte) -62) {
                        return -1;
                    }
                    i3 = i4 + 1;
                    if (bArr[i4] > (byte) -65) {
                    }
                } else if (b < (byte) -16) {
                    if (i4 >= i2 - 1) {
                        return kur.m5358a(bArr, i4, i2);
                    }
                    r4 = i4 + 1;
                    r3 = bArr[i4];
                    if (r3 > (byte) -65) {
                        return -1;
                    }
                    if (b != (byte) -32 || r3 >= (byte) -96) {
                        if (b != (byte) -19 || r3 < (byte) -96) {
                            i3 = r4 + 1;
                            if (bArr[r4] > (byte) -65) {
                                return -1;
                            }
                        }
                    }
                } else if (i4 >= i2 - 2) {
                    return kur.m5358a(bArr, i4, i2);
                } else {
                    r4 = i4 + 1;
                    r3 = bArr[i4];
                    if (r3 > (byte) -65) {
                        return -1;
                    }
                    if ((((b << 28) + (r3 + 112)) >> 30) != 0) {
                        return -1;
                    }
                    i4 = r4 + 1;
                    if (bArr[r4] > (byte) -65) {
                        return -1;
                    }
                    i3 = i4 + 1;
                    if (bArr[i4] > (byte) -65) {
                        return -1;
                    }
                }
                return -1;
            }
        }
        return 0;
    }
}
