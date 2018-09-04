package p000;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* renamed from: ibl */
public final class ibl {
    /* renamed from: a */
    public final ByteBuffer f6903a;

    private ibl(ByteBuffer byteBuffer) {
        this.f6903a = byteBuffer;
        this.f6903a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private ibl(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, 0, i2));
    }

    /* renamed from: a */
    public static int m3615a(int i) {
        return i < 0 ? 10 : ibl.m3627c(i);
    }

    /* renamed from: a */
    public static int m3617a(String str) {
        int a = ibl.m3616a((CharSequence) str);
        return a + ibl.m3627c(a);
    }

    /* renamed from: a */
    public static int m3618a(byte[] bArr) {
        int length = bArr.length;
        return length + ibl.m3627c(length);
    }

    /* renamed from: a */
    public static long m3619a(long j) {
        return (j + j) ^ (j >> 63);
    }

    /* renamed from: a */
    public static ibl m3620a(byte[] bArr, int i) {
        return new ibl(bArr, 0, i);
    }

    /* renamed from: c */
    public static int m3627c(int i) {
        return (i & -128) != 0 ? (i & -16384) != 0 ? (-2097152 & i) != 0 ? (-268435456 & i) != 0 ? 5 : 4 : 3 : 2 : 1;
    }

    /* renamed from: c */
    public static int m3628c(long j) {
        return (-128 & j) != 0 ? (-16384 & j) != 0 ? (-2097152 & j) != 0 ? (-268435456 & j) != 0 ? (-34359738368L & j) != 0 ? (-4398046511104L & j) != 0 ? (-562949953421312L & j) != 0 ? (-72057594037927936L & j) != 0 ? (Long.MIN_VALUE & j) != 0 ? 10 : 9 : 8 : 7 : 6 : 5 : 4 : 3 : 2 : 1;
    }

    /* renamed from: d */
    public static int m3629d(int i) {
        return (i + i) ^ (i >> 31);
    }

    /* renamed from: e */
    private final void m3630e(int i) {
        byte b = (byte) i;
        if (this.f6903a.hasRemaining()) {
            this.f6903a.put(b);
            return;
        }
        throw new amx(this.f6903a.position(), this.f6903a.limit());
    }

    /* renamed from: b */
    public final void m3637b(int i) {
        while ((i & -128) != 0) {
            m3630e((i & ScriptIntrinsicBLAS.RsBlas_csyrk) | 128);
            i >>>= 7;
        }
        m3630e(i);
    }

    /* renamed from: b */
    public final void m3638b(long j) {
        while ((-128 & j) != 0) {
            m3630e((((int) j) & ScriptIntrinsicBLAS.RsBlas_csyrk) | 128);
            j >>>= 7;
        }
        m3630e((int) j);
    }

    /* renamed from: a */
    public final void m3634a(int i, ibr ibr) {
        m3639c(i, 2);
        if (ibr.f6912p < 0) {
            ibr.m3660e();
        }
        m3637b(ibr.f6912p);
        ibr.mo1801a(this);
    }

    /* renamed from: a */
    private static void m3621a(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i = 0;
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        } else if (byteBuffer.hasArray()) {
            try {
                byte[] array = byteBuffer.array();
                r0 = byteBuffer.arrayOffset() + byteBuffer.position();
                r2 = byteBuffer.remaining();
                int length = charSequence.length();
                int i2 = r0 + r2;
                while (i < length) {
                    r2 = i + r0;
                    if (r2 >= i2) {
                        break;
                    }
                    r3 = charSequence.charAt(i);
                    if (r3 >= '') {
                        break;
                    }
                    array[r2] = (byte) r3;
                    i++;
                }
                if (i != length) {
                    int i3 = r0 + i;
                    while (i < length) {
                        char charAt = charSequence.charAt(i);
                        if (charAt < '' && i3 < i2) {
                            r0 = i3 + 1;
                            array[i3] = (byte) charAt;
                        } else if (charAt >= 'ࠀ' || i3 > i2 - 2) {
                            int i4;
                            StringBuilder stringBuilder;
                            if (charAt >= '?') {
                                if (charAt > '?') {
                                }
                                if (i3 > i2 - 4) {
                                    r2 = i + 1;
                                    if (r2 == charSequence.length()) {
                                        r0 = charSequence.charAt(r2);
                                        if (Character.isSurrogatePair(charAt, r0)) {
                                            i = Character.toCodePoint(charAt, r0);
                                            r0 = i3 + 1;
                                            array[i3] = (byte) ((i >>> 18) | 240);
                                            i3 = r0 + 1;
                                            array[r0] = (byte) (((i >>> 12) & 63) | 128);
                                            i4 = i3 + 1;
                                            array[i3] = (byte) (((i >>> 6) & 63) | 128);
                                            r0 = i4 + 1;
                                            array[i4] = (byte) ((i & 63) | 128);
                                            i = r2;
                                        }
                                    } else {
                                        r2 = i;
                                    }
                                    stringBuilder = new StringBuilder(39);
                                    stringBuilder.append("Unpaired surrogate at index ");
                                    stringBuilder.append(r2 - 1);
                                    throw new IllegalArgumentException(stringBuilder.toString());
                                }
                                stringBuilder = new StringBuilder(37);
                                stringBuilder.append("Failed writing ");
                                stringBuilder.append(charAt);
                                stringBuilder.append(" at index ");
                                stringBuilder.append(i3);
                                throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
                            }
                            if (i3 <= i2 - 3) {
                                r0 = i3 + 1;
                                array[i3] = (byte) ((charAt >>> 12) | 480);
                                r2 = r0 + 1;
                                array[r0] = (byte) (((charAt >>> 6) & 63) | 128);
                                r0 = r2 + 1;
                                array[r2] = (byte) ((charAt & 63) | 128);
                            }
                            if (i3 > i2 - 4) {
                                stringBuilder = new StringBuilder(37);
                                stringBuilder.append("Failed writing ");
                                stringBuilder.append(charAt);
                                stringBuilder.append(" at index ");
                                stringBuilder.append(i3);
                                throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
                            }
                            r2 = i + 1;
                            if (r2 == charSequence.length()) {
                                r2 = i;
                            } else {
                                r0 = charSequence.charAt(r2);
                                if (Character.isSurrogatePair(charAt, r0)) {
                                    i = Character.toCodePoint(charAt, r0);
                                    r0 = i3 + 1;
                                    array[i3] = (byte) ((i >>> 18) | 240);
                                    i3 = r0 + 1;
                                    array[r0] = (byte) (((i >>> 12) & 63) | 128);
                                    i4 = i3 + 1;
                                    array[i3] = (byte) (((i >>> 6) & 63) | 128);
                                    r0 = i4 + 1;
                                    array[i4] = (byte) ((i & 63) | 128);
                                    i = r2;
                                }
                            }
                            stringBuilder = new StringBuilder(39);
                            stringBuilder.append("Unpaired surrogate at index ");
                            stringBuilder.append(r2 - 1);
                            throw new IllegalArgumentException(stringBuilder.toString());
                        } else {
                            r2 = i3 + 1;
                            array[i3] = (byte) ((charAt >>> 6) | 960);
                            r0 = r2 + 1;
                            array[r2] = (byte) ((charAt & 63) | 128);
                        }
                        i++;
                        i3 = r0;
                    }
                    r0 = i3;
                } else {
                    r0 += length;
                }
                byteBuffer.position(r0 - byteBuffer.arrayOffset());
            } catch (Throwable e) {
                BufferOverflowException bufferOverflowException = new BufferOverflowException();
                bufferOverflowException.initCause(e);
                throw bufferOverflowException;
            }
        } else {
            r2 = charSequence.length();
            r0 = 0;
            while (r0 < r2) {
                r3 = charSequence.charAt(r0);
                if (r3 < '') {
                    byteBuffer.put((byte) r3);
                } else if (r3 < 'ࠀ') {
                    byteBuffer.put((byte) ((r3 >>> 6) | 960));
                    byteBuffer.put((byte) ((r3 & 63) | 128));
                } else if (r3 >= '?' && r3 <= '?') {
                    i = r0 + 1;
                    if (i != charSequence.length()) {
                        r0 = charSequence.charAt(i);
                        if (Character.isSurrogatePair(r3, r0)) {
                            r0 = Character.toCodePoint(r3, r0);
                            byteBuffer.put((byte) ((r0 >>> 18) | 240));
                            byteBuffer.put((byte) (((r0 >>> 12) & 63) | 128));
                            byteBuffer.put((byte) (((r0 >>> 6) & 63) | 128));
                            byteBuffer.put((byte) ((r0 & 63) | 128));
                            r0 = i;
                        }
                    } else {
                        i = r0;
                    }
                    StringBuilder stringBuilder2 = new StringBuilder(39);
                    stringBuilder2.append("Unpaired surrogate at index ");
                    stringBuilder2.append(i - 1);
                    throw new IllegalArgumentException(stringBuilder2.toString());
                } else {
                    byteBuffer.put((byte) ((r3 >>> 12) | 480));
                    byteBuffer.put((byte) (((r3 >>> 6) & 63) | 128));
                    byteBuffer.put((byte) ((r3 & 63) | 128));
                }
                r0++;
            }
        }
    }

    /* renamed from: a */
    public final void m3632a(int i, int i2) {
        m3639c(i, 0);
        if (i2 < 0) {
            m3638b((long) i2);
        } else {
            m3637b(i2);
        }
    }

    /* renamed from: b */
    public static int m3622b(int i, int i2) {
        return ibl.m3627c(i << 3) + ibl.m3615a(i2);
    }

    /* renamed from: c */
    public final void m3639c(int i, int i2) {
        m3637b((i << 3) | i2);
    }

    /* renamed from: a */
    public final void m3636a(int i, byte[] bArr) {
        m3639c(i, 2);
        int length = bArr.length;
        m3637b(length);
        if (this.f6903a.remaining() < length) {
            throw new amx(this.f6903a.position(), this.f6903a.limit());
        }
        this.f6903a.put(bArr, 0, length);
    }

    /* renamed from: a */
    private static int m3616a(CharSequence charSequence) {
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
            StringBuilder stringBuilder;
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
                                stringBuilder = new StringBuilder(39);
                                stringBuilder.append("Unpaired surrogate at index ");
                                stringBuilder.append(i3);
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i3 = i + i2;
                if (i3 < length) {
                    return i3;
                }
                stringBuilder = new StringBuilder(54);
                stringBuilder.append("UTF-8 length does not fit in int: ");
                stringBuilder.append(((long) i3) + 4294967296L);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        i3 = i;
        if (i3 < length) {
            return i3;
        }
        stringBuilder = new StringBuilder(54);
        stringBuilder.append("UTF-8 length does not fit in int: ");
        stringBuilder.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final void m3631a(int i, float f) {
        m3639c(i, 5);
        int floatToIntBits = Float.floatToIntBits(f);
        if (this.f6903a.remaining() < 4) {
            throw new amx(this.f6903a.position(), this.f6903a.limit());
        }
        this.f6903a.putInt(floatToIntBits);
    }

    /* renamed from: b */
    public static int m3624b(int i, ibr ibr) {
        int c = ibl.m3627c(i << 3);
        int e = ibr.m3660e();
        return c + (e + ibl.m3627c(e));
    }

    /* renamed from: b */
    public static int m3626b(int i, byte[] bArr) {
        return ibl.m3627c(i << 3) + ibl.m3618a(bArr);
    }

    /* renamed from: a */
    public final void m3633a(int i, long j) {
        m3639c(i, 0);
        m3638b(j);
    }

    /* renamed from: b */
    public static int m3623b(int i, long j) {
        return ibl.m3627c(i << 3) + ibl.m3628c(j);
    }

    /* renamed from: a */
    public final void m3635a(int i, String str) {
        m3639c(i, 2);
        try {
            int c = ibl.m3627c(str.length());
            if (c != ibl.m3627c(str.length() * 3)) {
                m3637b(ibl.m3616a((CharSequence) str));
                ibl.m3621a((CharSequence) str, this.f6903a);
                return;
            }
            int position = this.f6903a.position();
            if (this.f6903a.remaining() >= c) {
                this.f6903a.position(position + c);
                ibl.m3621a((CharSequence) str, this.f6903a);
                int position2 = this.f6903a.position();
                this.f6903a.position(position);
                m3637b((position2 - position) - c);
                this.f6903a.position(position2);
                return;
            }
            throw new amx(c + position, this.f6903a.limit());
        } catch (Throwable e) {
            amx amx = new amx(this.f6903a.position(), this.f6903a.limit());
            amx.initCause(e);
            throw amx;
        }
    }

    /* renamed from: b */
    public static int m3625b(int i, String str) {
        return ibl.m3627c(i << 3) + ibl.m3617a(str);
    }
}
